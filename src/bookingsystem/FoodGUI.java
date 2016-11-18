package bookingsystem;

import java.util.Collections;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mikael Tolfström
 */
public class FoodGUI extends javax.swing.JFrame {

    static Customer customer1 = new Customer();
    FoodInit runFoodInit = new FoodInit();
    DefaultComboBoxModel currentMenuCombox = new DefaultComboBoxModel();
    DefaultListModel<String> currentCustomerFoodList = new DefaultListModel<>();
    Food customersSelection;

    //Change the value of chosenMenu to whatever comes from the previous booking step
    FoodMenu chosenMenu = runFoodInit.economyClassMenu;

    //Just change the value of currentCustomer to whatever customer comes from the previous booking step
    Customer currentCustomer = customer1;

    public FoodGUI() {
        runFoodInit.runInit();
        initCustomComponents();

        initComponents();
        jComboBox1.setSelectedIndex(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        removeItemFromListButton = new javax.swing.JButton();
        clearListButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        orderListItemPriceLabel = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        orderListTotalPriceLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        menuAmountPanel = new javax.swing.JPanel();
        plusButton = new java.awt.Button();
        minusButton = new java.awt.Button();
        amountToBuy = new javax.swing.JLabel();
        menuItemPricePanel = new javax.swing.JPanel();
        menuItemPriceLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addToCartButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 450));
        setMinimumSize(new java.awt.Dimension(620, 450));
        setResizable(false);

        foodPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        foodPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(currentCustomerFoodList);
        jList1.setToolTipText("Select food from the drop down and press the add button.");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        foodPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 170, 344));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your order");
        foodPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 170, -1));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 37, -1));

        jButton3.setText("jButton3");
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 241, 37, -1));

        removeItemFromListButton.setText("Remove");
        removeItemFromListButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        removeItemFromListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemFromListButtonActionPerformed(evt);
            }
        });
        jPanel8.add(removeItemFromListButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 90, 50));

        clearListButton.setText("Clear list");
        clearListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearListButtonActionPerformed(evt);
            }
        });
        jPanel8.add(clearListButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 356, 90, 40));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Item price"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderListItemPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orderListItemPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(orderListItemPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 56, 56));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 90));

        foodPanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 36, 100, 401));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Total price"));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderListTotalPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderListTotalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderListTotalPriceLabel.setText(Double.toString(currentCustomer.getFoodPrice()));
        jPanel10.add(orderListTotalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 138, -1));

        foodPanel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 386, 170, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setMaximumRowCount(16);
        jComboBox1.setModel(currentMenuCombox);
        jComboBox1.setToolTipText("Select food from the drop down and press the add button.");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 298, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 298, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(chosenMenu.findFoodByName(currentMenuCombox.getSelectedItem().toString()).getName()));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(chosenMenu.findFoodByName(currentMenuCombox.getSelectedItem().toString()).getDescription());
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 25, 170, 260));

        menuAmountPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Amount"));
        menuAmountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plusButton.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        plusButton.setLabel("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });
        menuAmountPanel.add(plusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 13, 13));

        minusButton.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        minusButton.setLabel("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });
        menuAmountPanel.add(minusButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 13, 13));

        amountToBuy.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        amountToBuy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountToBuy.setText("1");
        menuAmountPanel.add(amountToBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 45));

        jPanel1.add(menuAmountPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, 80, 80));

        menuItemPricePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Price"));
        menuItemPricePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuItemPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItemPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuItemPriceLabel.setText(chosenMenu.findFoodByName(currentMenuCombox.getSelectedItem().toString()).getPrice().toString());
        menuItemPricePanel.add(menuItemPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 40));

        jPanel1.add(menuItemPricePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, 80, 76));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, 298, 308));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addToCartButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addToCartButton.setText("Add to cart");
        addToCartButton.setMaximumSize(new java.awt.Dimension(120, 30));
        addToCartButton.setMinimumSize(new java.awt.Dimension(120, 30));
        addToCartButton.setPreferredSize(new java.awt.Dimension(120, 30));
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addToCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 115, 50));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Next");
        jButton7.setMaximumSize(new java.awt.Dimension(75, 31));
        jButton7.setMinimumSize(new java.awt.Dimension(75, 31));
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 0, 84, 50));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Previous");
        jButton9.setMaximumSize(new java.awt.Dimension(75, 31));
        jButton9.setMinimumSize(new java.awt.Dimension(75, 31));
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 84, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 388, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(foodPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foodPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        String selectedMenuItem = (String) currentMenuCombox.getSelectedItem();
        customersSelection = chosenMenu.findFoodByName(selectedMenuItem);
        jTextArea1.setText(chosenMenu.findFoodByName(currentMenuCombox.getSelectedItem().toString()).getDescription());
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(currentMenuCombox.getSelectedItem().toString()));
        menuItemPriceLabel.setText(chosenMenu.findFoodByName(currentMenuCombox.getSelectedItem().toString()).getPrice().toString());


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed

        int buyAmount = Integer.parseInt(amountToBuy.getText());
        buyAmount++;
        amountToBuy.setText(Integer.toString(buyAmount));

    }//GEN-LAST:event_plusButtonActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String selectedMenuItem = jList1.getSelectedValue();
        orderListItemPriceLabel.setText(Double.toString(chosenMenu.findFoodByName(selectedMenuItem).getPrice()));
    }//GEN-LAST:event_jList1MouseClicked

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        
        currentCustomerFoodList.removeAllElements();
        int buyAmount = Integer.parseInt(amountToBuy.getText());
        for (int i = 0; i < buyAmount; i++) {
            currentCustomer.addToMyFoodList(customersSelection);
        }
        for (int i = 0; i < currentCustomer.getMyFoodList().size(); i++) {
            currentCustomerFoodList.addElement(currentCustomer.getMyFoodList().get(i).getName());
        }
        orderListTotalPriceLabel.setText(Double.toString(currentCustomer.getFoodPrice()));
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void clearListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearListButtonActionPerformed
        
        currentCustomer.clearMyFoodList();
        currentCustomerFoodList.removeAllElements();
        orderListTotalPriceLabel.setText(Double.toString(currentCustomer.getFoodPrice()));
        
    }//GEN-LAST:event_clearListButtonActionPerformed

    private void removeItemFromListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemFromListButtonActionPerformed
        
        
        String selectedMenuItem = jList1.getSelectedValue();
        currentCustomer.removeFromMyFoodList(chosenMenu.findFoodByName(selectedMenuItem));
        currentCustomerFoodList.removeAllElements();
        for (int i = 0; i < currentCustomer.getMyFoodList().size(); i++) {
            currentCustomerFoodList.addElement(currentCustomer.getMyFoodList().get(i).getName());
        }
        orderListItemPriceLabel.setText("");
        orderListTotalPriceLabel.setText(Double.toString(currentCustomer.getFoodPrice()));
    }//GEN-LAST:event_removeItemFromListButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //New Line
    }//GEN-LAST:event_jButton2ActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        JFrame frame = new JFrame();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int buyAmount = Integer.parseInt(amountToBuy.getText());
        switch (buyAmount) {
            case 1:
            JOptionPane.showMessageDialog(frame, "Can not order less than one item");
            break;
            default:
            buyAmount--;
            amountToBuy.setText(Integer.toString(buyAmount));
            break;
        }

    }//GEN-LAST:event_minusButtonActionPerformed

    private void initCustomComponents() {
        Collections.sort(chosenMenu.getList());
        for (int i = 0; i < chosenMenu.getListSize(); i++) {
            currentMenuCombox.addElement(chosenMenu.getFoodAtIndex(i).getName());
        }
    }

    public int convertUserInputToInt(String userInput) {

        if (userInput == null || userInput.isEmpty()) {
            userInput = "1";
        }
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for (char c : userInput.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
                found = true;
            } else if (found) {
                // If we already found a digit before and this char is not a digit, stop looping
                break;
            }
        }
        userInput = sb.toString();
        if (sb.toString().isEmpty() || sb.toString() == null) {
            userInput = "1";
        }

        int buyAmount = Integer.parseInt(userInput);
        if (buyAmount <= 0) {
            buyAmount = 1;
        }
        return buyAmount;
    }

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
            java.util.logging.Logger.getLogger(FoodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JLabel amountToBuy;
    private javax.swing.JButton clearListButton;
    private javax.swing.JPanel foodPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel menuAmountPanel;
    public javax.swing.JLabel menuItemPriceLabel;
    private javax.swing.JPanel menuItemPricePanel;
    private java.awt.Button minusButton;
    public javax.swing.JLabel orderListItemPriceLabel;
    public javax.swing.JLabel orderListTotalPriceLabel;
    private java.awt.Button plusButton;
    private javax.swing.JButton removeItemFromListButton;
    // End of variables declaration//GEN-END:variables
}
