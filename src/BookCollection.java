public class BookCollection {
        private Book[] books;
        private int size;

        public BookCollection(int capacity) {
            books = new Book[capacity];
            size = 0;
        }

        public boolean insert(Book book) {
            if (size >= books.length) return false; // Check if the collection is full
            int i = size - 1;
            while (i >= 0 && books[i].getTitle().compareTo(book.getTitle()) < 0) {
                books[i + 1] = books[i];
                i--;
            }
            books[i + 1] = book;
            size++;
            return true;
        }

        public void delete(Book book) {
            int index = indexOf(book);
            if (index == -1) return; // Book not found
            for (int i = index; i < size - 1; i++) {
                books[i] = books[i + 1];
            }
            books[size - 1] = null;
            size--;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int indexOf(Book book) {
            for (int i = 0; i < size; i++) {
                if (books[i].equals(book)) {
                    return i;
                }
            }
            return -1;
        }

        public int countOccurrences(boolean isRegistered) {
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (books[i].isRegistered() == isRegistered) {
                    count++;
                }
            }
            return count;
        }

        public int lastIndexOf(Book book) {
            for (int i = size - 1; i >= 0; i--) {
                if (books[i].equals(book)) {
                    return i;
                }
            }
            return -1;
        }

        public boolean contains(Book book) {
            return indexOf(book) != -1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Title\tAge\tRegistered\n");
            sb.append("-----------------------------------\n");
            for (int i = 0; i < size; i++) {
                Book book = books[i];
                sb.append(book.getTitle()).append("\t")
                        .append(book.getAge()).append("\t")
                        .append(book.isRegistered()).append("\n");
            }
            return sb.toString();
        }


    }


