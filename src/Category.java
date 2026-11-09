import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category extends CatalogComponent {

    private final List<CatalogComponent> children = new ArrayList<>();

    public Category(String name) {
        super(name);
    }

    @Override
    public void add(CatalogComponent component) {
        children.add(Objects.requireNonNull(component));
    }

    @Override
    public void remove(CatalogComponent component) {
        children.remove(component);
    }

    @Override
    public CatalogComponent getChild(int index) {
        return children.get(index);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ " + getName());

        for (CatalogComponent child : children) {
            child.print(indent + "    ");
        }
    }

    @Override
    public int getProductCount() {
        int total = 0;

        for (CatalogComponent child : children) {
            total += child.getProductCount();
        }

        return total;
    }
}