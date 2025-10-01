/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisas;

/**
 *
 * @author B12
 */
public class Project {
    
    public static void main(String[] args) {
        Banco s1 = new Banco();
        Banco s2 = new Banco();
        Banco s3 = new Banco();
        System.out.println(s1.getCuenta());
        
        s2.setCuenta("Andres");
        
        System.out.println(s2.getCuenta());
        
        s3.toSafe();
    }
}
