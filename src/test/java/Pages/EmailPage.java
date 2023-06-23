package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmailPage extends BasePage {

    private final WebElement emailField;
    private final WebElement createAccountButton;
    public EmailPage(BasePage handedOffPage) {
        super(handedOffPage);

        By email = By.cssSelector("input[name='om_e']");
        emailField = findElement(email);

        By createButton = By.cssSelector("button[type='submit']");
        createAccountButton = findElement(createButton);
    }

    public void enterEmail(String email) {emailField.sendKeys(email);}
}
