public class Ejecutar {
    public static void main(String[] args){

        CuentaBancaria objcuentaBancaria = new CuentaBancaria(12, 5000, "Carlos");
        

        objcuentaBancaria.consultarSaldo();

        objcuentaBancaria.depositar(200);
        System.out.println("Se depositó 200 ");
        objcuentaBancaria.consultarSaldo();

        objcuentaBancaria.retirar(1000);
        System.out.println("Se retiró 1000 ");
        objcuentaBancaria.consultarSaldo();

        //se retira más de lo que hay en la cuenta
        objcuentaBancaria.retirar(7000);
        objcuentaBancaria.consultarSaldo();


    }
}

    