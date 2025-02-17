package javaquestion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FAI extends JFrame implements ActionListener
{
      JLabel ql; 
      JButton lg;
      ButtonGroup bg;
      JRadioButton rb[] = new JRadioButton[5];
      int running = 0;
      int count = 0;



    FAI()
    {

            setSize(500,500);
            setTitle("OOPL-IT");
            setLayout(null);
            setVisible(true);
            setLocationRelativeTo(null);
            getContentPane().setBackground( new Color(0, 41, 98) );

            JButton btn = new JButton ("University of Information Technology & Sciences");
            btn.setBounds(50,50,400,40);
            btn.setBorderPainted(false);
            btn.setFocusPainted(false);
            btn.setBackground(new Color(255, 255, 255));
            btn.setForeground(new Color(0, 0, 0));
            add(btn);

            JButton btn1 = new JButton ("Department of IT");
            btn1.setBorderPainted(false);
            btn1.setFocusPainted(false);
            btn1.setBackground(new Color(255, 255, 255));
            btn1.setForeground(new Color(0, 0, 0));
            btn1.setBounds(90,100,300,40);
            add(btn1);

            Label f1 = new Label("Name: ");
            f1.setBounds(50,150,70,30);
            f1.setForeground(new Color(255, 255, 255));
            add(f1);

            Label f1t = new Label("Mostafa Faisal & Nurhossain");
            f1t.setBounds(150,150,230,30);
            f1t.setForeground(new Color(255, 255, 255));
            add(f1t);
           
            

            Label f2 = new Label("ID: ");
            f2.setBounds(50,185,100,30);
            f2.setForeground(new Color(255, 255, 255));
            add(f2);

            Label f2t = new Label("2014755010, 2014755011");
            f2t.setBounds(150,185,220,30);
            f2t.setForeground(new Color(255, 255, 255));
            add(f2t);

            ql = new JLabel();
            ql.setForeground(new Color(255, 255, 255));
            add(ql);

            bg = new ButtonGroup();

        for (int i=0; i<5; i++)
        {   rb[i] = new JRadioButton();
            add(rb[i]);
            rb[i].setBackground(new Color(0, 41, 98));
            rb[i].setForeground(new Color(255, 255, 255));
            bg.add(rb[i]);
        }

            rb[0].setBounds(115,250,250,20);
            rb[1].setBounds(115,280,250,20);
            rb[2].setBounds(115,310,250,20);
            rb[3].setBounds(115,340,250,20);


            lg = new JButton("Next");
            lg.setBounds(200,370,70,40);
            lg.setBorderPainted(false);
            lg.setFocusPainted(false);
            lg.setBackground(new Color(255, 255, 255));
            lg.setForeground(new Color(0, 0, 0));
            add(lg);

               lg.addActionListener(this);


               Label db = new Label("Developed by Faisal & Nur");
               db.setForeground(new Color(255, 255, 255));
               db.setBounds(160,420,200,30);
               add(db);


               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               set();
           
}

public void actionPerformed(ActionEvent e)
{
           if(e.getSource()==lg)
           {
              if(check())
              {
                 count = count+1; 
              }
              running++;
              set();
              
              if(running ==9)
              { 
                  lg.setText("Result");
              }
           }
    if(e.getActionCommand(). equals("Result"))
    {
        if(check())
        {
            count = count+1;
        }
        running++;

            JOptionPane.showMessageDialog(this,"Correct Answer: " + count);
            System.exit(0);
        }
}

void set()
{
    rb[4].setSelected(true);
    if (running == 0);
    {
      ql.setText("What else is called runtime exception?");
        rb[0].setText("Compile time exception");
        rb[1].setText("Checked Exception");
        rb[2].setText("Unchecked Exception");
        rb[3].setText("None of them");
    }
    
    if (running == 1)
    {
        ql.setText("How many type of Exception?");
        rb[0].setText("2");
        rb[1].setText("4");
        rb[2].setText("6");
        rb[3].setText("8");
    }
    if (running == 2)
    {
        ql.setText("Why we use Encapsulation?");
        rb[0].setText("For public code");
        rb[1].setText("For data together into a double unit");
        rb[2].setText("For wrapping code");
        rb[3].setText("None of them");
    }
    if (running == 3)
    {
        ql.setText("Which feature can be implement using encapsulation?");
        rb[0].setText("Inheritance");
        rb[1].setText("Abstraction");
        rb[2].setText("Polymorphism");
        rb[3].setText("Overloading");
    }
    if (running == 4)
    {
        ql.setText("How many ways to achieve abstraction in java?");
        rb[0].setText("1");
        rb[1].setText("2");
        rb[2].setText("3");
        rb[3].setText("4");
    }
    if (running == 5)
    {
        ql.setText("Is abstract method have body?");
        rb[0].setText("Yes");
        rb[1].setText("No");
        rb[2].setText("a+b");
        rb[3].setText("None of them");
    }
    if (running == 6)
    {
        ql.setText("To successfully overload in java,the method names must be____");
        rb[0].setText("Same");
        rb[1].setText("Different");
        rb[2].setText("Same or different");
        rb[3].setText("None");
    }
    if (running == 7)
    {
        ql.setText("Which of these is supported by method overriding in java?");
        rb[0].setText("Abstration");
        rb[1].setText("Encapsulation");
        rb[2].setText("Polymorphism");
        rb[3].setText("None of them");
    }
    if (running == 8)
    {
        ql.setText("How many types of inheretance?");
        rb[0].setText("3");
        rb[1].setText("4");
        rb[2].setText("6");
        rb[3].setText("8");
    }
    if (running == 9)
    {
        ql.setText("What is the full meaning of AWT?");
        rb[0].setText("Abstract window toolkit");
        rb[1].setText("Abstract windows toolkit");
        rb[2].setText("Abstracts windows tool");
        rb[3].setText("None of them");
    }
    ql.setBounds(120,220,400,20);
}
    
    boolean check()
    {
            if(running == 0)
        {
         return(rb[2].isSelected());
        }
         if (running == 1)
        {
         return(rb[0].isSelected());
        }
         if (running == 2)
        {
         return(rb[2].isSelected());
        }
         if (running == 3)
        {
         return(rb[1].isSelected());
        }
         if (running == 4)
        {
         return(rb[1].isSelected());
        }
         if (running == 5)
        {
         return(rb[1].isSelected());
        }
         if (running == 6)
        {
         return(rb[0].isSelected());
        }
         if (running == 7)
        {
         return(rb[2].isSelected());
        }
         if (running == 8)
        {
         return(rb[1].isSelected());
        }
         if (running == 9)
        {
         return(rb[0].isSelected());
        }
         return false;
    }

    public static void main(String[] args){
        FAI awt = new FAI();
       }
}
