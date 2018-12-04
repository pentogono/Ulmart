package ru.itpark.service;

import ru.itpark.domain.Product;
import ru.itpark.repository.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Service {
    private Repository repository;


    public Service(Repository repository) {
        this.repository = repository;
    }


    public void add(Product product) {
        repository.add(product);
    }

    public List<Product> getAll() {
        return repository.getAll();
    }

    public List<Product> getSorted(Comparator<Product> comparator) {
        List<Product> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

        public List<Product>
    getAllNamesProduct(List<Product> products) {

        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains("LG")) {
                result.add(product);
            }
        }
        return result;
    }

}
