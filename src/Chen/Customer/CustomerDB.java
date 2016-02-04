package Chen.Customer;

public class CustomerDB {

    public static Customer getCustomer(int customerNumber){
        Customer customer = new Customer();
        if (customerNumber == 1001){
            customer.setName("Barbara White");
            customer.setAddress("3400 Richmond Parkway #3423");
            customer.setCity("Bristol");
            customer.setState("CT");
            customer.setPostalCode("06010");
        }
        else if (customerNumber == 1002){
            customer.setName("Karl Vang");
            customer.setAddress("327 Franklin Street");
            customer.setCity("Edina");
            customer.setState("MN");
            customer.setPostalCode("55435");

        }
        else if (customerNumber == 1003){
            customer.setName("Ronda Chavan");
            customer.setAddress("518 Commanche Dr.");
            customer.setCity("Greensboro");
            customer.setState("NC");
            customer.setPostalCode("27410");

        }
        else {
            customer.setName("There is no customer number "+customerNumber+" in our records.");
        }
        return customer;

    }

}
