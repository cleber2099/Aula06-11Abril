import java.util.ArrayList;

public class CarrinhodeCompra {
    ArrayList<Produto> produtos;


    public CarrinhodeCompra(){
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }

    public double calcularTotal(){
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getValor()
                ;
        }
        return total;
    }

    public void imprimirProdutos(){
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
