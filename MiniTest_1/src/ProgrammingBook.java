public class ProgrammingBook extends Book {
    private String language ;
    private String framework ;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String framework, int bookCode , String name , String author , double price) {
        super(bookCode, name, author, price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.95;
    }

    @Override
    public String toString() {
        return "ProgrammingBook ["+ super.toString() + "language = "+language + ", framework = " + framework + "]";
    }
}