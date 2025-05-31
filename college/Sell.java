import java.util.Scanner;

class Product {
    private float productNo;
    private float priceOfProduct;
    private String productName;
    private String activationKey;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductNo(float productNo) {
        this.productNo = productNo;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public void setPriceOfProduct(float priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product No: " + productNo);
        System.out.println("Activation Key: " + activationKey);
        System.out.println("Price of Product: " + priceOfProduct);
    }

    public String getProductName() {
        return productName;
    }

    public float getProductNo() {
        return productNo;
    }
}

public class Sell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = new Product();

            System.out.print("Enter the name of the product: ");
            String productName = sc.nextLine();
            products[i].setProductName(productName);

            System.out.print("Enter the product number: ");
            float productNo = sc.nextFloat();
            sc.nextLine();
            products[i].setProductNo(productNo);

            System.out.print("Enter the activation key: ");
            String activationKey = sc.nextLine();
            products[i].setActivationKey(activationKey);

            System.out.print("Enter the price of the product: ");
            float priceOfProduct = sc.nextFloat();
            sc.nextLine();
            products[i].setPriceOfProduct(priceOfProduct);
        }
        System.out.print("Enter the name of the product to search for: ");
        String searchName = sc.nextLine();
        System.out.print("Enter the product number to search for: ");
        float searchNo = sc.nextFloat();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (products[i].getProductName().equalsIgnoreCase(searchName) && products[i].getProductNo() == searchNo) {
                products[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Product not found!");
        }
        sc.close();
    }
}