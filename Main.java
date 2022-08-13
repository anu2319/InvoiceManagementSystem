import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    static HashMap<Product,Integer> products = new HashMap<>();
    static HashMap<Customer,Integer> customers = new HashMap<>();
    static int billId = 1;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String productName;
        int quantity;
        int rate;
        int total;
        int grandTotal = 0;
        double discount;

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        int option;

        do
        {
            option = sc.nextInt();
            switch (option)
            {
                case 1 : addProducts(products);
                break;

                case 2 : removeProduct(products);
                break;

                case 3 : addCustomer(customers);
                break;

                case 4 : removeCustomer(customers);
                break;

                case 5 : buyProduct(products);
                break;

                default:
                    System.out.println("Invalid option");

            }
        }while (option!=5);


        for(Product p : products.keySet())
        {
            p.displayProductDetails();
        }
        
        discount = grandTotal*2/100;



    }
}
