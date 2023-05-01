package helpDesk.auth;

import core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends BaseSeleniumPage {
    @FindBy(xpath = "/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[3]/div[2]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")
    private WebElement inputLogin1;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")
    private WebElement inputLogin2;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")
    private WebElement errorsField;



    public AuthPage() {
        driver.get("https://www.youtube.com/");
        PageFactory.initElements(driver, this);
    }

    public PasswordPage auth(String login) throws InterruptedException {
        inputLogin1.click();
        Thread.sleep(3000);
        inputLogin2.sendKeys(login, Keys.ENTER);
        return new PasswordPage();
    }

    public String authWithWrongs(String login) throws InterruptedException {
        inputLogin1.click();
        Thread.sleep(3000);
        inputLogin2.sendKeys(login, Keys.ENTER);
        return errorsField.getText();
    }
}
