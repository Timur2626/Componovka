public interface CatalogVisitor {

    void visit(Product product);

    void visit(Category category);
}