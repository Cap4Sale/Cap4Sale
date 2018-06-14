/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scrawl.business;

import br.com.scrawl.business.interfaces.LoginInterface;
import br.com.scrawl.dominio.Arte;
import br.com.scrawl.dominio.Tatuador;
import br.com.scrawl.repositorio.Repositorio;
import java.util.Iterator;
import tella.Login;

/**
 *
 * @author Thiago Vinicius
 */
public class LoginBusiness implements LoginInterface{

    @Override
    public boolean validaTatuador(Tatuador tatuador) {
        
        for (Iterator<Tatuador> it = Repositorio.tatuadorDBFake.iterator(); it.hasNext();) {
             tatuador = it.next();
            if(tatuador.getNome().
                    equals(tatuador.getNomedeusuario()) &&
                 tatuador.equals(tatuador.getSenhadeusuario())){
                return true;
            }   
        }
        
        for(Arte arte:Repositorio.arteDBFake){
            if(arte.getNomeUsuario().
                    equals(tatuador.getNomedeusuario()) &&
                Arte.getSenha().equals(arte.getSenha())){
                return true;
            }
        }        
        return false;
    
    }

    @Override
    public Tatuador validaTatuador(String nomeTatuador, String senha) {
       
        for (Tatuador tatuador : Repositorio.tatuadorDBFake) {                        
            if(tatuador.getNomedeusuario().equals(nomeTatuador) &&
                 tatuador.getSenhadeusuario().equals(senha)){
                return tatuador;
            }   
        }
        return null;
    }

    @Override
    public boolean validaUsuario(Tatuador novoTatuador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Login salvarTatuador(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
