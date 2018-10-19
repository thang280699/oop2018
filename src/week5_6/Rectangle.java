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
public class Rectangle extends Shape{
    public Coordinate a,b,c,d ;
    public void setA(Coordinate m){
        this.a = m;
    }
    public Coordinate getA(){
        return this.a ;
    }
     public void setB(Coordinate n){
        this.b = n ;
    }
    public Coordinate getB(){
        return this.b ;
    }
    public void setC(Coordinate p){
        this.c = p ;
    }
    public Coordinate getC(){
        return this.c ;
    }
    public void setD(Coordinate q){
        this.d = q;
    }
    public Coordinate getD(){
        return this.d ;
    }
    public Rectangle(String color, Coordinate a, Coordinate b, Coordinate c, Coordinate d){
        this.a = a ;
        this.b = b;
        this.c = c;
        this.d = d;
        super.setColor(color);
    }
    public void Rectangle(){
    }
    public double Length(){
        double x =  (a.getx() - b.getx())*(a.getx() - b.getx());
        double y = (a.gety() - b.gety())*(a.gety() - b.gety());
        double length = Math.sqrt(x+y);
        return length ;
    }
    public double Width(){
        double x =(b.getx() - c.getx())*(b.getx() -c.getx() );
        double y =(b.gety() - c.gety())* (b.gety() - c.gety());
        double width = Math.sqrt(x+y);
        return width;
    }
    
    @Override
    public String toString(){
        return "length: "+ Length() + "    Width: " + Width();
    }
            
    
    
        
    
   
    
    
    
}
