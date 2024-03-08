public class Driver {

    public static void main(String[] args) {
        // Create and insert books into the collection
        BookCollection myLibrary = new BookCollection(15);

        myLibrary.insert(new Book("To Kill a Mockingbird", 40, true));
        myLibrary.insert(new Book("1984", 33, false));
        myLibrary.insert(new Book("Brave New World", 30, true));
        myLibrary.insert(new Book("Catch-22", 45, false));
        myLibrary.insert(new Book("Animal Farm", 25, true));

        // Display the initial state of the collection
        System.out.println("Initial Library Collection:");
        System.out.println(myLibrary);

        // Test deletion of a book
        System.out.println("Deleting '1984' from the collection.");
        myLibrary.delete(new Book("1984", 33, false));
        System.out.println("Library Collection after Deletion:");
        System.out.println(myLibrary);

        // Test if the collection contains a specific book
        System.out.println("Does the collection contain 'To Kill a Mockingbird'? " + myLibrary.contains(new Book("To Kill a Mockingbird", 40, true)));

        // Test the size of the collection
        System.out.println("Current size of the collection: " + myLibrary.size());

        // Test for counting occurrences based on the 'isRegistered' status
        System.out.println("Number of registered books: " + myLibrary.countOccurrences(true));
        System.out.println("Number of unregistered books: " + myLibrary.countOccurrences(false));
    }
}



