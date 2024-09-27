package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{
    JTextField text_field;
    JLabel text_field_label, output_label;
    JButton get_result_button;
    MyFrame(){
        setTitle("Binary to Decimal converter");

        text_field_label = new JLabel("Enter the binary number");
        text_field_label.setBounds(50,50, 150,20);
        text_field_label.setFont(new Font("Arial", Font.BOLD, 12));

        text_field =new JTextField();
        text_field.setBounds(200,50, 150,20);

        output_label=new JLabel();
        output_label.setBounds(25,100, 350,20);

        get_result_button =new JButton("Find decimal");
        get_result_button.setBounds(100,150,200,30);
        get_result_button.setBackground(Color.BLACK);
        get_result_button.setForeground(Color.WHITE);

        text_field.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    try{
                        String binary = text_field.getText();
                        int decimal = 0;
                        int length = binary.length();
                        for(int i=0;i<length;i++){
                            decimal += Integer.parseInt("" + binary.charAt(i)) * Math.pow(2,length - 1 - i );
                        }
                        output_label.setText("The decimal number of "+binary+" is: "+decimal);
                        output_label.setHorizontalAlignment(SwingConstants.CENTER);
                        output_label.setForeground(Color.green);
                        output_label.setFont(new Font("Arial", Font.BOLD, 16));
                    }catch(Exception ex){
                        output_label.setText("" + ex);
                        output_label.setHorizontalAlignment(SwingConstants.CENTER);
                    }
                }
            }
        });
        get_result_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String binary= text_field.getText();
                    int decimal = 0;
                    int length = binary.length();
                    for(int i=0;i<length;i++){

                        decimal += Integer.parseInt("" + binary.charAt(i)) * Math.pow(2,length - 1 - i );
                    }
                    output_label.setText("The decimal number of "+binary+" is: "+decimal);
                    output_label.setHorizontalAlignment(SwingConstants.CENTER);
                    output_label.setForeground(Color.green);
                    output_label.setFont(new Font("Arial", Font.BOLD, 16));

                }catch(Exception ex){
                    output_label.setText("" + ex);
                    output_label.setHorizontalAlignment(SwingConstants.CENTER);
                }
            }
        });

        add(text_field);
        add(text_field_label);
        add(get_result_button);
        add(output_label);

        setSize(400,250);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
