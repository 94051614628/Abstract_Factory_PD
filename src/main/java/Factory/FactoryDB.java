package Factory;

import Abstracta.AbstractFactoryDB;

public class  FactoryDB {
    public static AbstractFactoryDB obtenerBaseDatos(Boolean relacional){
        if (relacional.equals(Boolean.TRUE)){
            return new RelacionalFactory();
        }else
        {
            return new NoRelacionalFactory();
        }
    }
}
