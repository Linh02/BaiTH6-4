/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadEcho;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class LuongLamViec extends Thread{
    Socket socketClient;
	int id = -1;
    /**
     * @param args the command line arguments
     */
    
    public LuongLamViec(Socket socketClient, int id) {
        super();
        this.socketClient = socketClient;
        this.id = id;
	}
	@Override
	public void run() {
            try {
                System.out.print(socketClient.getInetAddress().getHostAddress());
                System.out.print(id);

                OutputStream osToClinent = socketClient.getOutputStream();
                OutputStreamWriter write2Client = new OutputStreamWriter(osToClinent);
                BufferedWriter buffWrite = new BufferedWriter(write2Client);

                InputStream in = socketClient.getInputStream();
                InputStreamReader inReader = new InputStreamReader(in);
                BufferedReader buffRead = new BufferedReader(inReader);
                // Xử lý
                while (true) {
                    // nhận Dữ liệu
                    String chuoiNhan = buffRead.readLine();
                    System.out.print(chuoiNhan);
                    // In ra 
                    // gửi trả 
                    String chuoiGui = chuoiNhan;
                    buffWrite.write(chuoiGui+"\n");
                    buffWrite.flush();
                    if (chuoiGui.equals("Bye")) break;
                    }
                        socketClient.close();		
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
			}
    }
    
}
