 public class Book extends Product {

        final String type = "Book";

        /**
         * @return the type
         * @param datePublished
         * @param category
         * @param name
         */
        public Book(int datePublished, Category category, String name, String status) {
            super(datePublished, category, name, status);
        }

        @Override
        public String getType() {
            return this.type;
        }


    }
