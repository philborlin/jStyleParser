[![Build Status](https://travis-ci.org/philborlin/jStyleParser.png)](https://travis-ci.org/philborlin/jStyleParser)

jStyleParser
============

jStyleParser parses CSS2 and CSS3 into structures which can be assigned to DOM elements.
While handling errors, it is a user agent conforming to specification.

All the source code of jStyleParser itself is licensed under the GNU Lesser General
Public License (LGPL), version 3. A copy of the LGPL can be found 
in the LICENSE file.

Building
--------

- jStyleParser uses [sbt 0.13](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html)
to build the project.
	- Use `sbt compile` to compile the project
	- Use `sbt test` to run the tests
	- Use `sbt eclipse` to create an Eclipse project that can be imported using `Import Existing Projects into Workspace`

- ANTLR 3.1 is used to generate Lexer and Parser from grammar files. Generated output is part 
of project to make compilation easier. The sbt-antlr plugin may be integrated in the future.
Pull request appreciated.

Required Libraries
------------------
The Xerces and the NekoHTML libraries may be replaced by any other DOM implementation.
