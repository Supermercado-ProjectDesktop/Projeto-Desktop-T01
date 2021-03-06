/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UsuarioController;
import Model.Usuario;
import ModelDAO.UsuarioDAO;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author JOAO
 */
public class CadastroUsuario extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    private final UsuarioController controller;
    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
        initComponents();
        controller = new UsuarioController(this);
        controller.setTabel();
        
    }
    public JTable getTabelUsuario() {
       return tabelUsuario;
    }
    public JTextField getTxtCodUsuario(){
        return txtCodigoUsuario;
    }
    public JTextField getTxtCpf(){
        return txtCpf;
    }
    public JTextField getTxtNome(){
        return txtNome;
    }
    public JTextField getTxtSobrenome(){
        return txtSobrenome;
    }
    public JTextField getTxtTipoUsuario(){
        return txtTipoUsuario;
    }
    public JTextField getTxtSenha(){
        return txtSenha;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ccliente = new javax.swing.JLabel();
        ccpf = new javax.swing.JLabel();
        cendereco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnRefreshUser = new javax.swing.JButton();
        updateUsuario = new javax.swing.JButton();
        deleteUsuario = new javax.swing.JButton();
        ccliente1 = new javax.swing.JLabel();
        txtCodigoUsuario = new javax.swing.JTextField();
        ccliente2 = new javax.swing.JLabel();
        ccliente3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        insertUsuario = new javax.swing.JButton();
        btnGetDataUser = new javax.swing.JButton();
        txtTipoUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUsuario = new javax.swing.JTable();
        btnGetDataUser1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(5, 81, 103));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADASTRO USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(702, 487));
        jPanel1.setPreferredSize(new java.awt.Dimension(702, 487));

        ccliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ccliente.setForeground(new java.awt.Color(255, 255, 255));
        ccliente.setText("Nome:");

        ccpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ccpf.setForeground(new java.awt.Color(255, 255, 255));
        ccpf.setText("Senha:");

        cendereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cendereco.setForeground(new java.awt.Color(255, 255, 255));
        cendereco.setText("Tipo de Usuario:");

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        btnRefreshUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRefreshUser.setText("ATUALIZAR");
        btnRefreshUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshUserActionPerformed(evt);
            }
        });

        updateUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateUsuario.setText("ALTERAR");
        updateUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUsuarioActionPerformed(evt);
            }
        });

        deleteUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteUsuario.setText("EXCLUIR");
        deleteUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUsuarioActionPerformed(evt);
            }
        });

        ccliente1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ccliente1.setForeground(new java.awt.Color(255, 255, 255));
        ccliente1.setText("Código de Usuario:");

        txtCodigoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoUsuarioActionPerformed(evt);
            }
        });

        ccliente2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ccliente2.setForeground(new java.awt.Color(255, 255, 255));
        ccliente2.setText("CPF:");

        ccliente3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ccliente3.setForeground(new java.awt.Color(255, 255, 255));
        ccliente3.setText("Sobrenome:");

        txtCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtSobrenome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        insertUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertUsuario.setText("INSERIR");
        insertUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertUsuarioActionPerformed(evt);
            }
        });

        btnGetDataUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGetDataUser.setText("CONSULTAR");
        btnGetDataUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGetDataUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataUserActionPerformed(evt);
            }
        });

        tabelUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelUsuario);

        btnGetDataUser1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGetDataUser1.setText("RETORNAR AO MENU");
        btnGetDataUser1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGetDataUser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetDataUser1MouseClicked(evt);
            }
        });
        btnGetDataUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataUser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ccpf)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ccliente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ccliente3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ccliente1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addComponent(cendereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(ccliente2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addGap(45, 45, 45)
                        .addComponent(btnGetDataUser1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(insertUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(updateUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(deleteUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRefreshUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnGetDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cendereco)
                                .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ccliente1)
                                .addComponent(txtCodigoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccliente2)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccliente)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccliente3)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ccpf)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGetDataUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefreshUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnRefreshUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshUserActionPerformed
        controller.reset();
        controller.setTabel();
    }//GEN-LAST:event_btnRefreshUserActionPerformed

    private void updateUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUsuarioActionPerformed
        controller.update();
        controller.setTabel();
        controller.reset();
    }//GEN-LAST:event_updateUsuarioActionPerformed

    private void deleteUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUsuarioActionPerformed
          controller.delete();
          controller.setTabel();
          controller.reset();
            
    }//GEN-LAST:event_deleteUsuarioActionPerformed

    private void txtCodigoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoUsuarioActionPerformed

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void insertUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertUsuarioActionPerformed
        controller.insert();
        controller.setTabel();
        controller.reset();
    }//GEN-LAST:event_insertUsuarioActionPerformed

    private void btnGetDataUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataUserActionPerformed
        controller.getData();
    }//GEN-LAST:event_btnGetDataUserActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void tabelUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelUsuarioMouseClicked
        controller.getDataField();
    }//GEN-LAST:event_tabelUsuarioMouseClicked

    private void btnGetDataUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGetDataUser1ActionPerformed

    private void btnGetDataUser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetDataUser1MouseClicked
    JFMenu_principal tela = new JFMenu_principal();
    tela.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnGetDataUser1MouseClicked

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetDataUser;
    private javax.swing.JButton btnGetDataUser1;
    private javax.swing.JButton btnRefreshUser;
    private javax.swing.JLabel ccliente;
    private javax.swing.JLabel ccliente1;
    private javax.swing.JLabel ccliente2;
    private javax.swing.JLabel ccliente3;
    private javax.swing.JLabel ccpf;
    private javax.swing.JLabel cendereco;
    private javax.swing.JButton deleteUsuario;
    private javax.swing.JButton insertUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelUsuario;
    private javax.swing.JTextField txtCodigoUsuario;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JTextField txtTipoUsuario;
    private javax.swing.JButton updateUsuario;
    // End of variables declaration//GEN-END:variables
}
