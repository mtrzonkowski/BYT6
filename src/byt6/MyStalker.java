/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byt6;

import java.util.Date;

/**
 *
 * @author mtrzonkowski
 */
public class MyStalker implements MyObserver,MyInformation{
    private long date;
    private MyWebSite myWebSite;

    public MyStalker(MyWebSite myWebSite) {
        this.myWebSite = myWebSite;
        date=0L;
    }
    
    

    @Override
    public void update(Long date) {
        this.date=date;
    }

    @Override
    public void inform() {
        System.out.println(myWebSite+" zmiana");
    }
    
    public void removeMe(){
        myWebSite.removeObserver(this);
    }
}
