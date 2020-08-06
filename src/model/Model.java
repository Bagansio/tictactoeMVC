/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagansio
 */

// Creates a Model
public class Model 
{
    private char[][] board;
    boolean fturn;

    
    public Model()
    {
        board = new char[3][3];
        fturn = true;
        for (int i = 3; i < 3; i++) 
        {
            for (int j = 3; j < 3; j++) 
            {
                board[i][j] = ' ';
            }
        }
    }
    
    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public boolean isFturn() {
        return fturn;
    }

    public void setFturn(boolean fturn) {
        this.fturn = fturn;
    }
    
    public boolean empty(int x, int y)
    {
        if (board[x][y] == ' ') return true;
        return false;
    }
    
}
