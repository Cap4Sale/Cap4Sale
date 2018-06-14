/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.scrawl.test;

import br.com.scrawl.business.TatuadorBusiness;
import br.com.scrawl.dominio.Tatuador;

/**
 *
 * @author internet
 */
public class TatuadorBusinessMock {
    
    public static void main (String[] args){
        
        Tatuador novoTatuador = new Tatuador();
        novoTatuador.setNomedeusuario("admin");
        novoTatuador.setSenhadeusuario("admin");
        
        TatuadorBusiness tatuadorBusiness = new TatuadorBusiness();
        
        Tatuador segundoTatuador = null ;
                try{
                    tatuadorBusiness.salvarTatuador(novoTatuador);
                    tatuadorBusiness.salvarTatuador(segundoTatuador);
                    
                }catch(UnsupportedOperationException exc){
                    System.out.println(exc.getMessage());
                }
                    
                }
        
        
    }
    
            

