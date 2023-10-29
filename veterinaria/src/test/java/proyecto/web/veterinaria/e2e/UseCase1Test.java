package proyecto.web.veterinaria.e2e;

import java.time.Duration;

import org.assertj.core.api.Assertions;
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
        chromeOptions.addArguments("--start-maximized");


        this.driver = new ChromeDriver(chromeOptions);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    @Test
    public void RegisterUserTest_addUser_MascotaName(){
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
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cedulaVeterianrio")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("contraseña")));

        WebElement inputUser = driver.findElement(By.id("cedulaVeterianrio"));
        inputUser.sendKeys("12345678910");


        
        WebElement inputContra = driver.findElement(By.id("contraseña"));
        //Se ingresa la contrseña incorrecta
        inputContra.sendKeys("walter11");

        //hace click al boton de login
        WebElement ingresar = driver.findElement(By.id("btonLoginVet"));
        ingresar.click();

        //Se esperan 2 segundos para que se vea que se ingreso mal la contraseña
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Espera 2 segundos

        //Se ingresa la contrseña correcta
        inputContra.clear();
        inputContra.sendKeys("walter1");

        //hace click al boton de login
        ingresar.click();

        //carga la pagina de detalle del veterinario
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("pet-image")));

        //hace click al boton de agregar cliente
        WebElement botonAgregarClientes = driver.findElement(By.xpath("/html/body/app-root/header/nav/ul/li[3]/a/span"));
        botonAgregarClientes.click();

        //carga el formulario para agregar un cliente
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nombre")));

        //ingresa los datos del cliente
        WebElement inputNombre = driver.findElement(By.id("nombre"));
        inputNombre.sendKeys("Pedro");

        WebElement inputCelular = driver.findElement(By.id("celular"));
        inputCelular.sendKeys("123456789");

        //Se ingresa un correo invalido
        WebElement inputCorreo = driver.findElement(By.id("correo"));
        inputCorreo.sendKeys("calvo@gmail");

        WebElement inputCedula = driver.findElement(By.id("cedula"));
        inputCedula.sendKeys("123456789251");

        //Se esperan 2 segundos para que se vea que se ingreso mal la contraseña
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Espera 2 segundos

        //Se corrige el correo
        inputCorreo.clear();
        inputCorreo.sendKeys("calvo@gmail.co");

        //hace click al boton de agregar el cliente
        WebElement botonAgregar = driver.findElement(By.id("agregarCliente"));
        botonAgregar.click();

        //Se carga la pagina de todos los clientes
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("nombres")));

        //se hace scroll a lo ams abajo de la pagina para ver si se agrego el nuevo cliente
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

         //Se esperan 2 segundos para que se vea que se agrego el nuevo cliente
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Espera 2 segundos

        WebElement botonAgregarMascotas = driver.findElement(By.xpath("/html/body/app-root/header/nav/ul/li[1]/a/span"));
        botonAgregarMascotas.click();

        //carga el formulario para agregar una mascota
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nombre")));

        //ingresa los datos de la mascota
        WebElement inputNombreMascota = driver.findElement(By.id("nombre"));
        inputNombreMascota.sendKeys("Firulais");

        WebElement inputRaza = driver.findElement(By.id("raza"));
        inputRaza.sendKeys("Caniche");

        WebElement inputEdad = driver.findElement(By.id("edad"));
        inputEdad.sendKeys("2");

        WebElement inputEnfermedad = driver.findElement(By.id("enfermedad"));
        inputEnfermedad.sendKeys("Escalofrio");

        WebElement inputClietne = driver.findElement(By.id("cliente"));
        inputClietne.sendKeys("123456789251");

       WebElement inputImagen = driver.findElement(By.id("imagen"));
       inputImagen.sendKeys("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgk7GvkQgJO5Y1jpS1hK-D7kmuDFqsRZD4Ig&usqp=CAU");

        //hace click al boton de agregar la mascota
        WebElement botonAgregarMascota = driver.findElement(By.id("agregarMascota"));
        botonAgregarMascota.click();

        //carga la pagina de todas las mascotas
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("nombres")));

         //se hace scroll a lo ams abajo de la pagina para ver si se agrego el nuevo cliente
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //Se esperan 2 segundos para que se vea que se agrego el nuevo cliente
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // Espera 2 segundos

        //hace click al boton de cerrar sesion
        WebElement botonCerrarSesion = driver.findElement(By.xpath("/html/body/app-root/header/nav/ul/li[7]/a/span"));
        botonCerrarSesion.click();

        //Se espera a que se cargue la landing page
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("body")));

        //hace click al boton de login
        WebElement btonLogin2 = driver.findElement(By.className("dropdown"));
        btonLogin2.click();

        //hace click al boton de login de veterinario
        WebElement btonLoginCliente = driver.findElement(By.id("botonCliente"));
        btonLoginCliente.click();

        //Se espera a que se cargue el formulario de login
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cedulaCliente")));

        //Llena los campos del login
        WebElement inputCedulaCliente = driver.findElement(By.id("cedulaCliente"));
        inputCedulaCliente.sendKeys("123456789251");

        //hace click al boton de login
        WebElement botonLoginCliente = driver.findElement(By.id("loginCliente"));
        botonLoginCliente.click();

        //Se cargan los datos del cliente junto a la mascota agregada
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("info")));

        //Obtiene el nombre de la mascota que se agrego
        WebElement primerMascota = driver.findElement(By.cssSelector(".mascota-items li:first-child"));
        WebElement nombreMascotaElement = primerMascota.findElement(By.className("nombreMascota"));

        String ExpectedNombreMascota = "Firulais";

        //Verifica que el nombre d ela mascota sea el esperado
        Assertions.assertThat(nombreMascotaElement.getText()).isEqualTo(ExpectedNombreMascota);
    }  
}
