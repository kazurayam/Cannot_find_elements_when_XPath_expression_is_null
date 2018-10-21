import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.angularjshub.com/examples/forms/textinputs/')

WebUI.click(findTestObject('Object Repository/Page_AngularJS Hub  Text Inputs/html_charset UTF-8ngcloakng-cl'))

WebUI.closeBrowser()