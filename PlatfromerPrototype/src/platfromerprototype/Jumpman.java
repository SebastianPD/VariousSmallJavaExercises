/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platfromerprototype;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Sebastian
 */
public class Jumpman {
    
    /// TODO make timer for jump button so it has a cooldown or disable 
    
     Rectangle rectangle;
     PlatfromerPrototype Gameinstance;
     Pane root = new Pane();
     
    double cooldown = 0;
     
    double vy = 200;
    double NewVy = 0;
    double vx = 200;
    double y = 200;
    double x = 200;
    double startingy;
    double height = 0;
    
    double fallspeed = 10000;
    boolean gravity = false;
    
    double LastTimeStep;
  
    boolean uPressed;
    boolean dPressed;
    boolean lPressed;
    boolean rPressed;
    
    Jumpman(Pane container, PlatfromerPrototype Gameinstance){
    
    this.Gameinstance = Gameinstance;
    
    rectangle = new Rectangle(x, y, 20, 20);
    rectangle.setFill(Color.RED);

    container.getChildren().add(rectangle);
    }  
    
     void update (double t){
  
    if (cooldown > .125){
    Gameinstance.uPressed = false;
        vy = 0;
    
    }
   
    if (Gameinstance.uPressed){
    startingy=y;
    
    }
   
    height = Math.abs(y-startingy);
 
    if (height==100)
    {
        System.out.println("true");
      vy = 0;
      Gameinstance.uPressed = false;
    }
    
    
     if (y+20 >= 650){
     
     fallspeed = 0;
     height = 0;
     cooldown = 0;
     }
    // else {fallspeed = 10000;}
     
    NewVy = vy + fallspeed*t;
         
    y = NewVy*t + y;
   // y = vy*t + y;
    x = vx*t + x;
    
    LastTimeStep = t;
    
    
    
}
    
    
    void relocate(){
    rectangle.relocate(x, y);
    
    }
    
     void CheckInput (double t){
     
     boolean bottom = (y + 20 > 600);
     boolean top = (y < 0);
     boolean right = (x + 20 > 1400);
     boolean left = (x < 0);
     
     
    if (Gameinstance.uPressed && !top){
   // vy = -200;
   vy = -141.421356237;
    fallspeed = -50000;
    startingy=y;
    cooldown +=t;
   
    
    }
    else if (Gameinstance.dPressed && !bottom){
    vy = 200;
    }else {
    vy = 0;
     fallspeed = 10000;
    //vy2 = 0;
    }
    
    if (Gameinstance.lPressed && !left){
    vx = -200;}
    else if (Gameinstance.rPressed && !right){
    vx = 200;
    }else {
    vx = 0;
    //vx2 = 0;
    }
    
    
   if(Gameinstance.uPressed && Gameinstance.lPressed && !left && !top){
   vx = -705.421356237;
   vy = -705.421356237;
   fallspeed = -5000;
   }
   
   if(Gameinstance.uPressed && Gameinstance.rPressed && !right && !top){
   vx = 705.421356237;
   vy = -705.421356237;
  fallspeed = -5000;
   }
   
   if(Gameinstance.dPressed && Gameinstance.lPressed && !left && !bottom){
   vx = -141.421356237;
   vy = 141.421356237;
   }
   
   if(Gameinstance.dPressed && Gameinstance.rPressed && !right && !bottom){
   vx = 141.421356237;
   vy = 141.421356237;
   }
    
    
    }
      void CheckCol(){
    
    for (int i = 0 ; i < Gameinstance.walls.size(); i++){
     
             Walls currentWall = Gameinstance.walls.get(i);
             
             
              double box1Right = x+20;
              double box1Left = x;
              double box1Top = y;
              double box1Bottom = y+20;
              double box2Left = currentWall.x;
              double box2Right = currentWall.x + currentWall.width;
              double box2Top = currentWall.y;
              double box2Bottom = currentWall.y + currentWall.height;
              
             if (   
                (
                    ((box1Left >= box2Left) && (box1Left <= box2Right)) 
                    || ((box1Right >= box2Left) && (box1Right <= box2Right))
                    || ((box2Left >= box1Left) && (box2Left <= box1Right))
                    || ((box2Right >= box1Left) && (box2Right <= box1Right))
                )
                    &&
                (
                    (box1Top >= box2Top) && (box1Top <= box2Bottom) 
                    || ((box1Bottom >= box2Top) && (box1Bottom <= box2Bottom))
                    || ((box2Top >= box1Top) && (box2Top <= box1Bottom))
                    || ((box2Bottom >= box1Top) && (box2Bottom <= box1Bottom))
                     )    
            ){
           /////
           cooldown =0;
          fallspeed = 0;
                x = x-vx*LastTimeStep;
                y = y-NewVy*LastTimeStep;
           
           
           double Centerx = x+10;
           double Centery = y+10;
           
           double boxCx = currentWall.x + .5*currentWall.width;
           double boxCy = currentWall.y + .5*currentWall.height;
           

           
           
           double distanceX =  Math.abs(Centerx - boxCx) - 10 - .5*currentWall.width;
           double distanceY = Math.abs(Centery - boxCy) - 10 - .5*currentWall.height;
           
           double Tx = distanceX/Math.abs(vx);
           double Ty = distanceY/Math.abs(NewVy);
           
           
            double t = Double.max(Tx, Ty);
            
            
            
            if (Double.isFinite(t)){
                
                if(Tx > Ty){
                x = x+vx*t;
                y = y+NewVy*LastTimeStep;
                
                
                }
                else if(Tx < Ty){
                x = x+vx*LastTimeStep;
                y = y+NewVy*t;
             
                }
                else {
                x = x+vx*t;
                y = y+NewVy*t;
              
                }
            }else{
                x += vx*LastTimeStep*.95;
                y += NewVy*LastTimeStep*.95;
                
            }
           }
             
    
    }   
 
 }
}
