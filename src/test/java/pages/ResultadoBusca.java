public class ResultadoBusca{
    WebDriver driver;

    final String PRODUTO = '//*[@id="CardInstance9tGOwnjTVNiL3AtUH5BVxQ"]/div[1]/div/div[2]/div[2]/div[1]/div/div/div/div[2]/a/div[1]/span/span[2]/span[2]'

    public ResultadoBusca(WebDriver driver){
        this.driver = driver;
    }

    public void verificaValor(String valorPesquisado){
        String valorProduto = driver.findElement(By.xpath(PRODUTO)).getText();
        AssertTrue(Integer.parseInt(valorProduto) > Integer.parseInt(valorPesquisado));
    }
}