public class App {
    public static void main(String[] args) throws Exception {
        Product arrayProducts[] = {};
        Sale sale = new Sale(arrayProducts);
        try {
            sale.calcularTotal();
        } catch(VendaBuidaException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            sale.productAt(1);
        } catch(IndexOutOfBoundsException exception) {
            System.out.println("Inside IndexOutOfBoundsException: " + exception.getMessage());
        }

    }
}