/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.View_Game;
import view.View_result;

/**
 *
 * @author Bagansio
 */
public class Controller_result {
    
    private View_result view;
    
    public Controller_result(View_Game view)
    {
        this.view = new View_result(view,true);
        
    }
    
    public void start()
    {
        view.setTitle("RESULT");
        view.setLocationRelativeTo(null);
    }
    
}
