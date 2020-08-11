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
    static int winx = 0;
    static int wino = 0;
    
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
    public int getwinx()
    {
        return winx;
    }
    public int getwino()
    {
        return wino;
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
    
    private boolean draw()
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
    
    private boolean win()
    {
        for (int i = 0; i < 3; i++) 
        {
            if (board[i][0] != 0 && board[i][1] == board[i][0] && board[i][0] == board[i][2]) return true;
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[0][i] == board[2][i]) return true;         
        }
        if (board[0][0] != 0 && board[1][1] == board[0][0] && board[0][0] == board[2][2]) return true;
        if (board[0][2] != 0 && board[1][1] == board[0][2] && board[0][2] == board[2][0]) return true;
        return false;
    }
    
    public int end()
    {
        if (win())
        {
            if (fturn)
            {
                ++winx;
                return 1;
            }
            else
            {
                ++wino;
                return 2;
            }
        }
        else if (draw()) return 0;
        return -1;
    }
}
