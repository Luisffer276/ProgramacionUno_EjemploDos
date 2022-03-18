/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodos;

/**
 *
 * @author Luisf
 */
public class Employee {
    /**
    *@author Luis Villagrán
    *@description
        Español: Encapsulado de variables
    */
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }
    /**
     *@author Luis Villagrán
     *@description
     *        Español: Metodos sobre la clase Employee aplicando los "modificadores"
     *        Ingles: Methods on the Employee class applying the "modifiers"
     */
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printData() {
        System.out.println("*********   INFORMATION ABOUT THE EMPLOYEE   **********");
        System.out.println("The person's name is: " + this.name);
        System.out.println("Temployee's age: " + this.age);
        System.out.println("the employee's salary is: " + this.salary+" Q"+"\n");
    }
}
