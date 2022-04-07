/**
 * creates moive class with extends from Product.
 * creates movie objects to be stored int o the product database.
 * movies craeted have to have a date published, category, name, status, and rating.
 */
public class Movie extends Product {
    /**
     * Constructor for objects of class Movie
     */
    final String type = "Movie";

    /**
     *
     * @return the type as "Movie"
     */
    public Movie() {
        this(0, null, null, null, 0.0); // call the constructor of the super class
    }

    /**
     * Creating a movie with date published, category, name, and status.
     * @param datePublished
     * @param category
     * @param name
     */
    public Movie(int datePublished, Category category, String name, String status, double rating) {
        super(datePublished, category, name, status, rating);
    }

    /**
     * @return type "Movie" as a string
     */
    @Override
    public String getType() {
        return this.type;
    }
}


