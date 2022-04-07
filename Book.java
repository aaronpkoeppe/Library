/**
 * creates Book class that extends Product class
 * creates book objects to be stored within the database.
 * books need to have a date published, category, name, status, and rating.
 */
public class Book extends Product {
    /**
     * creates variables for book objects
     */
    final String type = "Book";

    /**
     * @return the type as "Book"
     */

    public Book() {
        this(0, null, null, null, 0.0); // call the constructor of the super class
    }

    public Book(int datePublished, Category category, String name, String status, double rating) {
        super(datePublished, category, name, status, rating);
    }
    /**
     * creates a book with the type as "Book"  with the datePublished, category, name and status
     * @param datePublished
     * @param category
     * @param name
     * @param status
     * @param rating
     * @return the type as "Book"
     */

    /**
     * @return the type "Book" as a string
     */
    @Override
    public String getType() {
        return this.type;
    }


}
