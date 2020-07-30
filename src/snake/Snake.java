/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import controller.Controller_menu;
import model.Model_menu;
import view.View_menu;

/**
 *
 * @author Bagansio
 */
public class Snake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Model_menu mod = new Model_menu();
        View_menu view = new View_menu();
        
        Controller_menu ctrl = new Controller_menu(view,mod);
        ctrl.start();
        view.setVisible(true);
        
    }
    
}
