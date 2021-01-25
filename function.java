public class function {
    public static void main(String[] args) {
        name("Huzaifa");
        int a = 10;
        function printage = new function(); // non static access by making object
        printage.age(a);

    }
    public static void name(String arr) { // static declaration means object not needed
        System.out.printf("%s", arr);
                
    }
    public void age(int a) {   // non static declaration aka object needed
        System.out.printf("\nYour age is = %d",a);
        
        
    }
}
