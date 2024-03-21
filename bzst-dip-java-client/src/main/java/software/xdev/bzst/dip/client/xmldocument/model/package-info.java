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
// Prefixes
@XmlSchema(location= "http://itzbund.de/ozg/bzst/post/dip/v1/dip.xsd", namespace = "http://itzbund.de/ozg/bzst/post/dip/v1/",
        xmlns =
        {
                @XmlNs(namespaceURI = "http://itzbund.de/ozg/bzst/post/dip/v1/", prefix = "dip"),
                @XmlNs(namespaceURI = "urn:oecd:ties:dpi:v1", prefix = "dpi"),
                @XmlNs(namespaceURI = "urn:oecd:ties:isodpitypes:v1", prefix = "iso"),
                @XmlNs(namespaceURI = "urn:oecd:ties:dpistf:v1", prefix = "stf"),
                @XmlNs(namespaceURI = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi"),
        },
        elementFormDefault = XmlNsForm.QUALIFIED)

package software.xdev.bzst.dip.client.xmldocument.model;

import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlNsForm;
import jakarta.xml.bind.annotation.XmlSchema;
