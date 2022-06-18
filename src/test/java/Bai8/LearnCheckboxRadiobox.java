package Bai8;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LearnCheckboxRadiobox extends BaseTest {

    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.anhtester.com/basic-checkbox-demo.html");

        Boolean checkbox = driver.findElement(By.id("isAgeSelected")).isSelected();

        System.out.println(checkbox);

        driver.findElement(By.id("isAgeSelected")).click();

        Boolean checkbox2 = driver.findElement(By.id("isAgeSelected")).isSelected();

        System.out.println(checkbox2);




        closeDriver();
    }

}
