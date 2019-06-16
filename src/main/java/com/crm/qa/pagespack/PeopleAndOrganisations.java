package com.crm.qa.pagespack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import com.crm.qa.basepack.BaseClass;
import com.crm.qa.utilpack.TestCommonUtiles;

public class PeopleAndOrganisations extends BaseClass{
	
	@FindBy(xpath="//a[@class='btn-secondary btn-small ember-view']")
	public WebElement addPerson;
	
	public void clickAddPerson() {
		addPerson.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'New Person')]")
	public WebElement titleNewPerson;
	
	public String title() {
		String title=titleNewPerson.getText();
		return title;
	}
	@FindBy (xpath="//select[@name='party:j_id107:j_id115']")
	public WebElement titleDropDown;
	
	@FindBy(xpath="//input[@id='party:fnDecorate:fn']")
	public WebElement firstNameTextBox;
	
	@FindBy(xpath="//input[@id='party:lnDecorate:ln']")
	public WebElement lastNameTextBox;
	
	@FindBy(xpath="//input[@id='party:roleDecorate:jobTitle']")
	public WebElement jobTitleTextBox;
	
	@FindBy(xpath="//input[@id='party:orgDecorate:org']")
	public WebElement organisationTextBox;
	
	@FindBy(xpath="//input[@id='party:tagsDecorate:tagComboBox']")
	public WebElement tagsTextBox;
	
	@FindBy(xpath="//input[@id='party:j_id324:0:phnDecorate:number']")
	public WebElement phoneNumberTextBox;
	
	@FindBy(xpath="//select[@name='party:j_id324:0:phnDecorate:j_id327']")
	public WebElement mobileDropDown;
	
	@FindBy(xpath="//input[@id='party:j_id341:0:emlDecorate:nmbr']")
	public WebElement emailAdressTextBox;
	
	@FindBy(xpath="//input[@type='text'][@name='party:j_id341:0:emlDecorate:nmbr']")
	public WebElement emailAdressType;
	
	@FindBy(xpath="//input[@id='party:j_id369:0:webDecorate:web']")
	public WebElement websitesTextBox;
	
	@FindBy(xpath="//input[@type='text'][@name='party:j_id369:0:webDecorate:web']")
	public WebElement websitesDropDown;
	
	@FindBy(xpath="//input[@type='text'][@name='party:j_id369:0:webDecorate:web']")
	public WebElement websitesType;
	
	@FindBy(xpath="//span[contains(text(),'Ad‌d an ad‌dress')]")
	public WebElement addAdresslink;
	
	@FindBy(xpath="//textarea[@id='party:j_id388:0:strDecorate:str']")
	public WebElement addAdress;
	
	@FindBy(xpath="//input[@id='party:save']")
	public WebElement saveBtn;
	
	public void addNewPerson(String title, String firstName, String lastName, String jobTitle, String organisation, 
			String tags,String phoneNumber, String email, String website, String address ) throws Throwable {
		
		TestCommonUtiles.selectValueFromDropDown(title, titleDropDown);
		firstNameTextBox.click();
		firstNameTextBox.sendKeys(firstName);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		firstNameTextBox.click();
		js.executeScript("document.getElementById('party:fnDecorate:fn').value='"+firstName+"';");
		lastNameTextBox.click();
		js.executeScript("document.getElementById('party:lnDecorate:ln').value='"+lastName+"';");
		jobTitleTextBox.click();
		js.executeScript("document.getElementById('party:roleDecorate:jobTitle').value='"+jobTitle+"';");
		organisationTextBox.click();
		js.executeScript("document.getElementById('party:orgDecorate:org').value='"+organisation+"';");
		tagsTextBox.click();
		js.executeScript("document.getElementById('party:tagsDecorate:tagComboBox').value='"+tags+"';");
		phoneNumberTextBox.click();
		js.executeScript("document.getElementById('party:j_id324:0:phnDecorate:number').value='"+TestCommonUtiles.convertPhoneNumber(phoneNumber)+"';");
		emailAdressTextBox.click();
		js.executeScript("document.getElementById('party:j_id341:0:emlDecorate:nmbr').value='"+email+"';");
		websitesTextBox.click();
		js.executeScript("document.getElementById('party:j_id369:0:webDecorate:web').value='"+website+"';");
		addAdresslink.click();
		addAdress.click();
		js.executeScript("document.getElementById('party:j_id388:0:strDecorate:str').value='"+address+"';");
		saveBtn.click();
		Thread.sleep(2000);
		
//		lastNameTextBox.sendKeys(lastName);
//		jobTitleTextBox.sendKeys(jobTitle);
//		organisationTextBox.sendKeys(organisation);
//		tagsTextBox.sendKeys(tags);
//		phoneNumberTextBox.sendKeys(phoneNumber);
//		emailAdressTextBox.sendKeys(email);
//		websitesTextBox.sendKeys(website);
//		addAdress.sendKeys(address);
		
	}
	
	@FindBys( {
		   @FindBy(xpath= "//table[@class='simple-table list-results-table with-hover-effect']/tbody/tr[*]/td[3]")
	})
	public List<WebElement> peopleList;
	
	@FindBys( {
		   @FindBy(xpath= "//table[@class='simple-table list-results-table with-hover-effect']/tbody/tr[*]/td[1]")
	})
	public List<WebElement> peopleListCheckBox;
	
	@FindBy(xpath="//span[@class='btn-tertiary btn-small list-actions-delete tooltipper simple-tooltipper ember-view']")
	public WebElement deleteContactbtn;
	@FindBy(xpath="//input [@class='form-input-checkbox bulk-delete-modal-checkbox']")
	public WebElement understandBtn;
	@FindBy(xpath="//button[contains(.,'Delete')]")
	public WebElement deleteBtn;
//	@FindBy(xpath="//div[@class='menu-select-selected-option ember-view multi-button-secondary']")
//	public WebElement editbtn;
//	@FindBy(xpath="//button[contains(.,'Delete')]")
//	WebElement deletemenu;
//	@FindBy(xpath="//button[contains(.,'Delete')]")
	WebElement deletbtn;
	
	
	
	public PeopleAndOrganisations deletePersion(String firstName, String lastName) {
		
		String name= firstName+" "+lastName;
		TestCommonUtiles.findTableElementAndClickOnCheckBox(peopleList, name,peopleListCheckBox );
		deleteContactbtn.click();
		understandBtn.click();
		deleteBtn.click();
		return new PeopleAndOrganisations();
	}

}
