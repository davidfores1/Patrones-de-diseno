/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.abstractfactory;

import com.runfores.abstractfactory.inter.IConexionDB;
import com.runfores.abstractfactory.inter.IConexionRest;
import com.runfores.abstractfactory.inter.IFabricaAbstracta;

/**
 *
 * @author david
 */
public class App {

    public static void main(String[] args) {
        
        System.out.println("****Conexión DB*****");
        IFabricaAbstracta fabricaDB = FabricaProducto.getFactory("DB");
        IConexionDB cxDB1 = fabricaDB.getDB("ORACLE");
        cxDB1.conectar();
        System.out.println();

        System.out.println("****Conexión REST*****");
        IFabricaAbstracta fabricaRest = FabricaProducto.getFactory("REST");
        IConexionRest cxRest1 = fabricaRest.getRest("COMPRAS");
        cxRest1.leerURL("www.davidfor.com.co");

    }

}
