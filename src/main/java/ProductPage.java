import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//a[text()='Samsung galaxy s6']")
    WebElement samsungGalaxyS6;
    @FindBy(linkText = "Nexus 6")
    WebElement nexus6;
    @FindBy(linkText = "Sony vaio i5")
    WebElement sonyLaptop;

    public ProductPage(EdgeDriver driver){
        this.driver  = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickOnSamsung(){
        samsungGalaxyS6.click();
    }

    public void ClickOnNexus(){
        nexus6.click();
    }

    public void ClickOnSonyVaio5() { sonyLaptop.click(); }

}
