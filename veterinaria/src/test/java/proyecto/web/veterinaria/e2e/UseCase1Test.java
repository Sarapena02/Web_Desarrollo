package proyecto.web.veterinaria.e2e;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

import io.github.bonigarcia.wdm.WebDriverManager;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles("test")
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class UseCase1Test {

    private final String BASE_URL = "http://localhost:4200";

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void init(){
        
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-extensions");

        this.driver = new ChromeDriver(chromeOptions);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void RegisterUserTest_addUser_(){
        driver.get(BASE_URL);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("botonVet")));
        //hace click al boton de login
        WebElement btonLogin = driver.findElement(By.className("dropdown"));
        btonLogin.click();

        //hace click al boton de login de veterinario
        WebElement btonLoginVet = driver.findElement(By.id("botonVet"));
        btonLoginVet.click();

        //llena los campos del login
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btonLoginVet")));
        WebElement inputUser = driver.findElement(By.id("cedulaVeterianrio"));
        WebElement inputContra = driver.findElement(By.id("contraseña"));

        inputUser.sendKeys("12345678910");
        inputContra.sendKeys("walter1");

        WebElement btonIngresar = driver.findElement(By.id("btonLoginVet"));
        btonIngresar.click();


    }

    
}
