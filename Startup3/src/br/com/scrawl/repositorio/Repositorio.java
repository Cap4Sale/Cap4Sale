/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scrawl.repositorio;

import br.com.scrawl.dominio.Arte;
import br.com.scrawl.dominio.Login;
import br.com.scrawl.dominio.Tatuador;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author internet
 */
public class Repositorio {
    
    public static List<Tatuador> tatuadorDBFake = new ArrayList<Tatuador>();
    public static List<Arte> arteDBFake = new ArrayList<Arte>();
    public static List<Login>  loginDBFake = new ArrayList<Login>();
    

    static{
        Tatuador tatuador = new Tatuador();
        tatuador.setNomedeusuario("thiago");
        tatuador.setSenhadeusuario("123");
        tatuadorDBFake.add(tatuador);
        
        Tatuador tatuador2 = new Tatuador();
        tatuador2.setNomedeusuario("augusto");
        tatuador2.setSenhadeusuario("123");
        tatuadorDBFake.add(tatuador2);
    }         
 static{
     Login login = new Login ();
     login.setNomeTatuador("Joao");
     login.setSenha("123");
     loginDBFake.add(login);
     
     Login login2 = new Login ();
     login2.setNomeTatuador("Nino");
     login2.setSenha("123");
     loginDBFake.add(login2);
     
     
            }   
    }
