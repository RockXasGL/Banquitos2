package General;

import General.Banco.Banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    private List<Banco> listaCuentas;

    public Cliente(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

        listaCuentas = new ArrayList<Banco>();
    }

    public void addCuenta(Banco pepe) {
        listaCuentas.add(pepe);
    }

    public List<Banco> getListaCuentas() {
        return listaCuentas;
    }


    public void setListaCuentas(List<Banco> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void registrarCliente(){
        System.out.println("CUENTA BANCO");
        System.out.println("NOMBRE: " + getNombre() + "|| APELLIDO: " + getApellido() + "|| DNI:" + getDni());

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", listaCuentas=" + listaCuentas +
                '}';
    }
}
