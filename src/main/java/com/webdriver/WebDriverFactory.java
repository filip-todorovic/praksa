package com.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(){

        //Inicijalizacija web drivera
        //System.setProperty("web.driver.chromedriver","src/main/resources/chromedriver");
        //WebDriver driver = new ChromeDriver() ;
        //driver.manage().window().maximize();

        WebDriver driver = null;
        String browser = System.getProperty("webdriver.chrome.driver","C:\\Users\\Filip.Todorovic\\Vezbanje\\src\\main\\resources\\chromedriver.exe");
        String chromeBrowser = "chrome";
        String firefoxBrowser = "firefox";
        String edgeBrowser = "edge";
        String ieBrowser = "explorer";

        WebDriverManager.chromedriver().setup(); //storuje u maven putanji
        driver = new ChromeDriver();

        /*if(browser.equals(chromeBrowser)){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equals(firefoxBrowser)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if(browser.equals(edgeBrowser)){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }else if(browser.equals(ieBrowser)) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }else {
            System.out.println("Uneli smo nepodrzani browser");
        }*/

        return driver;

    }

}
