/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import javax.swing.JFrame;

/**
 *
 * @author udeshay
 */
public class Notepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotepadGUI obj = new NotepadGUI();
        obj.setTitle("Untitled-Notepad");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
