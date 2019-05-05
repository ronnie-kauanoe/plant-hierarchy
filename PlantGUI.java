import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;

/**
* Plant GUI driver class.
* @author Ronnie Kauanoe
* @since 4/10/19
*/
public class PlantGUI {
   /**
   * Main method.
   * @param args Arguments for main method.
   */
   public static void main(String[] args) {
      JFrame frm = new JFrame("Modeling Native Plants using"
          + "Object-Oriented Programming");
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.setPreferredSize(new Dimension(1920, 1000));
      frm.getContentPane().add(new PlantPanel());
      frm.pack();
      frm.setVisible(true);
   }
}