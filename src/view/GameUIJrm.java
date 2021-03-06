/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.ChessPiece;
import static view.GameUI.redColor;
import static view.GameUI.whiteColor;

/**
 *
 * @author phamhung
 */
public class GameUIJrm extends javax.swing.JFrame {

    /**
     * Creates new form GameUIJrm
     */
    ChessPiece[][] chessPieces = new ChessPiece[9][10];
    int width = 100;
    public Board board = new Board(chessPieces, width, new GameUI());
    public GameUIJrm() {
        initComponents();
        initialPieces();
        board.setBounds(0, 0, rightPanel.getWidth(), rightPanel.getHeight());
        rightPanel.add(board);
        
    }
    public void initialPieces() {
        //Các quân cờ bên ĐỎ
        chessPieces[0][0] = new ChessPiece(redColor, "車", 0, 0);
        chessPieces[1][0] = new ChessPiece(redColor, "馬", 1, 0);
        chessPieces[2][0] = new ChessPiece(redColor, "相", 2, 0);
        chessPieces[3][0] = new ChessPiece(redColor, "仕", 3, 0);
        chessPieces[4][0] = new ChessPiece(redColor, "帥", 4, 0);
        chessPieces[5][0] = new ChessPiece(redColor, "仕", 5, 0);
        chessPieces[6][0] = new ChessPiece(redColor, "相", 6, 0);
        chessPieces[7][0] = new ChessPiece(redColor, "馬", 7, 0);
        chessPieces[8][0] = new ChessPiece(redColor, "車", 8, 0);
        chessPieces[1][2] = new ChessPiece(redColor, "炮", 1, 2);
        chessPieces[7][2] = new ChessPiece(redColor, "炮", 7, 2);
        chessPieces[0][3] = new ChessPiece(redColor, "兵", 0, 3);
        chessPieces[2][3] = new ChessPiece(redColor, "兵", 2, 3);
        chessPieces[4][3] = new ChessPiece(redColor, "兵", 4, 3);
        chessPieces[6][3] = new ChessPiece(redColor, "兵", 6, 3);
        chessPieces[8][3] = new ChessPiece(redColor, "兵", 8, 3);

        //Các quân cờ bên TRẮNG
        chessPieces[0][9] = new ChessPiece(whiteColor, "車", 0, 9);
        chessPieces[1][9] = new ChessPiece(whiteColor, "馬", 1, 9);
        chessPieces[2][9] = new ChessPiece(whiteColor, "象", 2, 9);
        chessPieces[3][9] = new ChessPiece(whiteColor, "士", 3, 9);
        chessPieces[4][9] = new ChessPiece(whiteColor, "將", 4, 9);
        chessPieces[5][9] = new ChessPiece(whiteColor, "士", 5, 9);
        chessPieces[6][9] = new ChessPiece(whiteColor, "象", 6, 9);
        chessPieces[7][9] = new ChessPiece(whiteColor, "馬", 7, 9);
        chessPieces[8][9] = new ChessPiece(whiteColor, "車", 8, 9);
        chessPieces[1][7] = new ChessPiece(whiteColor, "砲", 1, 7);
        chessPieces[7][7] = new ChessPiece(whiteColor, "砲", 7, 7);
        chessPieces[0][6] = new ChessPiece(whiteColor, "卒", 0, 6);
        chessPieces[2][6] = new ChessPiece(whiteColor, "卒", 2, 6);
        chessPieces[4][6] = new ChessPiece(whiteColor, "卒", 4, 6);
        chessPieces[6][6] = new ChessPiece(whiteColor, "卒", 6, 6);
        chessPieces[8][6] = new ChessPiece(whiteColor, "卒", 8, 6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rightPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        idRoom = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mời bạn:");

        idRoom.setText("idRoom");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Đang trong phòng:");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idRoom)
                    .addComponent(jButton1)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(idRoom)
                .addGap(79, 79, 79)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        leftPanel.getAccessibleContext().setAccessibleParent(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GameUIJrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameUIJrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameUIJrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameUIJrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameUIJrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idRoom;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
