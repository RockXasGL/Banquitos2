package General.Banco;

public class CuentaCorriente extends Banco {

    private Double saldoCC;

    public CuentaCorriente(String numerodeCuenta){
        super (numerodeCuenta);
    }

    public Double getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(Double saldoCC) {
        this.saldoCC = saldoCC;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldoCC=" + saldoCC + "Numero de Cuenta="+ numerodeCuenta+
                '}';
    }
}
