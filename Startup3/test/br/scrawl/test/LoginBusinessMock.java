/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.scrawl.test;

import br.com.scrawl.business.LoginBusiness;
import br.com.scrawl.business.interfaces.LoginInterface;

/**
 *
 * @author internet
 */
public class LoginBusinessMock {
    
    public static void main(String agrs[]){
     
        LoginInterface loginBusiness = new LoginBusiness();
        
        if(loginBusiness.validaTatuador("thiago", "123")!=null){
            System.out.println("Usuario Encontrado");
        }else{
            System.err.println("Usuario não Encontrado");
        }
        
        if(loginBusiness.validaTatuador("nestor", "123")!=null){
            System.out.println("Usuario Encontrado");
        }else{
            System.err.println("Usuario não Encontrado");
        }
        
    }    
}
