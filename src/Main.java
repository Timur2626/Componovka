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

        System.out.println("КАТАЛОГ");
        catalog.print();

        System.out.println("\nОТЧЁТ ПО ВСЕМУ КАТАЛОГУ");
        showReport(catalog);

        System.out.println("\nОТЧЁТ ПО РАЗДЕЛУ «ЗАЩИТА»");
        showReport(protection);

        System.out.println("\nОТЧЁТ ПО ОДНОМУ ТОВАРУ");
        showReport(helmet);
    }

    private static void showReport(CatalogComponent component) {
        CatalogReportVisitor visitor = new CatalogReportVisitor();

        component.accept(visitor);

        visitor.printReport();
    }
}