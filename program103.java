import java.lang.*;
import java.util.*;

class Student
{
    public int RID;
    public String Name;
    public int Salary;

    private static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str, int value)
    {
        this.RID = ++Generator;
        this.Name = str;
        this.Salary = value;
    }
}

class program103
{
    public static void main(String arg[])
    {
            Student obj = new Student("Piyush",1000);
            System.out.println(obj.RID);
            System.out.println(obj.Name);
            System.out.println(obj.Salary);

            Student obj2 = new Student("Shantanu",2000);
            System.out.println(obj2.RID);
            System.out.println(obj2.Name);
            System.out.println(obj2.Salary);
    }
}