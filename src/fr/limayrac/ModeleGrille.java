package fr.limayrac;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ModeleGrille {

    public static void main(String[] args) {

        //set title
        JFrame title = new JFrame("Mots croises");
        title.setTitle("Mots croises");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new GridLayout(6, 6, 8, 8));

        //boucle : creation de la grille au format 6x6
        for (int i = 0; i < 6; i++) {
            for (int y = 0; y < 6; y++) {
                frame.add(new JButton("."));
            }
        }

        frame.setVisible(true);
    }
}