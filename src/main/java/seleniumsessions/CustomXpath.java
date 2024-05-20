package seleniumsessions;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//xpath:- It is the address of an element in HTML DOM
		//2 types of xpath:-
		//1.absolute xpath:- Absolute address of an element in HTML DOM
		///html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea
		
		//2.relative/custom xpath
		//xpath functions-
		//1.contains()
		//2.text()
		//3.start-with()
		
		//xpath axes
		//xpath properties
		
		//Meaning of slashes in xpath
		
		//Double slash- //- It will give direct+indirect child elements
		//Single slash- / - It will only give direct child element
		
		//Syntax for writing creating custom xpath:-
		
		//HTMLTag[@attributeName='attributeValue']
		//input[@id='input-email]
		//input[name='email]
		
		//When there are two attributes:-
		//HTMLTag[@attribute1='attributeValue1' and @attribute2='attributeValue2']
		//img[@alt='naveenopencart' and @title='naveenopencart']
		
		//text(): Can be used in labels,links,headers, span
		//syntax
		//HTMLTag[text()='valueOfText']
		//a[text():'Login']
		//a[text():'Register']
		//a[text():'Forgotten Password']
		
		//contains(): with single attribute
		//HTMLTag[contains(@attributeName ,'some value that it contains')]
		//input[contains(@placeholder,'E-mail')]
		//a[contains(@href,'account/forgotten')]
		
		//contains(): with multiple attributes
		//HTMLTag[contains(@attr1,'some value1') and contains(@attr2,'some value2')]
		//input[contains(placeholder,'Mail') and contains(@id,'mail')]
		
		//contains() with one attribute and does not contain with second attribute
		//HTMLTag[contains(@attr1,'some value1') and @attr2='some value2']
		//input[contains(placeholder,'Mail') and @id='input-email')]
		
		//contains with text():
		//HTMLTag[contains(text(),'textValue']
		//a[contains(text(),'Delivery']
		
		//contains with text(): and contains with attribute
		//HTMLTag[contains(text(),'textValue') and contains(@attr2,'value2']
		//a[contains(text(),'Terms') and contains(@href,'information']
		
		//contains with text(): and does not contain with other attributes
		//HTMLTag[contains(text(),'textValue') and @attr2='value2']
		//a[contains(text(),'Account') and @class='list-group-item']
		
		//-------------------------------------------------//
		//starts-with():
		//HTMLTag[starts-with(@attrName,'value')
		//input[starts-with(@placeholder,'E-mail')
		
		//ends-with():- No concept in xpath- Interview question
		
		//-------------------------------------------------//
		//Indexing concept():
		// (//input[@class='form-control'])[1]---for first name
		// (//input[@class='form-control'])[2]---for last name
		// (//input[@class='form-control'])[3]---for email id
		// (//input[@class='form-control'])[4]---for mobile no

		//Indexing concept() with position fn:
		// (//input[@class='form-control'])[position()='1']---for first name

		//Indexing concept() with last element tracking-last function
		// (//input[@class='form-control'])[last()]--- it will locate to last element
		// (//input[@class='form-control'])[last()-(last()-1)]--- it will locate to first element--INTERVIEW QUESTION

		//Homework1
		//locate Help icon on the last section of the footer in Flipkart app
		//(//div[@class='_1HSe4t']//a)[last()]
		
		//Homework2
		//locate Help icon on the last section of the footer in Cricbuzz app
		//((//div[@class='cb-footer cb-col-100 cb-col']//div)[last()-2]//a)[last()-2]











		
		
		
		
		


		
		

	}

}
