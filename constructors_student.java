//A constructor is used to initialize INSTANCE VARIABLES (created when objects are created)
//It does not have return type, because its of same class
//Name should be same as of class of whose constructor is bein created
// MULTIPLE CONSTURCTORS CAN BE USED FOR DIFFERENT WAYS OF INITIALIZATIOns CALLED CONSTRUCTOR OVERLOADING
//this Keyword is used to pass reference of current object thats created. hence removing confusion between class variables and object(instance)variables
public class constructors_student {
    int marks;
    String name;


    public constructors_student(int marks) { //constructor method FOR ONLY MARKS
        this.marks = marks;
}
    public constructors_student(String name) { //constructor method FOR ONLY NAME
        this.name = name;
}
    public constructors_student(int marks,String name){//constructor method FOR ALL VARIABLES
        this.marks = marks;
        this.name = name;
    }

    //NOTE THAT EACH CONSCTURCTOR HAS SAME NAME WHICH IS CLASS NAME HENCE END USER CAN USE ANY TYPE HE/SHE WANTS TO USE TO INTIIALIZE ANY VALUE
    
    
    /*NOTE THAT NOW USER CANNOT CREATE AN EMPTY UNINTIALIZED CONSTRUCTOR 
    BECAUSE THAT IS A DEFAULT TYPE CONSTRUCTOR PROVIDED BY COMPILER
    TO MAKE SUCH A THING NOW WE HAVE TO SEPRATELY DEFINE AN EMPTY CONSTRUCTOR*/

    //EMPTY CONSTRUCTOR
    public constructors_student(){
        
    }
}
