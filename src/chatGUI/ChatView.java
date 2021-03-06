package chatGUI;

import java.awt.event.ActionListener;

/**
 *
 * @author Diah Ajeng
 */
public class ChatView extends javax.swing.JFrame {

    public ChatView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaChat = new javax.swing.JTextArea();
        txFieldChat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txAreaChat.setEditable(false);
        txAreaChat.setColumns(20);
        txAreaChat.setRows(5);
        txAreaChat.setText("Input server IP : ");
        jScrollPane1.setViewportView(txAreaChat);

        txFieldChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFieldChatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(txFieldChat))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txFieldChat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txFieldChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFieldChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFieldChatActionPerformed
   
    public void setTxAreaCaht(String Message) {
        txAreaChat.append(Message + "\n");
    }
       
    public Object getTextField() {
        return txFieldChat;
    }
    
    public String getStringChat() {
        return txFieldChat.getText();
    }
    
    public void setTextFieldChat(String Message) {
        this.txFieldChat.setText(Message);
    }
    
    public void addListener (ActionListener e){
        txFieldChat.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txAreaChat;
    private javax.swing.JTextField txFieldChat;
    // End of variables declaration//GEN-END:variables
}
