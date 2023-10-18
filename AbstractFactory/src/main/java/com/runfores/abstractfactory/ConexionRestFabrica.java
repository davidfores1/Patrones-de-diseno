/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.abstractfactory;

import com.runfores.abstractfactory.impl.ConexionRestCompras;
import com.runfores.abstractfactory.impl.ConexionRestVacia;
import com.runfores.abstractfactory.impl.ConexionRestVentas;
import com.runfores.abstractfactory.inter.IConexionDB;
import com.runfores.abstractfactory.inter.IConexionRest;
import com.runfores.abstractfactory.inter.IFabricaAbstracta;

/**
 *
 * @author david
 */
public class ConexionRestFabrica implements IFabricaAbstracta {

    @Override
    public IConexionDB getDB(String motor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IConexionRest getRest(String url) {

        if (url == null) {
            return new ConexionRestVacia();
        }
        if (url.equalsIgnoreCase("COMPRAS")) {
            return new ConexionRestCompras();
            
        } else if (url.equalsIgnoreCase("VENTAS")) {
            return new ConexionRestVentas();
        }
        return new ConexionRestVacia();
    }

}
