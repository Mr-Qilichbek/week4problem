public class LibraryTest {
    public static void main(String[] args) {
        LibraryBook validBook = new LibraryBook();
        validBook.setBookTitle("The Great Gatsby");
        validBook.setAuthor("F. Scott Fitzgerald");
        validBook.setPages(180);

        LibraryBook invalidBook = new LibraryBook();
        invalidBook.setBookTitle("Broken Logic");
        invalidBook.setAuthor("Jane Doe");

        System.out.println("--- Attempting to set negative pages ---");
        invalidBook.setPages(-50);

        System.out.println("\n--- Valid Book Results ---");
        validBook.displayInfo();

        System.out.println("\n--- Invalid Book Results (Should show default pages) ---");
        invalidBook.displayInfo();
    }
}