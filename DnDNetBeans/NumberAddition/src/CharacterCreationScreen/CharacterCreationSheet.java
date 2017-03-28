/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterCreationScreen;

import dice.d6;

/**
 *
 * @author cookd
 */
public class CharacterCreationSheet extends javax.swing.JFrame {

    /**
     * Creates new form CharacterCreationSheet
     */
    public CharacterCreationSheet() {
        initComponents();
    }
    private int hitDieMax;
    private int strBaseVal = 0;
    private int dexBaseVal = 0;
    private int conBaseVal = 0;
    private int intBaseVal = 0;
    private int wisBaseVal = 0;
    private int chaBaseVal = 0;
    private int strBonus = 0;
    private int dexBonus = 0;
    private int conBonus = 0;
    private int intBonus = 0;
    private int wisBonus = 0;
    private int chaBonus = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        rollButton = new javax.swing.JButton();
        takeStandardButton = new javax.swing.JButton();
        subRaceSelector = new javax.swing.JComboBox<>();
        subRaceLabel = new javax.swing.JLabel();
        raceSelector = new javax.swing.JComboBox<>();
        classSelector = new javax.swing.JComboBox<>();
        classLabel = new javax.swing.JLabel();
        raceLabel = new javax.swing.JLabel();
        hitPointsLabel = new javax.swing.JLabel();
        hpValue = new javax.swing.JTextField();
        statsTab = new javax.swing.JTabbedPane();
        statsTabPanel = new javax.swing.JPanel();
        chaModField = new javax.swing.JTextField();
        charismaField = new javax.swing.JTextField();
        charismaLabel = new javax.swing.JLabel();
        wisdomLabel = new javax.swing.JLabel();
        intellectLabel = new javax.swing.JLabel();
        constitutionLabel = new javax.swing.JLabel();
        dexterityLabel = new javax.swing.JLabel();
        strengthLabel = new javax.swing.JLabel();
        strengthField = new javax.swing.JTextField();
        strModField = new javax.swing.JTextField();
        modifierLabel = new javax.swing.JLabel();
        dexterityField = new javax.swing.JTextField();
        dexModField = new javax.swing.JTextField();
        constitutionField = new javax.swing.JTextField();
        conModField = new javax.swing.JTextField();
        intellectField = new javax.swing.JTextField();
        intModField = new javax.swing.JTextField();
        wisdomField = new javax.swing.JTextField();
        wisModField = new javax.swing.JTextField();
        strRaceBonus = new javax.swing.JTextField();
        racialBonusLabel = new javax.swing.JLabel();
        dexRaceBonus = new javax.swing.JTextField();
        conRaceBonus = new javax.swing.JTextField();
        intRaceBonus = new javax.swing.JTextField();
        wisRaceBonus = new javax.swing.JTextField();
        chaRaceBonus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        racialAdjustmentsTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name");

