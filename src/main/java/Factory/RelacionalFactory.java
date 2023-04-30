package Factory;

import Abstracta.AbstractFactoryDB;
import Clases.Oracle;
import Clases.Postgres;
import Clases.SQL;
import Interfaces.BaseDatos;

import java.util.Locale;

public class RelacionalFactory extends AbstractFactoryDB {
    @Override
    public BaseDatos obtenerDB(String name) {
        BaseDatos retorno = null;

       if(name.toUpperCase().equals("SQL")){
          retorno =  new SQL();
       }else if(name.toUpperCase().equals("ORACLE"))
       {
           retorno = new Oracle();
       } else if (name.toUpperCase().equals("POSTGRES")) {
           retorno = new Postgres();
       }

       return retorno;
    }


}
