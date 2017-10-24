/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provis;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author student
 */

public class ProVis extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ProVis frame = new ProVis();
        frame.setSize(600, 400);
        frame.setTitle("ProVis");
        frame.createGUI();
        frame.show();
    }
    
    public void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
    }
    
}
