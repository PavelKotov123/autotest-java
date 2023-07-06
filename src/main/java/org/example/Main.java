package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\cromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chat.omega-r.club/home");

//        WebElement input = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

//        input.sendKeys("Иосиф");
//        input.click();

    }
}