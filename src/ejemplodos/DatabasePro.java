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
public class DatabasePro extends Employee{
    /**
    *@author Luis Villagrán
    *@description
        Español: Encapsulado de variables
    */
    private String databaseTool;

    public DatabasePro(String name, int age, double salary,String databaseTool) {
        super(name, age, salary);
        this.databaseTool = databaseTool;
    }

    public DatabasePro() {
    }
    /**
     *@author Luis Villagrán
     *@description
     *       Español: Metodos sobre la clase DatabasePro aplicando los "modificadores"
     *       Ingles: Methods on the DatabasePro class applying the "modifiers"
     */
    public String getDatabaseTool() {
        return databaseTool;
    }

    public void setDatabaseTool(String databaseTool) {
        this.databaseTool = databaseTool;
    }
    
    public void printData() {
        super.printData();
        System.out.println("*********   INFORMATION ABOUT THE DATABASEPRO   **********");
        System.out.println("these are the database managers: " + this.databaseTool+"\n");
    }
}
