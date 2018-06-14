
package br.com.scrawl.business;

import br.com.scrawl.business.interfaces.TatuadorInterface;
import br.com.scrawl.dominio.Login;
import br.com.scrawl.dominio.Tatuador;
import br.com.scrawl.repositorio.Repositorio;
import java.util.List;
import javax.swing.JOptionPane;


        
public  class TatuadorBusiness implements TatuadorInterface {

    private Tatuador Login;

    @Override
    public Tatuador salvarTatuador(Tatuador tatuadorr) {
        if(validarTatuador(tatuadorr)){
           Repositorio.tatuadorDBFake.add(tatuadorr);  
            System.out.println("Tatuador  cadastrado!");
        }else{
            System.err.println("Tatuador com dados inválido");
        }
        return null;
    }

    private boolean validarTatuador(Tatuador tatuadorr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tatuador> buscarTatuadorPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tatuador> buscarTodosTatuadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tatuador salvarTatuador(String nomeCadastro, String senha) {
        for(Login login : Repositorio.loginDBFake) {
            if(login.getNomeTatuador().equals(nomeCadastro)&& 
                    login.getSenha().equals(senha)){
                
                return Login;
                          }
                     }
        return null;
             }
    
     }

    

   
 