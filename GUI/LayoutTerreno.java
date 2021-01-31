/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author Gui
 */

public class LayoutTerreno extends JLabel {

    public LayoutTerreno() {
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }
}