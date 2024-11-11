public class Main {
    public static void main(String[] args) {

        ProgrammingBook pBook1 = new ProgrammingBook("Java", "Java Basics", 150, "Author A", "Manh", 25000);
        ProgrammingBook pBook2 = new ProgrammingBook("Java", "Advanced Java", 200, "Author B","Dung" , 30000);
        ProgrammingBook pBook3 = new ProgrammingBook("Python", "Python Guide", 120, "Author C", "Vuong", 35000);

        FictionBook fBook1 = new FictionBook(1, "Fantasy World", 180.0, "Author D", "Viễn tưởng 1");
        FictionBook fBook2 = new FictionBook(2, "Space Adventures", 220.0, "Author E", "Viễn tưởng 1");
        FictionBook fBook3 = new FictionBook(3, "Mystery Night", 90.0, "Author F", "Viễn tưởng 2");

        double totalPrice = pBook1.getPrice() + pBook2.getPrice() + pBook3.getPrice()
                + fBook1.getPrice() + fBook2.getPrice() + fBook3.getPrice();
        System.out.println("Total price: " + totalPrice);

        int javaBookCount = 0;
        if (pBook1.getLanguage().equalsIgnoreCase("Java")) javaBookCount++;
        if (pBook2.getLanguage().equalsIgnoreCase("Java")) javaBookCount++;
        if (pBook3.getLanguage().equalsIgnoreCase("Java")) javaBookCount++;
        System.out.println("Number of ProgrammingBook with language 'Java': " + javaBookCount);

        int fiction1Count = 0;
        if (fBook1.getCategory().equalsIgnoreCase("Viễn tưởng 1")) fiction1Count++;
        if (fBook2.getCategory().equalsIgnoreCase("Viễn tưởng 1")) fiction1Count++;
        if (fBook3.getCategory().equalsIgnoreCase("Viễn tưởng 1")) fiction1Count++;
        System.out.println("Number of FictionBook with category 'Viễn tưởng 1': " + fiction1Count);

        int fictionUnder100Count = 0;
        if (fBook1.getPrice() < 100) fictionUnder100Count++;
        if (fBook2.getPrice() < 100) fictionUnder100Count++;
        if (fBook3.getPrice() < 100) fictionUnder100Count++;
        System.out.println("Number of FictionBook with price < 100: " + fictionUnder100Count);
    }
}