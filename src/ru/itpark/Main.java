package ru.itpark;

import ru.itpark.comparator.PriceComparator;
import ru.itpark.domain.*;
import ru.itpark.repository.Repository;
import ru.itpark.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service(
                new Repository()
        );

       service.add(new Smatphone(1,"Alcatel", 12_000));
        service.add(new Smatphone(2,"LG", 15_500));
        service.add(new Smatphone(3,"Nokia", 12_500));

        service.add(new Computer(4,"MXP i5-7400", 32_900));
        service.add(new Computer(5,"NexPort", 34_900));

        service.add(new Television(6,"Витязь", 7_980));
        service.add(new Television(7,"Panasonic", 24_690));

        service.add(new Pot(8,"Дорожный", 1_520));

        service.add(new TShirt(9,"Nike", 1_690));



        System.out.println(service.getSorted(new PriceComparator()));
        System.out.println(service.getAllNamesProduct(service.getSorted(new PriceComparator())));


    }
}
