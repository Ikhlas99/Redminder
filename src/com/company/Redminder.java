package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redminder {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium_Jars\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redminder.se");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(new By.ByClassName("logo-img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Hem']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("workshopBtn")).click();
        driver.findElement(By.cssSelector("#loginEmail")).sendKeys(new CharSequence[]{"automationfun12@gmail.com"}) ;
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#loginPassword")).sendKeys(new CharSequence[] {"Automation2012"});
        Thread.sleep(500);
        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("settingBtn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#InfoBtn")).click();
        driver.findElement(By.id("inputPhoneNr")).sendKeys(new CharSequence[]{"072131619"});
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"InfoBtn\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#vehicleBtn > a")).click();
        driver.findElement(By.id("addCarBtn")).click();
        driver.findElement(By.id("newCar")).sendKeys(new CharSequence[]{"DZU 241"});
        Thread.sleep(500);
        driver.findElement(By.id("addCarBtn")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div/div/div[1]/div/table/thead/tr/th[4]")).click();
       // driver.findElement(By.id("newCar")).sendKeys(new CharSequence[]{"DBS 627"});
        //driver.findElement(By.id("addCarBtn")).click();
        driver.findElement(By.id("footerContact")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("footerPartners")).click();
        Thread.sleep(500);
        driver.navigate().back();
        driver.findElement(By.id("footerAboutUs")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("footerGDPR")).click();
        driver.findElement(By.id("goBackBtn")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Hem']")).click();
        driver.findElement(By.cssSelector("#banner > div > div.carousel-item.active > a:nth-child(1) > img")).click();
        driver.navigate().back();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("#banner > div > div:nth-child(2) > a:nth-child(2) > img")).click();
        Thread.sleep(500);
        driver.navigate().back();
        driver.findElement(By.id("logOutBtn")).click();
        // I making a little change


    }
}
