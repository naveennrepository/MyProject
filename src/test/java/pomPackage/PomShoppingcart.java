package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseAmazon;

public class PomShoppingcart extends BaseAmazon {
	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")  WebElement Accountlists;
	@FindBy(id = "ap_email")  WebElement email;
	@FindBy(id = "continue") WebElement Continue;
	@FindBy(id = "ap_password") WebElement password;
	@FindBy(id = "signInSubmit") WebElement Signinbtn;
	@FindBy (id="twotabsearchtextbox") WebElement Search;
	@FindBy(id ="nav-search-submit-button") WebElement searchicon;
	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]") WebElement shirt;
	@FindBy(xpath ="//select[@id='native_dropdown_selected_size_name']") WebElement size;
	@FindBy(xpath = "//select[@id='quantity']") WebElement quantity;
	@FindBy(xpath ="//input[@id='add-to-cart-button']") WebElement addtocart;
	@FindBy (xpath="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/span[1]/span[1]/input[1]") WebElement proceedcheckout;
	@FindBy(xpath="//input[@id='buy-now-button']") WebElement buynow;
	@FindBy(id = "nav-cart-count") WebElement cart;
	@FindBy(css="body.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.a-container.sc-background-dark:nth-child(30) div.a-section.a-spacing-none:nth-child(4) div.a-fixed-right-flipped-grid:nth-child(4) div.a-fixed-right-grid-inner div.a-fixed-right-grid-col.sc-retail-cart-column-spacing.a-col-left:nth-child(3) div.a-cardui.sc-card-style.sc-list.sc-java-remote-feature.celwidget.sc-card-spacing-top-none:nth-child(1) div.a-cardui-body.a-scroller-none div.a-section.a-spacing-mini.sc-list-body.sc-java-remote-feature:nth-child(6) div.a-row.sc-list-item.sc-list-item-border.sc-java-remote-feature div.sc-list-item-content div.a-row.a-spacing-base.a-spacing-top-base div.a-column.a-span10:nth-child(1) div.a-fixed-left-grid div.a-fixed-left-grid-inner div.a-fixed-left-grid-col.a-col-right:nth-child(2) div.a-row.sc-action-links span.a-size-small.sc-action-delete:nth-child(3) span.a-declarative > input.a-color-link") WebElement remove;
	public PomShoppingcart() {
		PageFactory.initElements(driver, this);	}
	public void clickaccounts() {
		Accountlists.click();	}
	public void typetheemail(String Email) {
		email.sendKeys(Email);	}
	public void clickoncontinue() {
		Continue.click();	}
	public void typethepassword(String Password) {
		password.sendKeys(Password);		}
	public void clickonsigninbtn() {
		Signinbtn.click();	}
	public void searchtheproduct(String product)	{
		Search.sendKeys(product);	}
	public void icon()	{
		searchicon.click();		}
	public void clickshirt() {
		shirt.click();	}
	public void selectsize()	{
		Select shirtsize = new Select(driver.findElement(By.cssSelector("#native_dropdown_selected_size_name")));
		shirtsize.selectByValue("1");	}
	public void selectquantity()	{
		Select shirtquantity = new Select(driver.findElement(By.xpath("//*[@id=\"quantity\"]")));
		shirtquantity.selectByValue("2");	}
	public void adding()	{
		addtocart.click();	}
	public void proceed()	{
		proceedcheckout.click();	}	
	public void buy()	{
	buynow.click();		}
	public void gotocart()	{
		cart.click();	}
	public void removeproduct()	{
		remove.click();	}
}
