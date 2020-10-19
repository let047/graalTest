# graalTest
Example of Graal Trouble for https://www.magicator.com

After generating the Jar, 

- install GraalVM native-image 
- set the environment variable export PROD=1
- compile it without the configuration file run native-image -cp ./graalTest.jar -H:Name=test -H:Class=io.manycore.Main -H:+ReportExceptionStackTraces io.manycore.Main --no-fallback -H:EnableURLProtocols=http
- launch it: ./test
- recompile with configuration file: native-image -cp ./graalTest.jar -H:ReflectionConfigurationFiles=./reflection-config.json -H:Name=test -H:Class=io.manycore.Main -H:+ReportExceptionStackTraces io.manycore.Main --no-fallback -H:EnableURLProtocols=http
- ./test works!
