/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Administrator
 */



class thread extends Thread  {
String s;
 
thread (String s) throws IOException {
  this.s = s;
 
  
  
  
  
  }  
    
    
public  void run(){

    
    try {
 {
            
            InetAddress addresses[]=InetAddress.getAllByName(s);
        for(int i=0 ; i<addresses.length;i++)
            System.out.println(addresses[i]);
        }
    }
    
    
    catch (UnknownHostException ex) {
        Logger.getLogger(thread.class.getName()).log(Level.SEVERE, null, ex);
    }
       
}



}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
     //   InetAddress address = InetAddress.getLoopbackAddress();
     ArrayList<thread> th= new ArrayList<thread>();  
     InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(r);
     System.out.println("Pleas enter Sites:");
      
        
        String token[];
        String line;
//To Fill The file
        while (!((line=br.readLine()).equals("end")))
        {
            th.add(new thread (line));
            
        
        }
        
        
        
        for(int i=0;i<th.size();i++){
        th.get(i).start();
        th.get(i).join();
        }
        
        
        
     
      
}
    
}
