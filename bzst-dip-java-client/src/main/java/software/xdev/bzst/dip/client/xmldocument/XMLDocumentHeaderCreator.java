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
package software.xdev.bzst.dip.client.xmldocument;

import java.time.LocalDateTime;
import java.util.UUID;

import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.xmldocument.model.ApplicationType;
import software.xdev.bzst.dip.client.xmldocument.model.ConsignmentType;
import software.xdev.bzst.dip.client.xmldocument.model.CustomerIdentifierType;
import software.xdev.bzst.dip.client.xmldocument.model.DipHeaderType;
import software.xdev.bzst.dip.client.xmldocument.model.EnvironmentType;
import software.xdev.bzst.dip.client.xmldocument.model.IdentityProviderType;

public class XMLDocumentHeaderCreator
{
    private final BzstDipConfiguration configuration;

    public XMLDocumentHeaderCreator(final BzstDipConfiguration configuration)
    {
        this.configuration = configuration;
    }

    protected DipHeaderType createHeader(final EnvironmentType environmentType)
    {
        final DipHeaderType dipHeaderType = new DipHeaderType();
        dipHeaderType.setEnvironment(environmentType);
        dipHeaderType.setConsignment(this.createConsignment());
        dipHeaderType.setApplication(creationApplication());

        return dipHeaderType;
    }

    private static ApplicationType creationApplication()
    {
        final ApplicationType applicationType = new ApplicationType();
        applicationType.setCode("DAC7");

        return applicationType;
    }

    private ConsignmentType createConsignment()
    {
        final ConsignmentType consignmentType = new ConsignmentType();
        consignmentType.setCustomerIdentifier(this.createCustomerIdentifier());
        consignmentType.setCreationTime(
            XMLDocumentCreator.parseLocalDateToXMLGregorianCalendarDateTime(LocalDateTime.now())
        );
        consignmentType.setTransferticketId(UUID.randomUUID().toString());

        return consignmentType;

    }

    private CustomerIdentifierType createCustomerIdentifier()
    {
        final CustomerIdentifierType customerIdentifierType = new CustomerIdentifierType();
        customerIdentifierType.setIdentityProvider(IdentityProviderType.ELSTER);
        //Steuernummer
        customerIdentifierType.setIdentifier(this.configuration.getTaxNumber());

        return customerIdentifierType;
    }
}
