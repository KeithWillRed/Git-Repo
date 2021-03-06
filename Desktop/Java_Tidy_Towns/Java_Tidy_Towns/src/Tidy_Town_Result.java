/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.sun.glass.events.KeyEvent;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author home
 */
public class Tidy_Town_Result extends javax.swing.JFrame {

    /**
     * Creates new form Tidy_Town_Result
     */
    public Tidy_Town_Result() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jtxtJudgeID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTown = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtCat1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtCat2 = new javax.swing.JTextField();
        jtxtCat3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtCat4 = new javax.swing.JTextField();
        jtxtCat5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtCat6 = new javax.swing.JTextField();
        jtxtCat7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtCat8 = new javax.swing.JTextField();
        jcbCounty = new javax.swing.JComboBox<>();
        jcbPopulation = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnSubmit = new javax.swing.JButton();
        jbtExit = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tidy Town Result System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), "Town Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Judge ID:");

        jtxtJudgeID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("County:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Town:");

        jtxtTown.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Population:");

        jtxtCat1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCat1ActionPerformed(evt);
            }
        });
        jtxtCat1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCat1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("1. Community Involvement & Planning :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("2. Built Environment & Streetscape:");

        jtxtCat2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtCat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCat2ActionPerformed(evt);
            }
        });
        jtxtCat2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCat2KeyTyped(evt);
            }
        });

        jtxtCat3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtCat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCat3ActionPerformed(evt);
            }
        });
        jtxtCat3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCat3KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("3. Landscaping & Open Spaces:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("4. Wildlife, Habitats & Natural Amenities:");

        jtxtCat4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtCat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCat4ActionPerformed(evt);
            }
        });
        jtxtCat4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCat4KeyTyped(evt);
            }
        });

        jtxtCat5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtCat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCat5ActionPerformed(evt);
            }
        });
        jtxtCat5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCat5KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("5. Tidiness & Litter Control:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("6. Sustainable Waste & Resource Management :");

        jtxtCat6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtCat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCat6ActionPerformed(evt);
            }
        });
        jtxtCat6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCat6KeyTyped(evt);
            }
        });

        jtxtCat7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtCat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCat7ActionPerformed(evt);
            }
        });
        jtxtCat7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCat7KeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("8. Residential Streets & Housing Areas:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("7. Approach Roads, Streets & Lanes:");

        jtxtCat8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtCat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCat8ActionPerformed(evt);
            }
        });
        jtxtCat8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCat8KeyTyped(evt);
            }
        });

        jcbCounty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcbCounty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", "Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow" }));

        jcbPopulation.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcbPopulation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category A", "Category B", "Category C", "Category D", "Category E", "Category F", "Category G", "Category H" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Total Score:");

        jtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbCounty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtJudgeID)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbPopulation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtTown))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtCat7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jtxtCat6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCat5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCat4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCat3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCat2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCat1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCat8))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtCat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtCat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtCat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtCat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtCat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtCat6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCat7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCat8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtJudgeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbCounty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11))
                            .addComponent(jLabel13)
                            .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1140, 440));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judge ID", "County", "Town", "Population", "Cat 1", "Cat 2", "Cat 3", "Cat 4", "Cat 5", "Cat 6", "Cat 7", "Cat 8", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 1140, 90));

        jbtnSubmit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnSubmit.setText("Submit");
        jbtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jbtExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtExit.setText("Exit");
        jbtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, -1));

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Delete button to remove row in table
    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1) {
            if(jTable1.getRowCount()==0) {
                
                JOptionPane.showMessageDialog(null, "No data to delete ",
                        "Tidy Town Score System",JOptionPane.OK_OPTION);
            }else{
                
                JOptionPane.showMessageDialog(null, "Select a row to delete ",
                        "Tidy Town Score System",JOptionPane.OK_OPTION);
            }
        }else{
            model.removeRow(jTable1.getSelectedRow());
            
        }
        
    }//GEN-LAST:event_jbtnDeleteActionPerformed
        // Clear Text Fields - Not Working but should ??
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed

            JTextField temp=null;
        for(Component c:jPanel1.getComponents()){
//            System.out.print(c.getClass().toString());
          if(c.getClass().toString().contains("javax.swing.JTextField")){
              temp=(JTextField)c;
              temp.setText("");
          }  
        }

    }//GEN-LAST:event_jbtnResetActionPerformed
