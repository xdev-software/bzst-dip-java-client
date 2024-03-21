/*
 * Copyright © 2024 XDEV Software (https://xdev.software)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package software.xdev.bzst.dip.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

import software.xdev.bzst.dip.client.util.WebClientUtil;

class WebClientUtilTest
{
    @Test
    void throwExceptionCanNotParseToXmlTest()
    {
        final RuntimeException thrown = assertThrows
                (
                        RuntimeException.class,
                        () ->  WebClientUtil.convertTransferNumberXML("12345")
                );

        assertEquals("An error occurred while parsing the transfer numbers.", thrown.getMessage());
    }

    @Test
    void noTransferNumbersTest()
    {
        final List<String> dataTransferNumbers =
                WebClientUtil.convertTransferNumberXML("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                                                       "<Datentransfernummern/>");

        assertEquals(0, dataTransferNumbers.size());
    }

    @Test
    void transferNumbersTest()
    {
        final List<String> dataTransferNumbers =
                WebClientUtil.convertTransferNumberXML("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                                                       "<Datentransfernummern>" +
                                                       "<Datentransfernummer>2394headfsoiu</Datentransfernummer>" +
                                                       "<Datentransfernummer>328ddsdfasdfa</Datentransfernummer>" +
                                                       "<Datentransfernummer>vbmcvbopfdpos</Datentransfernummer>" +
                                                        "</Datentransfernummern>");

        assertEquals("2394headfsoiu", dataTransferNumbers.get(0));
        assertEquals("328ddsdfasdfa", dataTransferNumbers.get(1));
        assertEquals("vbmcvbopfdpos", dataTransferNumbers.get(2));
    }
}
