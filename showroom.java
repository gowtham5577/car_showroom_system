package showroom;
import java.util.Scanner;

public class showroom implements utility {
    String showrom_name;
    String showroom_address;
    int total_employee;
    int cars_in_stock=0;
    String manager_name;

    @Override
    public void get_details() {
        System.out.println("showroom name: " + showrom_name);
        System.out.println("showroom address: " + showroom_address);
        System.out.println("total employee: " + total_employee);
        System.out.println("cars in stock:" + cars_in_stock);
        System.out.println("manager name: " + manager_name);

    }
    @Override
    public void set_details(){
        Scanner sc =new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.println("Enter Showroom Name:");
        showrom_name=sc.nextLine();
        System.out.println("Enter Showroom address:");
        showroom_address=sc.nextLine();
        System.out.println("Enter total_employee:");
        total_employee=sc.nextInt();
        System.out.println("Enter cars_in_stock:");
        cars_in_stock=sc.nextInt();
        System.out.println("Enter Manager Name:");
        manager_name=sc.nextLine();
    }}


