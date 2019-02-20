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

a = WS.sendRequest(findTestObject('Agency/37GetTicketByRequestID'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].TicketId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].DeviceId', 43)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceItemName', "Wifi chậm")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Desciption', "Anh test")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', "09:48 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].UpdateDate', "09:48 16/01/2019")*/

