public class Product extends CatalogComponent {

    private final long price;

    public Product(String name, long price) {
        super(name);

        if (price < 0) {
            throw new IllegalArgumentException(
                    "Цена не может быть отрицательной"
            );
        }

        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public void print(String indent) {
        System.out.println(
                indent + "- " + getName()
                        + " — " + price + " руб."
        );
    }

    @Override
    public int getProductCount() {
        return 1;
    }
}