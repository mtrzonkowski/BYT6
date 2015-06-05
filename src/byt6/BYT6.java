/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byt6;

import java.io.IOException;

/**
 *
 * @author mtrzonkowski
 */
public class BYT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
       MyWebSite fotopia=new MyWebSite("http://www.fotopia.pl/");
       MyWebSite pjwstk=new MyWebSite("https://translate.google.pl/?hl=pl&tab=wT#en/pl/stalker");
       MyStalker fotopiaStalker=new MyStalker(fotopia);
       MyStalker pjwstkStalker = new MyStalker(pjwstk);
       
       for(int i=0;i<100;i++){
           fotopia.checkDate();
           pjwstk.checkDate();
           Thread.sleep(500);
       }
       
    }
    
}
