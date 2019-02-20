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

a = WS.sendRequest(findTestObject('Request/52RequestHistoryInRequest'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestHistoryId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].RequestId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].PreSupporter_Name', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].PreStatus', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', "11:20 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].StartDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].EndDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestHistoryId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].RequestId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].PreSupporter_Name', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].PreStatus', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CreateDate', "11:20 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].StartDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].EndDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].RequestHistoryId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].RequestId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].PreSupporter_Name', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].PreStatus', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].CreateDate', "11:20 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].StartDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].EndDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].RequestHistoryId', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].RequestId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].PreSupporter_Name', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].PreStatus', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].CreateDate', "11:21 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].StartDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].EndDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].RequestHistoryId', 6)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].RequestId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].PreSupporter_Name', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].PreStatus', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].CreateDate', "15:38 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].StartDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].EndDate', null)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].RequestHistoryId', 7)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].RequestId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].PreSupporter_Name', "Phạm Phú Tiến")

WS.verifyElementPropertyValue(a, 'ObjReturn[5].PreStatus', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].CreateDate', "15:39 17/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[5].StartDate', "01/17/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[5].EndDate', "01/17/2019")*/
