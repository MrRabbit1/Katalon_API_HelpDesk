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

a = WS.sendRequest(findTestObject('Company/26Company'))

WS.verifyResponseStatusCode(a, 200)

WS.verifyElementPropertyValue(a, 'IsError', false)

/*WS.verifyElementPropertyValue(a, 'ObjReturn[0].CompanyId', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CompanyName', "Passio")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].Description', "Coffee ")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].CreateDate', "00:00 25/09/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].UpdateDate', "16:21 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[0].NumericalOrder', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].PercentForITSupporterRate', 30)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].PercentForITSupporterExp', 30)

WS.verifyElementPropertyValue(a, 'ObjReturn[0].PercentForITSupporterFamiliarWithAgency', 40)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CompanyId', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CompanyName', "Uni space")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].Description', "Coffee")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].CreateDate', "00:00 02/01/2018")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].UpdateDate', "15:07 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[1].NumericalOrder', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].PercentForITSupporterRate', 100)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].PercentForITSupporterExp', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn[1].PercentForITSupporterFamiliarWithAgency', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].CompanyId', 14)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].CompanyName', "Reso")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].Description', "Phong 201 Toa nha QTSC Incubator")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].CreateDate', "10:56 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].UpdateDate', "15:07 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[2].NumericalOrder', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].PercentForITSupporterRate', 100)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].PercentForITSupporterExp', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[2].PercentForITSupporterFamiliarWithAgency', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].CompanyId', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].CompanyName', "Wisky")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].Description', "Phát triển phần mềm")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].CreateDate', "11:10 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].UpdateDate', "16:57 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[3].NumericalOrder', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].PercentForITSupporterRate', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].PercentForITSupporterExp', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[3].PercentForITSupporterFamiliarWithAgency', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].CompanyId', 18)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].CompanyName', "Test1")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].Description', "Xem")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].CreateDate', "16:24 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].UpdateDate', "14:35 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[4].NumericalOrder', 5)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].PercentForITSupporterRate', 29)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].PercentForITSupporterExp', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[4].PercentForITSupporterFamiliarWithAgency', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].CompanyId', 19)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].CompanyName', "Xem")

WS.verifyElementPropertyValue(a, 'ObjReturn[5].Description', "Chi")

WS.verifyElementPropertyValue(a, 'ObjReturn[5].CreateDate', "16:24 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[5].UpdateDate', "17:04 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[5].NumericalOrder', 6)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].PercentForITSupporterRate', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].PercentForITSupporterExp', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[5].PercentForITSupporterFamiliarWithAgency', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[6].CompanyId', 20)

WS.verifyElementPropertyValue(a, 'ObjReturn[6].CompanyName', "Test3")

WS.verifyElementPropertyValue(a, 'ObjReturn[6].Description', "Nhánh")

WS.verifyElementPropertyValue(a, 'ObjReturn[6].CreateDate', "16:25 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[6].UpdateDate', "17:04 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[6].NumericalOrder', 7)

WS.verifyElementPropertyValue(a, 'ObjReturn[6].PercentForITSupporterRate', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[6].PercentForITSupporterExp', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[6].PercentForITSupporterFamiliarWithAgency', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[7].CompanyId', 21)

WS.verifyElementPropertyValue(a, 'ObjReturn[7].CompanyName', "Test4")

WS.verifyElementPropertyValue(a, 'ObjReturn[7].Description', "Hợp")

WS.verifyElementPropertyValue(a, 'ObjReturn[7].CreateDate', "16:25 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[7].UpdateDate', "17:04 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[7].NumericalOrder', 8)

WS.verifyElementPropertyValue(a, 'ObjReturn[7].PercentForITSupporterRate', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[7].PercentForITSupporterExp', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[7].PercentForITSupporterFamiliarWithAgency', 4)

WS.verifyElementPropertyValue(a, 'ObjReturn[8].CompanyId', 22)

WS.verifyElementPropertyValue(a, 'ObjReturn[8].CompanyName', "Test5")

WS.verifyElementPropertyValue(a, 'ObjReturn[8].Description', "Đồng")

WS.verifyElementPropertyValue(a, 'ObjReturn[8].CreateDate', "16:25 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[8].UpdateDate', "17:04 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[8].NumericalOrder', 9)

WS.verifyElementPropertyValue(a, 'ObjReturn[8].PercentForITSupporterRate', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[8].PercentForITSupporterExp', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[8].PercentForITSupporterFamiliarWithAgency', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[9].CompanyId', 25)

WS.verifyElementPropertyValue(a, 'ObjReturn[9].CompanyName', "Test7")

WS.verifyElementPropertyValue(a, 'ObjReturn[9].Description', "sdagi")

WS.verifyElementPropertyValue(a, 'ObjReturn[9].CreateDate', "16:29 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[9].UpdateDate', "16:29 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[9].NumericalOrder', 10)

WS.verifyElementPropertyValue(a, 'ObjReturn[9].PercentForITSupporterRate', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[9].PercentForITSupporterExp', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[9].PercentForITSupporterFamiliarWithAgency', 1)

WS.verifyElementPropertyValue(a, 'ObjReturn[10].CompanyId', 27)

WS.verifyElementPropertyValue(a, 'ObjReturn[10].CompanyName', "Test9")

WS.verifyElementPropertyValue(a, 'ObjReturn[10].Description', "ahgiu")

WS.verifyElementPropertyValue(a, 'ObjReturn[10].CreateDate', "16:29 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[10].UpdateDate', "16:29 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[10].NumericalOrder', 11)

WS.verifyElementPropertyValue(a, 'ObjReturn[10].PercentForITSupporterRate', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[10].PercentForITSupporterExp', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[10].PercentForITSupporterFamiliarWithAgency', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[11].CompanyId', 28)

WS.verifyElementPropertyValue(a, 'ObjReturn[11].CompanyName', "Test10")

WS.verifyElementPropertyValue(a, 'ObjReturn[11].Description', "jgaiui")

WS.verifyElementPropertyValue(a, 'ObjReturn[11].CreateDate', "16:29 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[11].UpdateDate', "16:29 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[11].NumericalOrder', 12)

WS.verifyElementPropertyValue(a, 'ObjReturn[11].PercentForITSupporterRate', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[11].PercentForITSupporterExp', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[11].PercentForITSupporterFamiliarWithAgency', 3)

WS.verifyElementPropertyValue(a, 'ObjReturn[12].CompanyId', 29)

WS.verifyElementPropertyValue(a, 'ObjReturn[12].CompanyName', "Test11")

WS.verifyElementPropertyValue(a, 'ObjReturn[12].Description', "gani")

WS.verifyElementPropertyValue(a, 'ObjReturn[12].CreateDate', "16:29 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[12].UpdateDate', "16:29 10/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[12].NumericalOrder', 13)

WS.verifyElementPropertyValue(a, 'ObjReturn[12].PercentForITSupporterRate', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[12].PercentForITSupporterExp', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[12].PercentForITSupporterFamiliarWithAgency', 2)

WS.verifyElementPropertyValue(a, 'ObjReturn[13].CompanyId', 34)

WS.verifyElementPropertyValue(a, 'ObjReturn[13].CompanyName', "test15")

WS.verifyElementPropertyValue(a, 'ObjReturn[13].Description', "Dịch vụ bán hàng")

WS.verifyElementPropertyValue(a, 'ObjReturn[13].CreateDate', "11:33 15/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[13].UpdateDate', "11:33 15/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[13].NumericalOrder', 14)

WS.verifyElementPropertyValue(a, 'ObjReturn[13].PercentForITSupporterRate', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[13].PercentForITSupporterExp', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[13].PercentForITSupporterFamiliarWithAgency', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[14].CompanyId', 36)

WS.verifyElementPropertyValue(a, 'ObjReturn[14].CompanyName', "asda")

WS.verifyElementPropertyValue(a, 'ObjReturn[14].Description', "dasd")

WS.verifyElementPropertyValue(a, 'ObjReturn[14].CreateDate', "14:13 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[14].UpdateDate', "14:13 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[14].NumericalOrder', 15)

WS.verifyElementPropertyValue(a, 'ObjReturn[14].PercentForITSupporterRate', 12)

WS.verifyElementPropertyValue(a, 'ObjReturn[14].PercentForITSupporterExp', 32)

WS.verifyElementPropertyValue(a, 'ObjReturn[14].PercentForITSupporterFamiliarWithAgency', 23)

WS.verifyElementPropertyValue(a, 'ObjReturn[15].CompanyId', 37)

WS.verifyElementPropertyValue(a, 'ObjReturn[15].CompanyName', "tessting")

WS.verifyElementPropertyValue(a, 'ObjReturn[15].Description', "sdfgsdfsdfsd")

WS.verifyElementPropertyValue(a, 'ObjReturn[15].CreateDate', "15:15 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[15].UpdateDate', "15:15 16/01/2019")

WS.verifyElementPropertyValue(a, 'ObjReturn[15].NumericalOrder', 16)

WS.verifyElementPropertyValue(a, 'ObjReturn[15].PercentForITSupporterRate', 100)

WS.verifyElementPropertyValue(a, 'ObjReturn[15].PercentForITSupporterExp', 100)

WS.verifyElementPropertyValue(a, 'ObjReturn[15].PercentForITSupporterFamiliarWithAgency', 100)*/

