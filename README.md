[![Latest version](https://img.shields.io/maven-central/v/software.xdev/bzst-dip-java-client?logo=apache%20maven)](https://mvnrepository.com/artifact/software.xdev/bzst-dip-java-client)
[![Build](https://img.shields.io/github/actions/workflow/status/xdev-software/bzst-dip-java-client/check-build.yml?branch=develop)](https://github.com/xdev-software/bzst-dip-java-client/actions/workflows/check-build.yml?query=branch%3Adevelop)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=xdev-software_bzst-dip-java-client&metric=alert_status)](https://sonarcloud.io/dashboard?id=xdev-software_bzst-dip-java-client)

<div align="center">
    <img src="assets/Logo.svg" height="200" alt="XDEV BZST-DIP-Java-Client Logo">
</div>

# bzst-dip-java-client

Client for using the [Mass data transmission DIP (mass data interface)](https://www.bzst.de/EN/Businesses/CESOP/electronic_data_transmission/electronic_data_transmission_node.html#js-toc-entry1).

The BZSt (Bundeszentralamt für Steuern / Federal Central Tax Office) provides the Digital Inbox (DIP) as a service for payment service providers to transmit financial data.

This library uses a [generated](./bzst-dip-java-client/pom.xml) client from an [``openapi.yml``](./openapi/openapi.yml)
using [OpenAPI Generator](https://openapi-generator.tech/).

Clients need to register / login
at [BZSt online.portal](https://www.bzst.de/DE/Service/Portalinformation/Massendaten/DIP/dip.html?nn=68828)
through [Elster](https://www.elster.de/elsterweb/start), [BundID](https://id.bund.de/de)
or [BZSt Online-Portal (BOP)](https://www.elster.de/bportal/start).

See the [BZSt Information](https://www.bzst.de/EN/Service/Portalinformation/Login/login_node.html) for more information.

> [!NOTE]
> **BZSt Online-Portal** (deprecated) is different from **BZSt online.portal**.

> [!IMPORTANT]  
> We are currently on version 2.0.0. Since testing with the BZSt is quite difficult,
> **we could not test this version fully**.
>
> If you don't want to take any risk using our client, you can still use the **stable and
tested [version 1.0.3 of this library](https://github.com/xdev-software/bzst-dip-java-client/releases/tag/v1.0.3)**.
>
> If you are **willing to test v2.0.0**, we would very much appreciate your feedback!

## Rationale

We created this client to make it as easy as possible for the developer to use the BZSt DIP.
Through usage of the builder pattern (see [Configuration](#configuration) below), DTOs and a typesafe data model we ensure high usability and readability.

The BZSt provides [XSD](https://www.bzst.de/SharedDocs/Downloads/DE/Digitale_Plattformbetreiber/amtlicher_datensatz_entwurf) that define the expected XML structure and make it possible to generate java classes ([BZSt Docs](https://www.bzst.de/DE/Unternehmen/Intern_Informationsaustausch/DAC7/Handbuecher/handbuecher.html?nn=127558#js-toc-entry2)).<br/>
Our library validates each request through these XSD find errors before they are sent to the DIP.

## Installation
[Installation guide for the latest release](https://github.com/xdev-software/bzst-dip-java-client/releases/latest#Installation)

## Usage

See the [examples in the demo package](./bzst-dip-java-client-demo/src/main/java/software/xdev/).

### Create certificate

For authentification at the BZST you have to create a public- and private-key.

First you have to create a **PEM** file as described on the [BZST Website](https://www.bzst.de/DE/Service/Portalinformation/Massendaten/DIP/dip_node.html) (see 1.7).

OpenSSL can be downloaded from the [website](https://www.openssl.org/).

```
openssl req -newkey rsa-pss -new -nodes -x509 -days 3650 -pkeyopt rsa_keygen_bits:4096 -sigopt rsa_pss_saltlen:32 -keyout key.pem -out cert.pem
```

You also have to set the public key in the [BZST online.portal](https://online.portal.bzst.de/).
Exporting the public key with OpenSSL is easy:

```
openssl rsa -in key.pem -pubout > publicKey.pub
```

Now you can already use these two files to sign your requests. See
the [example with PEM signing](./bzst-dip-java-client-demo\src\main\java\software\xdev\ApplicationWithPem.java).

### Create Java KeyStore (JKS)

If you want to go one step further you can use the Java KeyStore. Then you have to convert the `cert.pem` file to a *
*PKCS12** file.

```
openssl pkcs12 -export -in cert.pem -inkey key.pem -out certificate.p12 -name "certificate"
```

The [keytool](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/keytool.html) is contained in your JDK installation.

```
keytool -importkeystore -srckeystore certificate.p12 -srcstoretype pkcs12 -destkeystore cert.jks
```

The password you insert here, along with the file itself must be set in the client configuration. See example at [app.properties](./bzst-dip-java-client-demo/src/main/resources/app.properties):

```
certificate.keystore.password=SECRET_PASSWORD
certificate.keystore.file=cert.jks
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
and [ApplicationWithConfigurationFromProperties.java](./bzst-dip-java-client-demo/src/main/java/software/xdev/ApplicationWithConfigurationFromProperties.java))
or by creating a configuration object (
see [ApplicationWithDac7.java](./bzst-dip-java-client-demo/src/main/java/software/xdev/ApplicationWithDac7.java)).

```java
public static BzstDipConfiguration createConfiguration()
{
	return new BzstDipConfigurationBuilder()
		.setApplicationCode(BzstDipConfiguration.SupportedApplicationCode.DAC7)
		.setClientId("abcd1234-ab12-ab12-ab12-abcdef123456")
		.setTaxID("86095742719")
		.setTaxNumber("123")
		.setSigningProvider(new SigningProviderByJks("DemoKeystore.jks", "test123"))
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

Messages are sent with
DAC7 ([ApplicationWithDac7.java](./bzst-dip-java-client-demo/src/main/java/software/xdev/ApplicationWithDac7.java)) or
the
CESOP ([ApplicationWithCesop.java](./bzst-dip-java-client-demo/src/main/java/software/xdev/ApplicationWithCesop.java))
Format.

## Support

If you need support as soon as possible, and you can't wait for any pull request, feel free to use [our support](https://xdev.software/en/services/support).

## Contributing
See the [contributing guide](./CONTRIBUTING.md) for detailed instructions on how to get started with our project.

## Dependencies and Licenses
View the [license of the current project](LICENSE) or the [summary including all dependencies](https://xdev-software.github.io/bzst-dip-java-client/dependencies)
