import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<>();
        Sale sale = new Sale(products);
        try {
            sale.calcularTotal();
        } catch(EmptySaleException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            sale.productAt(1);
        } catch(IndexOutOfBoundsException exception) {
            System.out.println("Trying to access a non-existent sale");
        }
    }
}