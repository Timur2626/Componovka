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
    public void accept(CatalogVisitor visitor) {
        visitor.visit(this);
    }
}