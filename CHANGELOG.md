# 1.0.2

* The alias for the private key in the keystore is now configurable (
  Properties: `certificate.keystore.private.key.alias` or
  Code: `BzstDipConfigurationBuilder#setKeyStorePrivateKeyAlias`)
* It is now possible to deactivate the internal validation of the tax-id (
  Properties: `tax.id.validate` or
  Code: `BzstDipConfigurationBuilder#setValidateTaxID`)
