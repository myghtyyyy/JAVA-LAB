import java.util.Scanner;

class ElectricityBill {
    int Bill_Id;
    String CustomerName;
    int MeterReading;
    int Bill;

    ElectricityBill(int id, String name, int reading, int bill) {
        Bill_Id = id;
        CustomerName = name;
        MeterReading = reading;
        Bill = bill;

        if (MeterReading < 20) {
            Bill = Bill + 100;
        } 
        else if (MeterReading < 50) {
            Bill = Bill + 200;
        } 
        else {
            Bill = Bill + 500;
        }
    }

    void display() {
        System.out.println("Bill ID: " + Bill_Id);
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Meter Reading: " + MeterReading);
        System.out.println("Final Bill: Rs. " + Bill);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Meter Reading: ");
        int reading = sc.nextInt();

        System.out.print("Enter Bill Amount: ");
        int bill = sc.nextInt();

        ElectricityBill e = new ElectricityBill(id, name, reading, bill);

        e.display();
    }
}