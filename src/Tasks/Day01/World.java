package Tasks.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class World {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","E:\\Tasks\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.worldometers.info/world-population/";
        driver.get(baseUrl);

        long t= System.currentTimeMillis();
        long end = t+15000;
        while(System.currentTimeMillis() < end) {
            //current_World_Population
            WebElement current_World_Population = driver.findElement(By.xpath("//div[@class='maincounter-number']"));
            System.out.println("current_World_Population:   "+current_World_Population.getText());

            //births_Today
            WebElement births_Today = driver.findElement(By.xpath("//div[@class=\"col1in\"]//div[2]//div[2]"));
            System.out.println("births_Today:    "+births_Today.getText());

             //deaths_Today
            WebElement deaths_Today = driver.findElement(By.xpath("//div[@class=\"col1in\"]//div[3]//div[2]"));
            System.out.println("deaths_Today:    "+deaths_Today.getText());

             //population_Growth_Today
            WebElement population_Growth_Today = driver.findElement(By.xpath("//div[@class=\"col1in\"]//div[@class=\"sec-box-last\"]//div[@class=\"sec-counter\"]"));
            System.out.println("population_Growth_Today:    "+population_Growth_Today.getText());

             //births_This_Year
            WebElement births_This_Year = driver.findElement(By.xpath("//div[@class=\"col2in\"]//div[2]//div[2]"));
            System.out.println("births_This_Year:   "+births_This_Year.getText());

             //deaths_This_Year
            WebElement deaths_This_Year = driver.findElement(By.xpath("//div[@class=\"col2in\"]//div[3]//div[2]"));
            System.out.println("deaths_This_Year:   "+deaths_This_Year.getText());

             //population_Growth_This_Year
            WebElement population_Growth_This_Year = driver.findElement(By.xpath("//div[@class=\"col2in\"]//div[@class=\"sec-box-last\"]//div[@class=\"sec-counter\"]"));
            System.out.println("population_Growth_This_Year:    "+population_Growth_This_Year.getText());

            System.out.println("" +
                    "" +
                    "" +
                    "" +
                    "");
        }

        driver.close();
    }
}
