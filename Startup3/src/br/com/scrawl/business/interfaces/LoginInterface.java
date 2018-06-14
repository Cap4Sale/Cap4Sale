/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scrawl.business.interfaces;

import br.com.scrawl.dominio.Tatuador;
import tella.Login;

/**
 *
 * @author Thiago Vinicius
 */
public interface LoginInterface {
   public boolean validaTatuador (Tatuador tatuador);
   public Tatuador validaTatuador(String nomeTatuador, String senha);

    public boolean validaUsuario(Tatuador novoTatuador);

    public Login salvarTatuador(String text, String text0);
   
           
}
