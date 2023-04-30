package Clases;

import Interfaces.BaseDatos;

public class Cassandra implements BaseDatos {
    private String name = "Cassandra";

    @Override
    public void creaarConexion() {
        System.out.println("Se ha creado la conexion "+name);
    }

    @Override
    public void eliminarConexion() {
        System.out.println("Se ha eliminado la conexion "+name);
    }
}
