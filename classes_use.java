import java.util.Scanner;
public class classes_use {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in); 
    classes_bank_account user = new classes_bank_account(); //creating object of class
    System.out.println("Enter Your Name");
    user.name = input.nextLine();
    System.out.println("Enter Current Balance");
    user.bal = input.nextDouble();
    
    while (true){
    System.out.printf("1-Deposit\n 2-Withdraw\n 3-Current Balance\n 4-Exit\n ");
    int choice = input.nextInt();
    double b;
    if (choice == 1) {
        System.out.println("Enter Amount Balance");
        b = input.nextDouble();
        user.add(b);
    }
    else if (choice == 2) {
        System.out.println("Enter Amount Withdrawl");
        b = input.nextDouble();
        user.with(b);
    }

    else if (choice == 3) {
        System.out.printf("Total Amount in Your account is  %f: ",user.bal );
        
    }
    else
    {
        input.close();
        return ;
        
    }
}
}
         
}
