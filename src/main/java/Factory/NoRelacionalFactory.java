package Factory;

import Abstracta.AbstractFactoryDB;
import Clases.Oracle;
import Clases.Postgres;
import Clases.SQL;
import Interfaces.BaseDatos;

public class NoRelacionalFactory extends AbstractFactoryDB {

    @Override
    public BaseDatos obtenerDB(String name) {
        BaseDatos retorno = null;

        if(name.toUpperCase().equals("MONGODB")){
            retorno =  new SQL();
        }else if(name.toUpperCase().equals("CASSANDRA"))
        {
            retorno = new Oracle();
        } else if (name.toUpperCase().equals("COUCHDB")) {
            retorno = new Postgres();
        }

        return retorno;
    }
}
