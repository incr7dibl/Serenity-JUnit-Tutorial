package serenityswag.authentication.action;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import serenityswag.authentication.User;


public class LoginActions extends UIInteractionSteps {

    @Step("Login As {0}")
    public void as(User user) {

        openUrl("https://www.saucedemo.com/");

        find("[data-test='username']").sendKeys(user.getUsername());

        find("[data-test='password']").sendKeys(user.getPassword());

        find("[data-test='login-button']").click();
    }
}
