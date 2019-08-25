package com.workingtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Main {

    @Test
    public void MotorölparameterAuswählen() throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver", "D:\\driver\\chromedriver_76");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pkwteile.de/motoroel");

        driver.findElement(By.xpath("//div[@class='block-cookies__button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='viscosity_id']")).click();
        driver.findElement(By.xpath("//option[@value='sae-5w-30']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='manufacturer_id']")).click();
        driver.findElement(By.xpath("//option[@value='488']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='releases_id']")).click();
        driver.findElement(By.xpath("//option[@value='bmw-longlife-04']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='specifications_id']")).click();
        driver.findElement(By.xpath("//option[@value='acea-c3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='mainblock-search__button']")).click();

        Thread.sleep(2000);

        assertEquals(driver.getCurrentUrl(), "https://www.pkwteile.de/motoroel-search?brand%5B0%5D=castrol&release%5B0%5D=bmw-longlife-04&viscosity%5B0%5D=sae-5w-30&specification%5B0%5D=acea-c3");
        Thread.sleep(2000);

        System.out.println("Successfully opened the website test.pkwteile.de");
        driver.quit();
    }

    @Test
    public void MainblockSearchTitle() throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver", "D:\\driver\\chromedriver_76");
        WebDriver driver = new ChromeDriver();
        driver.get("https://pkwteile.de/motoroel");

        driver.findElement(By.xpath("//div[@class='block-cookies__button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("form_maker_id")).click();
        driver.findElement(By.xpath("//option[@value='121']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("form_model_id")).click();
        driver.findElement(By.xpath("//option[@value='10200']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("form_car_id")).click();
        driver.findElement(By.xpath("//option[@value='26739']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@class='submit ripple-out'][@href='#']")).click();
        Thread.sleep(2000);

        assertEquals(driver.getCurrentUrl(),"https://www.pkwteile.de/autoteile/vw-ersatzteile/cc-358/26739/12094/motorol");
        Thread.sleep(2000);

        System.out.println("Successfully opened the website test.pkwteile.de");
        driver.quit();
    }

    @Test
    public void ReifenPkw() throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver", "D:\\driver\\chromedriver_76");
        WebDriver driver = new ChromeDriver();
        driver.get("https://reifen.pkwteile.de/");

        driver.findElement(By.xpath("//div[@class='block-cookies__button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='form_Season']")).click();
        driver.findElement(By.xpath("//option[@value='winter']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='Width']")).click();
        driver.findElement(By.xpath("//option[@value='255']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='CrossSections']")).click();
        driver.findElement(By.xpath("//option[@value='65']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='Size']")).click();
        driver.findElement(By.xpath("//option[@value='16']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tyres_search")).click();
        Thread.sleep(2000);

        assertEquals(driver.getCurrentUrl(),"https://reifen.pkwteile.de/reifen-search?Season=winter&Width=255&CrossSections=65&Size=16");

        System.out.println("Successfully opened the website test.pkwteile.de");
        driver.quit();


    }
}

