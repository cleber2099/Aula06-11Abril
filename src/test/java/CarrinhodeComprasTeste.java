import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarrinhodeComprasTeste {
    @Test
    public void CalcularTotalcomDoisProdutos(){
        //cenario
        Produto produto1 = new Produto("queijo", 20.0);
        Produto produto2 = new Produto("pao", 10.0);
        CarrinhodeCompra carrinho = new CarrinhodeCompra();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        //acao
        double total = carrinho.calcularTotal();
        //verificacao
        Assertions.assertEquals(30.0, total);
    }
    @Test
    public void ValorTotalVazio(){
        //cenario
        CarrinhodeCompra carrinho = new CarrinhodeCompra();
        //acao
        double total = carrinho.calcularTotal();
        //verificacao
        Assertions.assertEquals(0.0, total);
    }
    @Test
    public void CalcluarComUmitemRemovido(){
        //cenario
        Produto produto1 = new Produto("queijo", 20.0);
        Produto produto2 = new Produto("pao", 10.0);
        CarrinhodeCompra carrinho = new CarrinhodeCompra();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        //acao
        double total = carrinho.calcularTotal();
        Assertions.assertEquals(30.0, total);
        carrinho.removerProduto(produto1);
        total = carrinho.calcularTotal();
        //verificacao
        Assertions.assertEquals(10.0, total);


    }

}
