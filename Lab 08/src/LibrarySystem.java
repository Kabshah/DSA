class Book {
    int bookID;String title;Book next;Book prev;
    public Book(int bookID, String title) {
        this.bookID = bookID;this.title = title;
        this.next = null;this.prev = null;}}
class Library {
    Book head;  // Head of the doubly linked list
    public void insertAtBeginning(int bookID, String title) {
        Book newBook = new Book(bookID, title);
        // If the list is empty, make the new book the head
        if (head == null) {
            head = newBook;
        } else {
            newBook.next = head;  // Point new book to the current head
            head.prev = newBook;  // Set the current head's previous to new book
            head = newBook;    }}   // Update head to the new book
    public void displayBooks() {
        if (head == null) {
            System.out.println("The library is empty.");
            return;}
        Book current = head;
        while (current != null) {
            System.out.println("Book ID: " + current.bookID + ", Title: " + current.title);
            current = current.next;}}
    public void deleteBook(int bookID) {
        if (head == null) {
            System.out.println("The library is empty.");
            return;}
        // If the book to be deleted is the head
        if (head.bookID == bookID) {
            head = head.next;  // Move the head to the next book
            if (head != null) {
                head.prev = null;}  // Set the previous pointer of the new head to null
            System.out.println("Book with ID " + bookID + " deleted.");
            return;}
        // Traverse the list to find the book with the given ID
        Book current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                if (current.next != null) {
                    current.next.prev = current.prev; } // Link the next book's previous to the previous book
                if (current.prev != null) {
                    current.prev.next = current.next; } // Link the previous book's next to the next book
                System.out.println("Book with ID " + bookID + " deleted.");
                return;}
            current = current.next;}
        // If the book is not found
        System.out.println("Book with ID " + bookID + " not found.");}}
public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.insertAtBeginning(1001, "Java Programming");
        library.insertAtBeginning(2102, "Discrete Maths book");
        library.insertAtBeginning(1033, "Computer Organization Book");
        System.out.println("Library Books:");
        library.displayBooks();
        library.deleteBook(2102);
        System.out.println("\nLibrary Books After Deletion:");
        library.displayBooks();}}

/*3. You are managing a library system where each book is represented by a node in a doubly linked list. Each node contains:
        •	Book ID (integer)
•	Book Title (string)
Your task is to:
a)	Insert a book at the beginning of the list.
        b)	Display all books in the list from start to end.
c)	Delete a book by its Book ID.
        d)	Display the list after deletion*/
