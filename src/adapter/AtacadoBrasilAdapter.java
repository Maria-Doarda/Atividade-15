package adapter;

import domain.Produto;
import externo.AtacadoBrasilApi;
import repository.CatalogoProdutos;

import java.util.ArrayList;
import java.util.List;

public class AtacadoBrasilAdapter implements CatalogoProdutos {

    private AtacadoBrasilApi api;

    public AtacadoBrasilAdapter(AtacadoBrasilApi api){
        this.api = api;
    }

    @Override
    public List<Produto> listarProdutos() {
        List<String[]> produtosApi = api.buscarProdutosAtacado();
        List<Produto> produtos = new ArrayList<>();

        for(String[] dados : produtosApi){
            String codigo = dados[0];
            String nome = dados[1];
            double preco = Double.parseDouble(dados[2]);
            int estoque = Integer.parseInt(dados[3]);

            Produto produto = new Produto(estoque, codigo, nome, preco,
                    "Atacadp Brasil", estoque>0);

            produtos.add(produto);
        }
        return produtos;
    }

}
