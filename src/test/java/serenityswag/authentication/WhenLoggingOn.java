package serenityswag.authentication;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.action.LoginActions;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityswag.authentication.User.*;


@RunWith(SerenityRunner.class)
public class WhenLoggingOn extends UIInteractionSteps {
    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;
    InventoryPage inventoryPage;

    @Test
    public void usersCanLogOnViaTheHomePage() {
        login.as(STANDARD_USER);

        //Should see product catalog
        Serenity.reportThat("Product catalog should be displayed",
                () -> assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products")
        );

    }
}
