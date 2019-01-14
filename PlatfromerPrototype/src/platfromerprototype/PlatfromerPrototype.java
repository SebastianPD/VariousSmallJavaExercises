/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platfromerprototype;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Sebastian
 */
public class PlatfromerPrototype extends Application {
    
    Pane root = new Pane();
    Jumpman player = new Jumpman(root, this);
    
    ArrayList<Walls> walls = new ArrayList();
   
    AnimationTimer timer;
    long lastFrame;
    
    boolean uPressed;
    boolean dPressed;
    boolean lPressed;
    boolean rPressed;
    
    boolean LU;
    boolean LD;
    boolean LL;
    boolean LR;
    
    @Override
    public void start(Stage primaryStage) {
       
        makeWall(200,10, 10,470 );
        makeWall(200,10, 250,430 );
        makeWall(20,100, 400,300 );
        makeWall(20,100, 320,300 );
          
           lastFrame = System.nanoTime();
         timer = new AnimationTimer(){
            @Override
            public void handle(long currentFrame) {
            double Time = (currentFrame-lastFrame)/1000000000.0;
            
            player.CheckInput(Time);
          
            player.update(Time);
            player.CheckCol();
            
            
            updatewalls();
            player.relocate();
            lastFrame = currentFrame; 
            
            }};
            
             root.setOnKeyPressed((event) -> {
         if (event.getCode() == KeyCode.UP && player.cooldown < .125){
            uPressed=true;
            LU=true;
            LD=false;
            LR=false;
            LL=false;
            }
        if (event.getCode() == KeyCode.DOWN){
            dPressed=true;
            LD=true;
            LU=false;
            LR=false;
            LL=false;
            }
        if (event.getCode() == KeyCode.LEFT){
            lPressed=true;
            LL=true;
            LD=false;
            LR=false;
            LU=false;
            }
        if (event.getCode() == KeyCode.RIGHT){
            rPressed=true;
            LR=true;
            LD=false;
            LU=false;
            LL=false;
            }});
         
          root.setOnKeyReleased((event) -> {
        if (event.getCode() == KeyCode.UP){
           uPressed=false;
            }
        if (event.getCode() == KeyCode.DOWN){
           dPressed=false;
            }
        if (event.getCode() == KeyCode.LEFT){
            lPressed=false;
            }
        if (event.getCode() == KeyCode.RIGHT){
            rPressed=false;
            }
        });
            
        

        timer.start();
        Scene scene = new Scene(root, 1400, 600);
        primaryStage.setTitle("Platformer Prototype!");
        primaryStage.setScene(scene);
        primaryStage.show();
         root.requestFocus();
    }
     void makeWall(double width, double height, double x, double y) {
    
        Walls newwall = new Walls(root);
        newwall.width = width;
        newwall.height = height;
        newwall.x = x;
        newwall.y = y;
        newwall.rectangle.setWidth(width);
        newwall.rectangle.setHeight(height);
        walls.add(newwall);
        
    }
     void updatewalls(){
    
         for (int i = 0 ; i < walls.size(); i++){
        
        walls.get(i).rectangle.relocate(walls.get(i).x, walls.get(i).y);
        
         }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
