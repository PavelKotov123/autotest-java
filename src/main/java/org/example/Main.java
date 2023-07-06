package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omega\\cromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://vk.com/");


        WebElement inputphone = driver.findElement(By.xpath("//*[@id=\"index_email\"]"));
        inputphone.sendKeys("ADSL153760");

        WebElement clickBtnVk= driver.findElement(By.xpath("//*[@id=\"index_login\"]/div/form/button"));
        clickBtnVk.click();

        WebElement inputPass = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div/div/div/form/div[1]/div[3]/div[1]/div/input"));
        inputPass.sendKeys("89229015935pavel");

        WebElement enterBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div/div/div/form/div[2]/button"));
        enterBtn.click();

        WebElement friendBtn = driver.findElement(By.xpath("//*[@id=\"l_fr\"]/a/span"));
        friendBtn.click();

        WebElement inputFriend = driver.findElement(By.xpath("//*[@id=\"s_search\"]"));
        inputFriend.sendKeys("Александр Дехант");

        WebElement friendClickBtn = driver.findElement(By.xpath("//*[@id=\"friends_user_row113874867\"]/div[3]/div[1]/a"));
        friendClickBtn.click();

//        WebElement messageBtn = driver.findElement(By.linkText("Сообщение"));
//        messageBtn.click();

//        WebElement mailbox = driver.findElement(By.xpath("//*[@id=\"mail_box_editable\"]"));
//        mailbox.sendKeys("Тест1");
//
//        WebElement sendBtn = driver.findElement(By.xpath("//*[@id=\"mail_box_send\"]"));
//        sendBtn.click();

        WebElement clickBtn = driver.findElement(By.xpath("//*[@id=\"top_profile_link\"]"));
        clickBtn.click();

        WebElement logoutBtn = driver.findElement(By.xpath("//*[@id=\"top_logout_link\"]"));
        logoutBtn.click();
    }
}