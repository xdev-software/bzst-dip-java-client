# 2.0.0

* Now supports the CESOP-Format (and the DAC7-Format).
* Uses a client that is auto generated by OpenAPI. This makes the library more robust for future changes of the API.
* Certificates can now be defined with a ``SigningProvider``.

# 1.0.3

* ReportableSellerCreator can now create "Rechtsträger" like a company.

# 1.0.2

* The alias for the private key in the keystore is now configurable (
  Properties: `certificate.keystore.private.key.alias` or
  Code: `BzstDipConfigurationBuilder#setKeyStorePrivateKeyAlias`)
* It is now possible to deactivate the internal validation of the tax-id (
  Properties: `tax.id.validate` or
  Code: `BzstDipConfigurationBuilder#setValidateTaxID`)
