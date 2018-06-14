/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.scrawl.test;

import br.com.scrawl.business.LoginBusiness;
import br.com.scrawl.business.TatuadorBusiness;
import br.com.scrawl.business.interfaces.LoginInterface;
import br.com.scrawl.business.interfaces.TatuadorInterface;
import br.com.scrawl.business.LoginBusiness;

/**
 *
 * @author Thiago Vinicius
 */
public class CadastroMock {
    public static void main(String agrs[]){
     
        LoginInterface loginBusiness = new LoginBusiness();
        
        if(loginBusiness.salvarTatuador("Joao", "123")
           !=null){
            System.out.println("Usuario Cadastrado");
        }else{
            System.err.println("Usuario Invalido tente Novamente");
        }
        
        if(loginBusiness.salvarTatuador("Nino", "123")
           !=null){
            System.out.println("Usuario Cadastrado");
        }else{
            System.err.println("Usuario Invalido tente Novamente");
        }
    }
}

