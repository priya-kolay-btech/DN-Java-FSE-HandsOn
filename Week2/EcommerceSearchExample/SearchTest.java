import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        Product result1 =
                SearchAlgorithms.linearSearch(products, "Watch");

        if (result1 != null)
            System.out.println("Found using Linear Search: "
                    + result1.productName);

        Arrays.sort(products,
                Comparator.comparing(p -> p.productName));

        Product result2 =
                SearchAlgorithms.binarySearch(products, "Watch");

        if (result2 != null)
            System.out.println("Found using Binary Search: "
                    + result2.productName);
    }
}