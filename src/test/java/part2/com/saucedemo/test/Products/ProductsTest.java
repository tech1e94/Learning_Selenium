package part2.com.saucedemo.test.Products;

import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    @Test
    public void productsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");

        Assert.assertTrue(productsPage.isProdcutsHeaderDisplayed(), "\n Products Header is not Displayed");
    }
}