private JFrame frame; // Exit Prompt
    private void jbtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you wish to exit", "Tidy Town Scoring System",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtExitActionPerformed

    private void jtxtCat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCat5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCat5ActionPerformed

    // Submit Button - Stores input into an array 
    private void jbtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubmitActionPerformed
        double[] S = new double[10];
        
        S[0] = Double.parseDouble(jtxtCat1.getText());
        S[1] = Double.parseDouble(jtxtCat2.getText());
        S[2] = Double.parseDouble(jtxtCat3.getText());
        S[3] = Double.parseDouble(jtxtCat4.getText());
        S[4] = Double.parseDouble(jtxtCat5.getText());
        S[5] = Double.parseDouble(jtxtCat6.getText());
        S[6] = Double.parseDouble(jtxtCat7.getText());
        S[7] = Double.parseDouble(jtxtCat8.getText());
        
        // Stores total score in array [8]
        S[8] = S[0] + S[1] + S[2] + S[3] + S[4] + S[5] + S[6] + S[7];
        
        String Total = String.format("%.0f",S[8]);
        jtxtTotal.setText(Total);
        
        //Displays the text Input into the table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            
            jtxtJudgeID.getText(),
            jcbCounty.getSelectedItem(),
            jtxtTown.getText(),
            jcbPopulation.getSelectedItem(),
            jtxtCat1.getText(),
            jtxtCat2.getText(),
            jtxtCat3.getText(),
            jtxtCat4.getText(),
            jtxtCat5.getText(),
            jtxtCat6.getText(),
            jtxtCat7.getText(),
            jtxtCat8.getText(),
            jtxtTotal.getText()
            
                
        });
    }//GEN-LAST:event_jbtnSubmitActionPerformed

    //Ignore CatAction mistakingly selected ActionPerformed rather than KeyTyped
    private void jtxtCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCat1ActionPerformed
       
    }//GEN-LAST:event_jtxtCat1ActionPerformed

    private void jtxtCat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCat2ActionPerformed

    private void jtxtCat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCat3ActionPerformed

    private void jtxtCat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCat4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCat4ActionPerformed

    private void jtxtCat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCat6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCat6ActionPerformed

    private void jtxtCat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCat7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCat7ActionPerformed

    private void jtxtCat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCat8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCat8ActionPerformed

    
    
    //Only allows the input of numbers into the text field
    private void jtxtCat1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCat1KeyTyped
        char iNumber = evt.getKeyChar();
      if((!(Character.isDigit(iNumber)) && iNumber < 60 )
      ||(iNumber == KeyEvent.VK_BACKSPACE)
      ||(iNumber == KeyEvent.VK_DELETE)){
          evt.consume();
      }
    }//GEN-LAST:event_jtxtCat1KeyTyped

    private void jtxtCat2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCat2KeyTyped
        char iNumber = evt.getKeyChar();
      if(!(Character.isDigit(iNumber))
      ||(iNumber == KeyEvent.VK_BACKSPACE)
      ||(iNumber == KeyEvent.VK_DELETE)){
          evt.consume();
      }
    }//GEN-LAST:event_jtxtCat2KeyTyped

    private void jtxtCat3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCat3KeyTyped
             char iNumber = evt.getKeyChar();
      if(!(Character.isDigit(iNumber))
      ||(iNumber == KeyEvent.VK_BACKSPACE)
      ||(iNumber == KeyEvent.VK_DELETE)){
          evt.consume();
      }
    }//GEN-LAST:event_jtxtCat3KeyTyped

    private void jtxtCat4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCat4KeyTyped
                char iNumber = evt.getKeyChar();
      if(!(Character.isDigit(iNumber))
      ||(iNumber == KeyEvent.VK_BACKSPACE)
      ||(iNumber == KeyEvent.VK_DELETE)){
          evt.consume();
      }
    }//GEN-LAST:event_jtxtCat4KeyTyped

    private void jtxtCat5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCat5KeyTyped
                char iNumber = evt.getKeyChar();
      if(!(Character.isDigit(iNumber))
      ||(iNumber == KeyEvent.VK_BACKSPACE)
      ||(iNumber == KeyEvent.VK_DELETE)){
          evt.consume();
      }
    }//GEN-LAST:event_jtxtCat5KeyTyped

    private void jtxtCat6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCat6KeyTyped
                char iNumber = evt.getKeyChar();
      if(!(Character.isDigit(iNumber))
      ||(iNumber == KeyEvent.VK_BACKSPACE)
      ||(iNumber == KeyEvent.VK_DELETE)){
          evt.consume();
      }
    }//GEN-LAST:event_jtxtCat6KeyTyped

    private void jtxtCat7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCat7KeyTyped
                char iNumber = evt.getKeyChar();
      if(!(Character.isDigit(iNumber))
      ||(iNumber == KeyEvent.VK_BACKSPACE)
      ||(iNumber == KeyEvent.VK_DELETE)){
          evt.consume();
      }
    }//GEN-LAST:event_jtxtCat7KeyTyped

    private void jtxtCat8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCat8KeyTyped
                char iNumber = evt.getKeyChar();
      if(!(Character.isDigit(iNumber))
      ||(iNumber == KeyEvent.VK_BACKSPACE)
      ||(iNumber == KeyEvent.VK_DELETE)){
          evt.consume();
      }
    }//GEN-LAST:event_jtxtCat8KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Tidy_Town_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tidy_Town_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tidy_Town_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tidy_Town_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Button Design
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tidy_Town_Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtExit;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSubmit;
    private javax.swing.JComboBox<String> jcbCounty;
    private javax.swing.JComboBox<String> jcbPopulation;
    private javax.swing.JTextField jtxtCat1;
    private javax.swing.JTextField jtxtCat2;
    private javax.swing.JTextField jtxtCat3;
    private javax.swing.JTextField jtxtCat4;
    private javax.swing.JTextField jtxtCat5;
    private javax.swing.JTextField jtxtCat6;
    private javax.swing.JTextField jtxtCat7;
    private javax.swing.JTextField jtxtCat8;
    private javax.swing.JTextField jtxtJudgeID;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JTextField jtxtTown;
    // End of variables declaration//GEN-END:variables
}

