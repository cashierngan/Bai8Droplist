package Bai8;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LearnCheckboxRadiobox extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");

        Boolean checkbox = driver.findElement(By.id("isAgeSelected")).isSelected();

        System.out.println(checkbox);

        driver.findElement(By.id("isAgeSelected")).click();

        Boolean checkbox2 = driver.findElement(By.id("isAgeSelected")).isSelected();

        System.out.println(checkbox2);

        //Multi checkbox
        //driver.findElement(By.xpath("//label[normalize-space()='Option 2']")).click();
        //Thread.sleep(2000);
        //System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Option 2']/child::input")).isSelected());


        Thread.sleep(1000);
        List<WebElement> listCheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//div//input"));

        System.out.println(((List<?>) listCheckbox).size());

        for (int i = 0; i < listCheckbox.size(); i++) {
            listCheckbox.get(i).click();
            Thread.sleep(1000);
        }

        Thread.sleep(1000);

        for (int i = 0; i < listCheckbox.size(); i++) {
            System.out.println(listCheckbox.get(i).isSelected());
            Thread.sleep(1000);
        }





        closeDriver();
    }

}
