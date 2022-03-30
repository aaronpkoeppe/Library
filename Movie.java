public class Movie extends Product {

    final String type = "Movie";

    /**
     * @return the type
     */
    public Movie() {
        this(0, null, null, null); // call the constructor of the super class
    }

    /**
     * @param datePublished
     * @param category
     * @param name
     */
    public Movie(int datePublished, Category category, String name, String status) {
        super(datePublished, category, name, status);
    }



    @Override
    public String getType() {
        return this.type;
    }
}
	

