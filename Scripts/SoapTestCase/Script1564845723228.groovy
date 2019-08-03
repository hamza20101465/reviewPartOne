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

response = WS.sendRequest(findTestObject('PartOne/1-Request - Add'))

println(WS.verifyElementPropertyValue(response, 'AddResponse.AddResult', '320'))

responseTwo = WS.sendRequest(findTestObject('PartOne/2-Request-Divide'))

println(WS.verifyElementPropertyValue(responseTwo, 'DivideResponse.DivideResult', '10'))

responseThree = WS.sendRequest(findTestObject('PartOne/3-Request-multiply'))

println(WS.verifyElementPropertyValue(responseThree, 'MultiplyResponse.MultiplyResult', '10'))

responseFour = WS.sendRequest(findTestObject('PartOne/3-Request-Substract'))

WS.verifyElementPropertyValue(responseFour, 'SubtractResponse.SubtractResult', '10')

println WS.verifyElementText(responseFour, 'SubtractResponse.SubtractResult', '10')

