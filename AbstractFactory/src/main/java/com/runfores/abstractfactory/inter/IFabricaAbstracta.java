/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.abstractfactory.inter;

/**
 *
 * @author david
 */
public interface IFabricaAbstracta {
    
    IConexionDB getDB(String motor);
    IConexionRest getRest(String url);
    
}
