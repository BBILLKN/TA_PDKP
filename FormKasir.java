/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BILL_0058
 */
public class FormKasir extends javax.swing.JFrame {

    /**
     * Creates new form FormKasir
     */
    NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    public FormKasir() {
        initComponents();
        KodeBarang();
        Total();
        Diskon();
        bayar();
    }
    
    private void bayar(){
        txtBayar.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int bayar, total, kembali;
                bayar = Integer.parseInt(txtBayar.getText().replace("", "")) - Integer.parseInt(txtTotalBayar.getText().replace(".", ""));
                
                txtKembali.setText(nf.format(bayar));
                lblJumlahHarga.setText("Rp. " + nf.format(bayar));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void Diskon(){
        txtDiskon.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int diskon, hasil_diskon;
                diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText().replace("", "")) / 100;        
                hasil_diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", ""))
                - diskon;        
                txtHasilDiskon.setText(nf.format(diskon));
                
        
                // total bersih      
                int totalBersih;
                totalBersih = hasil_diskon;
                txtTotalBayar.setText(nf.format(totalBersih));
                lblJumlahHarga.setText("Rp. " + nf.format(totalBersih));
                
                
                    }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void Total(){
        txtQTY.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try {
                    int hasil = 0;
                    if (txtQTY.getText().equals("")){
                     hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * 0;
                    }else{
                     hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * 
                             Integer.parseInt(txtQTY.getText());
                    }
                    txtTotalHarga.setText(nf.format(hasil));
                } catch (Exception e){
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                try {
                    int hasil = 0;
                    if (txtQTY.getText().equals("")){
                     hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * 0;
                    }else{
                     hasil = Integer.parseInt(txtHarga.getText().replace(".", "")) * 
                             Integer.parseInt(txtQTY.getText());
                    }
                    txtTotalHarga.setText(nf.format(hasil));
                } catch (Exception e){
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    private void KodeBarang(){
        txtKodeBarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String KodeBarang;
                KodeBarang = (String) txtKodeBarang.getText();
                
                switch(KodeBarang){
                    case "0001" :
                        txtNamaBarang.setText("Asus TUF F15 FX506LH");
                        txtHarga.setText(nf.format(11500000));
                        txtQTY.grabFocus();
                        break;
                    case "0002" :
                        txtNamaBarang.setText("Mouse Fantech Blake X17");
                        txtHarga.setText(nf.format(215000));
                        txtQTY.grabFocus();
                        break;
                    case "0003" :
                        txtNamaBarang.setText("Keyboard Fantech MAXFIT61");
                        txtHarga.setText(nf.format(450000));
                        txtQTY.grabFocus();
                        break;
                    case "0004" :
                        txtNamaBarang.setText("iPad Air 4 64GB Wifi-only");
                        txtHarga.setText(nf.format(7000000));
                        txtQTY.grabFocus();
                        break;
                    case "0005" :
                        txtNamaBarang.setText("Printer Epson L380");
                        txtHarga.setText(nf.format(2000000));
                        txtQTY.grabFocus();
                        break;
                    case "0006" :
                        txtNamaBarang.setText("Mouse Wireless Logitech");
                        txtHarga.setText(nf.format(150000));
                        txtQTY.grabFocus();
                        break;
                    default:
                        txtNamaBarang.setText("");
                        txtHarga.setText("");
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String KodeBarang;
                KodeBarang = (String) txtKodeBarang.getText();
                
                switch(KodeBarang){ 
                    case "0001" :
                        txtNamaBarang.setText("Asus TUF F15 FX506LH");
                        txtHarga.setText(nf.format(11500000));
                        txtQTY.grabFocus();
                        break;
                    case "0002" :
                        txtNamaBarang.setText("Mouse Fantech Blake X17");
                        txtHarga.setText(nf.format(215000));
                        txtQTY.grabFocus();
                        break;
                    case "0003" :
                        txtNamaBarang.setText("Keyboard Fantech MAXFIT61");
                        txtHarga.setText(nf.format(450000));
                        txtQTY.grabFocus();
                        break;
                    case "0004" :
                        txtNamaBarang.setText("iPad Air 4 64GB Wifi-only");
                        txtHarga.setText(nf.format(7000000));
                        txtQTY.grabFocus();
                        break;
                    case "0005" :
                        txtNamaBarang.setText("Printer Epson L380");
                        txtHarga.setText(nf.format(2000000));
                        txtQTY.grabFocus();
                        break;
                    case "0006" :
                        txtNamaBarang.setText("Mouse Wireless Logitech");
                        txtHarga.setText(nf.format(150000));
                        txtQTY.grabFocus();
                        break;
                    default:
                        txtNamaBarang.setText("");
                        txtHarga.setText("");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblJumlahHarga = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKodeBarang = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtQTY = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtJumlahHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHasilDiskon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalBayar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblJmlQTY = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblbayar = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtKembali = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJumlahHarga.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        lblJumlahHarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJumlahHarga.setText("Rp.");
        lblJumlahHarga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel3.setText("Nama Barang");

        txtKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeBarangActionPerformed(evt);
            }
        });

        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });

        txtHarga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });

        txtTotalHarga.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNamaBarang))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtKodeBarang)))
                .addGap(14, 14, 14)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        tblList.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Harga", "QTY", "Total Harga"
            }
        ));
        jScrollPane1.setViewportView(tblList);
        if (tblList.getColumnModel().getColumnCount() > 0) {
            tblList.getColumnModel().getColumn(0).setMinWidth(50);
            tblList.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblList.getColumnModel().getColumn(0).setMaxWidth(50);
            tblList.getColumnModel().getColumn(1).setMinWidth(100);
            tblList.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblList.getColumnModel().getColumn(1).setMaxWidth(100);
            tblList.getColumnModel().getColumn(2).setMinWidth(350);
            tblList.getColumnModel().getColumn(2).setPreferredWidth(350);
            tblList.getColumnModel().getColumn(2).setMaxWidth(350);
            tblList.getColumnModel().getColumn(4).setMinWidth(50);
            tblList.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblList.getColumnModel().getColumn(4).setMaxWidth(50);
        }

        jLabel4.setText("Jumlah Harga");

        jLabel5.setText("Diskon");

        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        jLabel6.setText("%");

        txtHasilDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHasilDiskonActionPerformed(evt);
            }
        });

        jLabel7.setText("Total Harga");
        jLabel7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel7ComponentHidden(evt);
            }
        });

        jLabel8.setText("Item Yang Dibeli :");

        lblJmlQTY.setText("0");

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 48)); // NOI18N
        jLabel1.setText("GFG CELL");

        lblbayar.setText("Bayar");

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        txtBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBayarKeyReleased(evt);
            }
        });

        jLabel9.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJmlQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHasilDiskon, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addComponent(txtJumlahHarga)
                            .addComponent(txtTotalBayar))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblbayar)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtKembali)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                                .addComponent(lblJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJumlahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lblJmlQTY)
                    .addComponent(lblbayar)
                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHasilDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1065, 681));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        // TODO add your handling code here:
        if (txtQTY.getText().equals("")){
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel) tblList.getModel();
            
            Object obj [] = new Object[6];
            obj [1] = txtKodeBarang.getText();
            obj [2] = txtNamaBarang.getText();
            obj [3] = txtHarga.getText();
            obj [4] = txtQTY.getText();
            obj [5] = txtTotalHarga.getText();
            
            model.addRow(obj);
            
            int baris = model.getRowCount();
            for(int a = 0; a < baris; a ++){
                String no = String.valueOf(a + 1);
                model.setValueAt(no + ".", a, 0);
            }
            
            tblList.setRowHeight(30);
            
            lblJmlQTY.setText(String.valueOf(baris));
            
            jmlTotalHarga();
            bayar();
            bersih();
            
            
           
        }
    }//GEN-LAST:event_txtQTYActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

    private void txtHasilDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHasilDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHasilDiskonActionPerformed

    private void jLabel7ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel7ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7ComponentHidden

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        // TODO add your handling code here:
        /*int bayar, total, kembali;
        bayar = Integer.parseInt(txtBayar.getText());
        total = Integer.parseInt(txtTotalBayar.getText());
        kembali = total-bayar;
        txtKembali.setText("Rp." + nf.format(kembali)); */
    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBayarKeyReleased
        // TODO add your handling code here:
      /*  int bayar, total, kembali;
        bayar=Integer.parseInt(txtBayar.getText());
        total=Integer.parseInt(txtTotalBayar.getText());
        kembali=bayar-total;
        txtKembali.setText(""+c);/*
    }//GEN-LAST:event_txtBayarKeyReleased

    private void txtKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeBarangActionPerformed

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
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJmlQTY;
    private javax.swing.JLabel lblJumlahHarga;
    private javax.swing.JLabel lblbayar;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtHasilDiskon;
    private javax.swing.JTextField txtJumlahHarga;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtTotalBayar;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables

    private void jmlTotalHarga() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int sub_total = 0;
        for(int a = 0; a < tblList.getRowCount(); a ++){
            sub_total += Integer.parseInt((String) 
                    tblList.getValueAt(a, 5).toString().replace(".", ""));
        }
        
        txtJumlahHarga.setText(nf.format(sub_total));
        
        // diskon
        int diskon, hasil_diskon;
        diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText().replace("", "0")) / 100;        
        hasil_diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", ""))
                - diskon;
        
        
        // total bersih
        int totalBersih;
        totalBersih = hasil_diskon;
        txtTotalBayar.setText(nf.format(totalBersih));
        lblJumlahHarga.setText("Rp. " + nf.format(totalBersih));
        
        
    }

    private void bayar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int bayar, total, kembali;
        bayar = Integer.parseInt(txtBayar.getText().replace("", "0")) - Integer.parseInt(txtTotalBayar.getText().replace(".", ""));
        
        txtKembali.setText(nf.format(bayar));
        lblJumlahHarga.setText("Rp. " + nf.format(bayar));
    }
    
    private void bersih(){
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        txtKodeBarang.setText("");
        txtKodeBarang.grabFocus();
        txtQTY.setText("");
        txtTotalHarga.setText("");
    }


}
 
