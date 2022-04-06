/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class LuongLamViec extends Thread {
	Socket socketClient;
	int id = -1;
	

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
			OutputStream osToClient = socketClient.getOutputStream();	
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2Client);
		
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
				
			while(true){
				String chuoiNhan=buffR.readLine();
				System.out.print(chuoiNhan);
				
				if(chuoiNhan.equals("0")) {
					String chuoiGui= "zero";
					buffW.write(chuoiGui+"");
					buffW.flush();
				}else if(chuoiNhan.equals("1")) {
					String chuoiGui= "F:\\Lap trinh mang Project\\Buoi4\\src\\buoi4\\1.txt";
                                        
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("2")) {
					String chuoiGui= "two";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("3")) {
					String chuoiGui= "three";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("4")) {
					String chuoiGui= "four";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("5")) {
					String chuoiGui= "five";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("6")) {
					String chuoiGui= "six";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("7")) {
					String chuoiGui= "seven";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("8")) {
					String chuoiGui= "eight";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("9")) {
					String chuoiGui= "night";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("10")) {
                                        String chuoiGui= "ten";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
					break;
				}
				
			}
			socketClient.close();
				}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}


