[![Latest version](https://img.shields.io/maven-central/v/software.xdev/bzst-dip-java-client?logo=apache%20maven)](https://mvnrepository.com/artifact/software.xdev/bzst-dip-java-client)
[![Build](https://img.shields.io/github/actions/workflow/status/xdev-software/bzst-dip-java-client/checkBuild.yml?branch=develop)](https://github.com/xdev-software/bzst-dip-java-client/actions/workflows/checkBuild.yml?query=branch%3Adevelop)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=xdev-software_bzst-dip-java-client&metric=alert_status)](https://sonarcloud.io/dashboard?id=xdev-software_bzst-dip-java-client)

# bzst-dip-java-client

Client for using
the [Digitaler POSteingang of the BZSt online.portal](https://www.bzst.de/DE/Service/Portalinformation/Massendaten/DIP/dip.html?nn=68828).

## Information about BZST DIP

To create the XML-files we created java classes from the xsd provided on
the [BZST-Website](https://www.bzst.de/DE/Unternehmen/Intern_Informationsaustausch/DAC7/Handbuecher/handbuecher.html?nn=127558#js-toc-entry2) ([Direct download](https://www.bzst.de/SharedDocs/Downloads/DE/Digitale_Plattformbetreiber/amtlicher_datensatz_entwurf)).

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

## Support

If you need support as soon as possible, and you can't wait for any pull request, feel free to
use [our support](https://xdev.software/en/services/support).

## Contributing
See the [contributing guide](./CONTRIBUTING.md) for detailed instructions on how to get started with our project.

## Dependencies and Licenses
View the [license of the current project](LICENSE) or the [summary including all dependencies](https://xdev-software.github.io/bzst-dip-java-client/dependencies/)
