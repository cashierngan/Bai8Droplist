package Bai8;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LearnDroplistDynamic extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(2000);

        WebElement category = driver.findElement(By.xpath("//span[normalize-space() = 'Select a Category']"));
        category.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Select a Category']/following-sibling::div//input")).sendKeys("Hotels");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//em[normalize-space()]")).click();
        Thread.sleep(2000);
        WebElement textCategory = driver.findElement(By.xpath("//div[contains(@class, 'chosen-container-active')]"));

        Thread.sleep(2000);
        System.out.println(textCategory);

        if (textCategory.getText().equals("Hotels"))
            System.out.println("true");
        else
            System.out.println("false");

        closeDriver();
    }
}
