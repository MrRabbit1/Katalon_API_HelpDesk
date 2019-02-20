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

a = WS.sendRequest(findTestObject('ITSupporter/14ViewITSupporterStatistic'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].ServiceName', "WIFI")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].SupportTimeByTimes', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].SupportTimeByHour', "0")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].ServiceName', "POS")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].SupportTimeByTimes', 9)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].SupportTimeByHour', "0")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].ServiceName', "SOFTWARE")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].SupportTimeByTimes', 9)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].SupportTimeByHour', "0")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].ServiceName', "EMAIL")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].SupportTimeByTimes', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].SupportTimeByHour', "0")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].ServiceName', "tét3")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].SupportTimeByTimes', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].SupportTimeByHour', "0")

WS.verifyElementPropertyValue(a, 'ObjReturn[5].ServiceName', "a")

WS.verifyElementPropertyValue(a, 'ObjReturn[5].SupportTimeByTimes', 0)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].SupportTimeByHour', "0")

WS.verifyElementPropertyValue(a, 'ObjReturn[6].ServiceName', "CAMERA")

WS.verifyElementPropertyValue(a, 'ObjReturn[6].SupportTimeByTimes', 9)

WS.verifyElementPropertyValue(a, 'ObjReturn[6].SupportTimeByHour', "677.38")*/
