<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>33CreateRequest</name>
   <tag></tag>
   <elementGuidId>68a4565f-5053-4e54-898c-e22ae87306f5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;request_id\&quot;: 52,\n  \&quot;agency_id\&quot;: 31,\n  \&quot;agency_name\&quot;: \&quot;\&quot;,\n  \&quot;agency_address\&quot;: \&quot;\&quot;,\n  \&quot;request_category_id\&quot;: 3,\n  \&quot;service_id\&quot;: 1,\n  \&quot;service_name\&quot;: \&quot;WIFI\&quot;,\n  \&quot;service_iteam_id\&quot;: 6,\n  \&quot;service_item_name\&quot;: \&quot;Wifi chậm\&quot;,\n  \&quot;request_name\&quot;: \&quot;string\&quot;,\n  \&quot;request_description\&quot;: \&quot;string\&quot;,\n  \&quot;agency_phone\&quot;: \&quot;1234567890\&quot;,\n  \&quot;create_date\&quot;: \&quot;2019-02-15 12:19:13\&quot;,\n  \&quot;update_date\&quot;: \&quot;2019-02-16 12:19:13\&quot;,\n  \&quot;start_time\&quot;: \&quot;2019-02-15 12:00:00\&quot;,\n  \&quot;end_time\&quot;: \&quot;2019-02-16 12:00:00\&quot;,\n  \&quot;request_status\&quot;: \&quot;string\&quot;,\n  \&quot;request_status_value\&quot;: 5,\n  \&quot;request_estimate_time\&quot;: \&quot;12\&quot;,\n  \&quot;ticket_done\&quot;: 0,\n  \&quot;ticket_processing\&quot;: 0,\n  \&quot;total_ticket\&quot;: 0,\n  \&quot;it_supporter_name\&quot;: \&quot;string\&quot;,\n  \&quot;it_supporter_phone\&quot;: \&quot;string\&quot;,\n  \&quot;feedback\&quot;: \&quot;string\&quot;,\n  \&quot;rate\&quot;: 0,\n  \&quot;priority\&quot;: \&quot;string\&quot;,\n  \&quot;priority_value\&quot;: 0,\n  \&quot;list_ticket\&quot;: [\n    {\n      \&quot;ticket_id\&quot;: 0,\n      \&quot;device_id\&quot;: 0,\n      \&quot;device_code\&quot;: \&quot;string\&quot;,\n      \&quot;description\&quot;: \&quot;string\&quot;,\n      \&quot;device_name\&quot;: \&quot;string\&quot;,\n      \&quot;create_date\&quot;: \&quot;string\&quot;,\n      \&quot;creator\&quot;: \&quot;string\&quot;\n    }\n  ]\n}&quot;,
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
   <restUrl>https://mapihelpdesk.reso.vn/agency/create_request?</restUrl>
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
