# graalTest
Example of Graal Trouble for https://www.magicator.com

After generating the Jar, install GraalVM native-image and run native-image -cp ./graalTest.jar -H:Name=test -H:Class=io.manycore.Main -H:+ReportExceptionStackTraces io.manycore.Main --no-fallback -H:EnableURLProtocols=http

