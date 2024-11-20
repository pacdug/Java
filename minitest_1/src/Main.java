public class Main {
    public static void main(String[] args) {

        ProgrammingBook pBook1 = new ProgrammingBook("Java", "Java Basics", 150, "Author A", "Manh", 25000);
        ProgrammingBook pBook2 = new ProgrammingBook("Java", "Advanced Java", 200, "Author B","Dung" , 30000);
        ProgrammingBook pBook3 = new ProgrammingBook("Python", "Python Guide", 120, "Author C", "Vuong", 35000);

        FictionBook fBook1 = new FictionBook(1, "Fantasy World", 180.0, "Author D", "Viễn tưởng 1");
        FictionBook fBook2 = new FictionBook(2, "Space Adventures", 220.0, "Author E", "Viễn tưởng 1");
        FictionBook fBook3 = new FictionBook(3, "Mystery Night", 90.0, "Author F", "Viễn tưởng 2");

        double totalPrice = 0;
        Book[] books = {pBook1, pBook2, pBook3, fBook1, fBook2, fBook3 };
        for(Book book : books){
            totalPrice += book.getPrice();
        }
        System.out.println("Total price after discount: " + totalPrice);

        int javaBookCount = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                ProgrammingBook progBook = (ProgrammingBook) book;
                if (progBook.getLanguage().equals("Java")) {
                    javaBookCount++;
                }
            }
        }
        System.out.println("ProgrammingBook has the language 'Java': " + javaBookCount);


        int fictionCategoryCount = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                if (fictionBook.getCategory().equals("Viễn tưởng 1")) {
                    fictionCategoryCount++;
                }
            }
        }
        System.out.println("FictionBook has the category 'Viễn tưởng 1': " + fictionCategoryCount);

        int cheapFictionBookCount = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                if (book.getPrice() < 100) {
                    cheapFictionBookCount++;
                }
            }
        }
        System.out.println("FictionBook has price < 100: " + cheapFictionBookCount);
    }
}