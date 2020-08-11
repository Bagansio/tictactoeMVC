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

    private Controller_result ctrl;
    private Model model;
    private View_Game view;
    private JButton[][]  btns;
    private JLabel[][] lbls;
    /*
        CREATOR OF THE CONTROLLER GAME
        it starts the view and the model
        also in the view start each button
     */
    public Controller_game() {
        view = new View_Game();
        model = new Model();
        ctrl = new Controller_result(view);
        
        making_buttons();
        making_labels();
    }
    
    private void making_labels()
    {
        lbls = new JLabel[3][3];
        lbls[0][0] = view.sq00;
        lbls[0][1] = view.sq01;
        lbls[0][2] = view.sq02;
        lbls[1][0] = view.sq10;
        lbls[1][1] = view.sq11;
        lbls[1][2] = view.sq12;
        lbls[2][0] = view.sq20;
        lbls[2][1] = view.sq21;
        lbls[2][2] = view.sq22;     
    }
    private void making_buttons()
    {
        btns = new JButton[3][3];
        btns[0][0] = view.btn00;
        btns[0][1] = view.btn01;
        btns[0][2] = view.btn02;
        btns[1][0] = view.btn10;
        btns[1][1] = view.btn11;
        btns[1][2] = view.btn12;
        btns[2][0] = view.btn20;
        btns[2][1] = view.btn21;
        btns[2][2] = view.btn22;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                start_button(btns[i][j]);
            }
            
        }
        view.btn_restart.addActionListener(this);
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
            label.setVisible(true);
            
            
            if(! finish()) change_turn(model.isFturn());
        }
    }
    
    private boolean finish()
    {
        int end = model.end();
        if(end >= 0)
        {
            if (end == 1) view.label_winsX.setText("PLAYER 1 (X) WINS: " + model.getwinx());
            else if (end == 2) view.label_winsO.setText("PLAYER 1 (0) WINS: " + model.getwino());
            ctrl.result(end);
            ctrl.visiblity(true);
            restart();
            return true;
        }
        return false;
    }
    
    private void restart()
    {
        model = new Model();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                lbls[i][j].setVisible(false);
            }
 
        }
        //model.setFturn(false);
        change_turn(false);
        
    }

    public void change_turn(boolean Xturn)
    {
        model.setFturn(!Xturn);
        if (!Xturn) view.label_turn.setText("TURN OF: PLAYER 1 --X--");
        else view.label_turn.setText("TURN OF: PLAYER 2 --O--");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(e.getSource() == btns[i][j])
                {
                    control_action(lbls[i][j],i,j);
                    return;
                }
                
            }
            
        }
        restart();
    }

}
