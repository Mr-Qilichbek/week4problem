public class LibraryBook {

    private String bookTitle;
    private String author;
    private int pages;

    public LibraryBook() {
        this.bookTitle = "Unknown";
        this.author = "Unknown";
        this.pages = 1;
    }


    public String getBookTitle() { return bookTitle; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }


    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Error: Pages must be a positive integer greater than 0.");
        }
    }


    public boolean isThick() {
        return this.pages > 500;
    }


    public void displayInfo() {
        System.out.println("Title: " + bookTitle +
                ", Author: " + author +
                ", Pages: " + pages +
                ", Thick: " + isThick());
    }
}