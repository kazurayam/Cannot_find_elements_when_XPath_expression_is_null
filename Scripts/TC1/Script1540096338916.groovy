import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.angularjshub.com/examples/forms/textinputs/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_AngularJS Hub  Text Inputs/iframe_Example_exampleIFrame'), 10)

WebUI.closeBrowser()