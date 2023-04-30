package Clases;

import Interfaces.BaseDatos;

public class MongoDB  implements BaseDatos {
    private String name = "MongoDB";
    @Override
    public void creaarConexion() {
        System.out.println("Se ha creado la conexion"+name);
    }

    @Override
    public void eliminarConexion() {
        System.out.println("Se ha eliminado la conexion "+name);
    }
}
