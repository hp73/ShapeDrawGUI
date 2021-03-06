/*
 * This is a ShapeDrawGUI class that adds a frame,buttons, and button functionality
 * to the GUI where shapes will be printed.
 * @author Harry Pinkerton
 * @version 1.0 Project 4
 * 
 */

//JFrame is in here
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import shapes.*;


//import com.apple.eawt.ApplicationEvent;
//import com.apple.eawt.ApplicationListener;


public class ShapeDrawGUI extends JFrame implements ActionListener, ItemListener {
    
   // Class Variables  
   private Canvas canvas;
   private JButton triangleButton;
   private JButton circleButton;
   private JButton squareButton;
   private JButton rectangleButton;
   private JButton ovalButton;
   private JButton octagonButton;
   private JCheckBox filledButton;
   private JButton redButton;
   private JButton blueButton;
   private JButton greenButton;
   private JButton pinkButton;
   private JButton yellowButton;
   private JButton orangeButton;

   private String shapePicker;

   private ShapeHolder container = ShapeHolder.getInstance();
   
   
   public ShapeDrawGUI() {
      
      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      GridBagConstraints positionConst = new GridBagConstraints();
      positionConst.insets = new Insets(10, 10, 10, 10);

      // Set up the window
      setSize(1100,800);        
      setTitle("Draw Shapes");        
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Add the canvas
      positionConst.gridx = 0;
      positionConst.gridy = 0;
      positionConst.fill = GridBagConstraints.BOTH;
      positionConst.gridwidth = GridBagConstraints.REMAINDER;
      positionConst.weightx = 1;
      positionConst.weighty = 1;


      //the canvas is doing anything that is drawn
      canvas = new Canvas(this.container);        
      add(canvas, positionConst);
      
      positionConst.fill = GridBagConstraints.HORIZONTAL;
      positionConst.gridwidth = 1;
      positionConst.gridy = 1;
      positionConst.weighty = 0;

      
      
      // Adding buttons and checkboxes 

      
      // Create "Triangle" Button
      triangleButton = new JButton("Triangle");
      
      positionConst.gridx = 0;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(triangleButton, positionConst);
      
      
      //Create "Circle" Button
      circleButton = new JButton("Circle");
      circleButton.addActionListener(this);
      circleButton.getText();
      //Canvas.shape = "Circle";

      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 1;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(circleButton, positionConst);
      
      
      // Create "Square" Button
      squareButton = new JButton("Square");
      squareButton.addActionListener(this);
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 2;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(squareButton, positionConst);
      
      
      // Create "Rectangle" Button
      rectangleButton = new JButton("Rectangle");
      rectangleButton.addActionListener(this);
   
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 3;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(rectangleButton, positionConst);
      
      
      //Create "Oval" Button
      ovalButton = new JButton("Oval");
      ovalButton.addActionListener(this);
   
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 4;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(ovalButton, positionConst);
      
      
      //Create "Octagon" Button
      octagonButton = new JButton("Octagon");
      octagonButton.addActionListener(this);
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 5;
      positionConst.gridy = 1;
      add(octagonButton, positionConst);
      
      
      //Create "Red" Button
      redButton = new JButton("Red");
      redButton.addActionListener(this);
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 0;
      positionConst.gridy = 2;
      add(redButton, positionConst);
      
      
      //Create "Blue" Button
      blueButton = new JButton("Blue");
      blueButton.addActionListener(this);
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 1;
      positionConst.gridy = 2;
      add(blueButton, positionConst);
      
      
      //Create "Green" Button
      greenButton = new JButton("Green");
      greenButton.addActionListener(this);
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 2;
      positionConst.gridy = 2;
      add(greenButton, positionConst);
      
      //Create "Pink" Button
      pinkButton = new JButton("Pink");
      pinkButton.addActionListener(this);
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 3;
      positionConst.gridy = 2;
      add(pinkButton, positionConst);
      
      //Create "Yellow" Button
      yellowButton = new JButton("Yellow");
      yellowButton.addActionListener(this);
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 4;
      positionConst.gridy = 2;
      add(yellowButton, positionConst);
      
      //Create "Orange" Button
      orangeButton = new JButton("Orange");
      orangeButton.addActionListener(this);
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 5;
      positionConst.gridy = 2;
      add(orangeButton, positionConst);
      
      
      //Create "filled" check Box Button
      filledButton = new JCheckBox("filled");
      filledButton.setMnemonic(KeyEvent.VK_C);
      filledButton.setSelected(true);
      filledButton.addItemListener(this);
      
      positionConst.gridx = 6;
      positionConst.gridy = 1;
      add(filledButton, positionConst);
   }


   @Override
   public void itemStateChanged(ItemEvent event){
      
      JCheckBox sourceEvent = (JCheckBox) event.getItemSelectable();
      
      if (sourceEvent == filledButton){
         System.out.println("Filled");
      }
      if (event.getStateChange() == ItemEvent.DESELECTED){
         System.out.println("Not filled");
      }
   }
   
   @Override
   public void actionPerformed(ActionEvent event){
      Class thing;
      String newShape;
      
      JButton sourceEvent = (JButton) event.getSource();
      if (sourceEvent == triangleButton){
         System.out.println("triangle");

         canvas.setShape("Triangle");
         //this. shapePicker = "Triangle";

         //this.shapePicker = new Triangle();
         //Canvas.draw(Triangle);
      }
      
      if (sourceEvent == circleButton){
         System.out.println("circle");
         canvas.setShape("Circle");


         //this.shapePicker = new Circle();

         //canvas.draw(Circle);
      }
      
      if (sourceEvent == squareButton){
         System.out.println("square");
         canvas.setShape("Square");

         //shapePicker = new Square();

      }
      
      if (sourceEvent == rectangleButton){
         System.out.println("rectangle");
         canvas.setShape("Rectangle");

         //shapePicker = new shapes.Rectangle();

      }
      
      if (sourceEvent == ovalButton){
         System.out.println("oval");
         canvas.setShape("Oval");
         //shapePicker = new Oval();

      }
      
      if (sourceEvent == octagonButton){
         System.out.println("octagon");
         canvas.setShape("Octagon");
         //shapePicker = new Octagon();

      }
      
      if (sourceEvent == redButton){
         System.out.println("red");

         
      }
      
      if (sourceEvent == blueButton){
         System.out.println("blue");
      }
      
      if (sourceEvent == greenButton){
         System.out.println("green");
      }
      
      if (sourceEvent == pinkButton){
         System.out.println("pink");
      }
      
      if (sourceEvent == yellowButton){
         System.out.println("yellow");
      }
      
      if (sourceEvent == orangeButton){
         System.out.println("orange");
      }
    
   }


 
   
   //this is what main will look like
   public static void main(String[] args) {
       
      // Main frame
      ShapeDrawGUI appFrame = new ShapeDrawGUI();                
      
      // Show window
      appFrame.setVisible(true);
       
   }
}