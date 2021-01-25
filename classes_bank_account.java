//Classes are like struct but with methods/functions in them

public class classes_bank_account {
    String name;
    double bal;


public void add(double b) {
    bal = bal + b;
    System.out.printf("%f is added to your account",b);
}

public void with(double b) {
    if (bal >=b) {
        bal = bal - b;
        System.out.printf("%f is withdrawn to your account",b);
    }

    else
    {
        System.out.println("You dont have enough money lunatic");
        
    }
    
}
}