/*
Library Application
Author: Aaron Koeppe
Date: 03/30/2022
https://github.com/aaronpkoeppe/Library
 */


import java.util.ArrayList;
import java.util.List;

/**
 * This class is the test bench for the library application.
 * runs Tests that test all functions of the program including Movies, Books, Magazines, Overloads, and Products.
 */
public class TestBench {
    /**
     * @param args the command line arguments
     */
    private static final List<Product> productList = new ArrayList<>();


    /**
     * Test 1: Product Default Constructor
     * creating a product "lord of the Rings" as a MOVIE
     * date published set to 2002
     * category set to MOVIE
     * status set to "CHECKED OUT"
     * rating set to 4.5
     * displays the info of the product
     * adds the LOTR to the productList
     */
    private static void unitTest1_Product_Default() {

        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Movie LOTR = new Movie();
        productList.add(LOTR);
        displayInfo(LOTR);

        LOTR.setDatePublished(2002);
        LOTR.setCategory(Category.MOVIE);
        LOTR.setName("Lord of the Rings");
        LOTR.setStatus("CHECKED OUT");
        LOTR.setRating(4.5);
        TestBench.displayInfo(LOTR);

    }

    /**
     * Test 2: Product Parameterized Constructor
     * creates a instance of a product named "Product Overload"
     * sets the date published to 9999
     * sets the category to OVERLOAD
     * sets the status to "OVERLOADED"
     * sets the rating to 0.0
     * displays the info of the product
     * adds the product to the productList
     */
    private static void unitTest2_Product_Overload() {

        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Product product = new Product(9999, Category.OVERLOAD, "Product Overload", "OVERLOADED", 0.0);
        productList.add(product);
        displayInfo(product);

    }

    /**
     * Test 3: Movie Default Constructor
     * creates a instance of a movie named "Fargo"
     * sets the date published to 1996
     * sets the category to movie
     * sets the status to "CHECKED IN"
     * sets the rating to 4.5
     * displays the info of the movie
     * adds fargo to the productList
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
        fargo.setStatus("CHECKED IN");
        fargo.setRating(4.5);
        displayInfo(fargo);

        System.out.println();
        System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();
    }

    /**
     * Test 4: magazine
     * creates a instance of a Magazine named "familyCircle"
     * sets the date published to 2001
     * sets the category to magazine
     * sets the status to "CHECKED OUT"
     * sets the rating to 3.5
     * displays the info of the magazine
     * adds familyCircle to the productList
     */
    private static void unitTest4_Magazine_Data(){
        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Magazine familyCircle = new Magazine();
        familyCircle.setDatePublished(2000);
        familyCircle.setCategory(Category.MAGAZINE);
        familyCircle.setName("Family Circle");
        familyCircle.setStatus("CHECKED OUT");
        familyCircle.setRating(3.5);
        displayInfo(familyCircle);

        productList.add(familyCircle);

        System.out.println();
        System.out.println("End of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

    }

    /**
     * Test 5: Movie Parameterized Constructor
     * creates a instance of a movie named "Harry Potter and the Philosopher's Stone"
     * sets the date published to 1997
     * sets the category to BOOK
     * sets the status to "CHECKED OUT"
     * sets the rating to 5.0
     * displays the info of the BOOK
     * adds Harry Potter to the productList
     */
    private static void unitTest5_Book_Overload() {

        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Book harryPotter = new Book(1997, Category.BOOK, "Harry Potter and the Philosopher's Stone", "CHECKED OUT", 5.0);
        productList.add(harryPotter);
        displayInfo(harryPotter);

    }

    /**
     * Test 6: Book Default Constructor with invalid data
     * creates a instance of a book named "1984"
     * sets the date published to 1949
     * sets the category to BOOK
     * sets the status to "CHECKED OUT"
     * sets the rating to 4.2
     * displays the info of the nineteenEightyFour
     * adds nineteenEightyFour to the productList
     *
     * creates a instance of a Movie named "sharknado"
     * sets the date published to 2013
     * sets the category to MOVIE
     * sets the status to "CHECKED IN"
     * sets the rating to 1.2
     * displays the info of the sharknado
     * adds sharknado to the productList
     */
    private static void unitTest6_Invalid_Data() {

        System.out.println();
        System.out.println("Start of " + Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println();

        Book nineteenEightyFour = new Book(1949, Category.BOOK, "1984", "CHECKED OUT", 4.2);
        TestBench.displayInfo(nineteenEightyFour);

        Movie sharknado = new Movie(2013, Category.MOVIE, "Sharknado", "CHECKED IN", 1.2);
        TestBench.displayInfo(sharknado);
        System.out.println();

    }

    /**
     * Display the report.
     * prints out products using a formatted print statement
     * prints out the Id, Name, Category, Date Published, Status, type, and Rating of every product
     * @param product
     */
    private static void displayInfo(Product product) {
        System.out.printf("ID: %-3d  Type: %-10s Category: %-10s DatePublished: %3d   Name: %s   Status: %s\n",
                product.getId(), product.getType(), product.getCategory(), product.getDatePublished(), product.getName(), product.getStatus());
    }

    /**
     * Display the report.
     * prints out all products under the productList
     */
    private static void displayReport() {

        System.out.println();
        System.out.println("============== library Inventory ============");
        System.out.println("ID  Product Type  Category   Date Published Name   Status  Rating");
        System.out.println("==  ============  ========   ============== ====   ======  ======");

        for (Product product : productList) {
            System.out.printf("%-3d %-10s %-10s %3d %-10s %s, %.2f\n",
                    product.getId(), product.getType(), product.getCategory(), product.getDatePublished(), product.getName(), product.getStatus(), product.getRating());
        }

        System.out.println();

    }

    /**
     * runs all tests in the TestBench class
     * displays the report following the tests
     * @param args Main method runs the test cases.
     */
    public static void main(String[] args) {

        TestBench.unitTest1_Product_Default();
        TestBench.unitTest2_Product_Overload();
        TestBench.unitTest3_Movie_Default();
        TestBench.unitTest4_Magazine_Data();
        TestBench.unitTest5_Book_Overload();
        TestBench.unitTest6_Invalid_Data();

        TestBench.displayReport();

    }

}
