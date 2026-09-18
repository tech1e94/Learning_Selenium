package part3_4.com.demoqa.tests.part3.forms;

import com.demoqa.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class radioButtonTest extends BaseTest {
    @Test
    public void testRadioButton() {
        var formsPage = new HomePage().goToForms().clickPracticeForm();
        formsPage.clickMaleRadioButton();
    }
}
