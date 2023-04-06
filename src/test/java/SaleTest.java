import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SaleTest extends BaseTest{
    EdgeDriver driver;
    WebDriverWait wait;
    ProductPage productPage;
    InfoProduct infoProduct;
    NaviPage naviPage;
    CartPage cartPage;

    @BeforeMethod
    public void SetUp(){
        driver = openBrowser();
        productPage = new ProductPage(driver);
        infoProduct = new InfoProduct(driver);
        naviPage = new NaviPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        cartPage = new CartPage(driver);
    }

    @Test
    public void BuyTwoProducts(){
        productPage.ClickOnSamsung();
        infoProduct.ClickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        naviPage.ClickHome();
        productPage.ClickOnNexus();
        infoProduct.ClickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        naviPage.ClickCart();
        cartPage.ClickPlaceOrder();
        cartPage.name.sendKeys("Marina");
        cartPage.country.sendKeys("Srbija");
        cartPage.city.sendKeys("Smederevo");
        cartPage.card.sendKeys("1234567");
        cartPage.month.sendKeys("Maj");
        cartPage.year.sendKeys("2023");
        cartPage.purchaseBtn.click();

        Assert.assertEquals(cartPage.GetInfoMessage(),"Thank you for your purchase!");
    }
    @Test
    public void BuyTwoProductsOnePhoneAndOneLaptop(){
        productPage.ClickOnSamsung();
        infoProduct.ClickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        naviPage.ClickHome();
        naviPage.ClickLaptops();
        productPage.ClickOnSonyVaio5();
        infoProduct.ClickAddToCart();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        naviPage.ClickCart();
        cartPage.ClickPlaceOrder();
        cartPage.name.sendKeys("Marina");
        cartPage.country.sendKeys("Srbija");
        cartPage.city.sendKeys("Smederevo");
        cartPage.card.sendKeys("1234567");
        cartPage.month.sendKeys("Maj");
        cartPage.year.sendKeys("2023");
        cartPage.purchaseBtn.click();

        Assert.assertEquals(cartPage.GetInfoMessage(),"Thank you for your purchase!");
    }
    @AfterMethod
    public void After(){
        driver.quit();
    }

}
