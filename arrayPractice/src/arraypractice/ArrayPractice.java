/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Sebastian
 */
public class ArrayPractice extends Application {
    
    AnimationTimer timer;
    long lastFrame;
    ArrayList<Thing> thing = new ArrayList();
    ArrayList<rectangle> rec = new ArrayList();
    Pane root = new Pane();
    
    @Override
    public void start(Stage primaryStage) {
        
        makeThing(50, 25);
        makeRec(20, 20, 200, 20);
       
        
        
          lastFrame = System.nanoTime();
          timer = new AnimationTimer(){
            @Override
            public void handle(long currentFrame) {
            double Time = (currentFrame-lastFrame)/1000000000.0;
            
           
                updateRecs();
                updateThings();
                lastFrame = currentFrame; 
            
            }
        };
    
        timer.start();
       
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Array Practice");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
     void makeThing(double x, double y) {
    
        Thing newThing = new Thing(root);
        newThing.x = x;
        newThing.y = y;
        thing.add(newThing);
  
       
    }
     
       void makeRec(double width, double height, double x, double y) {
    
        rectangle newRec = new rectangle(root);
        newRec.width = width;
        newRec.height= height;
        newRec.x = x;
        newRec.y = y;
        newRec.rectangle.setWidth(width);
        newRec.rectangle.setHeight(height);
        rec.add(newRec);
       
    }
     
      void updateThings(){
    
         for (int i = 0 ; i < thing.size(); i++){
        
        thing.get(i).update(thing.get(i).x, thing.get(i).y);
        
         }
    }
      
       void updateRecs(){
    
         for (int i = 0 ; i < rec.size(); i++){
        
         rec.get(i).rectangle.relocate(rec.get(i).x, rec.get(i).y);
        
         }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    
}
