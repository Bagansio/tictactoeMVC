/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import controller.Controller_menu;
import model.Model;
import view.View_menu;
import view.View_Game;

/**
 *
 * @author Bagansio
 */
public class Tictac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

        Controller_menu ctrlM = new Controller_menu();
        ctrlM.start();        
    }
    
}
