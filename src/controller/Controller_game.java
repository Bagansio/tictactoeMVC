/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import model.Model;
import view.View_Game;

/**
 *
 * @author Bagansio
 */
public class Controller_game implements ActionListener {

    private Model model;
    private View_Game view;

    /*
        CREATOR OF THE CONTROLLER GAME
        it starts the view and the model
        also in the view start each button
     */
    public Controller_game() {
        view = new View_Game();
        model = new Model();
        start_button(view.btn00);
        start_button(view.btn01);
        start_button(view.btn02);
        start_button(view.btn10);
        start_button(view.btn11);
        start_button(view.btn12);
        start_button(view.btn20);
        start_button(view.btn21);
        start_button(view.btn22);
    }

    /*
        STARTS THE BUTTON
        make the button listener and invisible but functional
    
     */
    private void start_button(JButton btn) {
        btn.addActionListener(this);
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
    }

    /*
        START THE VIEW
     */
    public void start() {
        view.setTitle("TICTACTOE");
        view.setLocationRelativeTo(null);
    }

    /*
        MAKES VISIBLE OR NOT THE VIEW OF THE GAME
     */
    public void visiblity(boolean b) {
        view.setVisible(b);
    }

    private void control_action(JLabel label, int x, int y) {
        if (model.empty(x, y)) {
            if (model.isFturn()) 
            {
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/x.png")));
            } 
            else 
            {
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/o.png")));
            }
            model.setSquare(x,y);
            model.setFturn(!model.isFturn());
            label.setVisible(true);
            change_turn();
            if (model.draw()) System.exit(0);
        }
    }

    public void change_turn()
    {
        if (model.isFturn()) view.label_turn.setText("TURN OF: PLAYER 1 --X--");
        else view.label_turn.setText("TURN OF: PLAYER 2 --O--");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == view.btn00) 
        {
            control_action(view.sq00, 0, 0);
        } 
        else if (e.getSource() == view.btn01) 
        {
            control_action(view.sq01, 0, 1);
        } 
        else if (e.getSource() == view.btn02) 
        {
            control_action(view.sq02, 0, 2);
        } 
        else if (e.getSource() == view.btn10) 
        {
            control_action(view.sq10, 1, 0);
        }
        else if (e.getSource() == view.btn11) 
        {
            control_action(view.sq11, 1, 1);
        } 
        else if (e.getSource() == view.btn12) 
        {
            control_action(view.sq12, 1, 2);
        } 
        else if (e.getSource() == view.btn20) 
        {
            control_action(view.sq20, 2, 0);
        } 
        else if (e.getSource() == view.btn21) 
        {
            control_action(view.sq21, 2, 1);
        } 
        else if (e.getSource() == view.btn22) 
        {
            control_action(view.sq22, 2, 2);
        }
    }

}
