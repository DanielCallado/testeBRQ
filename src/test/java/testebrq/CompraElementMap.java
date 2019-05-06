package testebrq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompraElementMap {
	
	private static WebElement element = null;
	
	public static WebElement logo(WebDriver driver) {
		element = driver.findElement(By.id("header_logo"));
		return element;
	};
	
	public static WebElement produto(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),\"Faded Short Sleeve T-shirts\")]"));
		return element;
	};
	
	public static WebElement produtoCart(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()=\"Faded Short Sleeve T-shirts\"]"));
		return element;
	};
	
	public static WebElement btnAddToCart(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
		return element;
	};
	
	public static WebElement btnProceed(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@title=\"Proceed to checkout\"]"));
		return element;
	};
	
	public static WebElement btnProceedCart(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[text()=\"Proceed to checkout\"]"));
		return element;
	};
	public static WebElement btnProceedPayment(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@name=\"processCarrier\"]"));
		return element;
	};
	
	public static WebElement segundoPasso(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@class=\"step_current second\"]"));
		return element;
	};
	
	public static WebElement terceiroPasso(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@class=\"step_current third\"]"));
		return element;
	};
	
	public static WebElement quartoPasso(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@class=\"step_current four\"]"));
		return element;
	};
	
	public static WebElement quintoPasso(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@class=\"step_current last\"]"));
		return element;
	};
	
	public static WebElement endereco(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@id=\"address_delivery\"]//li[@class=\"address_address1 address_address2\"]"));
		return element;
	};
	
	public static WebElement cidadeEstadoCEP(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@id=\"address_delivery\"]//li[@class=\"address_city address_state_name address_postcode\"]"));
		return element;
	};
	
	public static WebElement pais(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@id=\"address_delivery\"]//li[@class=\"address_country_name\"]"));
		return element;
	};
	
	public static WebElement selectPais(WebDriver driver) {
		element = driver.findElement(By.id("id_country"));
		return element;
	};
	
	
	public static WebElement termosECondicoes(WebDriver driver) {
		element = driver.findElement(By.id("cgv"));
		return element;
	};
	
	public static WebElement totalProduto(WebDriver driver) {
		element = driver.findElement(By.id("total_product"));
		return element;
	};
	
	public static WebElement TotalFrete(WebDriver driver) {
		element = driver.findElement(By.id("total_shipping"));
		return element;
	};
	
	public static WebElement Total(WebDriver driver) {
		element = driver.findElement(By.id("total_price"));
		return element;
	};
	
	public static WebElement formaPagamento(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(), \"Pay by bank wire\")]"));
		return element;
	};	
	
	public static WebElement btnConfirm(WebDriver driver) {
		element = driver.findElement(By.xpath("//button/span[text()=\"I confirm my order\"]"));
		return element;
	};
	
	public static WebElement msgConfirm(WebDriver driver) {
		element = driver.findElement(By.xpath("//p/strong[text()=\"Your order on My Store is complete.\"]"));
		return element;
	};
	
	public static WebElement primeiroNome(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id=\"customer_firstname\"]"));
		return element;
	};
	
	public static WebElement ultimoNome(WebDriver driver) {
		element = driver.findElement(By.id("customer_lastname"));
		return element;
	};
	
	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
	};
	
	public static WebElement emailCreate(WebDriver driver) {
		element = driver.findElement(By.id("email_create"));
		return element;
	};
	
	public static WebElement senha(WebDriver driver) {
		element = driver.findElement(By.id("passwd"));
		return element;
	};
	
	public static WebElement enderecoPrimeiroNome(WebDriver driver) {
		element = driver.findElement(By.id("firstname"));
		return element;
	};
	
	public static WebElement enderecoUltimoNome(WebDriver driver) {
		element = driver.findElement(By.id("lastname"));
		return element;
	};
	
	public static WebElement campoEndereco(WebDriver driver) {
		element = driver.findElement(By.id("address1"));
		return element;
	};
	
	public static WebElement cidade(WebDriver driver) {
		element = driver.findElement(By.id("city"));
		return element;
	};
	
	public static WebElement estado(WebDriver driver) {
		element = driver.findElement(By.id("id_state"));
		return element;
	};
	
	public static WebElement cep(WebDriver driver) {
		element = driver.findElement(By.id("postcode"));
		return element;
	};
	
	public static WebElement celular(WebDriver driver) {
		element = driver.findElement(By.id("phone_mobile"));
		return element;
	};
	
	public static WebElement btnRegistrar(WebDriver driver) {
		element = driver.findElement(By.id("submitAccount"));
		return element;
	};
	
	public static WebElement btnCriarConta(WebDriver driver) {
		element = driver.findElement(By.id("SubmitCreate"));
		return element;
	};
	
	public static WebElement orderStepCart(WebDriver driver) {
		element = driver.findElement(By.id("order_step"));
		return element;
	};
	public static WebElement apelidoEndereco(WebDriver driver) {
		element = driver.findElement(By.id("alias"));
		return element;
	};
	
}
