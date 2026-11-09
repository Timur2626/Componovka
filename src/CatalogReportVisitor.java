public class CatalogReportVisitor implements CatalogVisitor {

    private int productCount;
    private int categoryCount;
    private long totalPrice;

    @Override
    public void visit(Product product) {
        productCount++;
        totalPrice += product.getPrice();
    }

    @Override
    public void visit(Category category) {
        categoryCount++;
    }

    public int getProductCount() {
        return productCount;
    }

    public int getCategoryCount() {
        return categoryCount;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void printReport() {
        System.out.println("Категорий: " + categoryCount);
        System.out.println("Товарных позиций: " + productCount);

        System.out.println(
                "Стоимость одного экземпляра каждой позиции: "
                        + totalPrice + " руб."
        );
    }
}