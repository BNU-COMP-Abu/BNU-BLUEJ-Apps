/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Abu Ahmed
 * @version 22011615
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Volkswagen Golf MK5"));
        manager.addProduct(new Product(102,  "Honda Civic Type R"));
        manager.addProduct(new Product(103,  "Nissan Micra"));
        manager.addProduct(new Product(104,  "Bently Continental"));
        manager.addProduct(new Product(105,  "Hyundai I30"));
        manager.addProduct(new Product(106,  "Ford Focus ST"));
        manager.addProduct(new Product(107,  "Telsa Model S"));
        manager.addProduct(new Product(108,  "Jaguar XF"));
        manager.addProduct(new Product(109,  "Seat Ibifa"));
        manager.addProduct(new Product(110,  "Vauxhall Corsa"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDelivery()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 5 items of one of the products.
        manager.delivery(101, 10);
        manager.delivery(102,10);
        manager.delivery(103,10);
        manager.delivery(104,10);
        manager.delivery(105,10);
        manager.delivery(106,10);
        manager.delivery(107,10);
        manager.delivery(108,10);
        manager.delivery(109,10);
        manager.delivery(110,10);
        manager.printAllProducts();
    }

    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
