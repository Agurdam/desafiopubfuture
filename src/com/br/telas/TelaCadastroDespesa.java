/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.br.telas;

import com.br.dao.DespesasDao;
import com.br.entidades.Despesas;
import com.br.utils.Msg;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author X
 */
public class TelaCadastroDespesa extends javax.swing.JDialog {
    private boolean inserir;
    private Despesas cadastrarDespesa;
    private TelaDespesas pai;

    /**
     * Creates new form TelaCadastroConta
     */
    public TelaCadastroDespesa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cadastrarDespesa = new Despesas();
    }
     public TelaCadastroDespesa(TelaDespesas parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pai = parent;
        cadastrarDespesa = new Despesas();
    }
        protected void preencherCampos(Despesas cat){
        cadastrarDespesa = cat;
        txCredor.setText(cadastrarDespesa.getCredor());
        txValorDespesa.setText(Double.toString(cadastrarDespesa.getValor()));
        txObsDespesa.setText(cadastrarDespesa.getObservacao());
    }
     
     private Despesas getDespesas(){
         cadastrarDespesa.setCredor(txCredor.getText());
         cadastrarDespesa.setValor(Double.parseDouble(txValorDespesa.getText()));
         //SimpleDateFormat dataVencimento = new SimpleDateFormat();
         //Date dataConverida = dataVencimento.parse(txVencimentoDespesa.getText());
         //cadastrarDespesa.setDataVencimento(dataConvertida);
         cadastrarDespesa.setObservacao(txObsDespesa.getText());
         return cadastrarDespesa;
         
     }
      private boolean verificarCampos(){
        boolean verificar = false;
        String msg = "Campos obrigatórios\n";
        if(txCredor.getText().trim().equals("")|| txValorDespesa.getText().trim().equals("") || txVencimentoDespesa.getText().trim().equals("")){
            verificar = true;
        }
        if(verificar){
            Msg.errar(this, msg);            
        }
        return verificar;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSalvarDespesa = new javax.swing.JButton();
        btCancelarDespesa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txCredor = new javax.swing.JTextField();
        txValorDespesa = new javax.swing.JTextField();
        txVencimentoDespesa = new javax.swing.JTextField();
        txObsDespesa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de despesas");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));

        btSalvarDespesa.setText("Salvar");
        btSalvarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarDespesaActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvarDespesa);

        btCancelarDespesa.setText("Cancelar");
        btCancelarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarDespesaActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelarDespesa);

        jLabel1.setText("Credor:");

        jLabel2.setText("Valor:");

        jLabel3.setText("Data de vencimento:");

        jLabel4.setText("Observações:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txCredor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txVencimentoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txObsDespesa))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txCredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txVencimentoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txObsDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarDespesaActionPerformed
        if(isInserir()){
            new DespesasDao().inserir(getDespesas());
            Msg.informar(this, "Salvo com sucesso!");
            this.pai.atualizarTabela();
            this.dispose();
        } else{
            new DespesasDao().atualizar(getDespesas());
            Msg.informar(this, "Atualizado com sucesso!");
            this.pai.atualizarTabela();
            this.dispose();
            
        }
    }//GEN-LAST:event_btSalvarDespesaActionPerformed

    private void btCancelarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarDespesaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelarDespesaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDespesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroDespesa dialog = new TelaCadastroDespesa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarDespesa;
    private javax.swing.JButton btSalvarDespesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txCredor;
    private javax.swing.JTextField txObsDespesa;
    private javax.swing.JTextField txValorDespesa;
    private javax.swing.JTextField txVencimentoDespesa;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the inserir
     */
    public boolean isInserir() {
        return inserir;
    }

    /**
     * @param inserir the inserir to set
     */
    public void setInserir(boolean inserir) {
        this.inserir = inserir;
    }
}
