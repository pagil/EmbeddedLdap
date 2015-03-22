EmbeddedLdap server project
===========================

Description
-----------

This project was created using embedded-sample as an example:
https://github.com/truemate/embedded-sample

This project starts embedded LDAP server and loads sample data into it:
- /EmbeddedLdap/src/main/resources/setup_data.ldif

It is possbile to use data from file:
- /EmbeddedLdap/src/main/resources/import.ldif

However, in this case it is necessary to update ldap.propeties accordingly:
- sample.ldap.base=dc=jayway,dc=se
replace with
- sample.ldap.base=dc=example,dc=com
