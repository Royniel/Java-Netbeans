/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200;

import edu.neu.csye6200.model.Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kedar
 */
public class BillingModule extends javax.swing.JFrame {

    /**
     * Creates new form BillingModule
     */
    private static final double SERVICE_UTILITIES_COST = 100.0;
    private static final double XRAY_CHARGES_COST = 200.0;
    private static final double EMERGENCY_CARE_COST = 300.0;
    private static final double DOCTOR_FEES_COST = 400.0;
    private static final double BLOOD_REPORT_COST = 150.0;
    private static final double[] MEDICATION_CHARGES_COSTS = {50.0, 75.0, 100.0, 125.0, 150.0};
    private static final double TAX_RATE = 0.10; // 10% Tax
    
    private final Random random = new Random();

    
    public BillingModule() {
        initComponents();
        setupActionListeners();
        loadBillingData();
    }
    
    private void loadBillingData() {
    String sql = "SELECT * FROM billing_info";
    try (Connection conn = Control.getConnection();
         Statement stmt  = conn.createStatement();
         ResultSet rs    = stmt.executeQuery(sql)) {
        
        DefaultTableModel model = (DefaultTableModel) table_from_search.getModel();
        model.setRowCount(0); // Clear existing data

        while (rs.next()) {
            // Matching column names from DB abd fetching data
            model.addRow(new Object[]{
                rs.getString("patient_name"),
                rs.getString("service_description"),
                rs.getDouble("tax_amount"),
                rs.getDouble("total_amount"),
                rs.getString("payment_status"),
                rs.getString("billing_date")
            });
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_from_search = new javax.swing.JTable();
        Billing_of_patient = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        id_title = new javax.swing.JLabel();
        pIDinput = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Service_Utilities = new javax.swing.JCheckBox();
        medicationCharges = new javax.swing.JCheckBox();
        xrayCharges = new javax.swing.JCheckBox();
        emergencyCare = new javax.swing.JCheckBox();
        doctor_fees = new javax.swing.JCheckBox();
        Blood_report = new javax.swing.JCheckBox();
        updateBill = new javax.swing.JButton();
        checkIfpaid = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 500));

        table_from_search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Description", "Tax / VAT", "Total Amount", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_from_search);

        Billing_of_patient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Billing_of_patient.setForeground(new java.awt.Color(102, 102, 102));
        Billing_of_patient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Billing_of_patient.setText("Billing Portal");
        Billing_of_patient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Billing_of_patient.setPreferredSize(new java.awt.Dimension(30, 30));

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 153, 255));
        backButton.setText("Back to Dashboard");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        id_title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        id_title.setText("Patient ID");

        pIDinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pIDinputActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(51, 153, 255));
        search.setText("Show");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Service_Utilities.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Service_Utilities.setText("Service Utilities");

        medicationCharges.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medicationCharges.setText("Medication Charges");
        medicationCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicationChargesActionPerformed(evt);
            }
        });

        xrayCharges.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xrayCharges.setText("Xray Charges");

        emergencyCare.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emergencyCare.setText("Emergency Care");
        emergencyCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyCareActionPerformed(evt);
            }
        });

        doctor_fees.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        doctor_fees.setText("Doctor Fees");
        doctor_fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_feesActionPerformed(evt);
            }
        });

        Blood_report.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Blood_report.setText("Blood Report");
        Blood_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Blood_reportActionPerformed(evt);
            }
        });

        updateBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateBill.setForeground(new java.awt.Color(51, 153, 255));
        updateBill.setText("Update Bill");
        updateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBillActionPerformed(evt);
            }
        });

        checkIfpaid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkIfpaid.setText("Check IF Paid");
        checkIfpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIfpaidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(718, 718, 718)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(id_title)
                        .addGap(71, 71, 71)
                        .addComponent(pIDinput, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Blood_report)
                            .addComponent(doctor_fees)
                            .addComponent(Service_Utilities))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xrayCharges)
                            .addComponent(medicationCharges)
                            .addComponent(emergencyCare))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(checkIfpaid))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(updateBill))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(Billing_of_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Billing_of_patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(medicationCharges)
                                    .addComponent(checkIfpaid))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(xrayCharges)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(emergencyCare))
                                    .addComponent(updateBill)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Service_Utilities)
                                .addGap(14, 14, 14)
                                .addComponent(Blood_report)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doctor_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_title)
                            .addComponent(pIDinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search))))
                .addGap(124, 124, 124))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
 private void setupActionListeners() {
        ActionListener updateListener = (ActionEvent e) -> {
            updateBill();
        };

        
        Service_Utilities.addActionListener(updateListener);
        medicationCharges.addActionListener(updateListener);
        xrayCharges.addActionListener(updateListener);
        emergencyCare.addActionListener(updateListener);
        doctor_fees.addActionListener(updateListener);
        Blood_report.addActionListener(updateListener);
        checkIfpaid.addActionListener(updateListener); // If this affects billing

      
        updateBill.addActionListener((ActionEvent e) -> {
            updateBill();
        });

        // Listener for the search button
        search.addActionListener((ActionEvent e) -> {
            searchPatient();
        });

        // Listener for the back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBackToDashboard(); // You need to implement this method
            }
        });
    } 
    private void goBackToDashboard(){
       Dashboard dashboard= new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }
    private void searchPatient() {
        String patientIdInput = pIDinput.getText().trim();

        // Checking if the input is empty or invalid
        if (patientIdInput.isEmpty() || !patientIdInput.matches("\\d+")) {
            System.out.println("Invalid or empty patient ID");
            return;
        }

        int patientId = Integer.parseInt(patientIdInput);
        String sql = "SELECT * FROM billing_info WHERE patient_id = ?";

        try (Connection conn = Control.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, patientId);

            try (ResultSet rs = pstmt.executeQuery()) {
                DefaultTableModel model = (DefaultTableModel) table_from_search.getModel();
                model.setRowCount(0); // Clear existing data

                if (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("patient_name"),
                        rs.getString("service_description"),
                        rs.getDouble("tax_amount"),
                        rs.getDouble("total_amount"),
                        rs.getString("payment_status"),
                        rs.getString("billing_date")
                    });
                } else {
                    System.out.println("No patient found with ID: " + patientId);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error during database query: " + e.getMessage());
        }
}

    private void updateBill() {
        String patientIdStr = pIDinput.getText().trim();
        if (patientIdStr.isEmpty() || !patientIdStr.matches("\\d+")) {
            System.out.println("Invalid patient ID");
            return;
        }
        int patientId = Integer.parseInt(patientIdStr);

        double subtotal = calculateSubtotal();
        double taxAmount = subtotal * TAX_RATE;
        double totalCost = subtotal + taxAmount;
        String status = checkIfpaid.isSelected() ? "Paid" : "Unpaid";

        updateBillingData(patientId, totalCost, status);
    }

    private void updateBillingData(int patientId, double totalAmount, String paymentStatus) {
        String sql = "UPDATE billing_info SET total_amount = ?, payment_status = ? WHERE patient_id = ?";

        try (Connection conn = Control.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, totalAmount);
            pstmt.setString(2, paymentStatus);
            pstmt.setInt(3, patientId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     private double calculateSubtotal() {
        double subtotal = 0.0;
        if (Service_Utilities.isSelected()) subtotal += SERVICE_UTILITIES_COST;
        if (xrayCharges.isSelected()) subtotal += XRAY_CHARGES_COST;
        if (emergencyCare.isSelected()) subtotal += EMERGENCY_CARE_COST;
        if (doctor_fees.isSelected()) subtotal += DOCTOR_FEES_COST;
        if (Blood_report.isSelected()) subtotal += BLOOD_REPORT_COST;
        if (medicationCharges.isSelected()) {
            int index = random.nextInt(MEDICATION_CHARGES_COSTS.length);
            subtotal += MEDICATION_CHARGES_COSTS[index];
    }
    return subtotal;
}
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void pIDinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pIDinputActionPerformed
        // TODO add your handling code here:
        searchPatient();
    }//GEN-LAST:event_pIDinputActionPerformed

    private void medicationChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicationChargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicationChargesActionPerformed

    private void emergencyCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyCareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergencyCareActionPerformed

    private void doctor_feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_feesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctor_feesActionPerformed

    private void Blood_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Blood_reportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Blood_reportActionPerformed

    private void checkIfpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIfpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkIfpaidActionPerformed

    private void updateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBillActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(BillingModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Billing_of_patient;
    private javax.swing.JCheckBox Blood_report;
    private javax.swing.JCheckBox Service_Utilities;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox checkIfpaid;
    private javax.swing.JCheckBox doctor_fees;
    private javax.swing.JCheckBox emergencyCare;
    private javax.swing.JLabel id_title;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox medicationCharges;
    private javax.swing.JTextField pIDinput;
    private javax.swing.JButton search;
    private javax.swing.JTable table_from_search;
    private javax.swing.JButton updateBill;
    private javax.swing.JCheckBox xrayCharges;
    // End of variables declaration//GEN-END:variables
}
