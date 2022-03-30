import java.util.ArrayList;
import java.util.List;

public class TestBench {
    /**
     * @param args the command line arguments
     */
    private static final List<Product> productList = new ArrayList<>();


    /**
     * Test 1: Product Default Constructor
     */
    private static void unitTest1_Product_Default() {

        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Product product = new Product();
        productList.add(product);
        displayInfo(product);

        product.setDatePublished(2002);
        product.setCategory(Category.MOVIE);
        product.setName("Lord of the Rings");
        product.setStatus("CHECKED OUT");
        TestBench.displayInfo(product);

    }

    /**
     * Test 2: Product Parameterized Constructor
     */
    private static void unitTest2_Product_Overload() {

        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Product product = new Product(9999, Category.MOVIE, "Product Overload", "OVERLOADED");
        productList.add(product);
        displayInfo(product);

    }

    /**
     * Test 3: Movie Default Constructor
     */
    private static void unitTest3_Movie_Default() {

        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Movie fargo = new Movie();
        productList.add(fargo);
        displayInfo(fargo);

        fargo.setDatePublished(1996);
        fargo.setCategory(Category.MOVIE);
        fargo.setName("Fargo");
        displayInfo(fargo);

        System.out.println();
        System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();
    }
    /**
     * Test 4: Movie Parameterized Constructor
     */
    private static void unitTest4_Book_Overload() {

        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Book Up = new Book(1997, Category.BOOK, "Harry Potter and the Philosopher's Stone", "CHECKED OUT");
        productList.add(Up);
        displayInfo(Up);

    }

    /**
     * Test 5: Book Default Constructor with invalid data
     */
    private static void unitTest5_Invalid_Data() {

        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Book nineteenEightyFour = new Book(1949, Category.BOOK, "1984", "CHECKED OUT");
        TestBench.displayInfo(nineteenEightyFour);

        Movie sharknado = new Movie(2013, Category.MOVIE, "Sharknado", "CHECKED IN");
        TestBench.displayInfo(sharknado);
        System.out.println();

    }

    /**
     * Display the report.
     * @param product
     */
    private static void displayInfo(Product product) {
        System.out.printf("ID: %-3d  Type: %-10s Category: %-10s DatePublished: %3d   Name: %s   Status: %s\n",
                product.getId(), product.getType(), product.getCategory(), product.getDatePublished(), product.getName(), product.getStatus());
    }

    /**
     * Display the report.
     */
    private static void displayReport() {

        System.out.println();
        System.out.println("============== library Inventory ============");
        System.out.println("ID  Product Type  Category   Date Published Name   Status");
        System.out.println("==  ============  ========   ============== ====   ====== ");

        for (Product product : productList) {
               System.out.printf("%-3d %-10s %-10s %3d %-10s %s\n",
                    product.getId(), product.getType(), product.getCategory(), product.getDatePublished(), product.getName(), product.getStatus());
        }

        System.out.println();

    }

    /**
     * Display the report.
     * @param args
     * Main method runs the test cases.
     */
    public static void main(String[] args) {

        TestBench.unitTest1_Product_Default();
        TestBench.unitTest2_Product_Overload();
        TestBench.unitTest3_Movie_Default();
        TestBench.unitTest4_Book_Overload();
        TestBench.unitTest5_Invalid_Data();

        TestBench.displayReport();

    }

}
