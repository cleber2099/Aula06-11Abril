public class Produto {
    private Double valor;
    private String nome;

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
