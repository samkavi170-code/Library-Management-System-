class LibraryItem {
    private int itemId;
    private String title;
    LibraryItem() {
        this.itemId = 0;
        this.title = "No Title";
    }
    LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }
}
class Book extends LibraryItem {
    private String author;
    Book(int itemId, String title, String author) {
        super(itemId, title);   // Calls parent constructor
        this.author = author;   // Refers to current object's author
    }

    public void displayDetails() {
        System.out.println("Book ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
    }
}
class Main {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Programming", "James Gosling");
        Book book2 = new Book(102, "Thirukkural","Thiruvallvar");
        book1.displayDetails();
        book2.displayDetails();
        LibraryItem item = new LibraryItem();
        System.out.println("Library Item ID: " + item.getItemId());
        System.out.println("Library Item Title: " + item.getTitle());
    }
}
