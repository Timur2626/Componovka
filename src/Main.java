public class Main {

    public static void main(String[] args) {
        CatalogComponent catalog =
                new Category("Каталог хоккейной экипировки");

        CatalogComponent uniform =
                new Category("Форма");

        CatalogComponent protection =
                new Category("Защита");

        CatalogComponent headProtection =
                new Category("Защита головы");

        CatalogComponent jersey =
                new Product("Джерси", 5000);

        CatalogComponent socks =
                new Product("Гамаши", 1500);

        CatalogComponent helmet =
                new Product("Шлем", 12000);

        CatalogComponent mouthguard =
                new Product("Капа", 1000);

        CatalogComponent elbowPads =
                new Product("Налокотники", 4500);

        CatalogComponent skates =
                new Product("Коньки", 18000);

        uniform.add(jersey);
        uniform.add(socks);

        headProtection.add(helmet);
        headProtection.add(mouthguard);

        protection.add(headProtection);
        protection.add(elbowPads);

        catalog.add(uniform);
        catalog.add(protection);
        catalog.add(skates);

        System.out.println("ВЕСЬ КАТАЛОГ");
        showCatalog(catalog);

        System.out.println("\nТОЛЬКО ЗАЩИТА");
        showCatalog(protection);

        System.out.println("\nОДИН ТОВАР");
        showCatalog(helmet);
    }

    private static void showCatalog(CatalogComponent component) {
        component.print();

        System.out.println(
                "Товарных позиций: " + component.getProductCount()
        );
    }
}