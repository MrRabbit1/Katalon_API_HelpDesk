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

a = WS.sendRequest(findTestObject('ITSupporter/01Login'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn.order', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.it_supporter_id', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.it_supporter_name', "Lê Hồng Ân")

WS.verifyElementPropertyValue(a, 'ObjReturn.account_id', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn.username', "lehongan")

WS.verifyElementPropertyValue(a, 'ObjReturn.old_username', null)

WS.verifyElementPropertyValue(a, 'ObjReturn.it_supporter_phone', "0152012421")

WS.verifyElementPropertyValue(a, 'ObjReturn.it_supporter_mail', "anh@gmail.com")

WS.verifyElementPropertyValue(a, 'ObjReturn.gender', "1")

WS.verifyElementPropertyValue(a, 'ObjReturn.address', "742 Lê Đức Thọ")

WS.verifyElementPropertyValue(a, 'ObjReturn.rating_avg', 4.4375)

WS.verifyElementPropertyValue(a, 'ObjReturn.working_status', true)

WS.verifyElementPropertyValue(a, 'ObjReturn.available', false)

WS.verifyElementPropertyValue(a, 'ObjReturn.is_online', true)

WS.verifyElementPropertyValue(a, 'ObjReturn.create_date', "01:00:00 03/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn.update_date', "16:59:21 13/02/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.request_pending', "")

WS.verifyElementPropertyValue(a, 'ObjReturn.service_it_supporter_name', "")

WS.verifyElementPropertyValue(a, 'ObjReturn.password', "e10adc3949ba59abbe56e057f20f883e")

WS.verifyElementPropertyValue(a, 'ObjReturn.experience_months', "")

WS.verifyElementPropertyValue(a, 'ObjReturn.Id', "")

WS.verifyElementPropertyValue(a, 'ObjReturn.role_id', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn.role_name', "ITSupporter")

WS.verifyElementPropertyValue(a, 'ObjReturn.RoleName', "ITSupporter")*/