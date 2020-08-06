/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View_G;
import view.View_menu;
import view.View_Game;

/**
 *
 * @author Bagansio
 */
public class Controller_menu implements ActionListener{
    
    private View_menu view;
    private Controller_game ctrl;
    
    /*
        This creator makes a controller with a view and a model and put two listeners into the buttons of the view
    PRE: a View_menu && Model
    POST: A Controller_menu its created
    */
    public Controller_menu()
    {
        view = new View_menu();
        ctrl = new Controller_game();
        this.view.btn_play.addActionListener(this);
        this.view.btn_exit.addActionListener(this);
    }
    
    public void start()
    {
        view.setTitle("MENU");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        ctrl.start();
    }
    
    
    /*
        This makes that 
    */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == view.btn_play)
        {
            view.setVisible(false);
            ctrl.visiblity(true);
        }
        if(e.getSource() == view.btn_exit)
        {
            System.exit(0);
            //view.setVisible(false);
        }
    }
}
