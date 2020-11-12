# IDS Smart data app template
**Contact:** Dominic Reuter <dominic.reuter@fit.fraunhofer.de>

This is an example template for a smart-data-app that helps you to get started.
It provides an HTTP API for the following endpoints:
- Data Input
- Data Output
- Configuration / Parameterization
- Processing
- Status Information
- Usage Control

## Getting started

At first clone the repository: https://gitlab.cc-asp.fraunhofer.de/fhg-fit-ids/ids-app-template.git

**Until the next information model release:**
The latest snapshot version can be found in the **lib** folder wihtin the repository.
It needs to be installed into your local Maven Repository by hand.

**After the next information model release:**
Library can be loaded fom a public maven repository, so there is no need to install it manually.

### Add the infomodel release manually

mvn install:install-file \
   -Dfile=./lib/java-4.0.2-20201028.153942-4.jar \
   -DgroupId=de.fraunhofer.iais.eis.ids.infomodel \
   -DartifactId=java \
   -Dversion=4.0.2-20201028.153942-4 \
   -Dpackaging=jar \
   -DgeneratePom=true
   
## Endpoint description
