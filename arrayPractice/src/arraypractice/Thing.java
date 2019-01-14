/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;

/**
 *
 * @author Sebastian
 */
public class Thing {
    
    Button btn;
    double width = 40;
    double height = 40;
    double x;
    double y;
    
    Thing (Pane container){
   
        Button btn = new Button();
        btn.setMinSize(width, height);
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
    container.getChildren().add(btn); 
    
    }
   void update (double x, double y){
        
    btn.relocate(x, y);
    
}
    
}
