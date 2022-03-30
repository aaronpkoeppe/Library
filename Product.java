public class Product {

    private static int counter = 0;

    /**
     * @return the counter
     */
    final public String type = "Product";
    protected int id;
    protected int datePublished;
    protected Category category;
    protected String Name;
    protected String status;

    /**
     * @return the counter
     */
    public Product() {
        Product.counter++;
        this.id = Product.counter;
        datePublished = 0;
        category = null;
        Name = null;
        status = null;

    }

    /**
     * @param datePublished
     * @param category
     * @param Name
     */
    public Product(int datePublished, Category category, String Name, String status) {

        this();
        this.setDatePublished(datePublished);
        this.setCategory(category);
        this.setName(Name);
        this.status = status;
    }

    /**
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return the datePublished
     */
    public int getDatePublished() {
        return this.datePublished;
    }

    /**
     * @param datePublished the datePublished to set
     */
    public void setDatePublished(int datePublished) {
        this.datePublished = Math.max(datePublished, 0);
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return this.category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the Name of the product
     */
    public String getName() {
        return this.Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the type of the product
     */
    public String getType() {
        return this.type;
    }
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}



