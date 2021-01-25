import java.util.Scanner;
public class getting_input {
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in); //creating object of class scanner 
        int a;
        String b;
        a = input.nextInt(); // using method inside the class by object created 
        System.out.printf("%d\n",a);
        input.nextLine(); //for removing line eating
        b= input.nextLine();
        System.out.printf("%s",b);
        input.close();
        
    }
    
}
