#oc import-image --confirm quarkus/ubi-quarkus-native-image:21.3-java11 --from=quay.io/quarkus/ubi-quarkus-native-image:21.3-java11
#export GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-java11-21.2.0/Contents/Home
#mvn clean package -Pnative -Dquarkus.kubernetes.deploy=true -DskipTests 
#mvn clean package -Pnative -DskipTests -Dquarkus.package.uber-jar=false 
mvn clean package -DskipTests -Pnative -X