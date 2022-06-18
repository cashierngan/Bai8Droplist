package Bai8;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LearnDroplistStatic extends BaseTest {

    public static void main(String[] args) throws InterruptedException {

        createDriver();

        driver.get("https://demo.anhtester.com/basic-select-dropdown-demo.html");

        Select select = new Select(driver.findElement(By.id("select-demo")));
        select.selectByVisibleText("Thursday");
        Thread.sleep(2000);
        select.selectByValue("Monday");
        Thread.sleep(2000);

        Boolean check = select.isMultiple();
        System.out.println(check);
        Thread.sleep(1000);

        System.out.println(select.getOptions().size()); // Số lượng option thẻ select

        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        closeDriver();
    }
}
