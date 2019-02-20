<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>34CreateDevice</name>
   <tag></tag>
   <elementGuidId>afd4c6fa-9bef-46d9-a3cb-4e9c826cdd7a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;order\&quot;: 0,\n  \&quot;device_id\&quot;: 100,\n  \&quot;agency_name\&quot;: \&quot;Passio 47 TCV\&quot;,\n  \&quot;agency_id\&quot;: 3,\n  \&quot;device_type_id\&quot;: 1,\n  \&quot;device_type_name\&quot;: \&quot;string\&quot;,\n  \&quot;device_name\&quot;: \&quot;string\&quot;,\n  \&quot;device_code\&quot;: \&quot;string\&quot;,\n  \&quot;guaranty_start\&quot;: \&quot;2019-01-30 00:00:00.000\&quot;,\n  \&quot;guaranty_end\&quot;: \&quot;2019-03-30 00:00:00.000\&quot;,\n  \&quot;guaranty_status\&quot;: \&quot;string\&quot;,\n  \&quot;device_ip\&quot;: \&quot;string\&quot;,\n  \&quot;device_port\&quot;: \&quot;string\&quot;,\n  \&quot;device_account\&quot;: \&quot;string\&quot;,\n  \&quot;device_password\&quot;: \&quot;string\&quot;,\n  \&quot;setting_date\&quot;: \&quot;2019-01-30 00:00:00.000\&quot;,\n  \&quot;other_information\&quot;: \&quot;string\&quot;,\n  \&quot;available\&quot;: true,\n  \&quot;create_date\&quot;: \&quot;2019-01-30 00:00:00.000\&quot;,\n  \&quot;update_date\&quot;: \&quot;2019-01-30 00:00:00.000\&quot;,\n  \&quot;company_name\&quot;: \&quot;string\&quot;,\n  \&quot;comapny_id\&quot;: 0,\n  \&quot;ticket_list\&quot;: [\n    {\n      \&quot;ticket_id\&quot;: 0,\n      \&quot;request_id\&quot;: 0,\n      \&quot;device_id\&quot;: 0,\n      \&quot;description\&quot;: \&quot;string\&quot;,\n      \&quot;create_date\&quot;: \&quot;string\&quot;,\n      \&quot;update_date\&quot;: \&quot;string\&quot;\n    }\n  ]\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://mapihelpdesk.reso.vn/agency/create_device?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
