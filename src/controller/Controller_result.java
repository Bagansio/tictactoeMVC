/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.View_Game;
import view.View_Result;

/**
 *
 * @author Bagansio
 */
public class Controller_result  implements ActionListener{
    
    private View_Result view;
    
    public Controller_result(View_Game view)
    {
        this.view = new View_Result(view,true);
        start();
        this.view.btn_again.addActionListener(this);
        this.view.btn_exit.addActionListener(this);
    }

    public void start()
    {
        view.setTitle("RESULT");
        view.setLocationRelativeTo(null);
    }
    
    
    public void result(int r)
    {
        switch (r)
        {
            case 0:
                view.lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/draw.png")));
                break;
            case 1:
                view.lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/vico.png")));
                break;
            case 2:
                view.lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/vicx.png")));
                break;
        }
    }
    /*
        MAKES VISIBLE OR NOT THE VIEW OF THE GAME
     */
    public void visiblity(boolean b) {
  
        view.setVisible(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == view.btn_again)
        {
            view.setVisible(false);
        }
        else System.exit(0);
    }
    
    
}
