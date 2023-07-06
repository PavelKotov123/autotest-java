package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\cromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

        WebElement serch = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        serch.sendKeys("Linlkedin");
        serch.sendKeys(Keys.ENTER);

        WebElement linkLinkedin = driver.findElement(By.xpath("//h3[@class='g']"));
        linkLinkedin.click();

    }
}
//*[@id="APjFqb"]