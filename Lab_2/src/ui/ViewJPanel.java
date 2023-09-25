/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSignHistory;
import model.VitalSigns;

/**
 *
 * @author kusumanth
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    VitalSignHistory history; 
    public ViewJPanel(VitalSignHistory history) {
        initComponents();
        this.history=history;
        
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblVitals = new javax.swing.JTable();
        BtnView = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        LblTemperature = new javax.swing.JLabel();
        LblPressure = new javax.swing.JLabel();
        LblPulse = new javax.swing.JLabel();
        LblDate = new javax.swing.JLabel();
        TxtTemperature = new javax.swing.JTextField();
        TxtPressure = new javax.swing.JTextField();
        TxtPulse = new javax.swing.JTextField();
        TxtDate = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("View Vital Signs");

        TblVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Temperature", "Pulse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblVitals);

        BtnView.setText("View");
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        LblTemperature.setText("Temperature");

        LblPressure.setText("Blood Pressure");

        LblPulse.setText("Pulse");

        LblDate.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(503, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblPressure)
                                    .addComponent(LblTemperature)
                                    .addComponent(LblPulse)
                                    .addComponent(LblDate))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtTemperature)
                                    .addComponent(TxtPressure)
                                    .addComponent(TxtPulse)
                                    .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BtnView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(BtnDelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnView)
                    .addComponent(BtnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTemperature)
                    .addComponent(TxtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPressure)
                    .addComponent(TxtPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPulse)
                    .addComponent(TxtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDate)
                    .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
        int selcetedRowIndex =TblVitals.getSelectedRow();
        if(selcetedRowIndex <0){
            JOptionPane.showMessageDialog(this, "please select a row to view");
            return;
        }
        
        DefaultTableModel model=(DefaultTableModel) TblVitals.getModel();
        VitalSigns selectedVitals =(VitalSigns)model.getValueAt(selcetedRowIndex,0);
        
        TxtTemperature.setText(String.valueOf(selectedVitals.getTemperature()));
        TxtPressure.setText(String.valueOf(selectedVitals.getBloodpressure()));
        TxtPulse.setText(String.valueOf(selectedVitals.getPulse()));
        TxtDate.setText(selectedVitals.getDate());
        
        
        
    }//GEN-LAST:event_BtnViewActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        int selcetedRowIndex =TblVitals.getSelectedRow();
        if(selcetedRowIndex <0){
            JOptionPane.showMessageDialog(this, "please select a row to delete");
            return;
        }
        
        DefaultTableModel model=(DefaultTableModel) TblVitals.getModel();
        VitalSigns selectedVitals =(VitalSigns)model.getValueAt(selcetedRowIndex,0);
          
        history.deletevitals(selectedVitals);
        JOptionPane.showMessageDialog(this,"Vital Signs deleted");
        populateTable();
        TxtTemperature.setText("");
        TxtPressure.setText("");
        TxtPulse.setText("");
        TxtDate.setText("");
        
        
    }//GEN-LAST:event_BtnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnView;
    private javax.swing.JLabel LblDate;
    private javax.swing.JLabel LblPressure;
    private javax.swing.JLabel LblPulse;
    private javax.swing.JLabel LblTemperature;
    private javax.swing.JTable TblVitals;
    private javax.swing.JTextField TxtDate;
    private javax.swing.JTextField TxtPressure;
    private javax.swing.JTextField TxtPulse;
    private javax.swing.JTextField TxtTemperature;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model=(DefaultTableModel) TblVitals.getModel();
        model.setRowCount(0);
        
        for(VitalSigns vs : history.getHistory()){
            Object[] row =new Object[3];
            row[0]=vs;
            row[1]=vs.getTemperature();
            row[2]=vs.getPulse();
            
            model.addRow(row);

                    }
            
        }
        
    }
