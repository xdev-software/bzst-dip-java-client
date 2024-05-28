[![Latest version](https://img.shields.io/maven-central/v/software.xdev/bzst-dip-java-client?logo=apache%20maven)](https://mvnrepository.com/artifact/software.xdev/bzst-dip-java-client)
[![Build](https://img.shields.io/github/actions/workflow/status/xdev-software/bzst-dip-java-client/checkBuild.yml?branch=develop)](https://github.com/xdev-software/bzst-dip-java-client/actions/workflows/checkBuild.yml?query=branch%3Adevelop)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=xdev-software_bzst-dip-java-client&metric=alert_status)](https://sonarcloud.io/dashboard?id=xdev-software_bzst-dip-java-client)

<div align="center">
    <img src="assets/Logo.svg" height="200" alt="XDEV BZST-DIP-Java-Client Logo">
</div>

# bzst-dip-java-client

Client for using
the [Mass data transmission DIP (mass data
interface)](https://www.bzst.de/EN/Businesses/CESOP/electronic_data_transmission/electronic_data_transmission_node.html#js-toc-entry1).

The BZSt (Bundeszentralamt für Steuern / Federal Central Tax Office) provides the Digital Inbox (DIP) as a service
for payment service providers to transmit financial data.

This library uses a [generated](./bzst-dip-java-client/pom.xml) client from an [``openapi.yml``](./openapi/openapi.yml)
using [OpenAPI Generator](https://openapi-generator.tech/).

Clients need to register / login
at [BZSt online.portal](https://www.bzst.de/DE/Service/Portalinformation/Massendaten/DIP/dip.html?nn=68828)
through [Elster](https://www.elster.de/elsterweb/start), [BundID](https://id.bund.de/de)
or [BZSt Online-Portal (BOP)](https://www.elster.de/bportal/start).

See
the [BZSt Information](https://www.bzst.de/EN/Service/Portalinformation/Login/login_node.html)
for more information.

*Warning*: **BZSt Online-Portal** (deprecated) is different from **BZSt online.portal**.

## Rationale

We created this client to make it as easy as possible for the developer to use the BZSt DIP.
Through usage of the builder pattern (see [Configuration](#configuration) below), DTOs
and a typesafe data model we ensure high usability and readability.

The BZSt
provides [XSD](https://www.bzst.de/SharedDocs/Downloads/DE/Digitale_Plattformbetreiber/amtlicher_datensatz_entwurf) that
define the expected XML structure and
make it possible to generate java
classes ([BZSt Docs](https://www.bzst.de/DE/Unternehmen/Intern_Informationsaustausch/DAC7/Handbuecher/handbuecher.html?nn=127558#js-toc-entry2)).
Our library validates each
request through these XSD find errors before they are sent to the DIP.

## Installation
[Installation guide for the latest release](https://github.com/xdev-software/bzst-dip-java-client/releases/latest#Installation)

## Usage

See the [examples in the demo package](./src/main/java/software/demo/bzst/dip/client/demo).

### Create keystore file

For authentification at the BZST you have to create a public- and private-key.

First you have to create a **PEM** file as described on
the [BZST Website](https://www.bzst.de/SharedDocs/Downloads/DE/EOP_BOP/khb_dip.pdf?__blob=publicationFile&v=9) (see
1.7).

OpenSSL can be downloaded from their [website](https://www.openssl.org/).

```
openssl req -newkey rsa-pss -new -nodes -x509 -days 3650 -pkeyopt rsa_keygen_bits:4096 -sigopt rsa_pss_saltlen:32 -keyout key.pem -out cert.pem
```

Next you have to convert that file to a **PKCS12** file.

```
openssl pkcs12 -export -in cert.pem -inkey key.pem -out certificate.p12 -name "certificate"
```

The [keytool](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/keytool.html) is contained in your JDK
installation.

```
keytool -importkeystore -srckeystore certificate.p12 -srcstoretype pkcs12 -destkeystore cert.jks
```

The password you insert here, along with the file itself must be set in the client configuration. See example
at [app.properties](./bzst-dip-java-client-demo/src/main/resources/app.properties):

```
certificate.keystore.password=SECRET_PASSWORD
certificate.keystore.file=cert.jks
```

You also have to set the public key in the [BZST online.portal](https://online.portal.bzst.de/).
Exporting the public key with OpenSSL is easy:

```
openssl rsa -in key.pem -pubout > publicKey.pub
```

### Client ID

It's also important to use the client id provided by [BZST online.portal](https://online.portal.bzst.de/)
in the client configuration. See example
at [app.properties](./bzst-dip-java-client-demo/src/main/resources/app.properties):

```
client.id=abcd1234-ab12-ab12-ab12-abcdef123456
```

### Configuration

The client can be configured through a properties file (
see [app.properties](./bzst-dip-java-client-demo/src/main/resources/app.properties)
and [ApplicationWithConfigurationFromProperties.java](./bzst-dip-java-client-demo/src/main/java/software/demo/bzst/dip/client/demo/ApplicationWithConfigurationFromProperties.java))
or by creating a configuration object (
see [Application.java](./bzst-dip-java-client-demo/src/main/java/software/demo/bzst/dip/client/demo/Application.java)).

```java
public static BzstDipConfiguration createConfiguration()
{
	return new BzstDipConfigurationBuilder()
		.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
		.setTaxID("123")
		.setTaxNumber("123")
		.setCertificateKeystoreInputStream(() -> ClassLoader.getSystemClassLoader()
			.getResourceAsStream("DemoKeystore.jks"))
		.setCertificateKeystorePassword("test123")
		.setRealmEnvironmentBaseUrl(BzstDipConfiguration.ENDPOINT_URL_TEST)
		.setMessageTypeIndic(BzstDipDpiMessageType.DPI_401)
		.setReportingPeriod(LocalDate.now())
		.setDocTypeIndic(BzstDipOecdDocType.OECD_1)
		.setPlatformOperatorOrganizationName("TestOrg")
		.setPlatformOperatorPlatformName("TestApp")
		.setPlatformOperatorAddress(new BzstDipAddressFix("TestCity"))
		.buildAndValidate();
}
```

## Support

If you need support as soon as possible, and you can't wait for any pull request, feel free to
use [our support](https://xdev.software/en/services/support).

## Contributing
See the [contributing guide](./CONTRIBUTING.md) for detailed instructions on how to get started with our project.

## Dependencies and Licenses
View the [license of the current project](LICENSE) or the [summary including all dependencies](https://xdev-software.github.io/bzst-dip-java-client/dependencies)
