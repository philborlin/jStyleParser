organization := "cz.vutbr"

name := "jStyleParser"

version := "1.14"

homepage := Some(url("https://github.com/philborlin/jStyleParser"))

licenses += ("GNU Lesser General Public License, version 3.0", url("http://opensource.org/licenses/lgpl-3.0.html"))

scmInfo := Some(ScmInfo(url("https://github.com/philborlin/jStyleParser.git"), "scm:git@github.com:philborlin/jStyleParser.git"))

// Dependencies
libraryDependencies ++= Seq(
	"org.antlr" % "antlr-runtime" % "3.1",
	"net.sourceforge.nekohtml" % "nekohtml" % "1.9.19",
	"xerces" % "xercesImpl" % "2.11.0",
	"xml-apis" % "xml-apis" % "1.0.b2"
)

// Testing
libraryDependencies ++= Seq(
	"com.novocode" % "junit-interface" % "0.10" % "test"
)

// Logging
libraryDependencies ++= Seq(
	"ch.qos.logback" % "logback-classic" % "1.0.13",
	"ch.qos.logback" % "logback-core" % "1.0.13",
	"org.slf4j" % "slf4j-api" % "1.7.5"
)

javacOptions ++= Seq("-encoding", "utf-8")

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java

unmanagedSourceDirectories in Compile <<= (javaSource in Compile)(Seq(_))

unmanagedSourceDirectories in Test <<= (javaSource in Test)(Seq(_))

publishTo := Some("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")

pomIncludeRepository := { _ => false }

autoScalaLibrary := false

crossPaths := false

pomExtra := (
	<developers>
		<developer>
			<id>radkovo</id>
			<name>Radek Burget</name>
			<url>http://www.fit.vutbr.cz/~burgetr</url>
		</developer>
	</developers>
)