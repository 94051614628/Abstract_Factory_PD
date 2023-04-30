package Abstracta;

import Interfaces.BaseDatos;

public  abstract class AbstractFactoryDB {
    public abstract BaseDatos obtenerDB(String name);

}
