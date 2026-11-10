public class XmlVisitor implements CatalogVisitor {

    private final StringBuilder xml = new StringBuilder();

    private int depth = 0;

    @Override
    public void visit(Product product) {
        addIndent();

        xml.append("<product name=\"")
                .append(escape(product.getName()))
                .append("\" price=\"")
                .append(product.getPrice())
                .append("\"/>\n");
    }

    @Override
    public void visit(Category category) {
        addIndent();

        xml.append("<category name=\"")
                .append(escape(category.getName()))
                .append("\">\n");

        depth++;

        // Посещаем все товары и подкатегории.
        for (int i = 0; i < category.getChildCount(); i++) {
            CatalogComponent child = category.getChild(i);

            child.accept(this);
        }

        depth--;

        addIndent();

        xml.append("</category>\n");
    }

    public String getXml() {
        return xml.toString();
    }

    private void addIndent() {
        for (int i = 0; i < depth; i++) {
            xml.append("    ");
        }
    }

    private String escape(String text) {
        return text.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
    }
}