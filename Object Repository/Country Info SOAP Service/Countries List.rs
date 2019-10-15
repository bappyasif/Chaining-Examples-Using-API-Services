<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Countries List By Name</description>
   <name>Countries List</name>
   <tag></tag>
   <elementGuidId>36e0f781-064d-41b8-b7ab-b42c0cc0a3de</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;Envelope xmlns=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot;>
    &lt;Body>
        &lt;ListOfCountryNamesByName xmlns=&quot;http://www.oorsprong.org/websamples.countryinfo&quot;/>
    &lt;/Body>
&lt;/Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceFunction>ListOfCountryNamesByName</soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyElementText(response, 'ListOfCountryNamesByNameResponse.ListOfCountryNamesByNameResult.tCountryCodeAndName[0].sISOCode', 'AX')


WS.verifyElementText(response, 'ListOfCountryNamesByNameResponse.ListOfCountryNamesByNameResult.tCountryCodeAndName[18].sISOCode', 'BD')</verificationScript>
   <wsdlAddress>http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL</wsdlAddress>
</WebServiceRequestEntity>
