package helpDesk.auth;

import core.BaseSeleniumPage;
import helpDesk.VideosPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage extends BaseSeleniumPage {

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")
    private WebElement passwordButton;


    public PasswordPage() {
        PageFactory.initElements(driver, this);
    }

    public VideosPage inputPassword(String password) {
        passwordButton.sendKeys(password, Keys.ENTER);
        return new VideosPage();
    }
}
