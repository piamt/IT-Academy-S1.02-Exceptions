public class Sale {
    private Product[] arrayProducts;
    private double totalPrice;

    public Sale(Product[] arrayProducts) {
        this.arrayProducts = arrayProducts;
        this.totalPrice = sumPrice();
    }

    public double calcularTotal() throws VendaBuidaException {
        if (arrayProducts.length > 0) {
            System.out.println(totalPrice);
            return totalPrice;
        } else {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }
    }

    public Product productAt(int index) {
        return arrayProducts[index]; // Not checking lenght could lead to IndexOutOfBoundsException
    }

    private double sumPrice() {
        double sum = 0;
        for (Product product: arrayProducts) {
            sum =+ product.getPrice();
        }
        return sum;
    }
}