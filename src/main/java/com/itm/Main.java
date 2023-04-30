package com.itm;

import Abstracta.AbstractFactoryDB;
import Clases.Postgres;
import Clases.SQL;
import Factory.FactoryDB;
import Interfaces.BaseDatos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bases de Datos Relacionales");
      //Crea la clase Abstracta que va contener una familia de Objetos relacinal.
      AbstractFactoryDB abstractFactoryDB1 = FactoryDB.obtenerBaseDatos(Boolean.TRUE);
      //Se inicializa el objeto en especifico que se quiere.
      //SQL
      BaseDatos baseDatos1 = abstractFactoryDB1.obtenerDB("SQL");
      baseDatos1.creaarConexion();

      //Oracle.
      BaseDatos baseDatos2 = abstractFactoryDB1.obtenerDB("Oracle");
      baseDatos2.creaarConexion();

      //Postgrest
        BaseDatos baseDatos3 = abstractFactoryDB1.obtenerDB("Postgres");
        baseDatos3.creaarConexion();

        //Elimino conexion
        System.out.println("Elimino la Conexion");
        baseDatos1.eliminarConexion();
        baseDatos2.eliminarConexion();
        baseDatos3.eliminarConexion();

        System.out.println("Bases de Datos No Relacionales");
        //Crea la clase Abstracta que va contener una familia de Objetos No relacinal.
        AbstractFactoryDB abstractFactoryDB2 = FactoryDB.obtenerBaseDatos(Boolean.FALSE);
        //Se inicializa el objeto en especifico que se quiere.
        //Cassandra
        BaseDatos baseDatos4 = abstractFactoryDB2.obtenerDB("Cassandra");
        baseDatos4.creaarConexion();

        //CouchDB
        BaseDatos baseDatos5 = abstractFactoryDB2.obtenerDB("CouchDB");
        baseDatos5.creaarConexion();

        //Mongo
        BaseDatos baseDatos6 = abstractFactoryDB2.obtenerDB("Mongodb");
        baseDatos6.creaarConexion();

        //Elimino conexion
        System.out.println("Elimino la Conexion");
        baseDatos4.eliminarConexion();
        baseDatos5.eliminarConexion();
        baseDatos6.eliminarConexion();




    }
}