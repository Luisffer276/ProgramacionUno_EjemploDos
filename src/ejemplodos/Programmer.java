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
public class Programmer extends Employee{
    /**
    *@author Luis Villagrán
    *@description
        Español: Encapsulado de variables
    */
    private String languague;

    public Programmer(String name, int age, double salary, String languague) {
        super(name, age, salary);
        this.languague = languague;
    }
    
    public Programmer() {
    }
    /**
    *@author Luis Villagrán
    *@description 
    *    Español: Metodos sobre la clase Programmer aplicando los "modificadores"
    *    Ingles: Methods on the Programmer class applying the "modifiers"
    */
    public String getLanguague() {
        return languague;
    }

    public void setLanguague(String languague) {
        this.languague = languague;
    }
    
    //tambien se puede utiizar la creacion del objeto StringBuilder()
    public void printData() {
        super.printData();
        System.out.println("*********   INFORMATION ABOUT THE PROGRAMMER   **********");
        System.out.println("this is the language that handles: " + this.languague+"\n");
    }
}
