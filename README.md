### Install Infomodell Snapshot locally from lib parent folder
mvn install:install-file \
   -Dfile=java-4.0.2-20201028.153942-4.jar \
   -DgroupId=de.fraunhofer.iais.eis.ids.infomodel \
   -DartifactId=java \
   -Dversion=4.0.2-20201028.153942-4 \
   -Dpackaging=jar \
   -DgeneratePom=true
   
   