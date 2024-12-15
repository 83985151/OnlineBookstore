import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test12306 {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\27550\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/book_shop_war_exploded/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void testUI() {
       
    }
    
    @ParameterizedTest
    public void test_find_password() throws InterruptedException {

        WebElement findPassword = driver.findElement(By.xpath("//*[@id=\"base\"]/a"));
        findPassword.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }

    @ParameterizedTest
    @CsvSource({
	        "丹恒,1388",
            "星,0426"
    })
    public void test_login(String uname, String pssswd) throws InterruptedException {


    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);



        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);


        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }


    @ParameterizedTest
    @CsvSource({
	        "丹恒,1388,软件工程"
    })
    public void test_manager_search_books(String uname, String pssswd,String bname) throws InterruptedException {


    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);



        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement BMS = driver.findElement(By.xpath("//*[@id=\"u30\"]/p/span/input"));
        BMS.click();
        
        WebElement bookName = driver.findElement(By.xpath("//*[@id=\"u7_input\"]"));
        bookName.clear();
        bookName.sendKeys(bname);
        
        WebElement search = driver.findElement(By.xpath("//*[@id=\"u15_text\"]/p/span/input"));
        search.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }
    
    @ParameterizedTest
    @CsvSource({
	        "丹恒,1388"
    })
    public void test_manager_del_books(String uname, String pssswd) throws InterruptedException {


    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);



        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement BMS = driver.findElement(By.xpath("//*[@id=\"u30\"]/p/span/input"));
        BMS.click();
        
        WebElement del = driver.findElement(By.xpath("//*[@id=\"bookslist\"]/tr[4]/td[6]/a[2]"));
        del.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }


    @ParameterizedTest
    @CsvSource({
	        "丹恒,1388"
    })
    public void test_manager_change_books(String uname, String pssswd) throws InterruptedException {


    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);



        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement BMS = driver.findElement(By.xpath("//*[@id=\"u30\"]/p/span/input"));
        BMS.click();
        
        WebElement tochange = driver.findElement(By.xpath("//*[@id=\"bookslist\"]/tr[1]/td[6]/a[1]"));
        tochange.click();
        
        WebElement change = driver.findElement(By.xpath("//*[@id=\"u19\"]/p/span/input"));
        change.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }
    
    @ParameterizedTest
    @CsvSource({
	        "丹恒,1388,软件工程,齐志昌,2016年6月,教材,59.0"
    })
    public void test_manager_add_books(String uname, String pssswd,String bname ,String author ,String date ,String sort ,String price) throws InterruptedException {


        WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement BMS = driver.findElement(By.xpath("//*[@id=\"u30\"]/p/span/input"));
        BMS.click();
        
        WebElement toadd = driver.findElement(By.xpath("//*[@id=\"u5_text\"]/p/span"));
        toadd.click();
        
        WebElement bookName = driver.findElement(By.xpath("//*[@id=\"bookname\"]"));
        bookName.sendKeys(bname);

        WebElement Author = driver.findElement(By.xpath("//*[@id=\"author\"]"));
        Author.sendKeys(author);
        
        WebElement Date = driver.findElement(By.xpath("//*[@id=\"date\"]"));
        Date.sendKeys(date);

        WebElement Sort = driver.findElement(By.xpath("//*[@id=\"sort\"]"));
        Sort.sendKeys(sort);
        
        WebElement Price = driver.findElement(By.xpath("//*[@id=\"price\"]"));
        Price.sendKeys(price);
        
        WebElement add = driver.findElement(By.xpath("//*[@id=\"u36\"]/p/span/input"));
        add.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }

    @ParameterizedTest
    @CsvSource({
	        "丹恒,1388,星"
    })
    public void test_manager_search_order(String uname, String pssswd,String ouname) throws InterruptedException {


    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement orderPage = driver.findElement(By.xpath("//*[@id=\"u29\"]/p/span/input"));
        orderPage.click();
        
        WebElement orderUserName = driver.findElement(By.xpath("//*[@id=\"u79_input\"]"));
        orderUserName.clear();
        orderUserName.sendKeys(ouname);
        
        WebElement search = driver.findElement(By.xpath("//*[@id=\"u85_text\"]/p/span/input"));
        search.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }

    @ParameterizedTest
    @CsvSource({
	        "丹恒,1388"
    })
    public void test_manager_change_pay_order(String uname, String pssswd) throws InterruptedException {


    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement orderPage = driver.findElement(By.xpath("//*[@id=\"u29\"]/p/span/input"));
        orderPage.click();
        
        WebElement changePay = driver.findElement(By.xpath("//*[@id=\"orderlist\"]/tr[3]/td[4]/a[1]"));
        changePay.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }
    
    @ParameterizedTest
    @CsvSource({
	        "丹恒,1388"
    })
    public void test_manager_del_order(String uname, String pssswd) throws InterruptedException {


    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement orderPage = driver.findElement(By.xpath("//*[@id=\"u29\"]/p/span/input"));
        orderPage.click();
        
        WebElement del = driver.findElement(By.xpath("//*[@id=\"orderlist\"]/tr[3]/td[4]/a[2]"));
        del.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }

    @ParameterizedTest
    @CsvSource({
	        "星,0426,软件工程"
    })
    public void test_user_search_book(String uname, String psssw, String bname) throws InterruptedException {

    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement bookshop = driver.findElement(By.xpath("//*[@id=\"u30\"]/p/span/input"));
        bookshop.click();
        
        WebElement bookName = driver.findElement(By.xpath("//*[@id=\"u7_input\"]"));
        bookName.clear();
        bookName.sendKeys(bname);
        
        WebElement search = driver.findElement(By.xpath("//*[@id=\"u15_text\"]/p/span/input"));
        search.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }
    
    @ParameterizedTest
    @CsvSource({
	        "星,0426,软件工程"
    })
    public void test_user_add_order(String uname, String psssw, String bname) throws InterruptedException {

    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement bookshop = driver.findElement(By.xpath("//*[@id=\"u30\"]/p/span/input"));
        bookshop.click();
        
        WebElement bookName = driver.findElement(By.xpath("//*[@id=\"u7_input\"]"));
        bookName.clear();
        bookName.sendKeys(bname);
        
        WebElement search = driver.findElement(By.xpath("//*[@id=\"u15_text\"]/p/span/input"));
        search.click();
        
        WebElement addorder = driver.findElement(By.xpath("//*[@id=\"bookslist\"]/tr/td[6]/a"));
        addorder.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }
    
    @ParameterizedTest
    @CsvSource({
	        "星,0426,软件工程"
    })
    public void test_user_search_order(String uname, String psssw, String obname) throws InterruptedException {

    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement orderpage = driver.findElement(By.xpath("//*[@id=\"u29\"]/p/span/input"));
        orderpage.click();
        
        WebElement orderbookName = driver.findElement(By.xpath("//*[@id=\"u79_input\"]"));
        orderbookName.clear();
        orderbookName.sendKeys(obname);
        
        WebElement search = driver.findElement(By.xpath("//*[@id=\"u85_text\"]/p/span/input"));
        search.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }
    
    @ParameterizedTest
    @CsvSource({
	        "星,0426,软件工程"
    })
    public void test_user_pay_order(String uname, String psssw, String obname) throws InterruptedException {

    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement orderpage = driver.findElement(By.xpath("//*[@id=\"u29\"]/p/span/input"));
        orderpage.click();
        
        WebElement orderbookName = driver.findElement(By.xpath("//*[@id=\"u79_input\"]"));
        orderbookName.clear();
        orderbookName.sendKeys(obname);
        
        WebElement search = driver.findElement(By.xpath("//*[@id=\"u85_text\"]/p/span/input"));
        search.click();
        
        WebElement pay = driver.findElement(By.xpath("//*[@id=\"userorderlist\"]/tr[1]/td[4]/a[1]"));
        pay.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }
    
    @ParameterizedTest
    @CsvSource({
	        "星,0426,软件工程"
    })
    public void test_user_del_order(String uname, String psssw, String obname) throws InterruptedException {

    	WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        userName.clear();
        userName.sendKeys(uname);

        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.clear();
        passWord.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("//*[@id=\"u14\"]/p/span/input"));
        login.click();
        
        WebElement orderpage = driver.findElement(By.xpath("//*[@id=\"u29\"]/p/span/input"));
        orderpage.click();
        
        WebElement orderbookName = driver.findElement(By.xpath("//*[@id=\"u79_input\"]"));
        orderbookName.clear();
        orderbookName.sendKeys(obname);
        
        WebElement search = driver.findElement(By.xpath("//*[@id=\"u85_text\"]/p/span/input"));
        search.click();
        
        WebElement del = driver.findElement(By.xpath("//*[@id=\"userorderlist\"]/tr[1]/td[4]/a[2]"));
        del.click();

        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(1000);
    }

    @AfterEach
    public void teardown() {
        this.driver.quit();
    }

}
