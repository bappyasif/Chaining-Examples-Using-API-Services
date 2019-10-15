import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

countriesList = WS.sendRequest(findTestObject('Country Info SOAP Service/Countries List'))

// Retrieve List Content From countriesList
String xmlResponse = countriesList.responseBodyContent

// Parsing xmlResponse using XmlSlurper
def xmlParsed = new XmlSlurper().parseText(xmlResponse)

// Node Value From Countries List Needs To Be Checked And Verified
def countryCode = xmlParsed.ListOfCountryNamesByNameResult.tCountryCodeAndName[18].sISOCode.text()

// Country COde Rain Checkz
println('Extracted Code : ' + countryCode)

// Retriving COuntry Code and Storing It To Global Variable
GlobalVariable.countryISOCode = countryCode

capitalCity = WS.sendRequestAndVerify(findTestObject('Country Info SOAP Service/Capital City'))

// XML Content Response For Capital City Name
String capitalCityXmlResponse = capitalCity.responseBodyContent

// Parsing Capital City Name
def capitalCityXMLParsed = new XmlSlurper().parseText(capitalCityXmlResponse)

// Retriving Data
//def ccCode = capitalCityXMLParsed.CapitalCityResponse.CapitalCityResult

// Rain Check
println('Capital City: ' +capitalCityXMLParsed)

// Capital City Rain Check
println((('Capital City OF ' + countryCode) + ' Is : ') +capitalCityXMLParsed)

