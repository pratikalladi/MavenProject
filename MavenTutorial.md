# Guide to Maven

I think that uploading your code to the maven central repository, starting with just a program you wrote in java, can be divided into three main steps:

1. *Install Maven*  

  a.) Go to [link to maven download](https://maven.apache.org/download.cgi) and download the the binary zip file (the one that reads "apache-maven-3.6.3-bin.zip").  
  b.) Unzip the file to Program Files.  
  c.) For Windows: Add this bin file to the PATH variable by hitting the shift key and the pause key selecting the “Advanced” tab, and the “Environment Variables” button, then adding or selecting the PATH variable in the user variables with the value C:\Program Files\apache-maven-3.6.3\bin.  You should also check to make sure environment variable is set and points to your JDK installation, by entering "echo %JAVA_HOME%" into your command line - it should spit out "C:\Program Files\Java\jdk1.7.0_51".  If not, edit the path again.  Here's a nice link that explains how to do this:  [link to maven installation instructions](https://maven.apache.org/install.html).  
  d.) Check to see if maven is installed by entering "mvn -v" into the command line.  It should result in something akin to this message:  
  Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)  
Maven home: C:\Program Files\apache-maven-3.6.3\bin\..  
Java version: 11.0.4, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-11.0.4  
Default locale: en_US, platform encoding: Cp1252  
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"  

2. *Create a jar file using Maven*  

 a.) This video sums it up nicely (they use a code editor I'm unfamiliar with, but nevertheless is very helpful and guided me in the right direction):  
 [video link](https://www.youtube.com/watch?v=a7libRN0pK0&t=487s)  
 b.) Test to see if you did this correctly by going to the command line, cd-ing to the artifact id, and entering "java -cp target/<yourartifactid>-1.0-SNAPSHOT.jar<yourgroupid>.App" - it should spit out Hello World! if you did everything correctly.  
  
3. *Upload to Maven Central Repository  
  
  a.) Push your code to a github repository!   
  b.) Here's a video that sums up the rest nicely: [video link](https://www.youtube.com/watch?v=bxP9IuJbcDQ&t=14s).    

That's it!  I hope..
