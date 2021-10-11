
package eletroney1.pkg0;

import java.applet.Applet;
import javax.swing.JOptionPane;
import java.net.URL;
import java.applet.AudioClip;

public class UI_login extends javax.swing.JFrame {
    
    URL som = UI_login.class.getResource("lofi.wav");
    AudioClip Som = Applet.newAudioClip(som);
    
    public static void main(String[] args) {
        
        UI_login tocar = new UI_login();
        tocar.Som.loop();
        
        java.awt.EventQueue.invokeLater(() -> {
            new UI_login().setVisible(true);
        });
    }
    
    
    public UI_login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_criarconta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_senha = new javax.swing.JPasswordField();
        campo_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_sair = new java.awt.Button();
        btn_login1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_criarconta.setBackground(new java.awt.Color(0, 0, 0, 100));
        btn_criarconta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_criarconta.setForeground(new java.awt.Color(255, 255, 255));
        btn_criarconta.setText("Entrar");
        btn_criarconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_criarcontaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_criarconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 90, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0,150));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 60, 30));

        campo_senha.setBackground(new java.awt.Color(0, 0, 0, 150));
        campo_senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_senha.setForeground(new java.awt.Color(255, 255, 255));
        campo_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_senhaActionPerformed(evt);
            }
        });
        jPanel1.add(campo_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, 30));

        campo_usuario.setBackground(new java.awt.Color(0, 0, 0, 150));
        campo_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_usuario.setForeground(new java.awt.Color(255, 255, 255));
        campo_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 170, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        btn_sair.setBackground(new java.awt.Color(0, 0, 0, 100));
        btn_sair.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(255, 255, 255));
        btn_sair.setLabel("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 90, 30));

        btn_login1.setBackground(new java.awt.Color(0, 0, 0, 100));
        btn_login1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btn_login1.setForeground(new java.awt.Color(255, 255, 255));
        btn_login1.setText("Crie uma conta");
        btn_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eletroney1/pkg0/img/login.gif"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_criarcontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_criarcontaActionPerformed
        if(campo_usuario.getText().equals("Usuario") && campo_senha.getText().equals("1234")){

            JOptionPane.showMessageDialog (null, " Seu acesso foi permitido :) "
                    + "seja bem vindo a Eletroney");

            UI_produtos Produtos = new UI_produtos();
            Produtos.setVisible(true);
            
            dispose();   
        
        }else if(campo_usuario.getText().equals("admin") && campo_senha.getText().equals("senha")){

            JOptionPane.showMessageDialog (null, " Seja bem vindo ao modo administrador ");

            UI_administrador administrador = new UI_administrador();
            administrador.setVisible(true);
            
            dispose();
        }
        else{
            JOptionPane.showMessageDialog (null, " Seu acesso foi negado...");
        }

    }//GEN-LAST:event_btn_criarcontaActionPerformed

    private void campo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_usuarioActionPerformed
       
    }//GEN-LAST:event_campo_usuarioActionPerformed

    private void btn_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login1ActionPerformed
                UI_cria_conta conta = new UI_cria_conta();
            conta.setVisible(true);
            dispose();    
    }//GEN-LAST:event_btn_login1ActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void campo_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_senhaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_criarconta;
    private javax.swing.JButton btn_login1;
    private java.awt.Button btn_sair;
    private javax.swing.JPasswordField campo_senha;
    private javax.swing.JTextField campo_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
