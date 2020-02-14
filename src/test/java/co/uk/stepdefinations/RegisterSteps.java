package co.uk.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterSteps {

    WebDriver driver;

    @Given("I navigate to boohoo homepage")
    public void i_navigate_to_boohoo_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.navigate().to("https://www.boohoo.com/");
    }

    }
    @When("I click on the image icon and select register to display the register form")
    public void i_click_on_the_image_icon_and_select_register_to_display_the_register_form() {

    }
    @When("I enter {string} in the tittle field")
    public void i_enter_in_the_tittle_field(String string) {

    }
    @When("I enter {string} in the first name field")
    public void i_enter_in_the_first_name_field(String string) {

    }
    @When("I enter {string} in the last name field")
    public void i_enter_in_the_last_name_field(String string) {

    }
    @When("I enter {string} in the date of birth field")
    public void i_enter_in_the_date_of_birth_field(String string) {

    }
    @When("I select {string} from the gender dropdown")
    public void i_select_from_the_gender_dropdown(String string) {

    @When("I enter {string} in the email address field")
    public void i_enter_in_the_email_address_field(String string) {

    }
    @When("I enter {string} in the confirm email address field")
    public void i_enter_in_the_confirm_email_address_field(String string) {

    }
    @When("I enter {string} in the password field")
    public void i_enter_in_the_password_field(String string) {

    }
    @When("I enter {string} in the confirm password field")
    public void i_enter_in_the_confirm_password_field(String string) {

    }
    @When("I click on {string}")
    public void i_click_on(String string) {

    }
    @Then("I am taken to {string} homepage")
    public void i_am_taken_to_homepage(String string) {

    }

}
