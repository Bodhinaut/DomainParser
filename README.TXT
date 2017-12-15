------------------------------------------------------------------------
This is the project README file
This program mainly focuses on the implementaion of File IO and 
exception handling in regard to parsing Strings of domain names
------------------------------------------------------------------------

PROJECT TITLE: DomainParser

PURPOSE OF PROJECT: Takes an input file containing domain names for various
sites and parses (extracts) the individual parts and writes them to an output file.

VERSION or DATE: September 1, 2017 

HOW TO START THIS PROJECT: Open the files in the BlueJ IDE.
BlueJ was used to create this project. You want to run the main method which
houses the parseDomains method which performs the parsing of the domains.

AUTHORS: Kyle M. Shive

USER INSTRUCTIONS: In the main method pass the arguments,
String inputFile and String outputFile, to the method parseDomains. 
This method will read each domain from the input file, parse each domain part,
and write each to the output file.

Below is the UML for the program

------------------------------------------------------------------------------------------------
                                           DomainAnalyzer
------------------------------------------------------------------------------------------------
-domainName: String
------------------------------------------------------------------------------------------------
+DomainAnalyzer()
+DomainAnalyzer(domainName: String)

+getDomainName(): String
+setDomainName(domainName: String): void
+getTLD(): String
+getSLD(): String
+getSubdomainAtLevel(level: int): String
+getDomainPartCount(): int

+toString(): String <<Override>>
------------------------------------------------------------------------------------------------
