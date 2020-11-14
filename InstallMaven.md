#Install Maven

 1. Go to this site[https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi) and download the the binary zip file (the one that reads "apache-maven-3.6.3-bin.zip"). 
  
 2. Unzip the file to any directory on your computer.  
  
 3. For Windows: Add this bin file to the PATH variable by hitting the shift key and the pause key selecting the “Advanced” tab, and the “Environment Variables” button, then adding or selecting the PATH variable in the user variables with the value C:\<directory you unzipped the file to>\apache-maven-3.6.3\bin.  You should also check to make sure environment variable is set and points to your JDK installation, by entering "echo %JAVA_HOME%" into your command line - it should spit out "C:\Program Files\Java\jdk1.7.0_51".  If not, edit the path again.  Here's a nice link that explains how to do this:  [link to maven installation instructions](https://maven.apache.org/install.html).  
  
 4. Check to see if maven is installed by entering "mvn -v" into the command line.  It should result in something in this message:  
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)  
Maven home: C:\Program Files\apache-maven-3.6.3\bin\..  
Java version: 11.0.4, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-11.0.4  
Default locale: en_US, platform encoding: Cp1252  
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows" 
