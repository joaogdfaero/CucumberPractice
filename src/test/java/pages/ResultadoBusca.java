public class ResultadoBusca{
    WebDriver driver;

    final String PRODUTO = '//*[@id="search"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[2]/div[2]/h2/a/span'
    final String VALOR = '/html/body/div[4]/div/div[3]/div[10]/div[17]/div/div/div[3]/div[1]/span[2]/span[2]/span[2]'

    public ResultadoBusca(WebDriver driver){
        this.driver = driver;
    }

    public void clicarProduto(){
        driver.findElement(by.xpath(PRODUTO)).click();
    }

    public String retornaValor(String valorPesquisado){
        Return = driver.findElement(by.xpath(VALOR)).getText();
    }
}