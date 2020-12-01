package Sistema;

public class JFPrincipal extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Principal
     */
    public JFPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMLivro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMEmprestimo = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMMulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utils/imagens/antique-library-302930.jpg"))); // NOI18N

        jMenu2.setText("Cliente");

        jMCliente.setText("Editar Clientes");
        jMCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMCliente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Livro");

        jMLivro.setText("Editar Livros");
        jMLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLivroActionPerformed(evt);
            }
        });
        jMenu3.add(jMLivro);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Empr�stimo");

        jMEmprestimo.setText("Editar Emprestimos");
        jMEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEmprestimoActionPerformed(evt);
            }
        });
        jMenu6.add(jMEmprestimo);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Multa");

        jMMulta.setText("Editar Multas");
        jMMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMMultaActionPerformed(evt);
            }
        });
        jMenu7.add(jMMulta);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("Sair");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLivroActionPerformed
        
        // Abre a janela
        new JFLivro(this).setVisible(true);
        
        this.setEnabled(false);
        
    }//GEN-LAST:event_jMLivroActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClienteActionPerformed
        
       // Abre a janela
       // this(Esta janela) - Passa a instancia da tela atual como par�metro p/ o contrutor
       new JFCliente(this).setVisible(true);
       
       // Desativa funcionalidades da tabela principal
       this.setEnabled(false);
        
    }//GEN-LAST:event_jMClienteActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEmprestimoActionPerformed
        
        // Abre a janela
        new JFEmprestimo(this).setVisible(true);
        
        this.setEnabled(false);
        
    }//GEN-LAST:event_jMEmprestimoActionPerformed

    private void jMMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMMultaActionPerformed
        
        new JFMulta().setVisible(true);
        
    }//GEN-LAST:event_jMMultaActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMCliente;
    private javax.swing.JMenuItem jMEmprestimo;
    private javax.swing.JMenuItem jMLivro;
    private javax.swing.JMenuItem jMMulta;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}