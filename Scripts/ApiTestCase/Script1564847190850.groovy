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

response = WS.sendRequest(findTestObject('PartTwo/1-Request'))

println(WS.verifyElementPropertyValue(response, 'data[0].email', 'eve.holt@reqres.in'))

println(WS.verifyElementsCount(response, 'data', 3))

println(WS.verifyResponseStatusCode(response, 200))

println(WS.verifyResponseStatusCodeInRange(response, 200, 410))
responseTwo = WS.sendRequest(findTestObject('PartTwo/2-Request'))
println(WS.verifyElementPropertyValue(responseTwo , 'name', 'Hamza'))

responseThree = WS.sendRequest(findTestObject('PartTwo/3-Request'))
println(WS.verifyElementPropertyValue(responseThree, 'name', 'Hamza'))

responseFour = WS.sendRequest(findTestObject('PartTwo/4-Request'))
println(WS.verifyElementPropertyValue(responseFour, 'job', 'QA analyst'))

responseFive = WS.sendRequest(findTestObject('PartTwo/5-Request'))
println(WS.verifyResponseStatusCodeInRange(responseFive, 200, 410))


