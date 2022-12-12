/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface.SysAdmin;

import edu.northeastern.Business.DatabaseUtil.DB4OUtil;
import edu.northeastern.Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author altaf
 */
public class GovernmentEnterprise extends javax.swing.JPanel {

    /**
     * Creates new form GovernmentEnterprise
     */
    private final JPanel container;
    private final EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Timer timer;

    private void Time() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat timeFormat = new SimpleDateFormat("HH:mm a");
                String time = timeFormat.format(date);
                timeLabel.setText(time);
            }
        };
        timer = new Timer(100, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    public GovernmentEnterprise(EcoSystem system, JPanel container) {
        initComponents();
        this.container = container;
        this.system = system;
        Time();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        goBack = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cdcPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 190, 30));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        goBack.setBackground(new java.awt.Color(255, 255, 255));
        goBack.setPreferredSize(new java.awt.Dimension(100, 48));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBackMousePressed(evt);
            }
        });
        goBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-logout-24.png"))); // NOI18N
        goBack.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel22.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(115, 120, 128));
        jLabel22.setText("Return");
        goBack.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 290, 60));

        cdcPanel.setBackground(new java.awt.Color(255, 255, 255));
        cdcPanel.setPreferredSize(new java.awt.Dimension(100, 48));
        cdcPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cdcPanelMousePressed(evt);
            }
        });
        cdcPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-stethoscope-24.png"))); // NOI18N
        cdcPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(115, 120, 128));
        jLabel6.setText("CDC Registration");
        cdcPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(cdcPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 290, 60));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 290, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo/safe together-logos_transparent copy.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 1080));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLabel.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel.setText("3:45 PM");
        jPanel6.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel10.setText("Centre for Disease Control");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(152, 151, 151));
        jLabel1.setText("Manage everything related to Government Enterprises");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1630, 90));

        rightSidePanel.setBackground(new java.awt.Color(250, 249, 251));
        rightSidePanel.setLayout(new java.awt.CardLayout());
        jPanel1.add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1160, 750));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel8.setBackground(new java.awt.Color(245, 245, 245));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1020, -1, -1));
        jPanel9.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1020, 290, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        jLabel11.setText("Return");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 120, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/noun-exit-1365146.png"))); // NOI18N
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 190, 30));
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(100, 48));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-doctor-male-skin-type-3-48.png"))); // NOI18N
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        jLabel15.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(115, 120, 128));
        jLabel15.setText("Pandemic Centre");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 290, 60));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(100, 48));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-doctor-male-skin-type-3-48.png"))); // NOI18N
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        jLabel17.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(115, 120, 128));
        jLabel17.setText("Doctors Association");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 60));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 1080));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel18.setText("3:45 PM");
        jPanel13.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, -1));

        jLabel19.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel19.setText("Hospitals");
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel20.setForeground(new java.awt.Color(73, 84, 90));
        jLabel20.setText("Manage everything related to hospital enterprises");
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jPanel8.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1630, 100));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMousePressed
        // TODO add your handling code here:
        // Removing the container and replacing it with the system work area panel
        goBack.setBackground(new Color(213, 230, 249));
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_goBackMousePressed

    private void cdcPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdcPanelMousePressed
        // TODO add your handling code here:
        manageGovtEnterprise();
    }//GEN-LAST:event_cdcPanelMousePressed

    private void manageGovtEnterprise() {
        cdcPanel.setBackground(new Color(213, 230, 249));
//        PandemicTestCentreJPanel.setBackground(new Color(255,255,255));
//        PandemicTestCentreJPanel.setBackground(new Color(255,255,255));
        GovernmentRegistration gov = new GovernmentRegistration(container, system);
        rightSidePanel.add(gov);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cdcPanel;
    private javax.swing.JPanel goBack;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}