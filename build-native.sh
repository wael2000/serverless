export GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-java11-21.2.0/Contents/Home
mvn clean package -Pnative -DskipTests
