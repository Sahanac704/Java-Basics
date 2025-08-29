class Student{
    String name;  //data members(attributes)
    int age;
    String course;

    public void getInfo()    //method
    {
        System.out.println("Name of the student:"+name);
        System.out.println("Age of the student:"+age);
        System.out.println("Course of the student:"+course);
    }
}

public class oops1{    //main class
    public static void main(String[] args) //main function
    {         
        Student s1 = new Student();    //object
        s1.name = "Sana";
        s1.age = 23;
        s1.course = "Bsc CSIT";
        s1.getInfo();     //method call
    }
    
}
