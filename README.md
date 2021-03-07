# Read Me

## ShapeMaker

A simple client server application. The client would send requests based on the data contained in the flags to the server using Unix Domain Socket. The Server after processing the request will send the reply back to be shown by the cli.

This is a command line parser written in Scala. It is a multi-module project. I have defined my own flags for printing different shapes on the console. The user enters any valid flag ("-t", "-z" etc.) into the CLI, parser interprets it and shows the corresponding output pattern. If an invalid flag is used by the user, an exception is thrown which is handled by displaying the details of the valid flags.

To package the application I have used the sbt-native-packager (universal plugin). It creates a distribution that is not tied to any particular platform.

### Dependencies Used :

> addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.6.1")  //For native packager

> addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6") //For assembly

### Plugins Enabled :

> enablePlugins(UniversalPlugin)

> enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin) //For GraalVm Native Image

### Create a .zip file (which contains the bin folder which contains the runnable script file) :

> modulename/universal:packageBin

(Visit this location -> ShapeMaker/CliParser/target/universal)

### To run the application :

> unzip cliparser-0.1.0-SNAPSHOT.zip //unzip the folder in the above mentioned location

> ./cliparser -s // ./applicationname -flag

### For GraalVm native-image:

> ./CliParser-assembly-0.1.0-SNAPSHOT -z // ./modulename-assembly-version-SNAPSHOT -flag

(Run this command in the location -> ShapeMaker/CliParser/target/scala-2.12)

### Available flags :

> ./cliparser -t    : prints a triangle
     
              -s	: prints a square
    
              -r	: prints a rectangle
    
              -c	: prints a circle
    
              -z	: prints a dog emoji
