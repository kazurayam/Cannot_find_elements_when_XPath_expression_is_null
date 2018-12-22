import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.angularjshub.com/examples/forms/textinputs/')

TestObject to = findTestObject('Object Repository/Page_AngularJS Hub  Text Inputs/iframe_Example_exampleIFrame')

ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT)
println mapper.writeValueAsString(to)

WebUI.verifyElementPresent(to, 10)

WebUI.closeBrowser()