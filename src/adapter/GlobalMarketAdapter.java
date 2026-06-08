package adapter;

import domain.ItemGlobal;
import domain.Produto;
import externo.GlobalMarketApi;
import repository.CatalogoProdutos;

import java.util.ArrayList;
import java.util.List;

public class GlobalMarketAdapter implements CatalogoProdutos {

    private GlobalMarketApi api;

    public GlobalMarketAdapter(GlobalMarketApi api) {
        this.api = api;
    }

    @Override
    public List<Produto> listarProdutos() {
        List<ItemGlobal> itens = api.fetchAvailableItems();
        List<Produto> produtos = new ArrayList<>();

        for(ItemGlobal item : itens){

            double precoEmReais = item.getPriceInDollars() * 5;

            Produto produto = new Produto(item.getSku(), item.getDescription(),
                    precoEmReais, item.getAvailableUnits(),
                    "Global Market", item.getAvailableUnits()>0);

            produtos.add(produto);

        }
        return produtos;

    }
}
