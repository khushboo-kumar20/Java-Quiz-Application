package quizmasters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    String username;
    JButton b1,b2;
    Score(String username, int score){
        this.username = username;
        setBounds(300, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizmasters/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        
        JLabel l2 = new JLabel("Thankyou "+username+" for playing Java Quizzard");
        l2.setBounds(45, 30, 700, 30);
        l2.setForeground(new Color(30, 144, 254));
        l2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 26));
        add(l2);
        
        JLabel l3 = new JLabel("Your score is "+score);
        l3.setBounds(350, 200, 300, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
        b1 = new JButton("Play");
        b1.setBounds(300, 270, 120, 30);
        b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(480, 270, 120, 30);
        b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            this.setVisible(false);
            new JavaQuizzard().setVisible(true);
        }else if(e.getSource() == b2){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }

}
