import java.lang.reflect.Array;
import java.util.List;

public class Sale {
    private List<Product> arrayProducts;
    private double totalPrice;

    public Sale(List<Product> products) {
        this.arrayProducts = products;
        this.totalPrice = sumPrice();
    }

    public double calcularTotal() throws EmptySaleException {
        if (arrayProducts.size() == 0) throw new EmptySaleException("Per fer una venda primer has d’afegir productes");
        return totalPrice;
    }

    public Product productAt(int index) throws ArrayIndexOutOfBoundsException {
        if (arrayProducts.size() <= index || index < 0) throw new ArrayIndexOutOfBoundsException();
        return arrayProducts.get(index);
    }

    private double sumPrice() {
        double sum = 0;
        for (Product product: arrayProducts) {
            sum += product.getPrice();
        }
        return sum;
    }
}