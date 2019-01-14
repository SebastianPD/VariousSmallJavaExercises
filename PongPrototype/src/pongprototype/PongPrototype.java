/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongprototype;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Sebastian
 */
public class PongPrototype extends Application {
    
    Circle Ball;
    AnimationTimer timer;
    long lastFrame;
    
    double x;
    double y;
    
    double vx;
    double vy;
    
    
    @Override
    
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 700, 394);
        
        x = (700*Math.random()+1);
        y = (394*Math.random()+1);
        vx = 200;
        vy = 200;
       
        Ball = new Circle(0,0,10, Color.BLACK);
        Ball.setLayoutY(y);
        Ball.setLayoutX(x); 
        
        
        
        
        
        lastFrame = System.nanoTime();
        timer = new AnimationTimer(){
            @Override
            public void handle(long currentFrame) {
                double frameTime = (currentFrame-lastFrame)/1000000000.0;
                updatePhysics(frameTime);
                lastFrame = currentFrame;
            }
        };
        
        
        root.getChildren().add(Ball);
        primaryStage.setTitle("PONG");
        
        timer.start();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    void updatePhysics(double t){
       
       
        
        
       
        
       y = y + vy * t;
       x = x + vx * t;
       Ball.setLayoutY(y);
       Ball.setLayoutX(x);
        
        if (x > 700 - 10) {
                    vx = -1*vx;
                    x= x-1;
                    x = x + vx * t;
                    Ball.setLayoutX(x);
                }
        if (x < 0 + 10) {
                    vx = -1*vx;
                    x= x-1;
                    x = x + vx * t;
                    Ball.setLayoutX(x);
                }
        if (y > 394 - 10){
                    vy = -1*vx;
                    y= y-1;
                    y = y + vy * t;
                    Ball.setLayoutY(y);
                    
                }
        if (y < 0 + 10){
                    vy = -1*vx;
                    y= y-1;
                    y = y + vy * t;
                    Ball.setLayoutY(y);
                }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
