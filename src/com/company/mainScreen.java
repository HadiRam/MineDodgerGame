package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;



public class mainScreen {

    private static JLabel moneyLeft;

    public static void main(String[] args) {
    JFrame frame = new JFrame("Mine Dodger");
    frame.setContentPane(new mainScreen(moneyLeft).panel1);
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


    public mainScreen(JLabel moneyLeft) {


        boolean[][] grid = new boolean[5][5];
        int x = 0;
        while (x<2){
            int randomNum1 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
            int randomNum2 = ThreadLocalRandom.current().nextInt(0, 4 + 1);

            if(randomNum1 != randomNum2){
                grid[randomNum1][randomNum2] = true;
            }else{
                randomNum2 =ThreadLocalRandom.current().nextInt(0, 4 + 1);
                grid[randomNum1][randomNum2] = true;
            }
            x++;
        }

        final int[] money = {500};
        moneyLeft = new JLabel(String.valueOf(money[0]));
        panel1.add(moneyLeft);




        JLabel finalMoneyLeft = moneyLeft;
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //money[0] -= 100;
                //finalMoneyLeft.setText(String.valueOf(money[0]));
                grid[0][0] = true;
                if(grid[0][0] == true){
                 JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                 int wager = Integer.parseInt(a0TextField.getText());
                 money[0] -= wager;
                 finalMoneyLeft.setText(String.valueOf(money[0]));
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[0][1] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[0][2] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[0][3] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[0][4] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[1][0] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[1][1] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[1][2] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[1][3] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[1][4] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[2][0] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[2][1] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[2][2] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[2][3] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[2][4] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[3][0] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[3][1] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[3][2] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[3][3] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[3][4] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[4][0] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[4][1] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[4][2] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[4][3] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });
        button25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(grid[4][4] == true){
                    JOptionPane.showMessageDialog(null,"You Hit The Mine!");
                }
            }
        });

    }


}
