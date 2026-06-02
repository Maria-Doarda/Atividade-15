package domain;

public class Produto {

    private String codigo;
    private String nome;
    private int quantidadeEstoque;
    private double preco;
    private String nomeFornecedor;
    private boolean disponibilidade;

    public Produto(int quantidadeEstoque, String codigo, String nome,
                   double preco, String nomeFornecedor, boolean disponibilidade) {
        this.quantidadeEstoque = quantidadeEstoque;
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.nomeFornecedor = nomeFornecedor;
        this.disponibilidade = disponibilidade;
    }

    public boolean isDisponivel(){
        if(quantidadeEstoque > 0){
            return disponibilidade = true;
        }
        return disponibilidade = false;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", precoFinal=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", fornecedor='" + nomeFornecedor + '\'' +
                ", disponivel=" + disponibilidade +
                '}';
    }
}
