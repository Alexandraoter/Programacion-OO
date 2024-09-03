public class CuentaBancaria{

    //Atributos
    private int numeroCuenta;
    private double saldo;
    private String titular;

    //metodo constructor de la clase
    public CuentaBancaria(int numeroCuenta, double saldo, String titular){
        this.numeroCuenta= numeroCuenta; 
        this.saldo= saldo; 
        this.titular = titular;
    }

    //Metodos de la clase 

    public double depositar(double cantidad){
        return saldo+= cantidad;
    }

    

    public void retirar(double cantidad){
        if (cantidad <= saldo){
            saldo-= cantidad;
        }else{
            System.out.println("No tienes suficiente saldo para retirar esa cantidad");
        }
        
    }

    public void consultarSaldo(){
        System.out.println("El saldo actual es: " + saldo);
    }

    
}