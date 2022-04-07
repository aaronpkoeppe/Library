/**
 * creates a class for Magazine that extends the Product class
 * crates a magazine object with a date published, category, name, status , and rating
 */
public class Magazine extends Product{
    /**
     * Constructor for Magazine class
     */
    final String type = "Magazine";

    /**
     * calls the super class toString method
     */
    public Magazine() {
        this(0, null, null, null, 0.0); // call the constructor of the super class
    }

    /**
     * creates a new magazine object with the given parameters
     * @param datePublished
     * @param category
     * @param name
     * @param status
     * @param rating
     */
    public Magazine(int datePublished, Category category, String name, String status, double rating) {
        super(datePublished, category, name, status, rating);
    }

    /**
     * @return the type "Magazine" as a string
     */
    @Override
    public String getType() {
        return this.type;
    }

}
