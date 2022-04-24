public class Produto {
    private String nome;
    private Double valor;


    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }


    public String getNome() {
        return nome;
    }


}
