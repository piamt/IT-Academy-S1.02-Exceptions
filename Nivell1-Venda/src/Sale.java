import java.lang.reflect.Array;

public class Sale {
    private Product[] arrayProducts;
    private double totalPrice;

    public Sale(Product[] arrayProducts) {
        this.arrayProducts = arrayProducts;
        this.totalPrice = sumPrice();
    }

    public double calcularTotal() throws EmptySaleException {
        if (arrayProducts.length == 0) throw new EmptySaleException("Per fer una venda primer has d’afegir productes");
        return totalPrice;
    }

    public Product productAt(int index) throws ArrayIndexOutOfBoundsException {
        if (arrayProducts.length <= index || index < 0) throw new ArrayIndexOutOfBoundsException();
        return arrayProducts[index];
    }

    private double sumPrice() {
        double sum = 0;
        for (Product product: arrayProducts) {
            sum += product.getPrice();
        }
        return sum;
    }
}