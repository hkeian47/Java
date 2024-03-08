public class Book {
        private String title;
        private int age;
        private boolean isRegistered;

        public Book(String title, int age, boolean isRegistered) {
            this.title = title;
            this.age = age;
            this.isRegistered = isRegistered;
        }

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isRegistered() {
            return isRegistered;
        }

        public void setRegistered(boolean registered) {
            isRegistered = registered;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return title.equals(book.title);
        }

        @Override
        public int hashCode() {
            return title.hashCode();
        }
    }