        name.setText("Enter your name");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        rollButton.setText("Roll");
        rollButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rollButtonMouseClicked(evt);
            }
        });

        takeStandardButton.setText("Take Standard");
        takeStandardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                takeStandardButtonMouseClicked(evt);
            }
        });

        subRaceSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One" }));
        subRaceSelector.setEnabled(false);

        subRaceLabel.setText("Sub-Race");

        raceSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One", "Human", "Elf", "Dwarf", "Halfling" }));
        raceSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raceSelectorActionPerformed(evt);
            }
        });
        raceSelector.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                raceSelectorPropertyChange(evt);
            }
        });

        classSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One", "Fighter", "Rogue", "Paladin", "Wizard", "Cleric" }));
        classSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classSelectorActionPerformed(evt);
            }
        });
        classSelector.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                classSelectorPropertyChange(evt);
            }
        });

        classLabel.setText("Class");

        raceLabel.setText("Race");

        hitPointsLabel.setText("Hit Points");

        hpValue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hpValue.setText("0");
        hpValue.setToolTipText("");
        hpValue.setEnabled(false);

        chaModField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        chaModField.setText("0");
        chaModField.setEnabled(false);

        charismaField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        charismaField.setText("0");
        charismaField.setToolTipText("");
        charismaField.setEnabled(false);

        charismaLabel.setText("Charisma");

        wisdomLabel.setText("Wisdom");

        intellectLabel.setText("Intellect");

        constitutionLabel.setText("Constitution");

        dexterityLabel.setText("Dexterity");

        strengthLabel.setText("Strength");

        strengthField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        strengthField.setText("0");
        strengthField.setToolTipText("");
        strengthField.setEnabled(false);

        strModField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        strModField.setText("0");
        strModField.setToolTipText("");
        strModField.setEnabled(false);

        modifierLabel.setText("Modifier");

        dexterityField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dexterityField.setText("0");
        dexterityField.setEnabled(false);

        dexModField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dexModField.setText("0");
        dexModField.setEnabled(false);

        constitutionField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        constitutionField.setText("0");
        constitutionField.setToolTipText("");
        constitutionField.setEnabled(false);

        conModField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        conModField.setText("0");
        conModField.setEnabled(false);

        intellectField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        intellectField.setText("0");
        intellectField.setEnabled(false);

        intModField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        intModField.setText("0");
        intModField.setEnabled(false);

        wisdomField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        wisdomField.setText("0");
        wisdomField.setEnabled(false);

        wisModField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        wisModField.setText("0");
        wisModField.setEnabled(false);

        strRaceBonus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        strRaceBonus.setText("0");
        strRaceBonus.setEnabled(false);

        racialBonusLabel.setText("Racial Bonus");

        dexRaceBonus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dexRaceBonus.setText("0");
        dexRaceBonus.setEnabled(false);

        conRaceBonus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        conRaceBonus.setText("0");
        conRaceBonus.setEnabled(false);

        intRaceBonus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        intRaceBonus.setText("0");
        intRaceBonus.setEnabled(false);

        wisRaceBonus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        wisRaceBonus.setText("0");
        wisRaceBonus.setEnabled(false);

        chaRaceBonus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        chaRaceBonus.setText("0");
        chaRaceBonus.setEnabled(false);

        javax.swing.GroupLayout statsTabPanelLayout = new javax.swing.GroupLayout(statsTabPanel);
        statsTabPanel.setLayout(statsTabPanelLayout);
        statsTabPanelLayout.setHorizontalGroup(
            statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsTabPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(constitutionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dexterityLabel)
                        .addComponent(strengthLabel))
                    .addComponent(charismaLabel)
                    .addComponent(wisdomLabel)
                    .addComponent(intellectLabel))
                .addGap(18, 18, 18)
                .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(intellectField)
                    .addComponent(constitutionField)
                    .addComponent(dexterityField)
                    .addComponent(wisdomField)
                    .addComponent(strengthField)
                    .addComponent(charismaField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(racialBonusLabel)
                    .addGroup(statsTabPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dexRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wisRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chaRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(intModField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(conModField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dexModField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(strModField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(wisModField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modifierLabel)
                    .addComponent(chaModField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        statsTabPanelLayout.setVerticalGroup(
            statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsTabPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(statsTabPanelLayout.createSequentialGroup()
                        .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modifierLabel)
                            .addComponent(racialBonusLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(strModField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dexModField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conModField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intModField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wisModField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chaModField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(statsTabPanelLayout.createSequentialGroup()
                        .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strengthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strengthLabel)
                            .addComponent(strRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dexterityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dexterityLabel)
                            .addComponent(dexRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(constitutionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(constitutionLabel)
                            .addComponent(conRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intellectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intellectLabel)
                            .addComponent(intRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wisdomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wisdomLabel)
                            .addComponent(wisRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(charismaLabel)
                            .addGroup(statsTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(charismaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chaRaceBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        statsTab.addTab("Stats", statsTabPanel);

        racialAdjustmentsTextArea.setColumns(20);
        racialAdjustmentsTextArea.setRows(5);
        jScrollPane1.setViewportView(racialAdjustmentsTextArea);

        statsTab.addTab("Racial Adjustments", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLabel)
                    .addComponent(raceLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(classSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(raceSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(subRaceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subRaceSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rollButton)
                                .addGap(18, 18, 18)
                                .addComponent(takeStandardButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addComponent(statsTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(hitPointsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hpValue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rollButton)
                    .addComponent(takeStandardButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raceSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raceLabel)
                    .addComponent(subRaceLabel)
                    .addComponent(subRaceSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitPointsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statsTab, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void rollButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rollButtonMouseClicked
        // TODO add your handling code here:
        rollForStats();
    }//GEN-LAST:event_rollButtonMouseClicked

    private void takeStandardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_takeStandardButtonMouseClicked
        // TODO add your handling code here:
        takeStandard();
    }//GEN-LAST:event_takeStandardButtonMouseClicked

    private void raceSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raceSelectorActionPerformed
        // TODO add your handling code here:
        setRacialAdjustmentsTextArea();
        setRacialBonuses();
        resetStats();
    }//GEN-LAST:event_raceSelectorActionPerformed

    private void raceSelectorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_raceSelectorPropertyChange
        // TODO add your handling code here:
        setRacialAdjustmentsTextArea();
        setRacialBonuses();
        resetStats();
    }//GEN-LAST:event_raceSelectorPropertyChange

    private void classSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classSelectorActionPerformed
        // TODO add your handling code here:
        setHPMax();
    }//GEN-LAST:event_classSelectorActionPerformed

    private void classSelectorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_classSelectorPropertyChange
        // TODO add your handling code here:
        setHPMax();
    }//GEN-LAST:event_classSelectorPropertyChange

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
            java.util.logging.Logger.getLogger(CharacterCreationSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterCreationSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterCreationSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterCreationSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterCreationSheet().setVisible(true);
            }
        });
    }
/*
        Custom functions
    */
    private void takeStandard(){
        
        //Set the stats
        strBaseVal = 15;
        dexBaseVal = 14;
        conBaseVal = 13;
        intBaseVal = 12;
        wisBaseVal = 10;
        chaBaseVal = 8;
        //Set the new Stats
        resetStats();
        //Set Modifiers
        setModifiers();
        //generate Hit Points
        setHPMax();
    }
    private void rollForStats(){
        //Roll for stats
        strBaseVal = setStats();
        dexBaseVal = setStats();
        conBaseVal = setStats();
        intBaseVal = setStats();
        wisBaseVal = setStats();
        chaBaseVal = setStats();
        //Set the new Stats
        resetStats();
        //Set Modifiers
        setModifiers();
        //generate Hit Points
        setHPMax();
    }
    private void setModifiers(){
        strModField.setText(createModifier(Integer.parseInt(strengthField.getText())));
        dexModField.setText(createModifier(Integer.parseInt(dexterityField.getText())));
        conModField.setText(createModifier(Integer.parseInt(constitutionField.getText())));
        intModField.setText(createModifier(Integer.parseInt(intellectField.getText())));
        wisModField.setText(createModifier(Integer.parseInt(wisdomField.getText())));
        chaModField.setText(createModifier(Integer.parseInt(charismaField.getText())));
    }
    private int setStats(){
	d6 six = new d6();
	int min = 6;
	int statValue = 0;
	for (int i = 0; i < 4 ; i++){
            int value = six.roll();
            if (value < min){
                min = value;
            }
            statValue += value;
	}
	statValue -= min - 2;
	return Math.max(statValue, 8);
    }
    private void setHPMax(){
        int conMod = Integer.parseInt(conModField.getText());
        String chosenClass = classSelector.getItemAt(classSelector.getSelectedIndex());
        
        switch(chosenClass){
            case "Fighter":
            case "Paladin":
                hitDieMax = 10;
                break;
            case "Cleric":
                hitDieMax = 8;
                break;
            case "Wizard":
            case "Rogue":
                hitDieMax = 6;
                break;
            default:
                hitDieMax = 0;
                break;
        }
        hpValue.setText(Integer.toString(hitDieMax));
    }
    private void setTotalHP(){
        
    }
    private String createModifier(int value){
	String Modifier;
	switch(value){
        case 8:
        case 9:
            Modifier = "-1";    
            break;
	case 12:
	case 13:
            Modifier = "1";
            break;
	case 14:
	case 15:
            Modifier = "2";
            break;
	case 16:
	case 17:
		Modifier = "3";
		break;
	case 18:
	case 19:
		Modifier = "4";
		break;
	case 20:
	case 21:
		Modifier = "5";
		break;
	default:
		Modifier = "0";
		break;
	}
	return Modifier;
    }
    private void setRacialBonuses(){
        String race = raceSelector.getItemAt(raceSelector.getSelectedIndex());
        zeroOutRaceBonuses();
        switch(race){
            case "Human":
                chaBonus = 2;
                wisBonus = 1;
                //Set Fields
                chaRaceBonus.setText("2");
                wisRaceBonus.setText("1");
                break;
            case "Elf":
                intBonus = 2;
                dexBonus = 1;
                //Set Fields
                intRaceBonus.setText("2");
                dexRaceBonus.setText("1");
                break;
            case "Dwarf":
                conBonus = 2;
                strBonus = 1;
                //Set Fields
                conRaceBonus.setText("2");
                strRaceBonus.setText("1");
                break;
            case "Halfling":
                dexBonus = 2;
                wisBonus = 1;
                //Set Fields
                dexRaceBonus.setText("2");
                wisRaceBonus.setText("1");
                break;
            default:
        }
    }
    private void zeroOutRaceBonuses(){
        strBonus = 0;
        dexBonus = 0;
        conBonus = 0;
        intBonus = 0;
        wisBonus = 0;
        chaBonus = 0;
        strRaceBonus.setText("0");
        dexRaceBonus.setText("0");
        conRaceBonus.setText("0");
        intRaceBonus.setText("0");
        wisRaceBonus.setText("0");
        chaRaceBonus.setText("0");
    }
    private void setRacialAdjustmentsTextArea(){
        String race = raceSelector.getItemAt(raceSelector.getSelectedIndex());
        switch(race){
            case "Human":
                racialAdjustmentsTextArea.setText("Human\n\nHumans have the following bonuses:\n"
                +"-Increase Charisma by 2 and increase Wisdom by 1\n"
                +"-Start the game with an additional 50 gold\n"
                +"-Increase Charisma Saving Throws by 1");
                break;
            case "Elf":
                racialAdjustmentsTextArea.setText("Elf\n\nElves have the following bonuses:\n"
                +"-Increase Intellect by 2 and increase Dexterity by 1\n"
                +"-You have both Nightvision and Darkvision\n"
                +"-Increase Dexterity Saving Throws by 1");
                break;
            case "Dwarf":
                racialAdjustmentsTextArea.setText("Dwarf\n\nDwarves have the following bonuses:\n"
                +"-Increase Constitution by 2 and Strength by 1\n"
                +"-Each level increases your hit point total by 1\n"
                +"-Increase Strength Saving Throws by 1");
                break;
            case "Halfling":
                racialAdjustmentsTextArea.setText("Halfling\n\nHalfilings have the following bonuses:\n"
                +"-Increase Dexterity by 2 and Wisdom by 1\n"
                +"-You start the game with an additional skill\n"
                +"-Increase Wisdom Saving Throws by 1");
                break;
            default:
        }
    }
    private void resetStats(){
        //Used to set the new stats
        strengthField.setText(Integer.toString(strBaseVal + strBonus));
        dexterityField.setText(Integer.toString(dexBaseVal + dexBonus));
        constitutionField.setText(Integer.toString(conBaseVal + conBonus));
        intellectField.setText(Integer.toString(intBaseVal + intBonus));
        wisdomField.setText(Integer.toString(wisBaseVal + wisBonus));
        charismaField.setText(Integer.toString(chaBaseVal + chaBonus));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chaModField;
    private javax.swing.JTextField chaRaceBonus;
    private javax.swing.JTextField charismaField;
    private javax.swing.JLabel charismaLabel;
    private javax.swing.JLabel classLabel;
    private javax.swing.JComboBox<String> classSelector;
    private javax.swing.JTextField conModField;
    private javax.swing.JTextField conRaceBonus;
    private javax.swing.JTextField constitutionField;
    private javax.swing.JLabel constitutionLabel;
    private javax.swing.JTextField dexModField;
    private javax.swing.JTextField dexRaceBonus;
    private javax.swing.JTextField dexterityField;
    private javax.swing.JLabel dexterityLabel;
    private javax.swing.JLabel hitPointsLabel;
    private javax.swing.JTextField hpValue;
    private javax.swing.JTextField intModField;
    private javax.swing.JTextField intRaceBonus;
    private javax.swing.JTextField intellectField;
    private javax.swing.JLabel intellectLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modifierLabel;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel raceLabel;
    private javax.swing.JComboBox<String> raceSelector;
    private javax.swing.JTextArea racialAdjustmentsTextArea;
    private javax.swing.JLabel racialBonusLabel;
    private javax.swing.JButton rollButton;
    private javax.swing.JTabbedPane statsTab;
    private javax.swing.JPanel statsTabPanel;
    private javax.swing.JTextField strModField;
    private javax.swing.JTextField strRaceBonus;
    private javax.swing.JTextField strengthField;
    private javax.swing.JLabel strengthLabel;
    private javax.swing.JLabel subRaceLabel;
    private javax.swing.JComboBox<String> subRaceSelector;
    private javax.swing.JButton takeStandardButton;
    private javax.swing.JTextField wisModField;
    private javax.swing.JTextField wisRaceBonus;
    private javax.swing.JTextField wisdomField;
    private javax.swing.JLabel wisdomLabel;
    // End of variables declaration//GEN-END:variables
}
