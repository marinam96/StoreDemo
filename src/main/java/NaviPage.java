import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaviPage extends BasePage{

    @FindBy(xpath = "//a[text()='Cart']")
    WebElement cart;

    @FindBy(css = "li[class='nav-item active'] a[class='nav-link']")
    WebElement home;

    @FindBy(linkText = "Laptops")
    WebElement laptops;

    public NaviPage(EdgeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void ClickCart(){
        cart.click();
    }
    public void ClickLaptops(){
        laptops.click();
    }
    public void ClickHome() {
        home.click();
    }
}


