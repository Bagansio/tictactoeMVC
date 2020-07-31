/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model_menu;
import view.View_menu;
import view.View_test;

/**
 *
 * @author Bagansio
 */
public class Controller_menu implements ActionListener{
    
    private View_menu view;
    private Model_menu model;
    private View_test viewT;
    
    /*
        This creator makes a controller with a view and a model and put two listeners into the buttons of the view
    PRE: a View_menu && Model_menu
    POST: A Controller_menu its created
    */
    public Controller_menu(View_menu view, View_test viewT, Model_menu model)
    {
        this.view = view;
        this.model = model;
        this.viewT = viewT;
        this.view.btn_play.addActionListener(this);
        this.view.btn_exit.addActionListener(this);
        this.viewT.btn_back.addActionListener(this);
    }
    
    public void start()
    {
        view.setTitle("MENU");
        view.setLocationRelativeTo(null);
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
            viewT.setVisible(true);
        }
        if(e.getSource() == viewT.btn_back)
        {
            view.setVisible(true);
            viewT.setVisible(false);
        }
        if(e.getSource() == view.btn_exit)
        {
            System.exit(0);
            //view.setVisible(false);
        }
    }
}
