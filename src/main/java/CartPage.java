import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class CartPage extends BasePage{
        @FindBy (css = ".btn.btn-success")
        WebElement placeOrderBtn;

        @FindBy (id = "name")
        WebElement name;

        @FindBy (id = "country")
        WebElement country;

        @FindBy (id = "city")
        WebElement city;

        @FindBy (id = "card")
        WebElement card;

        @FindBy (id = "month")
        WebElement month;

        @FindBy (id = "year")
        WebElement year;

        @FindBy (xpath = "//button[text()='Purchase']")
        WebElement purchaseBtn;

        @FindBy(css = ".sweet-alert h2")
        WebElement textMessage;

        public CartPage(EdgeDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void ClickPlaceOrder() {
            placeOrderBtn.click();
        }

        public String GetInfoMessage(){
            return textMessage.getText();
        }
    }
