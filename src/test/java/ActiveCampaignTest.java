import Pages.EmailPage;
import org.junit.jupiter.api.Test;

public class ActiveCampaignTest extends BaseTest {
    @Test
    public void signUp() {
        EmailPage emailPage = (EmailPage) page.goTo("www.activecampaign.com/free", EmailPage.class);
        emailPage.enterEmail("test@test.com");
        System.out.println("test");
    }
}
