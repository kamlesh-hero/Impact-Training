import java.util.*;

class Person
{
    private String name;
    private int age;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if(age>=0)
        {
            this.age=age;
        }
        else
        {
            System.out.println("Enter positive integer");
        }

    }
}


public class Encapasulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ajith");
        person.setAge(20);
        System.out.println("Name is");


    }

}