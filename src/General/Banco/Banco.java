package General.Banco;

public class Banco {

    protected String numerodeCuenta;

    public Banco (String numerodeCuenta){
     this.numerodeCuenta = numerodeCuenta;
    }

    public String getNumerodeCuenta() {
        return numerodeCuenta;
    }

    public void setNumerodeCuenta(String numerodeCuenta) {
        this.numerodeCuenta = numerodeCuenta;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "numerodeCuenta='" + numerodeCuenta + '\'' +
                '}';
    }
}