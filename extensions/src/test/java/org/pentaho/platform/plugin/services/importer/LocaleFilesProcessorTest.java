/*!
 *
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 *
 * Copyright (c) 2002-2018 Hitachi Vantara. All rights reserved.
 *
 */

package org.pentaho.platform.plugin.services.importer;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.pentaho.platform.api.mimetype.IMimeType;
import org.pentaho.platform.api.repository2.unified.Converter;
import org.pentaho.platform.api.repository2.unified.IPlatformImportBundle;
import org.pentaho.platform.api.repository2.unified.IRepositoryContentConverterHandler;
import org.pentaho.platform.api.repository2.unified.RepositoryFile;
import org.pentaho.platform.core.mimetype.MimeType;
import org.pentaho.platform.engine.core.system.PentahoSystem;
import org.pentaho.platform.plugin.services.importexport.Log4JRepositoryImportLogger;
import org.pentaho.platform.plugin.services.importexport.RepositoryFileBundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

/**
 * Created by Yury_Bakhmutski on 1/20/2018.
 */
public class LocaleFilesProcessorTest {

  private static final String DEFAULT_ENCODING = "UTF-8";

  PentahoPlatformImporter importer;
  LocaleFilesProcessor localeFilesProcessor;

  @Before
  public void setUp() throws Exception {
    NameBaseMimeResolver nameResolver = new NameBaseMimeResolver();
    PentahoSystem.registerObject( nameResolver );
  }

  @Test
  public void testProcessLocaleFilesTwoLocaleFiles() throws Exception {
    IRepositoryContentConverterHandler converterHandler =
      new DefaultRepositoryContentConverterHandler( new HashMap<String, Converter>() );

    List<IMimeType> localeMimeList = new ArrayList<IMimeType>();
    localeMimeList.add( new MimeType( "text/locale", "locale" ) );

    LocaleImportHandler localeImportHandler = new LocaleImportHandler( localeMimeList, null );
    LocaleImportHandler localeImportHandlerSpy = spy( localeImportHandler );
    Log log = mock( Log.class );
    doReturn( log ).when( localeImportHandlerSpy ).getLogger();

    String localeFileName = "SampleTransformationWithParameters";
    List<IPlatformImportHandler> handlers = new ArrayList<IPlatformImportHandler>();
    handlers.add( localeImportHandlerSpy );

    importer = new PentahoPlatformImporter( handlers, converterHandler );
    importer.setRepositoryImportLogger( new Log4JRepositoryImportLogger() );

    localeFilesProcessor = new LocaleFilesProcessor();

    StringBuffer localePropertiesContent = new StringBuffer();
    localePropertiesContent.append(
      "description=This runs a simple Kettle transformation filtering records from the Quandrant_Actuals sample data "
        + "table, and sending a Hello message to each position.\n" );
    localePropertiesContent.append( "name=1. Hello ETL" );

    assertTrue( processIsLocalFile( "SampleTransformation.properties", localePropertiesContent ) );

    StringBuffer localeContent = new StringBuffer();
    localeContent.append( "file.title=" + localeFileName + "\n" );
    localeContent.append( "title=SampleTransformation\n" );
    localeContent.append( "file.description=" );

    assertTrue( processIsLocalFile( "SampleTransformation.xaction.locale", localeContent ) );

    localeFilesProcessor.processLocaleFiles( importer );

    //verify that in case of both .properties and .locale files are at input the only one proceeded is .locale
    Mockito.verify( localeImportHandlerSpy, times( 1 ) ).importFile( any( IPlatformImportBundle.class ) );
    ArgumentCaptor<IPlatformImportBundle> argument = ArgumentCaptor.forClass( IPlatformImportBundle.class );
    Mockito.verify( localeImportHandlerSpy ).importFile( argument.capture() );
    assertEquals( localeFileName, argument.getValue().getName() );
  }

  private boolean processIsLocalFile( String fileName, StringBuffer localeContent ) throws Exception {
    RepositoryFile file = new RepositoryFile.Builder( fileName ).build();
    RepositoryFileBundle repoFileBundle =
      new RepositoryFileBundle( file, null, StringUtils.EMPTY, null, DEFAULT_ENCODING, null );
    return localeFilesProcessor.isLocaleFile( repoFileBundle, "/", localeContent.toString().getBytes() );
  }

}
