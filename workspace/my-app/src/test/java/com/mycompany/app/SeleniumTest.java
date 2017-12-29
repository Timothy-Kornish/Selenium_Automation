package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SeleniumTest {

	/*
	 * Commands to run in terminal in my-app directory:
	 * 
	 * mvn clean
	 * mvn compile
	 * mvn test
	 * 
	 * Can create xml file with specific classes to run test of. Add config to POM.xml
	 * <configuration>
        <suiteXmlFiles>
         <suiteXmlFile>testng.xml</suiteXmlFile>
        </suiteXmlFiles>
       </configuration>
     *
     *  To run specific file without xml file from command line:
     *  
     *  mvn -Dtest=SeleniumTest test
       
     *  To run specific profile in pom.xml file with id:Smoke file from command line:
     *  
     *  mvn test -P Smoke
	 */
	
	@Test
	public void BrowserAutomation() {
		System.out.println("Running BrowserAutomation Method"); 

	}
	
	@Test
	public void ElementsUI() {
		System.out.println("Running ElementsUI Method"); 

	}
}
