/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byt6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observer;

/**
 *
 * @author mtrzonkowski
 */
public class MyWebSite implements MyObserved{
    
    private ArrayList <MyObserver> observers;
    private String url;
    private URL address;
    private URLConnection connect;
    
    private Long longtime;
    
    public MyWebSite(String url) throws MalformedURLException, IOException {
        this.url=url;
        address=new URL(url);
        observers=new ArrayList<MyObserver>();
        longtime=0L;
    }
    
    

    @Override
    public void addObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        int i=observers.indexOf(observer);
        observers.remove(i);
    }

    @Override
    public void informObserver() {
        for(MyObserver observer: observers){
            observer.update(longtime);
        }
    }
    
    public void checkDate() throws IOException{
        connect = address.openConnection();
        if(longtime != connect.getLastModified()){
            longtime=connect.getLastModified();
            System.out.println("Strona "+ url+ " się zmieniła." +connect.getLastModified());
        }else{
            System.out.println("Strona "+ url+ " się nie zmieniła. "+ connect.getLastModified());
            
        }
    }
  
}
