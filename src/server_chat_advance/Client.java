/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_chat_advance;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;

/**
 *
 * @author rs
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
        txt_error.setVisible(false);
        show_message.setEnabled(false);
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
        txt_IP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_PORT = new javax.swing.JTextField();
        btnConnect = new javax.swing.JButton();
        btnDisconnect = new javax.swing.JButton();
        window_show_message = new javax.swing.JScrollPane();
        show_message = new javax.swing.JTextArea();
        edt_Message = new javax.swing.JTextField();
        btn_SEND = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        user_online = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NAME = new javax.swing.JTextField();
        txt_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_IP.setText("192.168.1.5");

        jLabel1.setText("IP address: ");

        jLabel2.setText("Port:");

        txt_PORT.setText("3000");
        txt_PORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PORTActionPerformed(evt);
            }
        });

        btnConnect.setText("Connect ");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        btnDisconnect.setText("Disconnect");
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });

        show_message.setColumns(20);
        show_message.setRows(5);
        window_show_message.setViewportView(show_message);

        edt_Message.setText("type here .. ");

        btn_SEND.setText("Send");
        btn_SEND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SENDActionPerformed(evt);
            }
        });

        user_online.setColumns(20);
        user_online.setRows(5);
        jScrollPane2.setViewportView(user_online);

        jLabel3.setText("Online User ");

        jLabel4.setText("User Name: ");

        txt_NAME.setText("Thanh Tam");
        txt_NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NAMEActionPerformed(evt);
            }
        });

        txt_error.setFont(new java.awt.Font("Ubuntu Medium", 1, 15)); // NOI18N
        txt_error.setForeground(new java.awt.Color(255, 31, 0));
        txt_error.setText("EROR: Please check IP, Port and User Name ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edt_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_SEND))
                            .addComponent(window_show_message, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_PORT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(btnConnect)
                                .addGap(18, 18, 18)
                                .addComponent(btnDisconnect))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(8, 8, 8)
                                .addComponent(txt_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_error)))
                        .addGap(0, 29, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txt_PORT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnDisconnect)
                    .addComponent(btnConnect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_error))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(window_show_message))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edt_Message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_SEND)))
                    .addComponent(jLabel3))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PORTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PORTActionPerformed

    private void txt_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NAMEActionPerformed

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        // TODO add your handling code here:
        ConectToServer();

    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        // TODO add your handling code here:
//        disconnectToServer();
    }//GEN-LAST:event_btnDisconnectActionPerformed

    private void btn_SENDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SENDActionPerformed
        // TODO add your handling code here:
        thread_send_data.sendMessageAll();
    }//GEN-LAST:event_btn_SENDActionPerformed

    Socket connect_server;
    String IP_ADDRESS;
    String PORT_SERVER;
    int PORT;

    private void getIpPort() {

//        //Check PORT 
//        Pattern pattern = Pattern.compile("\\d*");
//        Matcher matcher = pattern.matcher(PORT_SERVER);
//        if (matcher.matches()) {
//            PORT = Integer.parseInt(PORT_SERVER);
//
//        } else {
//            //Set text and Show Message Error
//           txt_error.setText("Please type NUMBER in Port");
//           txt_error.setVisible(true);
//        }
        IP_ADDRESS = txt_IP.getText().toString().trim();
        PORT = Integer.parseInt(txt_PORT.getText());
    }
    Thread thread;
    SendDataToServer thread_send_data = new SendDataToServer();
    //
    //Check connect DONE

    boolean connect = false;
    BufferedReader br;
    DataOutputStream dos;
    PrintWriter pw;
    String getNameUser;
    //Have action: SET_NAME , SEND_ALL, SEND_TO, DISCONNECT
    String action;
    JLabel row_message;

    private void ConectToServer() {
        getIpPort();
        try {
            txt_error.setVisible(false);
            //Connect Server with IP PORT exits ..........................
            connect_server = new Socket(IP_ADDRESS, PORT);

            show_message.append("Server Connected");

            connect = true;
            //Create  ob OUTPUT
            dos = new DataOutputStream(connect_server.getOutputStream());
            //Get Name User From Edt Name
            getNameUser = txt_NAME.getText();
            action = "SET_NAME";
            //Send first data: [action]+%+[name]  to Server
            dos.writeUTF(action + "%" + getNameUser);
            //Start Thread Handle Send Data To Server

        } catch (IOException ex) {

            txt_error.setText("Can't Connect To Server, Please Check Data");
            //Show error
            txt_error.setVisible(true);
            connect = false;

        }

        if (connect == true) {
            txt_error.setText("Connection Suceeded !!!");
            txt_error.setForeground(Color.green);
            //Show message connected
            txt_error.setVisible(true);

            btnConnect.setEnabled(false);
            txt_IP.setEnabled(false);
            txt_PORT.setEnabled(false);

            //Open new Thread Handle Send Data To Server
            thread = new Thread(thread_send_data);
            thread.start();
        } else {
            return;
        }

    }

//    private void disconnectToServer() {
//        try {
//            action = "DISCONNECT";
//            dos = new DataOutputStream(connect_server.getOutputStream());
//            dos.writeUTF(action + "%" + getNameUser);
//        } catch (IOException ex) {
//            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    //Thread Send Data To Server
    private class SendDataToServer implements Runnable {

        private void sendMessageAll() {
            while (true) {
                try {
                    String message = edt_Message.getText().toString();
                    dos = new DataOutputStream(connect_server.getOutputStream());
                    action = "SEND_ALL";
                    dos.writeUTF(action + "%" + message);
                } catch (Exception e) {
                }
            }
        }

        @Override
        public void run() {
            //Wait to send message to server
//            while (true) {
//
//            }
        }

    }

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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnDisconnect;
    private javax.swing.JButton btn_SEND;
    private javax.swing.JTextField edt_Message;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea show_message;
    private javax.swing.JTextField txt_IP;
    private javax.swing.JTextField txt_NAME;
    private javax.swing.JTextField txt_PORT;
    private javax.swing.JLabel txt_error;
    private javax.swing.JTextArea user_online;
    private javax.swing.JScrollPane window_show_message;
    // End of variables declaration//GEN-END:variables

}
