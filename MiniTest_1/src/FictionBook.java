public class FictionBook extends Book {
    private String category;

    public FictionBook() {
    }

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, author, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.93;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                ", bookCode='" + getBookCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", author='" + getAuthor() + '\'' +
                '}';
    }
}
