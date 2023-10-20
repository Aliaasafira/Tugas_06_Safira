package StepDefinition;

import Factory.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDef {
    protected WebDriver webDriver;

    @Before
    public void startDriver() {
        webDriver = new DriverManager().initializeDriver();
    }

    @When("user open link {string}")
    public void userOpenLinkSaucedemoCom(String fieldValue) {
        webDriver.get(fieldValue);
    }

    @And("user input valid password {string}")
    public void userInputValidPassword(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("password")).sendKeys(fieldValue);
        Thread.sleep(2000);
    }


    @And("user input valid username {string}")
    public void userInputValidUsername(String fieldValue) throws InterruptedException {
        webDriver.findElement(By.id("user-name")).sendKeys(fieldValue);
        Thread.sleep(2000);
    }

    @Then("user click login button")
    public void userClickLoginButton() throws InterruptedException {
        webDriver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }

    @And("user input invalid username {string}")
    public void userInputInvalidUsernameStandard_user(String fieldValue) {
        webDriver.findElement(By.id("user-name")).sendKeys(fieldValue);
    }

    @And("user input invalid password {string}")
    public void userInputInvalidPasswordInvalid(String fieldValue) {
        webDriver.findElement(By.id("password")).sendKeys(fieldValue);
    }

    @Given("user click add to cart button")
    public void userClickAddToCartButton() {
        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("user click cart icon")
    public void userClickCartIcon() throws InterruptedException {
        webDriver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(5000);
    }

    @Then("user click checkout button")
    public void userClickCheckoutButton() {
        webDriver.findElement(By.id("checkout")).click();
    }

    @And("user input personal information")
    public void userInputPersonalInformation() throws InterruptedException {
        webDriver.findElement(By.id("first-name")).sendKeys("Safira");
        Thread.sleep(1000);
        webDriver.findElement(By.id("last-name")).sendKeys("Safira");
        Thread.sleep(1000);
        webDriver.findElement(By.id("postal-code")).sendKeys("12345");
    }

    @And("user click continue button")
    public void userClickContinueButton() {
        webDriver.findElement(By.id("continue")).click();
    }

    @And("user click finish button")
    public void userClickFinishButton() {
        webDriver.findElement(By.id("finish")).click();
    }

    @Then("user choose price low to high")
    public void userChoosePriceLowToHigh() {
        webDriver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
    }
}
