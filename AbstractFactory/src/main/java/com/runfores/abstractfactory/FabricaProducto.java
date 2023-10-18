/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.runfores.abstractfactory;

import com.runfores.abstractfactory.inter.IFabricaAbstracta;

/**
 *
 * @author david
 */
public class FabricaProducto {
    
    public static IFabricaAbstracta getFactory(String tipoFabrica){
    
        if(tipoFabrica.equalsIgnoreCase("DB")){
        
            return new ConexionDBFabrica();
        }else if(tipoFabrica.equalsIgnoreCase("REST")){
            return new ConexionRestFabrica();
        }
        
        return null;
    }
    
}
