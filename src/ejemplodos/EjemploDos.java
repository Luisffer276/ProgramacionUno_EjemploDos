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
public class EjemploDos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @author Luis Villagrán
         * @description 
         *      Español: Creación de objeto para la clase "Employee"
         *      Ingles: Create object for class "Employee"
         */
        Employee emplo = new Employee("Luis Fernando Villagrán", 20, 6000);
        /**
         * @author Luis Villagrán
         * @description 
         *      Español: Creación de objeto para la clase "Programmer"
         *      Ingles: Create object for class "Programmer"
         */
        Programmer programmer = new Programmer("Fernando Villagrán", 21, 5000,"Java, Phyton, PHP");
        programmer.printData();
        /**
         * @author Luis Villagrán
         * @description 
         *      Español: Creación de objeto para la clase "DatabasePro"
         *      Ingles: Create object for class "DatabasePro"
         */
        DatabasePro dataBase = new DatabasePro("Rene Ortiz", 38, 10000,"MySQL, Postgress, ORACLE, MongoDB, MariaDB");
        dataBase.printData();
    }
    
}
