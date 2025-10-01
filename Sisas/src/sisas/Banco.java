/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sisas;

public class Banco {
    
    // Variables de un banco
    String Cuenta = "Nicolas";
    int Saldo = 1451;
    String Tipo_moneda = "Pesos Colombianos";
    int Deuda = 0;
    String Sede = "Bucaramanga";
    
    // Constructor
    public Banco() {
    }
    // Get y set para Cuenta
    public String getCuenta(){
        return Cuenta;
    }
    public void setCuenta(String Cuenta){
        this.Cuenta = Cuenta;
    }
    // Get y set para Saldo
    public int getSaldo(){
        return Saldo;
    }
    public void setSaldo(int Saldo){
        this.Saldo = Saldo;
    }
    // Get y set para El tipo de moneda
    public String getTipo_moneda(){
        return Tipo_moneda;
    }
    public void setTipo_moneda(String Tipo_moneda){
        this.Tipo_moneda = Tipo_moneda;
    }
    // Get y set para La deuda al banco
    public int getDeuda(){
        return Deuda;
    }
    public void setDeuda(int Deuda){
        this.Deuda = Deuda;
    }
    // Get y set para la sede del banco
    public String getSede(){
        return Sede;
    }
    public void setSede(String Sede){
        this.Sede = Sede;
    }
    // metodo para guardar dinero en el saldo disponible
    public void toSafe(){
        System.out.println("Guardando dinero ingresado");
    }
    // metodo para pagar las deudas existentes
    public void tolibeDeudas(){
        System.out.println("Pagando dinero ingresado a deudas..");
    }
    // metodo para cambiar de un tipo de moneda a otro
    public void tocambioMoneda(){
        System.out.println("Pasando de x moneda a x...");
    }
    // metodo para ingresar a la cuenta del banco
    public void toenterCuenta(){
        System.out.println("Ingresando a la cuenta");
    }
    // metodo para pagar servicios de forma virtual
    public void topayServices(){
        System.out.println("Pagando x servicio...");
    }
    
}
