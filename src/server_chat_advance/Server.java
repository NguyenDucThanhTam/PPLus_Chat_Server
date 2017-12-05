/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_chat_advance;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author rs
 */
public class Server extends javax.swing.JFrame {

    ServerSocket server;
    Socket clients;

    /**
     * Creates new form Server
     */
    public Server() {
        initComponents();
        btn_Stop.setEnabled(false);
        txtArea_Message.setEnabled(false);
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
        btn_Stop = new javax.swing.JButton();
        panel_message = new javax.swing.JScrollPane();
        txtArea_Message = new javax.swing.JTextArea();
        panel_user = new javax.swing.JScrollPane();
        list_user = new javax.swing.JList<>();
        btn_Start = new javax.swing.JButton();
        txt_message_input_server = new javax.swing.JTextField();
        btn_Send = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Stop.setText("Stop Server");
        btn_Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StopActionPerformed(evt);
            }
        });

        txtArea_Message.setColumns(20);
        txtArea_Message.setRows(5);
        panel_message.setViewportView(txtArea_Message);

        panel_user.setViewportView(list_user);

        btn_Start.setText("Start Server");
        btn_Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartServer(evt);
            }
        });
        btn_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartActionPerformed(evt);
            }
        });

        txt_message_input_server.setText(" Message");

        btn_Send.setText("Send");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_message_input_server, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_message, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Start)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Stop))
                            .addComponent(btn_Send))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_user, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Stop)
                    .addComponent(btn_Start))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_message, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(panel_user))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_message_input_server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Send))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartActionPerformed
        // TODO add your handling code here:
        StartServer();
    }//GEN-LAST:event_btn_StartActionPerformed

    private void btn_StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StopActionPerformed
        // TODO add your handling code here:

        StopServer();

    }//GEN-LAST:event_btn_StopActionPerformed

    private void StartServer(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartServer
        // TODO add your handling code here:
    }//GEN-LAST:event_StartServer

    /**
     * @param args the command line arguments
     */
    //NOTE: Method Start Server
    public void ChecKButton(int stt) {
        if (stt == 1) {
            btn_Start.setEnabled(false);
            btn_Stop.setEnabled(true);
            txtArea_Message.setEnabled(false);
        }
    }
    HandleClient handleClient;
    Thread thread_receive, thread_send, thread;

    public void StartServer() {
        try {
            server = new ServerSocket(3000);
            txtArea_Message.append("Server Started !!! \n");
            btn_Start.setEnabled(false);
            //Disable Button Start Server

            //Create object in HandleClient
            handleClient = new HandleClient();
            //Create new Thread with o handleClient
            thread = new Thread(handleClient);
            //Start
            thread.start();
            //NOTE: test
            System.out.println("Server Started" + "\n");

        } catch (Exception ex) {
            System.out.println("Error when start Server: " + ex);
        }
    }

    public void StopServer() {

        try {
            //NOTE: Close Server
            server.close();
            btn_Start.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Can't Stop Server, error: " + ex);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Send;
    private javax.swing.JButton btn_Start;
    private javax.swing.JButton btn_Stop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> list_user;
    private javax.swing.JScrollPane panel_message;
    private javax.swing.JScrollPane panel_user;
    private javax.swing.JTextArea txtArea_Message;
    private javax.swing.JTextField txt_message_input_server;
    // End of variables declaration//GEN-END:variables

    ReceiveDataFromClients thread_receive_data;
    HashMap<Integer, String> clients_socket_hashmap = new HashMap<>();
    InputStream is;
    OutputStream os;
    ArrayList<String> arrSocket = new ArrayList<String>();
    PrintWriter pw;
    BufferedReader br;
    BufferedWriter bw;
    InputStreamReader isr;
    Scanner sc = new Scanner(System.in);
    DataInputStream dis;
    DataOutputStream dos;
    SendDataToClients thread_send_data;

    String message;
    String[] parts;

    class HandleClient implements Runnable {

        //Receive Data From CLient 
        // Protocal: ActionName
        @Override
        public void run() {
            try {
                //Loop
                while (true) {
                    //Wait Request From User
                    clients = server.accept();
                    //Add socket in hashmap
                    //Method Receive Name of Clients
                    receiveNameClient();
                    //Open new Thread Receive Data To Client
                    thread_receive_data = new ReceiveDataFromClients();
                    thread_receive = new Thread(thread_receive);
                    thread_receive.start();
                    //Open new Thread Handle Send Data
                    thread_send_data = new SendDataToClients();
                    thread_send = new Thread(thread_send_data);
                    thread_send.start();

                }

            } catch (IOException ex) {
                Logger.getLogger(HandleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void splitMessage() {
            try {
                // Receive Data to user
                dis = new DataInputStream(clients.getInputStream());
                //Read Data
                String message = dis.readUTF();
//                System.out.println(message);
                //Array store Data
                parts = message.split("%");
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Set JList User Online 
        private void setUserList() {
            DefaultListModel model = new DefaultListModel();
            for (int i = 0; i < arrSocket.size(); i++) {
                model.addElement("" + arrSocket.get(i));
            }
            list_user.setModel(model);
        }

        private void receiveNameClient() {
            try {
                while (true) {
                    splitMessage();
                    //Check and Work with ACTION : SET_NAME, SEND_ALL, SEND_TO
                    //IF SET_NAME true
                    if (parts[0].matches("SET_NAME")) {
                        txtArea_Message.append("User connected: " + parts[1] + "\n");
                        arrSocket.add(parts[1]);
                        setUserList();
                        //add Socket to array to store it
                    }
                    if (parts[0].matches("SEND_ALL")) {
                    }
                    return;
                }

            } catch (Exception ex) {
                System.err.println(ex);
            }
        }

    }
    HandleClient handle_clients = new HandleClient();

    class ReceiveDataFromClients implements Runnable {

        @Override
        public void run() {
//                while(true){
//                
//                }
        }

    }

    class SendDataToClients implements Runnable {

        String ACTION;
        String SENDER_NAME;

        @Override
        public void run() {
            try {
                while (true) {
                    handle_clients.splitMessage();

                    if (parts[0].matches("SEND_ALL")) {

                        //Get Message
                        String message = parts[1];
                        dos = new DataOutputStream(clients.getOutputStream());
                        txtArea_Message.append(parts[1]);
                        dos.writeUTF(SENDER_NAME + "%" + txt_message_input_server + "");
                    }
                }

            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
