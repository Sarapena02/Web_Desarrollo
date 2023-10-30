package proyecto.web.veterinaria.e2e;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
public class UseCase2Test {

    private WebDriver driver;
    private WebDriverWait wait; //Espera a que ocurra algo para seguir con la prueba 

    @BeforeEach
    public void init() {
        
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--disbale-notifications");
        chromeOptions.addArguments("--disbale-extensions");
        //chromeOptions.addArguments("--headless");

        this.driver = new ChromeDriver(chromeOptions);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    }
    @Test
    public void SystemTest_mascotaDetail_BuscarMascotaName() {
        driver.get("http://localhost:4200/logInVet");
        //Ingresa el Veterinario
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btonLoginVet")));
        WebElement inputUser = driver.findElement(By.id("cedulaVeterianrio"));
        WebElement inputContra = driver.findElement(By.id("contraseña"));

        inputUser.sendKeys("12345678910");
        inputContra.sendKeys("walter1");

        WebElement ingresar = driver.findElement(By.id("btonLoginVet"));
        ingresar.click();
        //Se espera que cargue la pagina de mascota 
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("pet-image")));

        //hace click al boton de agregar Tratamiento
        WebElement botonAgregarTratamiento = driver.findElement(By.xpath("/html/body/app-root/header/nav/ul/li[2]/a/span"));
        botonAgregarTratamiento.click();
        

        //Formulario para agregar el nuevo tratamiento
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fecha")));
        WebElement inputFecha = driver.findElement(By.xpath("//*[@id=\"fecha\"]"));
        inputFecha.sendKeys("10-30-2023");

        WebElement inputDroga = driver.findElement(By.xpath("//*[@id=\"droga\"]"));
        inputDroga.sendKeys("CLAMOXYL");

        WebElement inputMascota = driver.findElement(By.xpath("//*[@id=\"mascota\"]"));
        inputMascota.sendKeys("Jack");

        WebElement botonGuardarTratamiento = driver.findElement(By.xpath("//html//body//app-root//main//app-form-tratamiento//form//button"));
        botonGuardarTratamiento.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("thFecha")));

        driver.get("http://localhost:4200/mascota/findTratamientos/1");

        //Cierra Sesion
        WebElement botonCerrarSesion = driver.findElement(By.xpath("/html/body/app-root/header/nav/ul/li[2]/a/span"));
        botonCerrarSesion.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("inicio")));




        


        
    }
}
    
