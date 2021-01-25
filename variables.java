//static variables are variables that dont need any object to be called
//public , private , abstract and volatile are access modifiers of class

public class variables {
    

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        variables name_obj = new variables();
        System.out.println(name_obj.name());
      
    }

    public String name()
    {
        String my_name = "Huzaifa";
        return my_name;
    }

  
    
}
