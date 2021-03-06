package tella;


import br.com.scrawl.business.LoginBusiness;
import br.com.scrawl.business.interfaces.LoginInterface;
import br.com.scrawl.dominio.Tatuador;
import static java.time.Clock.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Vinicius
 */
public class ArteFrame extends javax.swing.JFrame {

    /**
     * Creates new form ArteFrame
     */
    Tatuador tatuador;
    
    public ArteFrame(Tatuador tatuador) {
        initComponents();
        
        this.tatuador=tatuador;
    }

    
    public ArteFrame() {
        initComponents();
    }

    ArteFrame(Login login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArteFrame(Cadastro cadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        Logof = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCadastrarfoto = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItem1sair = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Logof.setText("SAIR");
        Logof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogofActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuCadastrarfoto.setText("CadastrarArte");
        jMenuCadastrarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarfotoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastrarfoto);

        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Exit");

        jMenuItem1sair.setText("SAIR");
        jMenuItem1sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1sairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItem1sair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 393, Short.MAX_VALUE)
                .addComponent(Logof)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(Logof)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastrarfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarfotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCadastrarfotoActionPerformed

    private void jMenuItem1sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
                   
                
    }//GEN-LAST:event_jMenuItem1sairActionPerformed

    private void LogofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogofActionPerformed
        // TODO add your handling code here:
        
        dispose();
        
        
    }//GEN-LAST:event_LogofActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logof;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastrarfoto;
    private javax.swing.JMenuItem jMenuItem1sair;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
