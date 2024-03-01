/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayin_tarlasi;
import java.util.*;
/**
 *
 * @author Yiğit
 */
public class Mayin_tarlasi {
    int rownumber,colnumber,size;
    int[][] map;
    int[][] board;
    boolean game = true;
    Random rand= new Random();
    Scanner input = new Scanner(System.in);
    Mayin_tarlasi(int rownumber,int colnumber)
    {
        this.rownumber=rownumber;
        this.colnumber=colnumber;
        this.map=new int[rownumber][colnumber];
        this.board=new int[rownumber][colnumber];
        this.size=rownumber*colnumber;
        
    }
    public void run(){
        int row,col,success=0;
        prepare();
        //print(map);
        System.out.print("\n");
        while(game)
        {
            print(board);
            System.out.println("satir sayisi");
            row=input.nextInt();
            System.out.println("sutun sayisi");
            col=input.nextInt();
            if(map[row][col]!=(-1))
            {
                checkMayin(row,col);
                success++;
                if(success== size- (size/4)){
                    System.out.println("basariliniz");
                break;
                }
                }
            else
            {
                game = false;
                System.out.println("Game OVer");
            }
        }
    }
    public void checkMayin(int r,int c)
    {
        if(map[r][c]== 0)
        {
         if(c<colnumber-1 && (map[r][c+1]==(-1)))
            board[r][c]++;
         if(r<rownumber-3 && (map[r+1][c]==(-1)))
            board[r][c]++;
         if(r>0 && (map[r-1][c]==(-1)))
            board[r][c]++;
         if(c>0 && (map[r][c-1]==(-1)))
            board[r][c]++;
         if(board[r][c]== 0)
             board[r][c]=(-2);
        }
    }
    public void prepare()
    {
        int randRow,randCol,count=0;
        while (count != (size/4)) {
            randRow= rand.nextInt(rownumber);
            randCol= rand.nextInt(colnumber);
            if(map[randRow][randCol]!= (-1))
            {
                  map[randRow][randCol]= (-1);
                  count++;
            }
            
        }
    }
    public void print(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]>=0)
                    System.out.print(" ");
                System.out.print(arr[i][j]+"   ");
                
                
                }
            System.out.println();
        }
    }
    
}
