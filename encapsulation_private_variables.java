//Any Private variable is hidden from other classes JUST LIKE PRIVATE METHODS
// to change values WE USE METHODS IN SAME CLASS AND PASS VALUE AS ARGUMENTS
//this keyword is used to tell compiler that current object reference variable is used, if we dont use it then local variable is prioritised hence it'll set local variable in getter method
public class encapsulation_private_variables {
    private int num1;
    private int num2;

    private void display_values() {
        System.out.printf("First number is = %d \n Second Number is = %d \n",num1,num2);
        
    }
    public void set_values(int num1 , int num2) {
        this.num1 = num1; //this KEYWORD CONTAINS THE REFERENCE TO CURRENT OBJECT. MEANS INSTANCE VARIABLE THATS CREATED IN MAIN.
        this.num2 = num2;
        display_values();
    }
}
