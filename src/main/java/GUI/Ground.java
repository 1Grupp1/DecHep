package GUI;

import heptathlon.Hep100MHurdles;
import heptathlon.HeptHightJump;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ground extends JFrame {

    private JTextField insertNameBox;
    private JButton buttonEnterName;
    private JTextPane HeptathlonText;
    private JTextPane textHep100mHurdles;
    private JTextPane textHepHighJump;
    private JTextPane textHepShotPut;
    private JTextPane textHep200m;
    private JTextPane textHepLongJump;
    private JTextPane textHepJavelinThrow;
    private JTextPane textHep800m;
    private JTextField scoreHep100mHurdles;
    private JTextField scoreHepHighJump;
    private JTextField scoreHepShotPut;
    private JTextField scoreHep200m;
    private JTextField scoreHepLongJump;
    private JTextField scoreHepJavelinThrow;
    private JTextField scoreHep800m;
    private JTextPane DecathlonText;
    private JTextPane textDeca100m;
    private JTextPane textDecaLongJump;
    private JTextPane textDecaShotPut;
    private JTextPane textDecaHighJump;
    private JTextPane textDeca400m;
    private JTextPane textDeca110mHurdles;
    private JTextPane textDecaDiscusThrow;
    private JTextPane textDecaPoleVault;
    private JTextPane textDecaJavelinThrow;
    private JTextPane textDeca1500m;
    private JTextField scoreDeca100m;
    private JTextField scoreDecaLongJump;
    private JTextField scoreDecaShotPut;
    private JTextField scoreDecaHighJump;
    private JTextField scoreDeca400m;
    private JTextField scoreDeca110mHurdles;
    private JTextField scoreDecaDiscusThrow;
    private JTextField scoreDecaPoleVault;
    private JTextField scoreDecaJavelinThrow;
    private JTextField scoreDeca1500m;
    private JTextPane pleaseInsertCompetitorsNameTextPane;
    private JTextPane totalPointsText;
    private JTextField totalPointsBox;
    private JPanel GroundPanel;
    private JButton buttonCalculate;
    private JButton buttonEraseScore;
    private JTextField scoreHep100mHurdlesPoints;
    private JTextField scoreDeca100mPoints;
    private JTextField scoreHepHighJumpPoints;
    private JTextField scoreDecaLongJumpPoints;
    private JTextField scoreHepShotPutPoints;
    private JTextField scoreDecaShotPutPoints;
    private JTextField scoreHep200mPoints;
    private JTextField scoreDecaHighJumpPoints;
    private JTextField scoreHepLongJumpPoints;
    private JTextField scoreDeca400mPoints;
    private JTextField scoreHepJavelinThrowPoints;
    private JTextField scoreDeca110mHurdlesPoints;
    private JTextField scoreHep800mPoints;
    private JTextField scoreDecaDiscusThrowPoints;
    private JTextField scoreDecaPoleVaultPoints;
    private JTextField scoreDecaJavelinThrowPoints;
    private JTextField scoreDeca1500mPoints;
    private JTextField SCORETextField;

    public Ground() {
        setContentPane(GroundPanel);
        setTitle("Heptathlon and Decathlon GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 1700);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
        buttonEnterName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String competitorsName = insertNameBox.getText();
                JOptionPane.showMessageDialog(Ground.this, "Hello " + competitorsName + ", good luck today! Your name is now saved in the database.");
            }
        });
        scoreHep100mHurdles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double runningTime = 0;
                try {
                    runningTime = Double.parseDouble(scoreHep100mHurdles.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                    return;
                }
                Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
                hep100MHurdles.calculateResult(runningTime);
                int score = hep100MHurdles.getScore();
                scoreHep100mHurdlesPoints.setText(String.format("%d", score));
            }
        });
        scoreHepHighJump.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreHepHighJump.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                    return;
                }
                HeptHightJump heptHightJump = new HeptHightJump();
                heptHightJump.calculateResult(distance);
                int score = heptHightJump.getScore();
                scoreHepHighJumpPoints.setText(String.format("%d", score));
            }
        });
    }

    public static void main(String[] args) {
        new Ground();
    }
}
