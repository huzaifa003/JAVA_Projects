public class private_methods_use {
    public static void main(String[] args) {
        private_methods result_obj = new private_methods(); //creating object

        result_obj.num1 = 1;
        result_obj.num2 = 2;
        result_obj.display_sum(); //using public method in class
    }
}
