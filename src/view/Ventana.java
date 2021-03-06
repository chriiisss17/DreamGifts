/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.ControllerArticulo;
import controller.ControllerBanco;
import controller.ControllerComuna;
import controller.ControllerPack;
import controller.ControllerRrss;
import controller.Controller_usuarios;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Articulo;
import model.Banco;
import model.Comuna;
import model.Pack;
import model.Pack_has_articulo;
import model.RRSS;
import model.Usuario;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author christian
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public static int idComuna;
    public static int idRs;
    public static int idBanco;
    public static int idUsuario;
    public static int rowArticulo=0;
    
    public Ventana() {
        initComponents();
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = mipantalla.getScreenSize();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 1024, 768);
        tbl_comuna.getColumnModel().getColumn(3).setMaxWidth(0);
        tbl_comuna.getColumnModel().getColumn(3).setMinWidth(0);
        tbl_comuna.getColumnModel().getColumn(3).setPreferredWidth(0);
        tbl_banco.getColumnModel().getColumn(3).setMaxWidth(0);
        tbl_banco.getColumnModel().getColumn(3).setMinWidth(0);
        tbl_banco.getColumnModel().getColumn(3).setPreferredWidth(0);
        table_rrss.getColumnModel().getColumn(3).setMaxWidth(0);
        table_rrss.getColumnModel().getColumn(3).setMinWidth(0);
        table_rrss.getColumnModel().getColumn(3).setPreferredWidth(0);
        tbl_usuario.getColumnModel().getColumn(2).setMaxWidth(0);
        tbl_usuario.getColumnModel().getColumn(2).setMinWidth(0);
        tbl_usuario.getColumnModel().getColumn(2).setPreferredWidth(0);
        tbl_usuario.getColumnModel().getColumn(3).setMaxWidth(0);
        tbl_usuario.getColumnModel().getColumn(3).setMinWidth(0);
        tbl_usuario.getColumnModel().getColumn(3).setPreferredWidth(0);
        tbl_pack.getColumnModel().getColumn(4).setMaxWidth(0);
        tbl_pack.getColumnModel().getColumn(4).setMinWidth(0);
        tbl_pack.getColumnModel().getColumn(4).setPreferredWidth(0);
        tbl_articuloPackSelect.getColumnModel().getColumn(2).setMaxWidth(0);
        tbl_articuloPackSelect.getColumnModel().getColumn(2).setMinWidth(0);
        tbl_articuloPackSelect.getColumnModel().getColumn(2).setPreferredWidth(0);
        tbl_articuloPack.getColumnModel().getColumn(1).setMaxWidth(0);
        tbl_articuloPack.getColumnModel().getColumn(1).setMinWidth(0);
        tbl_articuloPack.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        
    }
    public void emptyField()
    {
        txt_nombreComuna.setText("");
        txt_codigoComuna.setText("");
    }
    public void removeSelect()
    {
        int indice = tbl_comuna.getSelectedRow();
        tbl_comuna.getSelectionModel().removeSelectionInterval(indice, indice);
    }
    public void removeSelectRrss()
    {
        int indice = table_rrss.getSelectedRow();
        table_rrss.getSelectionModel().removeSelectionInterval(indice, indice);
    }
    public void removeSelectBanco()
    {
        int indice = tbl_banco.getSelectedRow();
        tbl_banco.getSelectionModel().removeSelectionInterval(indice, indice);
    }
    public void removeSelectUsuario()
    {
        int indice = tbl_usuario.getSelectedRow();
        tbl_usuario.getSelectionModel().removeSelectionInterval(indice, indice);
    }
    public void emptyIdComuna()
    {
        idComuna=0;
    }
    public void emptyIdUsuario()
    {
        idUsuario=0;
    }
    public void emptyIdBanco()
    {
        idBanco=0;
    }
    public void emptyIdRrss()
    {
        idRs=0;
    }
    public void emptyRowArticulo()
    {
        rowArticulo=0;
    }
    public void emptyCantArticulo()
    {
        txt_unidadesArticulo.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        nombreRrss = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        codigoRrss = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        botonGuardarRrss = new javax.swing.JButton();
        botonCancelarRrss = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_rrss = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        buscarRrss = new javax.swing.JTextField();
        botonEditarRrss = new javax.swing.JButton();
        botonDesactivar = new javax.swing.JButton();
        searchRrss = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombreComuna = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_codigoComuna = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_comunasRegistradas = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_comuna = new javax.swing.JTable();
        btn_editar = new javax.swing.JButton();
        btn_desactivar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_banco = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        EspacioNombreBancos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BotoncitoguardarBanco = new javax.swing.JButton();
        BotoncitoCancelarBanco = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        EspacioLadobancos = new javax.swing.JTextField();
        BotoncitoEditorBanco = new javax.swing.JButton();
        BotoncitoDesactivarBanco = new javax.swing.JButton();
        EspacioSearchBanco = new javax.swing.JFormattedTextField();
        EspacioComunasRegistradas = new javax.swing.JLabel();
        searchBanco = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_nameusuario1 = new javax.swing.JTextField();
        txt_passw1 = new javax.swing.JPasswordField();
        txt_verificar1 = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        btn_guardar2 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_usuario = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txt_buscarUser = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        searchUsuario = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jp_pack = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        btn_guardar3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_precioPack = new javax.swing.JTextField();
        txt_nombrePack = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_unidadesArticulo = new javax.swing.JTextField();
        jl_buttonSend = new javax.swing.JLabel();
        jl_buttonBack = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_articuloPackSelect = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_articuloPack = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_pack = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        txt_buscarPack = new javax.swing.JTextField();
        btn_editarPack = new javax.swing.JButton();
        btn_desactivarPack = new javax.swing.JButton();
        searchUsuario1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btn_buscarInformePack = new javax.swing.JButton();
        jdate_desdePack = new com.toedter.calendar.JDateChooser();
        jdate_hastaPack = new com.toedter.calendar.JDateChooser();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_informePack = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txt_cantidadPack = new javax.swing.JTextField();
        txt_totalPack = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jdate_desdeComuna = new com.toedter.calendar.JDateChooser();
        jdate_hastaComuna = new com.toedter.calendar.JDateChooser();
        btn_searchCm = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        cmb_comunas = new javax.swing.JComboBox<>();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_informePackComuna = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        txt_cantidadPackComuna = new javax.swing.JTextField();
        txt_totalPackComuna = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenu8.setText("jMenu8");

        jMenu9.setText("File");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar3.add(jMenu10);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dream Gifts");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(10, 76));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel3.setText("Dream Gifts");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1.setName(""); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 443));

        jPanel7.setBackground(new java.awt.Color(0, 102, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setPreferredSize(new java.awt.Dimension(1000, 443));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Redes Sociales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N
        jPanel8.setToolTipText("");

        nombreRrss.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nombreRrss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRrssActionPerformed(evt);
            }
        });
        nombreRrss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreRrssKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setText("Nombre RRSS");

        codigoRrss.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        codigoRrss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoRrssActionPerformed(evt);
            }
        });
        codigoRrss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoRrssKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel8.setText("C??digo RRSS");

        botonGuardarRrss.setBackground(new java.awt.Color(255, 255, 255));
        botonGuardarRrss.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonGuardarRrss.setText("Guardar");
        botonGuardarRrss.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonGuardarRrss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarRrssActionPerformed(evt);
            }
        });

        botonCancelarRrss.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonCancelarRrss.setText("Cancelar");
        botonCancelarRrss.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCancelarRrss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelarRrss.setPreferredSize(new java.awt.Dimension(41, 17));
        botonCancelarRrss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarRrssActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(nombreRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(botonCancelarRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(botonGuardarRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nombreRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(codigoRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelarRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGuardarRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.setPreferredSize(new java.awt.Dimension(352, 186));

        table_rrss.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        table_rrss.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        table_rrss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "C??digo RRSS", "Nombre RRSS", "Acci??n", "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_rrss);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Red Social");

        buscarRrss.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        buscarRrss.setForeground(new java.awt.Color(153, 153, 153));
        buscarRrss.setText(" search");
        buscarRrss.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buscarRrss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarRrssActionPerformed(evt);
            }
        });

        botonEditarRrss.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonEditarRrss.setText("Editar");
        botonEditarRrss.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEditarRrss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEditarRrss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarRrssActionPerformed(evt);
            }
        });

        botonDesactivar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        botonDesactivar.setText("Desactivar");
        botonDesactivar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesactivarActionPerformed(evt);
            }
        });

        searchRrss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        searchRrss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchRrssMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEditarRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(botonDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(jLabel9)
                                .addGap(117, 117, 117)
                                .addComponent(searchRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(buscarRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEditarRrss, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Rrss", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Comunas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setText("Nombre Comuna");

        txt_nombreComuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_nombreComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreComunaActionPerformed(evt);
            }
        });
        txt_nombreComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreComunaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setText("C??digo Comuna");

        txt_codigoComuna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_codigoComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoComunaActionPerformed(evt);
            }
        });
        txt_codigoComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoComunaKeyTyped(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txt_nombreComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_codigoComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombreComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_codigoComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Comunas Registradas");

        txt_comunasRegistradas.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txt_comunasRegistradas.setForeground(new java.awt.Color(153, 153, 153));
        txt_comunasRegistradas.setText(" search");
        txt_comunasRegistradas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tbl_comuna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "C??digo Comuna", "Nombre Comuna", "Acci??n", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_comuna);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_editar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editar.setPreferredSize(new java.awt.Dimension(85, 30));
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_desactivar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_desactivar.setText("Desactivar");
        btn_desactivar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_desactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desactivarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(71, 71, 71)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_comunasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btn_desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_comunasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comunas", jPanel3);

        jPanel6.setBackground(new java.awt.Color(0, 102, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tbl_banco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo Banco", "Nombre Banco", "Accion", "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_banco);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Bancos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N

        EspacioNombreBancos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        EspacioNombreBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioNombreBancosActionPerformed(evt);
            }
        });
        EspacioNombreBancos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EspacioNombreBancosKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel10.setText("Nombre Bancos ");

        BotoncitoguardarBanco.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BotoncitoguardarBanco.setText("Guardar");
        BotoncitoguardarBanco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotoncitoguardarBanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotoncitoguardarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoncitoguardarBancoActionPerformed(evt);
            }
        });

        BotoncitoCancelarBanco.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BotoncitoCancelarBanco.setText("Cancelar");
        BotoncitoCancelarBanco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotoncitoCancelarBanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotoncitoCancelarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoncitoCancelarBancoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel13.setText("C??digo Banco");

        EspacioLadobancos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        EspacioLadobancos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        EspacioLadobancos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EspacioLadobancosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel10)
                .addGap(48, 48, 48)
                .addComponent(EspacioNombreBancos, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(34, 34, 34)
                .addComponent(EspacioLadobancos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotoncitoCancelarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(BotoncitoguardarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EspacioNombreBancos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(EspacioLadobancos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotoncitoCancelarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotoncitoguardarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        BotoncitoEditorBanco.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BotoncitoEditorBanco.setText("Editor");
        BotoncitoEditorBanco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotoncitoEditorBanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotoncitoEditorBanco.setPreferredSize(new java.awt.Dimension(85, 30));
        BotoncitoEditorBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoncitoEditorBancoActionPerformed(evt);
            }
        });

        BotoncitoDesactivarBanco.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        BotoncitoDesactivarBanco.setText("Desactivar");
        BotoncitoDesactivarBanco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotoncitoDesactivarBanco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotoncitoDesactivarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoncitoDesactivarBancoActionPerformed(evt);
            }
        });

        EspacioSearchBanco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EspacioSearchBanco.setForeground(new java.awt.Color(102, 102, 102));
        EspacioSearchBanco.setText(" Search");
        EspacioSearchBanco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        EspacioSearchBanco.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        EspacioSearchBanco.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        EspacioSearchBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspacioSearchBancoActionPerformed(evt);
            }
        });

        EspacioComunasRegistradas.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        EspacioComunasRegistradas.setForeground(new java.awt.Color(255, 255, 255));
        EspacioComunasRegistradas.setText("Bancos Registrados");

        searchBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        searchBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBancoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotoncitoEditorBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BotoncitoDesactivarBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(464, 464, 464))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(EspacioComunasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(searchBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EspacioSearchBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(296, 296, 296))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(90, 90, 90)))
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(370, 370, 370)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EspacioSearchBanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EspacioComunasRegistradas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotoncitoEditorBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotoncitoDesactivarBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Banco", jPanel2);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel18.setBackground(new java.awt.Color(0, 102, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel18.setVerifyInputWhenFocusTarget(false);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N
        jPanel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel19.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel16.setText("Nombre Usuario");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel17.setText("Ingrese clave");

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel18.setText("Verifique clave");

        txt_nameusuario1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_nameusuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameusuario1ActionPerformed(evt);
            }
        });
        txt_nameusuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameusuario1KeyTyped(evt);
            }
        });

        txt_passw1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_passw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passw1ActionPerformed(evt);
            }
        });

        txt_verificar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt_verificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_verificar1ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btn_guardar2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_guardar2.setText("Guardar");
        btn_guardar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addGap(61, 61, 61)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_verificar1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(txt_nameusuario1)
                    .addComponent(txt_passw1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(txt_nameusuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(txt_passw1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txt_verificar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_guardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tbl_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Usuario", "Acci??n", "Id", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbl_usuario);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Usuarios registrados");

        txt_buscarUser.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txt_buscarUser.setForeground(new java.awt.Color(102, 102, 102));
        txt_buscarUser.setText(" search");
        txt_buscarUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton7.setText("Editar");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton8.setText("Desactivar");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        searchUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        searchUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(searchUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_buscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 477, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Usuario", jPanel14);

        jp_pack.setBackground(new java.awt.Color(0, 102, 255));
        jp_pack.setPreferredSize(new java.awt.Dimension(1024, 768));
        jp_pack.setVerifyInputWhenFocusTarget(false);
        jp_pack.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jp_packAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "PACKs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12))); // NOI18N
        jPanel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel22.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel22.setPreferredSize(new java.awt.Dimension(947, 220));

        jButton9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton9.setText("Cancelar");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btn_guardar3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_guardar3.setText("Guardar");
        btn_guardar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_guardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Precio Pack");

        jLabel14.setText("Unidades");

        txt_unidadesArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unidadesArticuloActionPerformed(evt);
            }
        });

        jl_buttonSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mayorque.png"))); // NOI18N
        jl_buttonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_buttonSendMouseClicked(evt);
            }
        });

        jl_buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menorque.png"))); // NOI18N
        jl_buttonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_buttonBackMouseClicked(evt);
            }
        });

        tbl_articuloPackSelect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Unidades", "Descripcion", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tbl_articuloPackSelect);

        tbl_articuloPack.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descripcion", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_articuloPack.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl_articuloPackAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane8.setViewportView(tbl_articuloPack);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombrePack, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_buttonBack)
                            .addComponent(txt_unidadesArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_buttonSend))))
                .addGap(153, 153, 153)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txt_precioPack, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardar3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombrePack, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jl_buttonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_unidadesArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_buttonBack))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precioPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(btn_guardar3))
                .addGap(63, 63, 63))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tbl_pack.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo Pack", "Nombre Pack", "Unidades Bodega", "Selecci??n", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tbl_pack);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tabla Packs");

        txt_buscarPack.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        txt_buscarPack.setForeground(new java.awt.Color(102, 102, 102));
        txt_buscarPack.setText(" search");
        txt_buscarPack.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_editarPack.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_editarPack.setText("Editar");
        btn_editarPack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_editarPack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarPackActionPerformed(evt);
            }
        });

        btn_desactivarPack.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btn_desactivarPack.setText("Desactivar");
        btn_desactivarPack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_desactivarPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desactivarPackActionPerformed(evt);
            }
        });

        searchUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        searchUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchUsuario1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_packLayout = new javax.swing.GroupLayout(jp_pack);
        jp_pack.setLayout(jp_packLayout);
        jp_packLayout.setHorizontalGroup(
            jp_packLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_packLayout.createSequentialGroup()
                .addGroup(jp_packLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_packLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_editarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn_desactivarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_packLayout.createSequentialGroup()
                        .addGroup(jp_packLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_packLayout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(searchUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_buscarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_packLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jp_packLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_packLayout.setVerticalGroup(
            jp_packLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_packLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_packLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_packLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addGap(20, 20, 20))
                    .addGroup(jp_packLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jp_packLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_buscarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_packLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_desactivarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jp_pack, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_pack, javax.swing.GroupLayout.PREFERRED_SIZE, 480, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("PACKs", jPanel16);

        jPanel17.setBackground(new java.awt.Color(51, 102, 255));

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Desde");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Hasta");

        btn_buscarInformePack.setText("Buscar");
        btn_buscarInformePack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarInformePackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(28, 28, 28)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdate_hastaPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdate_desdePack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btn_buscarInformePack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jdate_desdePack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscarInformePack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdate_hastaPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addGap(37, 37, 37))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        tbl_informePack.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PACK", "Cantidad", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbl_informePack);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Total");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cantidadPack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(txt_totalPack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(35, 35, 35))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_cantidadPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_totalPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe de Venta de Packs", jPanel17);

        jPanel25.setBackground(new java.awt.Color(51, 102, 255));

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Desde");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Hasta");

        btn_searchCm.setText("Buscar");
        btn_searchCm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchCmActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Comuna");

        cmb_comunas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cmb_comunasAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cmb_comunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_comunasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdate_desdeComuna, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jdate_hastaComuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_comunas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchCm, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(173, 173, 173))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jdate_desdeComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(cmb_comunas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel26)
                        .addComponent(jdate_hastaComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_searchCm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        tbl_informePackComuna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Comuna", "PACK", "Cantidad", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tbl_informePackComuna);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Total");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cantidadPackComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(txt_totalPackComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(35, 35, 35))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_cantidadPackComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_totalPackComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe de Comunas", jPanel25);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Verifique el estado de May??sculas y bloqueo num??rico.");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Ventas");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(10, 5, 10, 20));
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Compras");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(10, 5, 10, 20));
        jMenuBar1.add(jMenu2);

        jMenu11.setText("Informes");
        jMenu11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jMenu11.setMargin(new java.awt.Insets(10, 5, 10, 20));
        jMenuBar1.add(jMenu11);

        jMenu12.setText("Maestros");
        jMenu12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu12.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jMenu12.setMargin(new java.awt.Insets(10, 5, 10, 20));
        jMenuBar1.add(jMenu12);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar2ActionPerformed
        try
        {
            if(txt_nameusuario1.getText().isEmpty() || txt_passw1.getText().isEmpty() || txt_verificar1.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
            }
            if(!(txt_passw1.getText().equals(txt_verificar1.getText()))){
                JOptionPane.showMessageDialog(rootPane, "Las contrase??as no coinciden");
            }else{
                Controller_usuarios ctrUsuario = new Controller_usuarios();
                Usuario usuario = new Usuario();
                usuario.setId(idUsuario);
                usuario.setName(txt_nameusuario1.getText());
                usuario.setPassword(txt_passw1.getText());
                ctrUsuario.validateUsuario(usuario);
                txt_nameusuario1.setText("");
                txt_passw1.setText("");
                txt_verificar1.setText("");
                removeSelectUsuario();
                emptyIdUsuario();
                JOptionPane.showMessageDialog(rootPane, "Usuario almacenado correctamente");
            };

        }catch(Exception err){
            JOptionPane.showMessageDialog(rootPane, err);
        }
    }//GEN-LAST:event_btn_guardar2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        txt_nameusuario1.setText("");
        txt_passw1.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_verificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_verificar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_verificar1ActionPerformed

    private void txt_passw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passw1ActionPerformed

    private void txt_nameusuario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameusuario1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameusuario1KeyTyped

    private void txt_nameusuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameusuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameusuario1ActionPerformed

    private void EspacioSearchBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioSearchBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspacioSearchBancoActionPerformed

    private void BotoncitoDesactivarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoncitoDesactivarBancoActionPerformed
        int indice = tbl_banco.getSelectedRow();
        int cod = (int)tbl_banco.getValueAt(indice, 0);
        String name = (String) tbl_banco.getValueAt(indice, 1);
        String action = (String)tbl_banco.getValueAt(indice, 2);
        int id = (int) tbl_banco.getValueAt(indice, 3);
        boolean state;
        if(action=="Desactivado"){
           state=false;
        }else{
            state=true;
        }
        ControllerBanco ctrBanco = new ControllerBanco();
        Banco banco = new Banco();
        banco.setId(id);
        banco.setAction(!state);
        ctrBanco.actionBanco(banco);
        removeSelect();
    }//GEN-LAST:event_BotoncitoDesactivarBancoActionPerformed

    private void BotoncitoEditorBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoncitoEditorBancoActionPerformed
        int indice = tbl_banco.getSelectedRow();
        int cod = (int)tbl_banco.getValueAt(indice, 0);
        String name = (String) tbl_banco.getValueAt(indice, 1);
        int id = (int) tbl_banco.getValueAt(indice, 3);
        EspacioNombreBancos.setText(name);
        EspacioLadobancos.setText(String.valueOf(cod));
        idBanco=id;
    }//GEN-LAST:event_BotoncitoEditorBancoActionPerformed

    private void BotoncitoCancelarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoncitoCancelarBancoActionPerformed
        //Limpiar campos
        EspacioNombreBancos.setText("");
        EspacioLadobancos.setText("");
    }//GEN-LAST:event_BotoncitoCancelarBancoActionPerformed

    private void BotoncitoguardarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoncitoguardarBancoActionPerformed
        try
        {
            if(EspacioNombreBancos.getText().isEmpty() || EspacioLadobancos.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
            }else{
                ControllerBanco ctrBanco = new ControllerBanco();
                Banco banco = new Banco();
                banco.setId(idBanco);
                banco.setDescripcion(EspacioNombreBancos.getText());
                banco.setCod(Integer.parseInt(EspacioLadobancos.getText()));
                ctrBanco.validateBanco(banco);
                emptyField();
                removeSelectBanco();
                emptyIdBanco();
                JOptionPane.showMessageDialog(rootPane, "Banco almacenado correctamente");
            };

        }catch(Exception err){
            JOptionPane.showMessageDialog(rootPane, err);
        }
    }//GEN-LAST:event_BotoncitoguardarBancoActionPerformed

    private void EspacioNombreBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspacioNombreBancosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EspacioNombreBancosActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ArrayList<Comuna> listComuna = new ArrayList<>();
        ControllerComuna ctrComuna = new ControllerComuna();

        try
        {
            String name = txt_comunasRegistradas.getText();
            listComuna = ctrComuna.listComuna(name);
            DefaultTableModel tableComuna = (DefaultTableModel)tbl_comuna.getModel();
            tableComuna.setRowCount(0);
            for(Comuna comuna: listComuna)
            {
                String estado;
                if(comuna.isAction()==true){
                    estado="Activado";
                }else{
                    estado="Desactivado";
                }
                Object[] fila ={
                    comuna.getCod(),
                    comuna.getName(),
                    estado,
                    comuna.getId()
                };
                tableComuna.addRow(fila);
            }
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_desactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desactivarActionPerformed
        int indice = tbl_comuna.getSelectedRow();
        int cod = (int)tbl_comuna.getValueAt(indice, 0);
        String name = (String) tbl_comuna.getValueAt(indice, 1);
        String action = (String)tbl_comuna.getValueAt(indice, 2);
        boolean state;
        if(action=="Desactivado"){
           state=false;
        }else{
            state=true;
        }
        int id = (int) tbl_comuna.getValueAt(indice, 3);
        ControllerComuna ctr = new ControllerComuna();
        Comuna comuna = new Comuna();
        comuna.setId(id);
        comuna.setAction(!state);
        ctr.actionComuna(comuna);
        removeSelect();
    }//GEN-LAST:event_btn_desactivarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        int indice = tbl_comuna.getSelectedRow();
        int cod = (int)tbl_comuna.getValueAt(indice, 0);
        String name = (String) tbl_comuna.getValueAt(indice, 1);
        int id = (int) tbl_comuna.getValueAt(indice, 3);
        txt_nombreComuna.setText(name);
        txt_codigoComuna.setText(String.valueOf(cod));
        idComuna=id;
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        try
        {
            if(txt_nombreComuna.getText().isEmpty() || txt_codigoComuna.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
            }else{
                ControllerComuna ctrComuna = new ControllerComuna();
                Comuna comuna = new Comuna();
                comuna.setId(idComuna);
                comuna.setName(txt_nombreComuna.getText());
                comuna.setCod(Integer.parseInt(txt_codigoComuna.getText()));
                ctrComuna.validateComuna(comuna);
                emptyField();
                removeSelect();
                emptyIdComuna();
                JOptionPane.showMessageDialog(rootPane, "Comuna almacenada correctamente");
            };

        }catch(Exception err){
            JOptionPane.showMessageDialog(rootPane, err);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        //Limpiar campos
        txt_nombreComuna.setText("");
        txt_codigoComuna.setText("");
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void txt_codigoComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoComunaKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Debe ingresar solo numeros");
        }
        if(txt_codigoComuna.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_txt_codigoComunaKeyTyped

    private void txt_codigoComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoComunaActionPerformed

    }//GEN-LAST:event_txt_codigoComunaActionPerformed

    private void txt_nombreComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreComunaKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Debe ingresar solo caracteres");
        }
    }//GEN-LAST:event_txt_nombreComunaKeyTyped

    private void txt_nombreComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreComunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreComunaActionPerformed

    private void botonEditarRrssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarRrssActionPerformed
        // TODO add your handling code here:
        int indice = table_rrss.getSelectedRow();
        int cod = (int)table_rrss.getValueAt(indice, 0);
        String name = (String) table_rrss.getValueAt(indice, 1);
        int id = (int) table_rrss.getValueAt(indice, 3);
        nombreRrss.setText(name);
        codigoRrss.setText(String.valueOf(cod));
        idRs=id;
    }//GEN-LAST:event_botonEditarRrssActionPerformed

    private void botonDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesactivarActionPerformed
        // TODO add your handling code here:
        int indice = table_rrss.getSelectedRow();
        int cod = (int)table_rrss.getValueAt(indice, 0);
        String name = (String) table_rrss.getValueAt(indice, 1);
        String action = (String)table_rrss.getValueAt(indice, 2);
        int id = (int) table_rrss.getValueAt(indice, 3);
        boolean state;
        if(action=="Desactivado"){
           state=false;
        }else{
            state=true;
        }
        ControllerRrss ctrRs = new ControllerRrss();
        RRSS rs = new RRSS();
        rs.setId(id);
        rs.setAction(!state);
        ctrRs.actionRrss(rs);
        removeSelect();
    }//GEN-LAST:event_botonDesactivarActionPerformed

    private void buscarRrssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarRrssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarRrssActionPerformed

    private void botonCancelarRrssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarRrssActionPerformed
        // TODO add your handling code here:
        //Limpiar campos
        nombreRrss.setText("");
        codigoRrss.setText("");
    }//GEN-LAST:event_botonCancelarRrssActionPerformed

    private void botonGuardarRrssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarRrssActionPerformed
        // TODO add your handling code here:
        try
        {
            if(nombreRrss.getText().isEmpty() || codigoRrss.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
            }else{
                ControllerRrss ctrRs = new ControllerRrss();
                RRSS rs = new RRSS();
                rs.setId(idRs);
                rs.setName(nombreRrss.getText());
                rs.setCod(Integer.parseInt(codigoRrss.getText()));
                ctrRs.validateComuna(rs);
                emptyField();
                removeSelectRrss();
                emptyIdRrss();
                JOptionPane.showMessageDialog(rootPane, "RRSS almacenada correctamente");
            };

        }catch(Exception err){
            JOptionPane.showMessageDialog(rootPane, err);
        }
    }//GEN-LAST:event_botonGuardarRrssActionPerformed

    private void codigoRrssKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoRrssKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Debe ingresar solo numeros");
        }
        if(txt_codigoComuna.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_codigoRrssKeyTyped

    private void codigoRrssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoRrssActionPerformed

    }//GEN-LAST:event_codigoRrssActionPerformed

    private void nombreRrssKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreRrssKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Debe ingresar solo caracteres");
        }
    }//GEN-LAST:event_nombreRrssKeyTyped

    private void nombreRrssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRrssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreRrssActionPerformed

    private void searchRrssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchRrssMouseClicked
        ArrayList<RRSS> listRrss = new ArrayList<>();
        ControllerRrss ctrRs = new ControllerRrss();

        try
        {
            String name = buscarRrss.getText();
            listRrss = ctrRs.listRrss(name);
            DefaultTableModel tableRrss = (DefaultTableModel)table_rrss.getModel();
            tableRrss.setRowCount(0);

            for(RRSS rrss: listRrss)
            {
                String estado;
                if(rrss.isAction()==true){
                    estado="Activado";
                }else{
                    estado="Desactivado";
                }
                Object[] fila ={
                    rrss.getCod(),
                    rrss.getName(),
                    estado,
                    rrss.getId()
                };
                tableRrss.addRow(fila);
            }
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_searchRrssMouseClicked

    private void searchBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBancoMouseClicked
        ArrayList<Banco> listBanco = new ArrayList<>();
        ControllerBanco ctrBanco = new ControllerBanco();

        try
        {
            String name = EspacioSearchBanco.getText();
            listBanco = ctrBanco.listBanco(name);
            DefaultTableModel tableBanco = (DefaultTableModel)tbl_banco.getModel();
            tableBanco.setRowCount(0);

            for(Banco banco: listBanco)
            {
                String estado;
                if(banco.isAction()==true){
                    estado="Activado";
                }else{
                    estado="Desactivado";
                }
                Object[] fila ={
                    banco.getCod(),
                    banco.getDescripcion(),
                    estado,
                    banco.getId()
                };
                tableBanco.addRow(fila);
            }
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_searchBancoMouseClicked

    private void searchUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchUsuarioMouseClicked
        ArrayList<Usuario> listUsuario = new ArrayList<>();
        Controller_usuarios ctrUsuarios = new Controller_usuarios();

        try
        {
            String name = txt_buscarUser.getText();
            listUsuario = ctrUsuarios.listUsuario(name);
            DefaultTableModel tableUsuario = (DefaultTableModel)tbl_usuario.getModel();
            tableUsuario.setRowCount(0);

            for(Usuario usuario: listUsuario)
            {
                String estado;
                if(usuario.isAction()==true){
                    estado="Activado";
                }else{
                    estado="Desactivado";
                }
                Object[] fila ={
                    usuario.getName(),
                    estado,
                    usuario.getId(),
                    usuario.getPassword()
                };
                tableUsuario.addRow(fila);
            }
        }
        catch(Exception err)
        {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_searchUsuarioMouseClicked

    private void EspacioNombreBancosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EspacioNombreBancosKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Debe ingresar solo caracteres");
        }
    }//GEN-LAST:event_EspacioNombreBancosKeyTyped

    private void EspacioLadobancosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EspacioLadobancosKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Debe ingresar solo numeros");
        }
        if(txt_codigoComuna.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_EspacioLadobancosKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int indice = tbl_usuario.getSelectedRow();
        String name = (String) tbl_usuario.getValueAt(indice, 0);
        int id = (int) tbl_usuario.getValueAt(indice, 2);
        String password = (String) tbl_usuario.getValueAt(indice, 3);
        txt_nameusuario1.setText(name);
        txt_passw1.setText(password);
        txt_verificar1.setText(password);
        txt_passw1.setEnabled(false);
        txt_verificar1.setEnabled(false);
        idUsuario=id;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int indice = tbl_usuario.getSelectedRow();
        String name = (String) tbl_usuario.getValueAt(indice, 0);
        String action = (String)tbl_usuario.getValueAt(indice, 1);
        int id = (int) tbl_usuario.getValueAt(indice, 2);
        boolean state;
        if(action=="Desactivado"){
           state=false;
        }else{
            state=true;
        }
        Controller_usuarios ctrU = new Controller_usuarios();
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setAction(!state);
        ctrU.actionUsuario(usuario);
        removeSelect();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btn_editarPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarPackActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tablePack = (DefaultTableModel)tbl_pack.getModel();
        int indice = tbl_pack.getSelectedRow();
        int cod =(int)tbl_pack.getValueAt(indice, 0);
        String name = (String)tbl_pack.getValueAt(indice, 1);
        String price = (String)tbl_pack.getValueAt(indice, 4);
        txt_nombrePack.setText(name);
        txt_precioPack.setText(price);
    }//GEN-LAST:event_btn_editarPackActionPerformed

    private void btn_desactivarPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desactivarPackActionPerformed
        int indice = tbl_pack.getSelectedRow();
        int cod = (int)tbl_pack.getValueAt(indice, 0);
        String action = (String)tbl_pack.getValueAt(indice, 3);
        boolean state;
        if(action=="Desactivado"){
           state=false;
        }else{
            state=true;
        }
        ControllerPack ctrPk = new ControllerPack();
        Pack pk = new Pack();
        pk.setPck_id_pack(cod);
        pk.setPck_estado(!state);
        ctrPk.actionPack(pk);
        System.out.println("ESTADO ACTUAL : "+pk.isPck_estado());
    }//GEN-LAST:event_btn_desactivarPackActionPerformed

    private void searchUsuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchUsuario1MouseClicked
        // TODO add your handling code here:
        ControllerPack ctrPk = new ControllerPack();
        ArrayList<Pack> listPack = new ArrayList<>();
        String name=txt_buscarPack.getText();
        DefaultTableModel tablePack = (DefaultTableModel)tbl_pack.getModel();
        tablePack.setRowCount(0);
        try{
            String state;
            listPack=ctrPk.listPack(name);
            for(Pack pk: listPack){
                if(pk.isPck_estado()==true){
                    state="Activado";
                }else{
                    state="Desactivado";
                }
                Object[] fila={
                  pk.getPck_id_pack(),
                  pk.getPck_nombre(),
                  pk.getPck_stock(),
                  state,
                  pk.getPck_costo()
                };
                
                tablePack.addRow(fila);
            }
            
            
        }catch(Exception err){
            System.out.println("ERROR EN EL BOTON LISTAR PACKS "+err.getMessage());
        }
        
    }//GEN-LAST:event_searchUsuario1MouseClicked

    private void txt_unidadesArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unidadesArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unidadesArticuloActionPerformed

    private void btn_guardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar3ActionPerformed
        
        ControllerPack ctrPk = new ControllerPack();
        
        try{
            
            DefaultTableModel tableIsSelected = (DefaultTableModel) tbl_articuloPackSelect.getModel();
            if(txt_precioPack.getText().isEmpty()|| txt_precioPack.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Los campos est??n vac??os");
            }
            else if(tableIsSelected.getValueAt(0, 0)==null||tableIsSelected.getValueAt(0, 2)==null){
              JOptionPane.showMessageDialog(rootPane, "No hay articulos seleccionados en el pack");
            }else{
                Pack pk = new Pack();
                pk.setPck_nombre(txt_nombrePack.getText());
                pk.setPck_costo(txt_precioPack.getText());
                pk.setPck_stock(0);
                pk.setPck_estado(true);
                ArrayList<Object> cantArt = new ArrayList<>();
                ArrayList<Object> idArticulo = new ArrayList<>();
                for(int i=0;i<tableIsSelected.getRowCount();i++)
                {
                    
                    cantArt.add(tableIsSelected.getValueAt(i, 0));
                    idArticulo.add(tableIsSelected.getValueAt(i, 2));
                }
                
                ctrPk.createPack(pk, cantArt,idArticulo);
                
                txt_nombrePack.setText("");
                txt_precioPack.setText("");
                int a = tbl_articuloPackSelect.getRowCount()-1;
                for (int i = a; i >= 0; i--) {          
                    tableIsSelected.removeRow(tableIsSelected.getRowCount()-1);
                }
                rowArticulo=0;
                JOptionPane.showMessageDialog(rootPane, "Pack almacenado correctamente");
            }
        }catch(Exception err)
        {
            System.out.println("ERROR EN LA VISTA PACK " +err.getMessage());
        }
    }//GEN-LAST:event_btn_guardar3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        txt_nombrePack.setText("");
        txt_precioPack.setText("");
        DefaultTableModel tableIsSelected = (DefaultTableModel) tbl_articuloPackSelect.getModel();
        int a = tbl_articuloPackSelect.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
            tableIsSelected.removeRow(tableIsSelected.getRowCount()-1);
        }
        rowArticulo=0;
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jp_packAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jp_packAncestorAdded
        ControllerArticulo ctrA = new ControllerArticulo();
        ArrayList<Articulo> listArticulo = new ArrayList<>();
        try{
            listArticulo=ctrA.listArticulo();
            DefaultTableModel tableArticulo = (DefaultTableModel)tbl_articuloPack.getModel();
            tableArticulo.setRowCount(0);
            for(Articulo articulo: listArticulo)
            {
                Object[] fila ={
                    articulo.getArt_descripcion(),
                    articulo.getArt_id_articulo()
                };
                tableArticulo.addRow(fila);
            }
            
        }catch(Exception err)
        {
            System.out.println("ERROR EN LA VISTA LISTA ARTICULO "+err.getMessage());
        }
    }//GEN-LAST:event_jp_packAncestorAdded

    private void tbl_articuloPackAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl_articuloPackAncestorAdded
        
    }//GEN-LAST:event_tbl_articuloPackAncestorAdded

    private void jl_buttonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_buttonSendMouseClicked
        if(txt_unidadesArticulo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debe indicar la cantidad");
        }else{
            int indice = tbl_articuloPack.getSelectedRow();
            String name =(String) tbl_articuloPack.getValueAt(indice, 0);
            int id = (Integer) tbl_articuloPack.getValueAt(indice, 1);
            String unit = txt_unidadesArticulo.getText();
            DefaultTableModel tableSelect = (DefaultTableModel)tbl_articuloPackSelect.getModel();
            DefaultTableModel tableIsSelected = (DefaultTableModel)tbl_articuloPack.getModel();
            tableSelect.setRowCount(rowArticulo);
            Object[] fila={
              unit,name,id  
            };
            tableSelect.addRow(fila);
            rowArticulo++;
            emptyCantArticulo();
            tableIsSelected.removeRow(indice);
            tableIsSelected.fireTableDataChanged(); 
        }
    }//GEN-LAST:event_jl_buttonSendMouseClicked

    private void jl_buttonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_buttonBackMouseClicked
        DefaultTableModel tableIsSelect = (DefaultTableModel)tbl_articuloPackSelect.getModel();
        int indice = tbl_articuloPackSelect.getSelectedRow();
        String unit = (String)tbl_articuloPackSelect.getValueAt(indice, 0);
        String name =(String) tbl_articuloPackSelect.getValueAt(indice, 1);
        int id = (Integer) tbl_articuloPackSelect.getValueAt(indice, 2);
        tableIsSelect.removeRow(indice);
        DefaultTableModel tableSelect =(DefaultTableModel)tbl_articuloPack.getModel();
        Object[] fila={
              name,id  
            };
        tableSelect.addRow(fila);
        emptyRowArticulo();
    }//GEN-LAST:event_jl_buttonBackMouseClicked

    private void btn_buscarInformePackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarInformePackActionPerformed
        // TODO add your handling code here:
        
        /*Date dateDesde = jdate_desdePack.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-mm-dd");
        String des1 = formato.format(dateDesde);
        System.out.println(""+des1);
                
        Date dateHasta = jdate_desdePack.getDate();
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-mm-dd");
        String des2 = formato2.format(dateHasta);
*/

        
        
        
        String des1 =((JTextField)jdate_desdePack.getDateEditor().getUiComponent()).getText();
        String fechaInit = des1.substring(6, 10)+"-"+des1.substring(4, 5)+"-"+des1.substring(1, 2);
        System.out.println(""+fechaInit);
        
        
        String des2 =((JTextField)jdate_hastaPack.getDateEditor().getUiComponent()).getText();
        String fechaFn = des2.substring(6, 10)+"-"+des2.substring(4, 5)+"-"+des2.substring(1, 2);
        System.out.println(""+fechaFn);
        
        
        ControllerPack ctrPack = new ControllerPack();
        List<List<Object>> listPackVenta = new ArrayList<List<Object>>();
        listPackVenta= ctrPack.listPack(fechaInit, fechaFn);
        
        DefaultTableModel tableInformePack = (DefaultTableModel)tbl_informePack.getModel();
            tableInformePack.setRowCount(0);
            
            int rg=listPackVenta.get(0).size();
            
            for (int i = 0; i < rg; i++) {
                Object[] fila={
                  listPackVenta.get(0).get(i),
                    listPackVenta.get(1).get(i),
                    "$"+listPackVenta.get(2).get(i),
                };
            tableInformePack.addRow(fila);
            int cant=0;
            int total=0;
                for (int j = 0; j < tbl_informePack.getRowCount(); j++) {
                    cant+=Integer.parseInt((String)tbl_informePack.getValueAt(j, 1));
                    String price= (String)tbl_informePack.getValueAt(j, 2);
                    total+=Integer.parseInt((String)price.replaceAll("\\$", ""));
                }
            txt_cantidadPack.setText(Integer.toString(cant));
            txt_totalPack.setText("$" +Integer.toString(total));
            
        }
        
    }//GEN-LAST:event_btn_buscarInformePackActionPerformed

    private void btn_searchCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchCmActionPerformed
        // TODO add your handling code here:
            String day= Integer.toString(jdate_desdeComuna.getCalendar().get(Calendar.DAY_OF_MONTH)); 
            String month= Integer.toString(jdate_desdeComuna.getCalendar().get(Calendar.MONTH));
            String year= Integer.toString(jdate_desdeComuna.getCalendar().get(Calendar.YEAR));

            ArrayList<Object> fechaInit=new ArrayList<>();
            
            fechaInit.add(day);
            fechaInit.add(month);
            fechaInit.add(year);

            String day2= Integer.toString(jdate_hastaComuna.getCalendar().get(Calendar.DAY_OF_MONTH)); 
            String month2= Integer.toString(jdate_hastaComuna.getCalendar().get(Calendar.MONTH));
            String year2= Integer.toString(jdate_hastaComuna.getCalendar().get(Calendar.YEAR));

            ArrayList<Object> fechaFn=new ArrayList<>();
            fechaFn.add(day2);
            fechaFn.add(month2);
            fechaFn.add(year2);
            
            ControllerPack ctrPack = new ControllerPack();
            //ctrComuna.listComuna(fechaInit, fechaFn);
            
            DefaultComboBoxModel cmBox = (DefaultComboBoxModel)cmb_comunas.getModel();
            String comuna =(String) cmBox.getSelectedItem();
            
            List<List<Object>> listPackVenta = new ArrayList<List<Object>>();
            
            listPackVenta= ctrPack.listPack(fechaInit, fechaFn, comuna);
            
            DefaultTableModel tableInformeComunas = (DefaultTableModel)tbl_informePackComuna.getModel();
            tableInformeComunas.setRowCount(0);
            
            int rg=listPackVenta.get(0).size();
            
            for (int i = 0; i < rg; i++) {
                Object[] fila={
                  listPackVenta.get(0).get(i),
                    listPackVenta.get(1).get(i),
                    listPackVenta.get(2).get(i),
                    "$"+listPackVenta.get(3).get(i),
                };
            tableInformeComunas.addRow(fila);
            int cant=0;
            int total=0;
                for (int j = 0; j < tbl_informePackComuna.getRowCount(); j++) {
                    cant+=Integer.parseInt((String)tbl_informePackComuna.getValueAt(j, 2));
                    String price= (String)tbl_informePackComuna.getValueAt(j, 3);
                    total+=Integer.parseInt((String)price.replaceAll("\\$", ""));
                }
            txt_cantidadPackComuna.setText(Integer.toString(cant));
            txt_totalPackComuna.setText("$" +Integer.toString(total));
            
        }
        
            
            
    }//GEN-LAST:event_btn_searchCmActionPerformed

    private void cmb_comunasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cmb_comunasAncestorAdded
        // TODO add your handling code here:
        ControllerComuna ctrComuna = new ControllerComuna();
        List<List<String>> list = new ArrayList<List<String>>();
        DefaultComboBoxModel comboBox = (DefaultComboBoxModel)cmb_comunas.getModel();
        
        list=ctrComuna.listComuna();
        
        for(int i=0;i<list.get(0).size();i++){
            comboBox.addElement(list.get(1).get(i));
        }
        
    }//GEN-LAST:event_cmb_comunasAncestorAdded

    private void cmb_comunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_comunasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_comunasActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked

        try{
            Workbook wb = new XSSFWorkbook();
            org.apache.poi.ss.usermodel.Sheet sheet =wb.createSheet();
            Row rowCol = (Row) sheet.createRow(0);
            for(int i=0;i<tbl_informePackComuna.getColumnCount();i++)
            {
                Cell cell = rowCol.createCell(i);
                cell.setCellValue(tbl_informePackComuna.getColumnName(i));
            }
            for (int i = 0; i < tbl_informePackComuna.getRowCount(); i++) {
                Row row = (Row) sheet.createRow(i+1);
                for(int k=0;k<tbl_informePackComuna.getColumnCount();k++)
                {
                    Cell cell = row.createCell(k);
                    if(tbl_informePackComuna.getValueAt(i, k)!=null){
                        cell.setCellValue(tbl_informePackComuna.getValueAt(i, k).toString());
                    }
                }
                
        }
            Row rwTotal=(Row)sheet.createRow(tbl_informePackComuna.getRowCount()+1);
            Cell cell = rwTotal.createCell(tbl_informePackComuna.getRowCount());
            cell.setCellValue("Total Cantidad");
            Row rwTotal2=(Row)sheet.createRow(tbl_informePackComuna.getRowCount()+2);
            Cell cell2 = rwTotal2.createCell(tbl_informePackComuna.getRowCount());
            cell2.setCellValue(txt_cantidadPackComuna.getText());
            
            rwTotal=(Row)sheet.createRow(tbl_informePackComuna.getRowCount()+3);
            //cell mueve de izquierda a derecha 
            cell=rwTotal.createCell(tbl_informePackComuna.getRowCount()+1);
            cell.setCellValue("Total precio");
            rwTotal=(Row)sheet.createRow(tbl_informePackComuna.getRowCount()+4);
            cell=rwTotal.createCell(tbl_informePackComuna.getRowCount()+1);
            cell.setCellValue(txt_totalPackComuna.getText());
            
            FileOutputStream out = new FileOutputStream(new File("InformePorComuna.xlsx"));
            wb.write(out);
            wb.close();
            out.close();
            System.out.println(out);
            JOptionPane.showMessageDialog(rootPane, "Informe exportado");
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException io){
            System.out.println(io);
        }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        try{
            Workbook wb = new XSSFWorkbook();
            org.apache.poi.ss.usermodel.Sheet sheet =wb.createSheet();
            Row rowCol = (Row) sheet.createRow(0);
            for(int i=0;i<tbl_informePack.getColumnCount();i++)
            {
                Cell cell = rowCol.createCell(i);
                cell.setCellValue(tbl_informePack.getColumnName(i));
            }
            for (int i = 0; i < tbl_informePack.getRowCount(); i++) {
                Row row = (Row) sheet.createRow(i+1);
                for(int k=0;k<tbl_informePack.getColumnCount();k++)
                {
                    Cell cell = row.createCell(k);
                    if(tbl_informePack.getValueAt(i, k)!=null){
                        cell.setCellValue(tbl_informePack.getValueAt(i, k).toString());
                    }
                }
                
        }
            Row rwTotal=(Row)sheet.createRow(tbl_informePack.getRowCount()+1);
            Cell cell = rwTotal.createCell(tbl_informePack.getRowCount());
            cell.setCellValue("Total Cantidad");
            Row rwTotal2=(Row)sheet.createRow(tbl_informePack.getRowCount()+2);
            Cell cell2 = rwTotal2.createCell(tbl_informePack.getRowCount());
            cell2.setCellValue(txt_cantidadPack.getText());
            
            rwTotal=(Row)sheet.createRow(tbl_informePack.getRowCount()+3);
            //cell mueve de izquierda a derecha 
            cell=rwTotal.createCell(tbl_informePack.getRowCount()+1);
            cell.setCellValue("Total precio");
            rwTotal=(Row)sheet.createRow(tbl_informePack.getRowCount()+4);
            cell=rwTotal.createCell(tbl_informePack.getRowCount()+1);
            cell.setCellValue(txt_precioPack.getText());
            
            FileOutputStream out = new FileOutputStream(new File("InformePack.xlsx"));
            wb.write(out);
            wb.close();
            out.close();
            System.out.println(out);
            JOptionPane.showMessageDialog(rootPane, "Informe exportado");
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException io){
            System.out.println(io);
        }
    }//GEN-LAST:event_jLabel25MouseClicked
    //MET??DO QUE VALIDA QUE SE INGRESEN 2 NUMEROS
    private static boolean validarCod(String datos){
        return datos.matches("[0-9][1.2]");
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotoncitoCancelarBanco;
    private javax.swing.JButton BotoncitoDesactivarBanco;
    private javax.swing.JButton BotoncitoEditorBanco;
    private javax.swing.JButton BotoncitoguardarBanco;
    private javax.swing.JLabel EspacioComunasRegistradas;
    private javax.swing.JTextField EspacioLadobancos;
    private javax.swing.JTextField EspacioNombreBancos;
    private javax.swing.JFormattedTextField EspacioSearchBanco;
    private javax.swing.JButton botonCancelarRrss;
    private javax.swing.JButton botonDesactivar;
    private javax.swing.JButton botonEditarRrss;
    private javax.swing.JButton botonGuardarRrss;
    private javax.swing.JButton btn_buscarInformePack;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_desactivar;
    private javax.swing.JButton btn_desactivarPack;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_editarPack;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_guardar2;
    private javax.swing.JButton btn_guardar3;
    private javax.swing.JButton btn_searchCm;
    private javax.swing.JTextField buscarRrss;
    private javax.swing.JComboBox<String> cmb_comunas;
    private javax.swing.JTextField codigoRrss;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdate_desdeComuna;
    private com.toedter.calendar.JDateChooser jdate_desdePack;
    private com.toedter.calendar.JDateChooser jdate_hastaComuna;
    private com.toedter.calendar.JDateChooser jdate_hastaPack;
    private javax.swing.JLabel jl_buttonBack;
    private javax.swing.JLabel jl_buttonSend;
    private javax.swing.JPanel jp_pack;
    private javax.swing.JTextField nombreRrss;
    private javax.swing.JLabel searchBanco;
    private javax.swing.JLabel searchRrss;
    private javax.swing.JLabel searchUsuario;
    private javax.swing.JLabel searchUsuario1;
    private javax.swing.JTable table_rrss;
    private javax.swing.JTable tbl_articuloPack;
    private javax.swing.JTable tbl_articuloPackSelect;
    private javax.swing.JTable tbl_banco;
    private javax.swing.JTable tbl_comuna;
    private javax.swing.JTable tbl_informePack;
    private javax.swing.JTable tbl_informePackComuna;
    private javax.swing.JTable tbl_pack;
    private javax.swing.JTable tbl_usuario;
    private javax.swing.JTextField txt_buscarPack;
    private javax.swing.JTextField txt_buscarUser;
    private javax.swing.JTextField txt_cantidadPack;
    private javax.swing.JTextField txt_cantidadPackComuna;
    private javax.swing.JTextField txt_codigoComuna;
    private javax.swing.JTextField txt_comunasRegistradas;
    private javax.swing.JTextField txt_nameusuario1;
    private javax.swing.JTextField txt_nombreComuna;
    private javax.swing.JTextField txt_nombrePack;
    private javax.swing.JPasswordField txt_passw1;
    private javax.swing.JTextField txt_precioPack;
    private javax.swing.JTextField txt_totalPack;
    private javax.swing.JTextField txt_totalPackComuna;
    private javax.swing.JTextField txt_unidadesArticulo;
    private javax.swing.JPasswordField txt_verificar1;
    // End of variables declaration//GEN-END:variables
}
