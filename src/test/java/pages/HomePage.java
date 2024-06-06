package pages;

public class HomePage {
    WebDriver driver;
    final String CAMPO_BUSCA = '//input[@id='twotabsearchtextbox']';

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void realizaBusca(String produto){
        driver.findElement(By.xpath(CAMPO_BUSCA)).sendKeys(produto + Keys.ENTER);
    }
}