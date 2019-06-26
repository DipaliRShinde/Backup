/*  Create a Student class that represents the following information of a student: id, name, and age
all the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having
same age, sort based on their name.
f. For students having same name and age, sort them according to their ID.   */

package com.stackroute.pe5;

import java.io.PrintStream;
import java.util.*;

public class Student {
    private String id;
    private String name;
    private int age;

    //Constructer
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class StudentSorter implements Comparator
{
    //Method to sort
    public int compare(Object object1, Object object2)
    {
        Student student1=(Student)object1;
        Student student2=(Student)object2;

        if(student1.getAge()==student2.getAge())
        {
            int result=student1.getName().compareTo(student2.getName());
            return result==0 ?student2.getId().compareTo(student1.getId()) :result;
        }
        else
        {
            return student1.getAge()<student2.getAge()?1:-1;
        }
    }
}

//Maintest class to print sorted result
class Maintest
{
    public static void main(String args[])
    {
        List<Student> list = new ArrayList<>();
        Student student1=new Student("1","Dipali",23);
        Student student2=new Student("2","Rani",30);
        Student student3=new Student("3","Nandini",25);
        Student student4=new Student("4","Bunty",23);
        Student student5=new Student("5","Kishan",35);
        Student student6=new Student("6","Kishan",35);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

        Collections.sort(list,new StudentSorter());

        for(int i = 0; i < list.size(); ++i) {
            {
                String id = ((Student)list.get(i)).getId();
                String name = ((Student)list.get(i)).getName();
                int age = ((Student)list.get(i)).getAge();
                System.out.println(id + " " + name + " " + age);
            }
        }
    }
}