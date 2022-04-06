/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreadEcho;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Admin
 */
public class CTChinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket socketServer = new ServerSocket(9999);
	System.out.print("I'm listening on 9999 port...");
		
        int id = 0;
        while (true) {
            Socket s = socketServer.accept();
            id ++;
            // new LuongLamVSiec(s, id++).start();
            LuongLamViec luongTask = new LuongLamViec(s, id);
            luongTask.start();
    }
    
}
