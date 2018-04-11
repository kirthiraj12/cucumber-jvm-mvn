package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClientSteps {


    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver"," /Users/karlin.kappala/Downloads/chromedriver.exe")
            System.setProperty("webdriver.chrome.driver", "/Users/xiaoxu/Downloads/chromedriver");



    private WebElement search;
    private WebElement searchbox;

    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        driver.get("http://google.com");
        driver.manage().window().maximize();
    }


    @Then("^type (.*) on the search page$")
    public void type_search() throws Throwable{
        search = driver.findElement(By.cssSelector("#lst-ib"));
        search.sendKeys("this is testing");
        searchbox = driver.findElement(By.cssSelector("#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)\n"));
        searchbox.click();

    }

}
