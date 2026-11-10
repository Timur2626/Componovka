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

    public int getChildCount() {
        return children.size();
    }

    @Override
    public void accept(CatalogVisitor visitor) {
        visitor.visit(this);
    }
}