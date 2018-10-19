/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author CCNE
 */
public class Coordinate{
    public double x,y;
   public void Coodinate(double x, double y){
       this.x = x;
       this.y = y;
   }
   public void setx(double x){
       this.x = x;
   }
    public void sety(double y){
        this.y = y ;
    }
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y ;
    }
}
