package testebrq;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CompraSteps {
	
	public static WebDriver driver;
	
	@Given ("^que eu tenha acessado o sistema no \"([^\"]*)\"$")
	public void acessarLink(String url) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
    @And ("^tenha movimentado o mouse até o produto$")
    public void moverMouse() {
    	CompraElementMap.produto(driver);
    	Actions actions = new Actions(driver);
    	actions.moveToElement(CompraElementMap.produto(driver)).perform();
    }
    
    @When ("^clico no botão \"([^\"]*)\"$")
    public void clicarBotao(String botao) {    	
		if(botao.equals("Add to cart")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.btnAddToCart(driver)));			
			CompraElementMap.btnAddToCart(driver).click();
		}
		if (botao.equals("Proceed to checkout")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.btnProceed(driver)));			
			CompraElementMap.btnProceed(driver).click();
		}
		if (botao.equals("Proceed to checkout >")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.btnProceedCart(driver)));			
			CompraElementMap.btnProceedCart(driver).click();
		}
		
		if (botao.equals("Proceed to payment")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.btnProceedPayment(driver)));			
			CompraElementMap.btnProceedPayment(driver).click();
		}
		
		if (botao.equals("Create an account")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.btnCriarConta(driver)));			
			CompraElementMap.btnCriarConta(driver).click();
		}
		if (botao.equals("Register")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.btnRegistrar(driver)));			
			CompraElementMap.btnRegistrar(driver).click();
		}
		if (botao.equals("Eu aceito ...")) {
			//WebDriverWait wait = new WebDriverWait(driver, 40);
			//wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.termosECondicoes(driver)));			
			CompraElementMap.termosECondicoes(driver).click();
		}
		if (botao.equals("I confirm my order")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.btnConfirm(driver)));			
			CompraElementMap.btnConfirm(driver).click();
		}
	}    
     
    @Then ("^que eu esteja no carrinho$")
    public void verificarEstouCarrinho() {    	
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(CompraElementMap.orderStepCart(driver)));		
    }
    
    @And ("^o produto \"([^\"]*)\" esta no carrinho$")
    public void verificarProdutoCarrinho(String produto) {
    	WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.produtoCart(driver)));
    }
    
    @And ("^esteja no \"([^\"]*)\" passo$")
    public void estarNoPasso(String passo) {
    	if (passo.equals("segundo")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.segundoPasso(driver)));
		}
    	if (passo.equals("terceiro")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.terceiroPasso(driver)));
		}
    	if (passo.equals("quarto")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.quartoPasso(driver)));
		}
    	if (passo.equals("quinto")) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.quintoPasso(driver)));
		}
    }
    
    @When ("^preencho o campo \"([^\"]*)\" com \"([^\"]*)\"$")
    public void preencherCampo(String campo, String valor) {    	
    	if (campo.equals("email")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.email(driver)));
			CompraElementMap.email(driver).sendKeys(valor);
		}
    	if (campo.equals("autenticacao")) {
    		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.emailCreate(driver)));
			CompraElementMap.emailCreate(driver).sendKeys(valor);
		}
    	if (campo.equals("primeiro nome")) {
    		WebDriverWait wait = new WebDriverWait(driver, 60);
    		WebElement teste = wait.until(ExpectedConditions.elementToBeClickable(CompraElementMap.primeiroNome(driver)));
			teste.sendKeys(valor);
		}
    	if (campo.equals("ultimo nome")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.ultimoNome(driver)));
			CompraElementMap.ultimoNome(driver).sendKeys(valor);
		}
    	if (campo.equals("senha")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.senha(driver)));
			CompraElementMap.senha(driver).sendKeys(valor);
		}
    	if (campo.equals("primeiro nome endereco")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.enderecoPrimeiroNome(driver)));
			CompraElementMap.enderecoPrimeiroNome(driver).sendKeys(valor);
		}
    	if (campo.equals("ultimo nome endereco")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.enderecoUltimoNome(driver)));
			CompraElementMap.enderecoUltimoNome(driver).sendKeys(valor);
		}
    	if (campo.equals("endereco")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.campoEndereco(driver)));
			CompraElementMap.campoEndereco(driver).sendKeys(valor);
		}
    	if (campo.equals("cidade")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.cidade(driver)));
			CompraElementMap.cidade(driver).sendKeys(valor);
		}
    	if (campo.equals("cep")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.cep(driver)));
			CompraElementMap.cep(driver).sendKeys(valor);
		}
    	if (campo.equals("pais")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.pais(driver)));
			CompraElementMap.pais(driver).sendKeys(valor);
		}
    	if (campo.equals("celular")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.celular(driver)));
			CompraElementMap.celular(driver).sendKeys(valor);
		}
    	if (campo.equals("apelido endereco")) {
    		WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(CompraElementMap.apelidoEndereco(driver)));
			CompraElementMap.apelidoEndereco(driver).sendKeys(valor);
		}    	
    }
    
    @And ("^seleciono o campo \"([^\"]*)\" com \"([^\"]*)\"$")
    public void selecionarCampo(String campo, String valor) {
    	if(campo.equals("estado")) {
    		Select estado = new Select(CompraElementMap.estado(driver));
        	estado.selectByVisibleText(valor);
    	}
    	if(campo.equals("pais")) {
	    	Select pais = new Select(CompraElementMap.selectPais(driver));
	    	pais.selectByVisibleText(valor);
    	}
    }    
    
    @When ("^valido se o \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\" estão corretos$")
    public void validoEndereco(String endereco, String estado, String cep ,String cidade, String pais) {    	
    	Assert.assertEquals(endereco, CompraElementMap.endereco(driver).getText());
    	Assert.assertEquals(cidade + ", " + estado + " " + cep, CompraElementMap.cidadeEstadoCEP(driver).getText());
    	Assert.assertEquals(pais, CompraElementMap.pais(driver).getText());    	
    }
    
    @Then ("^o valor total é \"([^\"]*)\", sendo a soma do valor do \"([^\"]*)\" com o valor de \"([^\"]*)\"$")
    public void verificaValorTotalCompra(String produto, String frete, String total) {
    	Assert.assertEquals(produto, CompraElementMap.totalProduto(driver).getText());
    	Assert.assertEquals(frete, CompraElementMap.TotalFrete(driver).getText());
    	Assert.assertEquals(total, CompraElementMap.Total(driver).getText());
    	
    }
    
    @When ("^seleciono o metodo de pagamento$")
    public void selecionaMetodoPagamento() {
    	CompraElementMap.formaPagamento(driver).click();
    }
    
    @Then ("^verifico a mensagem \"([^\"]*)\"$")
    public void verificaMensagem(String mensagem) {
    	Assert.assertEquals(mensagem, CompraElementMap.msgConfirm(driver).getText());
    }

}
