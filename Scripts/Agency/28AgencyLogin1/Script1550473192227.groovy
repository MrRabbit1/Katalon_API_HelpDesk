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

a = WS.sendRequest(findTestObject('Agency/28AgencyLogin'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn.AgencyId', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn.CompanyId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.AccountId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn.AgencyName', "Passio 47 TCV")

WS.verifyElementPropertyValue(a, 'ObjReturn.Address', "47 Trần Cao Vân")

WS.verifyElementPropertyValue(a, 'ObjReturn.Telephone', "0966167423")

WS.verifyElementPropertyValue(a, 'ObjReturn.CreateAt', "00:00 03/10/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn.UpdateAt', "10:53 14/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn.CompanyName', "Passio")

WS.verifyElementPropertyValue(a, 'ObjReturn.UserName', "c")

WS.verifyElementPropertyValue(a, 'ObjReturn.IsDelete', false)

WS.verifyElementPropertyValue(a, 'ObjReturn.NumericalOrder', 1)*/