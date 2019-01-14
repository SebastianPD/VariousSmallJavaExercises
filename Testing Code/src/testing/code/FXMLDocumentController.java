/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.code;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

/**
 *
 * @author Sebastian
 */
public class FXMLDocumentController implements Initializable {
    
    
    double y=561;
    double x=39;
    boolean uPressed;
    boolean dPressed;
    double vx;
    double vy;
    
    
    @FXML
    private Label label;
    
    @FXML
    private Label label2;
    
    @FXML
    Circle TestPlayer;
    
    @FXML
    AnchorPane root2;
    
    
    
   
    
    //Player1 Ball = new Player1(root2);
    
    
    double lastFrame = System.nanoTime();
    AnimationTimer timer = new AnimationTimer(){
            @Override
            public void handle(long currentFrame) {
            double frameTime = (currentFrame-lastFrame)/1000000000.0;
            
            y = vy*frameTime + y;
            TestPlayer.relocate(x, y);
            
            String counter = String.format("%4.2f", frameTime);
            label2.setText("runtime:  "+counter);
            }
        };
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
       
        root2.setOnKeyPressed((event2) -> {
         if (event2.getCode() == KeyCode.UP){
            uPressed=true;
            System.out.println("true");
            }
        if (event2.getCode() == KeyCode.DOWN){
            dPressed=true;
            }
        });
        
        root2.setOnKeyReleased((event2) -> {
        if (event2.getCode() == KeyCode.UP){
           uPressed=false;
            }
        if (event2.getCode() == KeyCode.DOWN){
           dPressed=false;
            }
        
        });
        
        
     boolean bottom = (y + 100 > 394);
     boolean top = (y < 0);
     
   
     
    if (uPressed && !top){
    vy = -1000;}
    else if (dPressed && !bottom){
    vy = 1000;
    }else {
    vy = 0;
    }
        
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       timer.start();

        // TODO
    }    
    
}
