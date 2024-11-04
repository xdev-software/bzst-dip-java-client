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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import software.xdev.bzst.dip.client.factory.SchemaFactoryExtension;
import software.xdev.bzst.dip.client.model.configuration.BzstDipConfiguration;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectablePlatformOperatorType;
import software.xdev.bzst.dip.client.xmldocument.model.CorrectableReportableSellerType;
import software.xdev.bzst.dip.client.xmldocument.model.DipType;


public class XMLDocumentCreator
{
	private static final Logger LOGGER = LoggerFactory.getLogger(XMLDocumentCreator.class);
	private static final String XSD_SUBDIRECTORY = "xsd";
	/**
	 * Files from <a href="https://www.bzst.de/DE/Unternehmen/Intern_Informationsaustausch/DAC7/Handbuecher/handbuecher
	 * .html?nn=127558#js-toc-entry2">https://www.bzst.de</a>
	 * <p>
	 * <a href="https://www.bzst.de/SharedDocs/Downloads/DE/Digitale_Plattformbetreiber/amtlicher_datensatz_entwurf
	 * .zip?__blob=publicationFile&v=5">Direct download</a>
	 * </p>
	 */
	private static final String DIP_XSD = "dip.xsd";
	/**
	 * Files from <a href="https://www.bzst.de/DE/Unternehmen/Intern_Informationsaustausch/DAC7/Handbuecher/handbuecher
	 * .html?nn=127558#js-toc-entry2">https://www.bzst.de</a>
	 * <p>
	 * <a href="https://www.bzst.de/SharedDocs/Downloads/DE/Digitale_Plattformbetreiber/amtlicher_datensatz_entwurf
	 * .zip?__blob=publicationFile&v=5">Direct download</a>
	 * </p>
	 */
	private static final String ISO_DPI_TYPES_XSD = "isodpitypes_v1.0.xsd";
	/**
	 * Files from <a href="https://www.bzst.de/DE/Unternehmen/Intern_Informationsaustausch/DAC7/Handbuecher/handbuecher
	 * .html?nn=127558#js-toc-entry2">https://www.bzst.de</a>
	 * <p>
	 * <a href="https://www.bzst.de/SharedDocs/Downloads/DE/Digitale_Plattformbetreiber/amtlicher_datensatz_entwurf
	 * .zip?__blob=publicationFile&v=5">Direct download</a>
	 * </p>
	 */
	private static final String OECD_DPI_TYPES_XSD = "oecddpitypes_v1.0.xsd";
	/**
	 * Files from <a href="https://www.bzst.de/DE/Unternehmen/Intern_Informationsaustausch/DAC7/Handbuecher/handbuecher
	 * .html?nn=127558#js-toc-entry2">https://www.bzst.de</a>
	 * <p>
	 * <a href="https://www.bzst.de/SharedDocs/Downloads/DE/Digitale_Plattformbetreiber/amtlicher_datensatz_entwurf
	 * .zip?__blob=publicationFile&v=5">Direct download</a>
	 * </p>
	 */
	private static final String DPI_XML_XSD = "DPIXML_v1.0.xsd";
	private final BzstDipConfiguration configuration;
	
	public XMLDocumentCreator(final BzstDipConfiguration configuration)
	{
		this.configuration = configuration;
	}
	
	public String buildXMLDocument(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes,
		final CorrectablePlatformOperatorType correctablePlatformOperatorType)
	{
		try(final StringWriter sw = new StringWriter())
		{
			final Marshaller jaxbMarshaller = createMarshaller();
			final DipType dipType = this.buildRootElement(
				correctableReportableSellerTypes,
				correctablePlatformOperatorType
			);
			
			jaxbMarshaller.marshal(dipType, sw);
			final String xmlString = sw.toString();
			
			this.validateXMLDocument(xmlString);
			
			return xmlString;
		}
		catch(final IOException | JAXBException e)
		{
			throw new RuntimeException("Something wrong happened while building the xml document.", e);
		}
	}
	
	
	private static Marshaller createMarshaller()
	{
		try
		{
			final JAXBContext jaxbContext = JAXBContext.newInstance(DipType.class);
			final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			
			return jaxbMarshaller;
		}
		catch(final JAXBException e)
		{
			throw new RuntimeException("Something wrong happened while creating the jaxb marshaller.", e);
		}
	}
	
	public DipType buildRootElement(
		final List<CorrectableReportableSellerType> correctableReportableSellerTypes,
		final CorrectablePlatformOperatorType correctablePlatformOperatorType
	)
	{
		final DipType dipType = new DipType();
		
		final XMLDocumentHeaderCreator xmlDocumentHeaderCreator = new XMLDocumentHeaderCreator(this.configuration);
		
		dipType.setHeader(
			xmlDocumentHeaderCreator.createHeader(
				this.configuration.getEnvironment().toEnvironmentType()
			)
		);
		
		final XMLDocumentBodyCreator xmlDocumentBodyCreator = new XMLDocumentBodyCreator(this.configuration);
		dipType.setBody(
			xmlDocumentBodyCreator.createBody(correctableReportableSellerTypes, correctablePlatformOperatorType)
		);
		dipType.setVersion("1.0");
		
		return dipType;
	}
	
	private void validateXMLDocument(final String xmlString)
	{
		LOGGER.debug("Starting to validate xml...");
		
		try
		{
			final SchemaFactory factory = SchemaFactoryExtension.newInstance();
			
			final Schema schema = factory.newSchema(new Source[]
				{
					new StreamSource(this.getClass()
						.getClassLoader()
						.getResourceAsStream(XSD_SUBDIRECTORY + "/" + DIP_XSD)),
					new StreamSource(this.getClass()
						.getClassLoader()
						.getResourceAsStream(XSD_SUBDIRECTORY + "/" + ISO_DPI_TYPES_XSD)),
					new StreamSource(this.getClass()
						.getClassLoader()
						.getResourceAsStream(XSD_SUBDIRECTORY + "/" + OECD_DPI_TYPES_XSD)),
					new StreamSource(this.getClass()
						.getClassLoader()
						.getResourceAsStream(XSD_SUBDIRECTORY + "/" + DPI_XML_XSD))
				});
			
			final Validator validator = schema.newValidator();
			validator.validate(
				new StreamSource(new ByteArrayInputStream(xmlString.getBytes(StandardCharsets.UTF_8))));
			
			LOGGER.debug("Finished validating xml.");
		}
		catch(final IOException | SAXException e)
		{
			throw new RuntimeException("An error occurred while validating the xml.", e);
		}
	}
	
	public static XMLGregorianCalendar parseLocalDateToXMLGregorianCalendarDate(final LocalDate localDate)
	{
		try
		{
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(localDate.toString());
		}
		catch(final DatatypeConfigurationException e)
		{
			throw new RuntimeException("An error occurred while parsing LocalDate to GregorianCalender.", e);
		}
	}
	
	public static XMLGregorianCalendar parseLocalDateToXMLGregorianCalendarDateTime(final LocalDateTime localDateTime)
	{
		try
		{
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(
				localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")));
		}
		catch(final DatatypeConfigurationException e)
		{
			throw new RuntimeException("An error occurred while parsing LocalDateTime to GregorianCalender.", e);
		}
	}
}
