package day5;

import org.openqa.selenium.By;

public class DicisionMaking {
	
/* Viết chương trình nhập số n từ bàn phím, in ra thứ trong tuần
- n= 2~7: in ra "Thứ" + n
- n= 8: in ra "Chủ nhật"
- n != [2,8]: in ra "nhập lại n”

 */
	public void inThutrongtuan (int n) {
		switch (n) {
		case 2: 
			System.out.println("monday");
			break;
		case 3: 
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("webnesday");
			break;
		case 5: 
			System.out.println("thusday");
			break;
		case 6:
		     System.out.println("friday");
		     break;
		case 7:
			System.out.println("saturday");
			break; 
		default:
				System.out.println("Please re-enter the value");
			
		}
		
	}
	
	public By getLocator (String locatorType, String locatorValue) {
		By result = null;
		switch (locatorType) {
		case"id":
		result = By.id(locatorValue); break;
		case "name":
		result = By.name(locatorValue);break;
		case "linkText":
			result = By.linkText(locatorValue);break;
		case "Selector":
			result = By.cssSelector(locatorValue);break;
		case "partialLinkText":
			result = By.partialLinkText(locatorValue);break;
		case "tagName":
			result = By.tagName(locatorValue);break;
		case "xpath":
			result = By.xpath(locatorValue);break;
			default:
				System.out.println("do nothing");break;
		}
		return result;
	}

}
