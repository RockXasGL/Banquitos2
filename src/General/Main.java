package General;

import General.Banco.CuentaCorriente;

public class Main {

    public static void main(String[] args) {
        Cliente C1= new Cliente("Pepito", "Papo", "38177323");
        CuentaCorriente B1= new CuentaCorriente("20381337323");
        B1.setSaldoCC(39000D);
        C1.addCuenta(B1);
        System.out.println(C1);
    }
}
