package General.Banco;

public class CajaDeAhorro extends Banco {

        private Double saldoCA;

    public CajaDeAhorro(String numerodeCuenta) {
        super (numerodeCuenta);
    }

    @Override
    public String toString() {
        return "CajaDeAhorro{" +
                "saldoCA=" + saldoCA +
                '}';
    }
}