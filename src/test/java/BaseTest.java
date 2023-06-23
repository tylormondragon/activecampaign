import Pages.BasePage;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private WebDriver driver;

    BasePage page;

    @BeforeEach
    public void setup() {
        WebDriver driver = DriverFactory.getDriver(DriverType.CHROME);
        this.page = new BasePage(driver);
        this.driver = page.getClassDriver();
    }
}
