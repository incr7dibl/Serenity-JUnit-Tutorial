package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractionSteps;


public class InventoryPage extends PageObject {


    public String getHeading() {
        return find(".title").getText();
    }
}
