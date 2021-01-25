public class constructors_student_use {
    public static void main(String[] args) {
        constructors_student student_obj_marks = new constructors_student(4); //object using constructor using only marks
        System.out.printf("Marks are = %d\n ",student_obj_marks.marks);
        System.out.printf("Name is  = %s\n",student_obj_marks.name);

        constructors_student student_obj_name = new constructors_student("Huzaifa"); //object Constructor using only name
        System.out.printf("Marks are = %d\n ",student_obj_name.marks);
        System.out.printf("Name is  = %s\n",student_obj_name.name);
        
        constructors_student student_obj_all = new constructors_student(4,"Huzaifa"); //object using constructor of both values
        System.out.printf("Marks are = %d\nName is  = %s\n",student_obj_all.marks,student_obj_all.name);
        
        constructors_student student_obj_empty = new constructors_student();//object using empty constructor
        System.out.printf("Marks are = %d\nName is  = %s\n",student_obj_empty.marks,student_obj_empty.name);
        
    }
}
