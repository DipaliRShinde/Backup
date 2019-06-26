package com.stackroute.pe2;

//Program to initialize data members and display it using instance of the Member class
public class MemberVariable {
    public static void main(String args[])
    {
        Member objMember=new Member();

        objMember.setName("Harry Potter");
        System.out.println("Member Name: "+ objMember.getName());

        objMember.setAge(30);
        System.out.println("Member Age: "+ objMember.getAge());

        objMember.setSalary(2500.3f);
        System.out.println("Member Salary: "+objMember.getSalary());
    }
}

class Member
{
    String name;
    int age;
    float salary;

    //setters to set the values for data members
    public void setName(String name)
    {
        this.name=name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public void setSalary(float salary)
    {
        this.salary=salary;
    }

    //getters to fetch the values of data members
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public float getSalary()
    {
        return salary;
    }
}
