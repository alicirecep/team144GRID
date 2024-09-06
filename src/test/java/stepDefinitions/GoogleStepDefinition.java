package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleStepDefinition{

	WebDriver driver = Hooks.driver;

	@Given("Kullanici URL girer")
	public void kullanici_url_girer() {
		driver.get("https://www.google.com");
	}
	@Given("Sayfa Titleni dogrular")
	public void sayfa_titleni_dogrular() {
		String expected = "Google";
		String actual = driver.getTitle();

		Assert.assertEquals(actual,expected);
	}
	@Then("Sayfayi kapatir.")
	public void sayfayi_kapatir() {

	}
}
