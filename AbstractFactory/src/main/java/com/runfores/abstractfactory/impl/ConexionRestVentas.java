/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.abstractfactory.impl;

import com.runfores.abstractfactory.inter.IConexionRest;

/**
 *
 * @author david
 */
public class ConexionRestVentas implements IConexionRest {

    @Override
    public void leerURL(String url) {
      System.out.println("VENTAS");        
      System.out.println("Conectandose a " +  url);
    }
    
}
