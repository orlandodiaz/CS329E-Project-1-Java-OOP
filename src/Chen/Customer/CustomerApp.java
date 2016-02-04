package Chen.Customer;

import java.util.Scanner;

public class CustomerApp {
  public static void main(String args[]){
      System.out.println("Welcome to the Customer Viewer");
      System.out.println();

      Scanner sc = new Scanner(System.in);
      String choice = "y";
      while (choice.equalsIgnoreCase("y")) {
          System.out.print("Enter a customer number: ");
          int customerNumber = sc.nextInt();

          Customer customer = CustomerDB.getCustomer(customerNumber);
          System.out.println();
          System.out.println(customer.getNameAndAddress());
          System.out.print("Display another customer? (y/n): ");
          choice = sc.next();
          System.out.println();


      }


  }


}
