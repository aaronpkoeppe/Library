/**
 * creates the product class which is used to create the product objects and store them in the database
 * gives the product objects parameters such as (name,id,date published, category,type, status, and rating)
 * increments counter for the number of products created
 * creates setters and getters for the product objects
 */

public class Product {


    /**
     *
     */
    private static int counter = 0;
    final public String type = "Product";
    protected int id;
    protected int datePublished;
    protected Category category;
    protected String Name;
    protected String status;
    protected double rating;

    /**
     * used to increment the counter
     * @return the counter
     */
    public Product() {
        Product.counter++;
        this.id = Product.counter;
        datePublished = 0;
        category = null;
        Name = null;
        status = null;
        rating = 0.0;

    }

    /**
     * creates prodcut with the given parameters(id, datePublished, category, name, status, rating)
     * @param datePublished
     * @param category
     * @param Name
     */
    public Product(int datePublished, Category category, String Name, String status, double rating) {

        this();
        this.setDatePublished(datePublished);
        this.setCategory(category);
        this.setName(Name);
        this.status = status;
        this.rating = 0.0;
    }

    /**
     * used to get the id of the product
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * used to get the date published of the product
     * @return the datePublished
     */
    public int getDatePublished() {
        return this.datePublished;
    }

    /**
     * used to set the date published of the product
     * @param datePublished the datePublished to set
     */
    public void setDatePublished(int datePublished) {
        this.datePublished = Math.max(datePublished, 0);
    }

    /**
     * used to get the category of the product
     * @return the category
     */
    public Category getCategory() {
        return this.category;
    }

    /**
     * used to set the category of the product
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * used to get the name of the product
     * @return the Name of the product
     */
    public String getName() {
        return this.Name;
    }

    /**
     * used set the name of product
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * used to set the type of product
     * @return the type of the product
     */
    public String getType() {
        return this.type;
    }

    /**
     * used to get the staus of the product
     * @return the status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * used to set the status of the product
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * used to get the rating of the product
     * @return rating
     */
    public double getRating() {
       return this.rating;
    }

    /**
     * used to set the rating of the product
     * @param rating
     */
    public void setRating(double rating) {
        this.rating = rating;
    }
}




