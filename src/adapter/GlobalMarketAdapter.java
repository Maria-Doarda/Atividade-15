package adapter;

import domain.Produto;
import repository.CatalogoProdutos;

import java.util.List;

public class GlobalMarketAdapter implements CatalogoProdutos {

    @Override
    public List<Produto> listarProdutos() {
        return List.of();
    }
}
