/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calclator;

/**
 *
 * @author yousef
 */
public class calclator extends javax.swing.JFrame {
double num1,num2;
    char opreator;
    /**
     * Creates new form calclator
     */
   
    public calclator() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        lbl_show = new javax.swing.JLabel();
        edt_text = new javax.swing.JTextField();
        btn_negate = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_seven = new javax.swing.JButton();
        btn_eight = new javax.swing.JButton();
        btn_nine = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_four = new javax.swing.JButton();
        btn_five = new javax.swing.JButton();
        btn_six = new javax.swing.JButton();
        btn_min = new javax.swing.JButton();
        btn_one = new javax.swing.JButton();
        btn_two = new javax.swing.JButton();
        btn_three = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn_zero = new javax.swing.JButton();
        btn_point = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        lbl_show.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        edt_text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btn_negate.setText("+/-");
        btn_negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_negateActionPerformed(evt);
            }
        });

        btn_clear.setText("c");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_div.setText("÷");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oprationAction(evt);
            }
        });

        btn_back.setText("back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_seven.setText("7");
        btn_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_eight.setText("8");
        btn_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_nine.setText("9");
        btn_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_mult.setText("X");
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oprationAction(evt);
            }
        });

        btn_four.setText("4");
        btn_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_five.setText("5");
        btn_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_six.setText("6");
        btn_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_min.setText("-");
        btn_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oprationAction(evt);
            }
        });

        btn_one.setText("1");
        btn_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_two.setText("2");
        btn_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_three.setText("3");
        btn_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_plus.setText("+");
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oprationAction(evt);
            }
        });

        btn_zero.setText("0");
        btn_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersAction(evt);
            }
        });

        btn_point.setText(".");
        btn_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pointActionPerformed(evt);
            }
        });

        btn_equal.setText("=");
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edt_text)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_negate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_four, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_five, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_six, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_min, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_one, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_two, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_three, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_point, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_show, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_negate)
                    .addComponent(btn_clear)
                    .addComponent(btn_back)
                    .addComponent(btn_div))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_seven)
                    .addComponent(btn_eight)
                    .addComponent(btn_nine)
                    .addComponent(btn_mult))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_four)
                    .addComponent(btn_five)
                    .addComponent(btn_six)
                    .addComponent(btn_min))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_one)
                    .addComponent(btn_two)
                    .addComponent(btn_three)
                    .addComponent(btn_plus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_zero)
                    .addComponent(btn_point)
                    .addComponent(btn_equal))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numbersAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numbersAction
        // TODO add your handling code here:
        switch (evt.getActionCommand()) {
            case "0":
                if (edt_text.getText().length()>0)
                { edt_text.setText(edt_text.getText()+"0");
                }
                break;
                
                
            case "1":
                edt_text.setText(edt_text.getText()+"1");
                break;
                
            case "2":
                edt_text.setText(edt_text.getText()+"2");
                break;
                
            case "3":
                edt_text.setText(edt_text.getText()+"3");
                break;
                
            case "4":
                edt_text.setText(edt_text.getText()+"4");
                break;
                
            case "5":
                edt_text.setText(edt_text.getText()+"5");
                break;
                
            case "6":
                edt_text.setText(edt_text.getText()+"6");
                break;
                
            case "7":
                edt_text.setText(edt_text.getText()+"7");
                break;
                
            case "8":
                edt_text.setText(edt_text.getText()+"8");
                break;
                
            case "9":
                edt_text.setText(edt_text.getText()+"9");
                break;
                
               
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_numbersAction

    private void oprationAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oprationAction
        // TODO add your handling code here:
        if(edt_text.getText().length()>0)
        {
            num1=Double.parseDouble(edt_text.getText());
        switch (evt.getActionCommand()) {
            case "+":
                opreator='+';
                lbl_show.setText(num1+"+");
                edt_text.setText("");
                break;
            case "-":
                opreator='-';
                lbl_show.setText(num1+"-");
                edt_text.setText("");
                break;
            case "÷":
                
                opreator='÷';
                
                lbl_show.setText(num1+"÷");
                edt_text.setText("");
                break;
            case "X":
               
                opreator='X';
                
                lbl_show.setText(num1+"X");
                edt_text.setText("");
                break;
            default:
                throw new AssertionError();
        }
        }
    }//GEN-LAST:event_oprationAction

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed
     if (edt_text.getText().length()>0)
     {
         num2=Double.parseDouble(edt_text.getText());
         
     }
     else
         num2=num1;
     double result; 
     if(opreator!='\u0000')
     {switch (opreator) {
            case '+' :
                result=num1+num2;
                edt_text.setText(""+result);
               lbl_show.setText(lbl_show.getText()+num2+" = "+result);
               opreator='\u0000';
                break;
            case'-':
               result=num1-num2; 
                 edt_text.setText(""+result);
                  lbl_show.setText(lbl_show.getText()+num2+" = "+result);
                  opreator='\u0000';
               break;
            case'X':
               result=num1*num2; 
                 edt_text.setText(""+result);
                lbl_show.setText(lbl_show.getText()+num2+" = "+result);
                opreator='\u0000';
               break;
            case'÷':
               result=num1/num2; 
                 edt_text.setText(""+result);
                  lbl_show.setText(lbl_show.getText()+num2+" = "+result);
                  opreator='\u0000';
               break;
               
            default:
                throw new AssertionError();
        }
     }
    }//GEN-LAST:event_btn_equalActionPerformed

    private void btn_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pointActionPerformed
        if (!edt_text.getText().contains("."));
        edt_text.setText(edt_text.getText()+".");
    }//GEN-LAST:event_btn_pointActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        if (edt_text.getText().length()>0)
        {
        String n=edt_text.getText().substring(0, edt_text.getText().length()-1);
        edt_text.setText(n);
        }
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        edt_text.setText(null);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_negateActionPerformed
        // TODO add your handling code here:
        edt_text.setText((-1*Double.parseDouble(edt_text.getText()))+"");
    }//GEN-LAST:event_btn_negateActionPerformed

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
            java.util.logging.Logger.getLogger(calclator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calclator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calclator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calclator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calclator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_eight;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_five;
    private javax.swing.JButton btn_four;
    private javax.swing.JButton btn_min;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_negate;
    private javax.swing.JButton btn_nine;
    private javax.swing.JButton btn_one;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_point;
    private javax.swing.JButton btn_seven;
    private javax.swing.JButton btn_six;
    private javax.swing.JButton btn_three;
    private javax.swing.JButton btn_two;
    private javax.swing.JButton btn_zero;
    private javax.swing.JTextField edt_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_show;
    // End of variables declaration//GEN-END:variables
}
