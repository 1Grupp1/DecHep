package GUI;

import decathlon.*;
import heptathlon.*;

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
    private JTextField POINTSTextField;
    private JTextField SCORETextField2;
    private JTextField POINTSTextField2;

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
                    if (runningTime < 11 || runningTime > 26.4) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 11 and 26.4 seconds");
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
                    if (distance < 75.5 || distance > 260) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 75.5 and 260 centimeters");
                    return;
                }
                HeptHightJump heptHightJump = new HeptHightJump();
                heptHightJump.calculateResult(distance);
                int score = heptHightJump.getScore();
                scoreHepHighJumpPoints.setText(String.format("%d", score));
            }
        });
//<<<<<<< HEAD
        scoreHepShotPut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreHepShotPut.getText());
                    if (distance < 1.53 || distance > 25) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 1.53 and 25 meters");
                    return;
                }
                HeptShotPut heptShotPut = new HeptShotPut();
                heptShotPut.calculateResult(distance);
                int score = heptShotPut.getScore();
                scoreHepShotPutPoints.setText(String.format("%d", score));
            }
        });
        scoreHep200m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double runningTime = 0;
                try {
                    runningTime = Double.parseDouble(scoreHep200m.getText());
                    if (runningTime < 18 || runningTime > 42.08) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 18 and 42.08 seconds");
                    return;
                }
                Hep200M hep200M = new Hep200M();
                hep200M.calculateResult(runningTime);
                int score = hep200M.getScore();
                scoreHep200mPoints.setText(String.format("%d", score));
            }
        });
        scoreHepLongJump.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreHepLongJump.getText());
                    if (distance < 214 || distance > 1000) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 214 and 1000 centimeters");
                    return;
                }
                HeptLongJump heptLongJump = new HeptLongJump();
                heptLongJump.calculateResult(distance);
                int score = heptLongJump.getScore();
                scoreHepLongJumpPoints.setText(String.format("%d", score));
            }
        });
        scoreHepJavelinThrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreHepJavelinThrow.getText());
                    if (distance < 3.9 || distance > 90) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 3.9 and 90 meters");
                    return;
                }
                HeptJavelinThrow heptJavelinThrow = new HeptJavelinThrow();
                heptJavelinThrow.calculateResult(distance);
                int score = heptJavelinThrow.getScore();
                scoreHepJavelinThrowPoints.setText(String.format("%d", score));
            }
        });
        scoreHep800m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double runningTime = 0;
                try {
                    runningTime = Double.parseDouble(scoreHep800m.getText());
                    if (runningTime < 70 || runningTime > 250.79) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 70 and 250.79 seconds");
                    return;
                }
                Hep800M hep800M = new Hep800M();
                hep800M.calculateResult(runningTime);
                int score = hep800M.getScore();
                scoreHep800mPoints.setText(String.format("%d", score));
            }
        });
        scoreDeca100m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double runningTime = 0;
                try {
                    runningTime = Double.parseDouble(scoreDeca100m.getText());
                    if (runningTime < 9 || runningTime > 17.9) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 9 and 17.9 seconds");
                    return;
                }
                Deca100M deca100M = new Deca100M();
                deca100M.calculateResult(runningTime);
                int score = deca100M.getScore();
                scoreDeca100mPoints.setText(String.format("%d", score));
            }
        });
        scoreDecaLongJump.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreDecaLongJump.getText());
                    if (distance < 225 || distance > 1000) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 225 and 1000 centimeters");
                    return;
                }
                DecaLongJump decaLongJump = new DecaLongJump();
                decaLongJump.calculateResult(distance);
                int score = decaLongJump.getScore();
                scoreDecaLongJumpPoints.setText(String.format("%d", score));
            }
        });
        scoreDecaShotPut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreDecaShotPut.getText());
                    if (distance < 1.53 || distance > 25) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 1.53 and 25 meters");
                    return;
                }
                DecaShotPut decaShotPut = new DecaShotPut();
                decaShotPut.calculateResult(distance);
                int score = decaShotPut.getScore();
                scoreDecaShotPutPoints.setText(String.format("%d", score));
            }
        });
        scoreDecaHighJump.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreDecaHighJump.getText());
                    if (distance < 76.2 || distance > 260) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 76.2 and 260 centimeters");
                    return;
                }
                DecaHighJump decaHighJump = new DecaHighJump();
                decaHighJump.calculateResult(distance);
                int score = decaHighJump.getScore();
                scoreDecaHighJumpPoints.setText(String.format("%d", score));
            }
        });
        scoreDeca400m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double runningTime = 0;
                try {
                    runningTime = Double.parseDouble(scoreDeca400m.getText());
                    if (runningTime < 42.5 || runningTime > 81) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 42.5 and 81 seconds");
                    return;
                }
                Deca400M deca400M = new Deca400M();
                deca400M.calculateResult(runningTime);
                int score = deca400M.getScore();
                scoreDeca400mPoints.setText(String.format("%d", score));
            }
        });
        scoreDeca110mHurdles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double runningTime = 0;
                try {
                    runningTime = Double.parseDouble(scoreDeca110mHurdles.getText());
                    if (runningTime < 12 || runningTime > 28) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 12 and 28 seconds");
                    return;
                }
                Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
                deca110MHurdles.calculateResult(runningTime);
                int score = deca110MHurdles.getScore();
                scoreDeca110mHurdlesPoints.setText(String.format("%d", score));
            }
        });
        scoreDecaDiscusThrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreDecaDiscusThrow.getText());
                    if (distance < 4.1 || distance > 76) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 4.1 and 76 meters");
                    return;
                }
                DecaDiscusThrow decaDiscusThrow = new DecaDiscusThrow();
                decaDiscusThrow.calculateResult(distance);
                int score = decaDiscusThrow.getScore();
                scoreDecaDiscusThrowPoints.setText(String.format("%d", score));
            }
        });
        scoreDecaPoleVault.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreDecaPoleVault.getText());
                    if (distance < 103 || distance > 700) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 103 and 700 centimeters");
                    return;
                }
                DecaPoleVault decaPoleVault = new DecaPoleVault();
                decaPoleVault.calculateResult(distance);
                int score = decaPoleVault.getScore();
                scoreDecaPoleVaultPoints.setText(String.format("%d", score));
            }
        });
        scoreDecaJavelinThrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double distance = 0;
                try {
                    distance = Double.parseDouble(scoreDecaJavelinThrow.getText());
                    if (distance < 7.2 || distance > 90) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 7.2 and 90 meters");
                    return;
                }
                DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
                decaJavelinThrow.calculateResult(distance);
                int score = decaJavelinThrow.getScore();
                scoreDecaJavelinThrowPoints.setText(String.format("%d", score));
            }
        });
        scoreDeca1500m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double runningTime = 0;
                try {
                    runningTime = Double.parseDouble(scoreDeca1500m.getText());
                    if (runningTime < 180 || runningTime > 474) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number between 180 and 474 seconds");
                    return;
                }
                Deca1500M deca1500M = new Deca1500M();
                deca1500M.calculateResult(runningTime);
                int score = deca1500M.getScore();
                scoreDeca1500mPoints.setText(String.format("%d", score));
            }
        });
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalPoints = 0;
                try {
                    int score1 = scoreHepShotPutPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreHepShotPutPoints.getText());
                    int score2 = scoreHep100mHurdlesPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreHep100mHurdlesPoints.getText());
                    int score3 = scoreHepHighJumpPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreHepHighJumpPoints.getText());
                    int score4 = scoreHep200mPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreHep200mPoints.getText());
                    int score5 = scoreHepLongJumpPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreHepLongJumpPoints.getText());
                    int score6 = scoreHepJavelinThrowPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreHepJavelinThrowPoints.getText());
                    int score7 = scoreHep800mPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreHep800mPoints.getText());
                    int score8 = scoreDeca100mPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDeca100mPoints.getText());
                    int score9 = scoreDecaLongJumpPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDecaLongJumpPoints.getText());
                    int score10 = scoreDecaShotPutPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDecaShotPutPoints.getText());
                    int score11 = scoreDecaHighJumpPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDecaHighJumpPoints.getText());
                    int score12 = scoreDeca400mPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDeca400mPoints.getText());
                    int score13 = scoreDeca110mHurdlesPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDeca110mHurdlesPoints.getText());
                    int score14 = scoreDecaDiscusThrowPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDecaDiscusThrowPoints.getText());
                    int score15 = scoreDecaPoleVaultPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDecaPoleVaultPoints.getText());
                    int score16 = scoreDecaJavelinThrowPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDecaJavelinThrowPoints.getText());
                    int score17 = scoreDeca1500mPoints.getText().isEmpty() ? 0 : Integer.parseInt(scoreDeca1500mPoints.getText());
                    totalPoints = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10 + score11 + score12 + score13 + score14 + score15 + score16 + score17;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers in all fields");
                    return;
                }
                totalPointsBox.setText(String.format("%d", totalPoints));
            }
        });

    }

    public static void main(String[] args) {
        new Ground();
    }
}