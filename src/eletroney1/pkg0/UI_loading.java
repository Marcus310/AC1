
package eletroney1.pkg0;

import javax.swing.JOptionPane;


public class UI_loading extends javax.swing.JFrame {


    public UI_loading() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        barra_progresso = new javax.swing.JProgressBar();
        contador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loading...");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel.setBackground(new java.awt.Color(0, 0, 0));
        painel.setName("Tela de Loading"); // NOI18N
        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eletroney1/pkg0/img/uni.gif.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        painel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 460, 270));

        barra_progresso.setBackground(new java.awt.Color(255, 255, 255));
        barra_progresso.setForeground(new java.awt.Color(123, 45, 140));
        painel.add(barra_progresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 650, -1));

        contador.setBackground(new java.awt.Color(255, 255, 255));
        contador.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        contador.setForeground(new java.awt.Color(255, 255, 255));
        contador.setText("%");
        painel.add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 491));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        UI_loading loading = new UI_loading ();
        loading.setVisible(true);
        try {
            for(int i = 0; i <= 100; i ++){
               Thread.sleep(70);
               loading.barra_progresso.setValue(i);
               loading.contador.setText(Integer.toString (i) + "%");
            }
            loading.dispose();
            
            UI_login login = new UI_login();
            login.setVisible(true);
        } catch (InterruptedException e){
          JOptionPane.showConfirmDialog(null, "Algum tubarão mordeu o cabo...");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra_progresso;
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
