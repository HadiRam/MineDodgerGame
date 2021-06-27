package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;



public class mainScreen {

    private static JLabel moneyLeft;

    public static void main(String[] args) {
    JFrame frame = new JFrame("Mine Dodger");
    frame.setContentPane(new mainScreen().panel1);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    }
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JTextField a0TextField;
    private JButton cashOutButton;
    private JLabel multiLabel;
    private JButton restartButton;
    private JButton resetMoneyButton;
    private JButton maxBetButton;


    public mainScreen() {

        ImageIcon mineIcon = new ImageIcon("C:\\Users\\hadir\\IdeaProjects\\pracice_2\\src\\mineIcon.jpg");
        ImageIcon questionMark = new ImageIcon("C:\\Users\\hadir\\IdeaProjects\\pracice_2\\src\\57788-200.png");
        ImageIcon moneyIcon = new ImageIcon("C:\\Users\\hadir\\IdeaProjects\\pracice_2\\src\\smallMoneyIcon.jpg");
        boolean[][] grid = new boolean[5][5];

        int randomNum1 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
        int randomNum2 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
        int randomNum3 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
        int randomNum4 = ThreadLocalRandom.current().nextInt(0, 4 + 1);

        grid[randomNum1][randomNum2] = true;
        grid[randomNum3][randomNum4] = true;

        while(randomNum1 == randomNum3 && randomNum2 == randomNum4){
            randomNum3 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
            randomNum4 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
            grid[randomNum3][randomNum4] = true;
        }


        final int[] money = {500};
        final double[] multiplier = {1.00};

        JLabel currentMultiplier = new JLabel(String.valueOf(multiplier[0]));
        JLabel moneyLeft = new JLabel(String.valueOf(money[0]));
        panel1.add(moneyLeft);
        panel1.add(currentMultiplier);
        JLabel finalMoneyLeft = moneyLeft;
        JLabel finalCurrentMultiplier = currentMultiplier;


        final int[] count = {0};

        resetMoneyButton.setEnabled(false);



        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                if(grid[0][0] == true) {
                    JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                    money[0] -= wager;
                    finalMoneyLeft.setText(String.valueOf(money[0]));
                    count[0] = 0;
                    button2.setIcon(mineIcon);
                    button1.setEnabled(false);
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                    button4.setEnabled(false);
                    button5.setEnabled(false);
                    button6.setEnabled(false);
                    button7.setEnabled(false);
                    button8.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    button11.setEnabled(false);
                    button12.setEnabled(false);
                    button13.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    button16.setEnabled(false);
                    button17.setEnabled(false);
                    button18.setEnabled(false);
                    button19.setEnabled(false);
                    button20.setEnabled(false);
                    button21.setEnabled(false);
                    button22.setEnabled(false);
                    button23.setEnabled(false);
                    button24.setEnabled(false);
                    button25.setEnabled(false);
                    grid[0][0] = false;
                }else{
                    count[0]++;
                    button2.setIcon(moneyIcon);
                    button2.setEnabled(false);
                    finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                }
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[0][1] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button3.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[0][1] = false;
                    }else{
                        count[0]++;
                        button3.setIcon(moneyIcon);
                        button3.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[0][2] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button4.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[0][2] = false;
                    }else{
                        count[0]++;
                        button4.setIcon(moneyIcon);
                        button4.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[0][3] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button5.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[0][3] = false;
                    }else{
                        count[0]++;
                        button5.setIcon(moneyIcon);
                        button5.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[0][4] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button1.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[0][4] = false;
                    }else{
                        count[0]++;
                        button1.setIcon(moneyIcon);
                        button1.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[1][0] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button7.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[1][0] = false;
                    }else{
                        count[0]++;
                        button7.setIcon(moneyIcon);
                        button7.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[1][1] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button8.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[1][1] = false;
                    }else{
                        count[0]++;
                        button8.setIcon(moneyIcon);
                        button8.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[1][2] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button9.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[1][2] = false;
                    }else{
                        count[0]++;
                        button9.setIcon(moneyIcon);
                        button9.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[1][3] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button10.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[1][3] = false;
                    }else{
                        count[0]++;
                        button10.setIcon(moneyIcon);
                        button10.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[1][4] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button6.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[1][4] = false;
                    }else{
                        count[0]++;
                        button6.setIcon(moneyIcon);
                        button6.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[2][0] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button12.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[2][0] = false;
                    }else{
                        count[0]++;
                        button12.setIcon(moneyIcon);
                        button12.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[2][1] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button13.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[2][1] = false;
                    }else{
                        count[0]++;
                        button13.setIcon(moneyIcon);
                        button13.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[2][2] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button14.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[2][2] = false;
                    }else{
                        count[0]++;
                        button14.setIcon(moneyIcon);
                        button14.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[2][3] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button15.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[2][3] = false;
                    }else{
                        count[0]++;
                        button15.setIcon(moneyIcon);
                        button15.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[2][4] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button11.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[2][4] = false;
                    }else{
                        count[0]++;
                        button11.setIcon(moneyIcon);
                        button11.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[3][0] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button17.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[3][0] = false;
                    }else{
                        count[0]++;
                        button17.setIcon(moneyIcon);
                        button17.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[3][1] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button18.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[3][1] = false;
                    }else{
                        count[0]++;
                        button18.setIcon(moneyIcon);
                        button18.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[3][2] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button20.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[3][2] = false;
                    }else{
                        count[0]++;
                        button20.setIcon(moneyIcon);
                        button20.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[3][3] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button19.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[3][3] = false;
                    }else{
                        count[0]++;
                        button19.setIcon(moneyIcon);
                        button19.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[3][4] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button16.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[3][4] = false;
                    }else{
                        count[0]++;
                        button16.setIcon(moneyIcon);
                        button16.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[4][0] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button21.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[4][0] = false;
                    }else{
                        count[0]++;
                        button21.setIcon(moneyIcon);
                        button21.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[4][1] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button22.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[4][1] = false;
                    }else{
                        count[0]++;
                        button22.setIcon(moneyIcon);
                        button22.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[4][2] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button23.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[4][2] = false;
                    }else{
                        count[0]++;
                        button23.setIcon(moneyIcon);
                        button23.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });
        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                if(wager <=0 || wager > money[0]){
                    JOptionPane.showMessageDialog(null,"Please enter a wager amount greater than 0 and less than your money left!");
                }else{
                    if(grid[4][3] == true) {
                        JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                        money[0] -= wager;
                        finalMoneyLeft.setText(String.valueOf(money[0]));
                        count[0] = 0;
                        button24.setIcon(mineIcon);
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                        button3.setEnabled(false);
                        button4.setEnabled(false);
                        button5.setEnabled(false);
                        button6.setEnabled(false);
                        button7.setEnabled(false);
                        button8.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        button11.setEnabled(false);
                        button12.setEnabled(false);
                        button13.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        button16.setEnabled(false);
                        button17.setEnabled(false);
                        button18.setEnabled(false);
                        button19.setEnabled(false);
                        button20.setEnabled(false);
                        button21.setEnabled(false);
                        button22.setEnabled(false);
                        button23.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        grid[4][3] = false;
                    }else{
                        count[0]++;
                        button24.setIcon(moneyIcon);
                        button24.setEnabled(false);
                        finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));
                    }
                }
            }
        });

        button25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());


                    if (wager <= 0 || wager > money[0]) {
                        JOptionPane.showMessageDialog(null, "Please enter a wager amount greater than 0 and less than your money left!");
                    } else {
                        if (grid[4][4] == true) {
                            JOptionPane.showMessageDialog(null, "You Hit The Mine!");
                            money[0] -= wager;
                            finalMoneyLeft.setText(String.valueOf(money[0]));
                            count[0] = 0;
                            button25.setIcon(mineIcon);
                            button1.setEnabled(false);
                            button2.setEnabled(false);
                            button3.setEnabled(false);
                            button4.setEnabled(false);
                            button5.setEnabled(false);
                            button6.setEnabled(false);
                            button7.setEnabled(false);
                            button8.setEnabled(false);
                            button9.setEnabled(false);
                            button10.setEnabled(false);
                            button11.setEnabled(false);
                            button12.setEnabled(false);
                            button13.setEnabled(false);
                            button14.setEnabled(false);
                            button15.setEnabled(false);
                            button16.setEnabled(false);
                            button17.setEnabled(false);
                            button18.setEnabled(false);
                            button19.setEnabled(false);
                            button20.setEnabled(false);
                            button21.setEnabled(false);
                            button22.setEnabled(false);
                            button23.setEnabled(false);
                            button24.setEnabled(false);
                            button25.setEnabled(false);
                            grid[4][4] = false;
                        } else {
                            count[0]++;
                            button25.setIcon(moneyIcon);
                            button25.setEnabled(false);
                            finalCurrentMultiplier.setText(String.valueOf(multiplier[0] + (count[0] * 0.1)));

                        }
                    }

            }
        });

        cashOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wager = Integer.parseInt(a0TextField.getText());
                money[0] += (int)(wager * (1+(count[0]*0.1)) - wager);
                finalMoneyLeft.setText(String.valueOf(money[0]));
                count[0] = 0;
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                button13.setEnabled(false);
                button14.setEnabled(false);
                button15.setEnabled(false);
                button16.setEnabled(false);
                button17.setEnabled(false);
                button18.setEnabled(false);
                button19.setEnabled(false);
                button20.setEnabled(false);
                button21.setEnabled(false);
                button22.setEnabled(false);
                button23.setEnabled(false);
                button24.setEnabled(false);
                button25.setEnabled(false);
            }
        });
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    for(int i = 0; i < grid.length; i++){
                        for(int j = 0; j <grid[0].length;j++){
                            grid[i][j] = false;
                        }
                    }

                    int randomNum1 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
                    int randomNum2 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
                    int randomNum3 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
                    int randomNum4 = ThreadLocalRandom.current().nextInt(0, 4 + 1);

                    grid[randomNum1][randomNum2] = true;
                    grid[randomNum3][randomNum4] = true;

                    while(randomNum1 == randomNum3 && randomNum2 == randomNum4){
                        randomNum3 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
                        randomNum4 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
                        grid[randomNum3][randomNum4] = true;
                    }


                button2.setIcon(questionMark);
                button1.setIcon(questionMark);
                button3.setIcon(questionMark);
                button4.setIcon(questionMark);
                button5.setIcon(questionMark);
                button6.setIcon(questionMark);
                button7.setIcon(questionMark);
                button8.setIcon(questionMark);
                button9.setIcon(questionMark);
                button10.setIcon(questionMark);
                button11.setIcon(questionMark);
                button12.setIcon(questionMark);
                button13.setIcon(questionMark);
                button14.setIcon(questionMark);
                button15.setIcon(questionMark);
                button16.setIcon(questionMark);
                button17.setIcon(questionMark);
                button18.setIcon(questionMark);
                button19.setIcon(questionMark);
                button20.setIcon(questionMark);
                button21.setIcon(questionMark);
                button22.setIcon(questionMark);
                button23.setIcon(questionMark);
                button24.setIcon(questionMark);
                button25.setIcon(questionMark);
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
                button10.setEnabled(true);
                button11.setEnabled(true);
                button12.setEnabled(true);
                button13.setEnabled(true);
                button14.setEnabled(true);
                button15.setEnabled(true);
                button16.setEnabled(true);
                button17.setEnabled(true);
                button18.setEnabled(true);
                button19.setEnabled(true);
                button20.setEnabled(true);
                button21.setEnabled(true);
                button22.setEnabled(true);
                button23.setEnabled(true);
                button24.setEnabled(true);
                button25.setEnabled(true);
                finalCurrentMultiplier.setText(String.valueOf(1.0));

                if(money[0] == 0){
                    resetMoneyButton.setEnabled(true);
                }
            }
        });

        resetMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                money[0] = 500;
                finalMoneyLeft.setText(String.valueOf(money[0]));
                resetMoneyButton.setEnabled(false);

            }
        });
        maxBetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a0TextField.setText(String.valueOf(money[0]));
            }
        });
    }


}
