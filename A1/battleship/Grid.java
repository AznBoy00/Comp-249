/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.*;

/**
 *
 * @author Kevin
 */
public class Grid {
    
    private MapObject[][] grid;
    private boolean isDestroyed = false;
    
    public Grid(){
        this.grid = new MapObject[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.grid[i][j] = new MapObject(0);
            }
        }
    }
    
    public void insertGrid(String xy, int type) {
        int x = xy.charAt(0)-64;
        int y = xy.charAt(1);
        this.grid[x][y].setType(type);
    }
    
    public int getGrid(String xy) {
        int x = xy.charAt(0)-64;
        int y = xy.charAt(1);
        return this.grid[x][y].getType();
    }
    
    public void shootRocket(String xy) {
        int x = xy.charAt(0)-64;
        int y = xy.charAt(1);
        switch(this.grid[x][y].getType()) {
            case 0:
                System.out.print("Nothing.");
                break;
            case 1:
                System.out.print("Ship hit.");
                break;
            case 2:
                System.out.print("Boom! Grenade!");
                break;
            case 3:
                System.out.print("Ship hit.");
                break;
            case 4:
                System.out.print("Boom! Grenade!");
                break;
            case 5:
                System.out.print("Position already called.");
                break;    
            default:
                System.out.print("Error.");//E for error
                break;
        }
        this.grid[x][y].setType(5);
    }
    
    public void showGrid() {
        for (int i = 0; i < 8; i++) {
            System.out.print("\t");
            for (int j = 0; j < 8; j++) {
                switch(this.grid[i][j].getType()) {
                    case 0:
                        System.out.print("_ ");
                        break;
                    case 1:
                        System.out.print("S ");
                        break;
                    case 2:
                        System.out.print("G ");
                        break;
                    case 3:
                        System.out.print("s ");
                        break;
                    case 4:
                        System.out.print("g ");
                        break;
                    case 5:
                        System.out.print("* ");
                        break;    
                    default:
                        System.out.print("E ");//E for error
                        break;
                }
            }
            System.out.println();
        }
    }
    
}