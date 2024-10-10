import java.lang.reflect.Array;

public class Sale {
    private Product[] arrayProducts;
    private double totalPrice;

    public Sale(Product[] arrayProducts) {
        this.arrayProducts = arrayProducts;
        this.totalPrice = sumPrice();
    }

    public double calcularTotal() throws EmptySaleException {
        if (arrayProducts.length > 0) return totalPrice;
        else  throw new EmptySaleException("Per fer una venda primer has d’afegir productes");
    }

    public Product productAt(int index) throws ArrayIndexOutOfBoundsException {
        if (arrayProducts.length > index) return arrayProducts[index];
        else throw new ArrayIndexOutOfBoundsException();
    }

    private double sumPrice() {
        double sum = 0;
        for (Product product: arrayProducts) {
            sum += product.getPrice();
        }
        return sum;
    }
}