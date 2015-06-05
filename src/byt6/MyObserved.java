/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byt6;

import java.util.Observer;

/**
 *
 * @author mtrzonkowski
 */
public interface MyObserved {
    
    public void addObserver(MyObserver observer);
    public void removeObserver(MyObserver observer);
    public void informObserver();
            
    
}
