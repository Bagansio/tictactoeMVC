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
    private int[][] board;
    boolean fturn;

    
    public Model()
    {
        board = new int[3][3];
        fturn = true;
        for (int i = 3; i < 3; i++) 
        {
            for (int j = 3; j < 3; j++) 
            {
                board[i][j] = 0;
            }
        }
    }
    
    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }
    public void setSquare(int x, int y)
    {
        if (fturn) board[x][y] = 1;
        else board[x][y] = 2;
    }
    public boolean isFturn() {
        return fturn;
    }

    public void setFturn(boolean fturn) {
        this.fturn = fturn;
    }
    
    public boolean empty(int x, int y)
    {
        return board[x][y] == 0;
    }
    
    public boolean draw()
    {
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (board[i][j] == 0) return false;
            }
        }
        return true;
    }
    
}
