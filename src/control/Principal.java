package control;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Principal extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        
        imCliente = new javax.swing.JMenuItem();
        imCartao = new javax.swing.JMenuItem();
        imHabilitacao = new javax.swing.JMenuItem();
        imEndereco = new javax.swing.JMenuItem();
        imVeiculo = new javax.swing.JMenuItem();
        imAluguel = new javax.swing.JMenuItem();
        imConsulta = new javax.swing.JMenuItem();
        imDevolver = new javax.swing.JMenuItem();
        imAlugarCarro = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, (int)screenSize.getWidth(), Short.MAX_VALUE)
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, (int)screenSize.getHeight(), Short.MAX_VALUE)
        );

        jMenu3.setText("Cliente");
        jMenu4.setText("Veiculo");
        jMenu5.setText("Aluguel");
        imConsulta.setText("Consultar");
        imDevolver.setText("Devolver");
        imCliente.setText("Cliente");
        imVeiculo.setText("Veiculo");
        imAluguel.setText("Aluguel");
        imCartao.setText("Cartao");
        imEndereco.setText("Endereco");
        imHabilitacao.setText("Habilitacao");
        imAlugarCarro.setText("Alugar Carro");
        
        imCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imClienteActionPerformed(evt);
            }
        });
        
        imConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConsultaActionPerformed(evt);
            }
        });
        
        imDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imDevolverActionPerformed(evt);
            }
        });
        
        imAlugarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAlugarCarroActionPerformed(evt);
            }
        });
        
        
        
        imCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCartaoActionPerformed(evt);
            }
        });
        
        
        imEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imEnderecoActionPerformed(evt);
            }
        });
        
        imHabilitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imHabilitacaoActionPerformed(evt);
            }
        });
        
        imVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	imVeiculoActionPerformed(evt);
            }
        });
        
        imAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	imAluguelActionPerformed(evt);
            }
        });
        
        jMenu3.add(imCliente);
        jMenu3.add(imCartao);
        jMenu3.add(imEndereco);
        jMenu3.add(imHabilitacao);
        jMenuAjuda.setText("Ajuda");
        jMenu4.add(imVeiculo);
        
        jMenu5.add(imConsulta);
        jMenu5.add(imDevolver);
        jMenu5.add(imAlugarCarro);
        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu4);
        jMenuBar1.add(jMenu5);
        
        jMenuBar1.add(jMenuAjuda);


        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imClienteActionPerformed
        // TODO add your handling code here:
        ConsultarCliente consultaCliente = new ConsultarCliente(jdpPrincipal);
        this.jdpPrincipal.add(consultaCliente);
        consultaCliente.setVisible(true);
    }//GEN-LAST:event_imClienteActionPerformed
    
    private void imCartaoActionPerformed(java.awt.event.ActionEvent evt) {
        
        ConsultarCartao consultaCartao = new ConsultarCartao(jdpPrincipal);
        this.jdpPrincipal.add(consultaCartao);
        consultaCartao.setVisible(true);
    }
    


	private void imDevolverActionPerformed(java.awt.event.ActionEvent evt) {
    
    DevolverCarro devolverCarro = new DevolverCarro(jdpPrincipal);
    this.jdpPrincipal.add(devolverCarro);
    devolverCarro.setVisible(true);
}
	
	private void imAlugarCarroActionPerformed(java.awt.event.ActionEvent evt) {
	    
	    AlugarCarro alugarCarro = new AlugarCarro(jdpPrincipal);
	    this.jdpPrincipal.add(alugarCarro);
	    alugarCarro.setVisible(true);
	}
	
private void imConsultaActionPerformed(java.awt.event.ActionEvent evt) {
        
        ConsultarCarro consultaCarro = new ConsultarCarro(jdpPrincipal);
        this.jdpPrincipal.add(consultaCarro);
        consultaCarro.setVisible(true);
    }

    private void imEnderecoActionPerformed(java.awt.event.ActionEvent evt) {
        
        ConsultarEndereco consultaEnder = new ConsultarEndereco(jdpPrincipal);
        this.jdpPrincipal.add(consultaEnder);
        consultaEnder.setVisible(true);
    }
    
    private void imHabilitacaoActionPerformed(java.awt.event.ActionEvent evt) {
        
        ConsultarHabilitacao consultaCNH = new ConsultarHabilitacao(jdpPrincipal);
        this.jdpPrincipal.add(consultaCNH);
        consultaCNH.setVisible(true);
    }
    
    private void imVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imVeiculoActionPerformed
        // TODO add your handling code here:
        ConsultarVeiculo consultaVeiculo = new ConsultarVeiculo(jdpPrincipal);
        this.jdpPrincipal.add(consultaVeiculo);
        consultaVeiculo.setVisible(true);
    }//GEN-LAST:event_imVeiculoActionPerformed
    
    private void imAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAluguelActionPerformed
        // TODO add your handling code here:
        ConsultarAluguel consultaAluguel = new ConsultarAluguel(jdpPrincipal);
        this.jdpPrincipal.add(consultaAluguel);
        consultaAluguel.setVisible(true);
    }//GEN-LAST:event_imAluguelActionPerformed
    
    
    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem imCliente;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenuItem imVeiculo;
    private javax.swing.JMenuItem imAluguel;
    private javax.swing.JMenuItem imCartao;
    private javax.swing.JMenuItem imDevolver;
    private javax.swing.JMenuItem imAlugarCarro;
    private javax.swing.JMenuItem imConsulta;
    private javax.swing.JMenuItem imHabilitacao;
    private javax.swing.JMenuItem imEndereco;
    // End of variables declaration//GEN-END:variables
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
}
