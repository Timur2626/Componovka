public abstract class CatalogComponent {

    private final String name;

    public CatalogComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        print("");
    }

    public abstract void print(String indent);

    public abstract int getProductCount();

    public abstract void accept(CatalogVisitor visitor);

    public void add(CatalogComponent component) {
        throw new UnsupportedOperationException(
                "В товар нельзя добавлять дочерние элементы"
        );
    }

    public void remove(CatalogComponent component) {
        throw new UnsupportedOperationException(
                "У товара нет дочерних элементов"
        );
    }

    public CatalogComponent getChild(int index) {
        throw new UnsupportedOperationException(
                "У товара нет дочерних элементов"
        );
    }
}