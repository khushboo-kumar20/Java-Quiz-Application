package quizmasters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(300, 50, 700, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome "+username+" to Java Quizzard");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        l1.setBounds(50, 20, 700, 30);
        add(l1);
        
        JLabel l2 = new JLabel("Welcome "+username+" to Java Quizzard");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(20, 90, 600, 400);
        l2.setText(
            "<html>"+
                "1. There will be 10 questions in total that you have to answer." + "<br><br>" +
                "2. You will have 15 seconds to answer each question." + "<br><br>" +
                "3. All the questions carry equal weightage that is 10 marks each." + "<br><br>" +
                "4. You are also provided with 50-50 Lifeline which hids the two wrong options out of four." + "<br><br>" +
                "5. Remember you can use 50-50 Lifeline only once <b>so use it wisely</b>." + "<br><br>" +
                "6. If your time is over and you are unable to click the <b>Next Button</b> then your response is taken automatically." + "<br><br>" +
                "7. Similarly if you are unable to click <b>Submit Button</b> at the end then your response is taken automatically." + "<br><br>" +
                "<center><b>***GOOD LUCK***</b></center>" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(200, 500, 100, 30);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(350, 500, 100, 30);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            setVisible(false);
            new JavaQuizzard().setVisible(true);
        }else if(e.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }

}
