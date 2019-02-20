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

a = WS.sendRequest(findTestObject('ITSupporter/10TaskByRequestTaskID'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn.request_id', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn.request_task_id', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn.task_status', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn.task_detail', "viet")

WS.verifyElementPropertyValue(a, 'ObjReturn.create_by', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.start_time', "00:00:00 01/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.end_time', "00:00:00 02/02/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.priority', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn.pre_task_condition', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn.pre_task_condition', 3)*/

