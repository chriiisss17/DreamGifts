/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller_login;
import controller.Controller_usuarios;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
/*import static java.lang.ProcessBuilder.Redirect.from;*/
/*import java.sql.Connection;*/
/*import java.sql.ResultSet;*/
/*import java.sql.Statement;*/
import javax.swing.JOptionPane;
import model.Usuario;
import view.Ventana;


/**
 *
 * @author paudi
 */
public class Ventana_login extends javax.swing.JFrame {
    
    
    /**
     * Creates new form Ventana_login
     */
    public Ventana_login() {
        initComponents();
        /*PRIMER METODO DE UBICACION Y TAMAÑO DE VENTANA SIN QUE TODAS LA PANTALLAS SE ADAPTE*/
        /*setSize(1024, 768);*/
        /*setLocation(500,100);*/
        /*se puede utilizar setBounds para ocupar setSiza que es el ancho y lardo de la pantalla y setLocation que donde se posicionara la pantalla*/
       /* setResizable(false);*/
        /*este argumento setResizable es para que la pantalla no se agrande (false)*/
        /*setExtendedState(Frame.MAXIMIZED_BOTH); /*es para utilizar la pantalla completa*/
        setTitle("Acceso seguro a Dream Gifts");
       
       /*SEGUNDO METODO PARA QUE LA VENTANA SE ADECUEE SEGUN LA PANTALLA DONDE SE ABRA*/
       Toolkit mipantalla = Toolkit.getDefaultToolkit();
       Dimension tamanoPantalla = mipantalla.getScreenSize();
       int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
       int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
       this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 1024, 768);
       /*int alturaPantalla = tamanoPantalla.height;
       int anchoPantalla = tamanoPantalla.width;
       setSize(anchoPantalla/2, alturaPantalla/2);
       setLocation(anchoPantalla/4, alturaPantalla/4);*/
      
    }
    
   /* public void validarAcceso(){
        int resultado=0;
        
        try{
            String usuario=usuario_login.getText();
            String password=String.valueOf(ingresa_clave.getPassword());
            
            String sql="select * from usuarios where name='"+usuario+"' and password='"+password+"' ";
            
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next()){
                resultado=1;
                if(resultado==1){
                    Panel_control_login abrir = new Panel_control_login();
                    .setVisible(true);
                }
            }
        }catch (Exception e){
            
        
    }*/

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ingresar_login = new javax.swing.JPanel();
        panel_contenedor_login = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario_login = new javax.swing.JTextField();
        ingresa_clave = new javax.swing.JPasswordField();
        btn_cancelar_login = new javax.swing.JButton();
        javax.swing.JButton btn_ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso seguro a Dream Gifts");
        setResizable(false);

        btn_ingresar_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_ingresar_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btn_ingresar_login.setToolTipText("");
        btn_ingresar_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_ingresar_login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        panel_contenedor_login.setBackground(new java.awt.Color(0, 102, 255));
        panel_contenedor_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Acceso sólo usuarios del sistema Dream Gifts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("USUARIO:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("CLAVE:");

        usuario_login.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        usuario_login.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn_cancelar_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancelar_login.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_cancelar_login.setText("Cancelar");
        btn_cancelar_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancelar_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_loginActionPerformed(evt);
            }
        });

        btn_ingresar.setBackground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuario_login, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(ingresa_clave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addComponent(btn_cancelar_login, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ingresa_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar_login)
                    .addComponent(btn_ingresar))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout panel_contenedor_loginLayout = new javax.swing.GroupLayout(panel_contenedor_login);
        panel_contenedor_login.setLayout(panel_contenedor_loginLayout);
        panel_contenedor_loginLayout.setHorizontalGroup(
            panel_contenedor_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contenedor_loginLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        panel_contenedor_loginLayout.setVerticalGroup(
            panel_contenedor_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor_loginLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setText("Dream Gifts");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Verifique el estado de Mayúsculas y bloqueo numérico.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout btn_ingresar_loginLayout = new javax.swing.GroupLayout(btn_ingresar_login);
        btn_ingresar_login.setLayout(btn_ingresar_loginLayout);
        btn_ingresar_loginLayout.setHorizontalGroup(
            btn_ingresar_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_ingresar_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_contenedor_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn_ingresar_loginLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_ingresar_loginLayout.setVerticalGroup(
            btn_ingresar_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ingresar_loginLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(panel_contenedor_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ingresar_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ingresar_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

        
    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
        
       
       
        
     String usuario = usuario_login.getText();
     String password = ingresa_clave.getText();
        
     
        if(usuario.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Algún campo esta vacio");
        }else{
            Controller_login ctr = new Controller_login();
            Usuario user = new Usuario();
           user.setName(usuario_login.getText());
           user.setPassword(ingresa_clave.getText());
           ctr.validateUsuario(user);
           JOptionPane.showMessageDialog(rootPane, "Bienvenido");
           Ventana vt = new Ventana();
            vt.setVisible(true);
            dispose();
            
             }
    }//GEN-LAST:event_btn_ingresarActionPerformed
    
    
    
    
    
    
    private void btn_cancelar_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar_login;
    private javax.swing.JPanel btn_ingresar_login;
    private javax.swing.JPasswordField ingresa_clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panel_contenedor_login;
    private javax.swing.JTextField usuario_login;
    // End of variables declaration//GEN-END:variables

  /* private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
