//Private Methods can only be accessed by the other methods in SAME class
//By default the access modifier is 'default' meaning it can be accessed in only the same folder
public class private_methods {
    int num1;
    int num2;

    private int sum() {
        return num1  + num2;
    }

    public void display_sum() {
        System.out.printf("Sum is  = %d ",sum()); //public method calling private method in same class
        
    }
}
