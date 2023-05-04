import java.awt.Color;
import java.lang.invoke.ConstantBootstraps;
import javax.annotation.processing.RoundEnvironment;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.plaf.FontUIResource;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.LineBreakMeasurer;
public class Calculator implements ActionListener{
   
    JFrame js;
    JButton Seven,Eight,Nine,Four,Five,Six,One,Two,Three,Addition,
    Substraction,Multiplication,Division,ZeroButton,DotButton,EqualButton;
    JLabel DisplayScreen;
    double num1=0,num2=0,res=0;
    int op=0;
    public Calculator(){
     //created a window using jframe
    
    js = new JFrame("Calculator - By Adithya Mohanan");
    js.getContentPane().setBackground(Color.darkGray);
    js.setLayout(null);
    js.setSize(550,700);
    js.setLocation(510, 100);
    

    //Creating screen for displaying the number 
    DisplayScreen = new JLabel();
    DisplayScreen.setBounds(50, 50, 450, 50);
    DisplayScreen.setBackground(Color.black);
    DisplayScreen.setHorizontalAlignment(SwingConstants.RIGHT);
    DisplayScreen.setForeground(Color.WHITE);
    Font displayfont = new Font("Arial",Font.PLAIN,30);
    DisplayScreen.setFont(displayfont);
    DisplayScreen.setOpaque(true);
    js.add(DisplayScreen);

   //Creating button for the calculator
    Seven = new JButton("7");
    Seven.setBounds(50,150,80,80);
    Font Buttonfont7 = new Font("Arial", Font.PLAIN, 30);
    Seven.setFont(Buttonfont7);
    Seven.setBackground(new Color(0,139,139));
    Seven.setForeground(Color.black);
    Seven.addActionListener(this);
    js.add(Seven);
   
    Eight = new JButton("8");
    Eight.setBounds(170,150,80,80);
    Font Buttonfont8 = new Font("Arial", Font.PLAIN, 30);
    Eight.setFont(Buttonfont8);
    Eight.setBackground(new Color(0,139,139));
    Eight.setForeground(Color.black);
    Eight.addActionListener(this);
    js.add(Eight);

    Nine = new JButton("9");
    Nine.setBounds(290,150,80,80);
    Font Buttonfont9 = new Font("Arial", Font.PLAIN, 30);
    Nine.setFont(Buttonfont9);
    Nine.setBackground(new Color(0,139,139));
    Nine.setForeground(Color.black);
    Nine.addActionListener(this);
    js.add(Nine);
    
    //creating next row

    Four = new JButton("4");
    Four.setBounds(50,270,80,80);
    Font Buttonfont4 = new Font("Arial", Font.PLAIN, 30);
    Four.setFont(Buttonfont4);
    Four.setBackground(new Color(0,139,139));
    Four.setForeground(Color.black);
    Four.addActionListener(this);
    js.add(Four);

    Five = new JButton("5");
    Five.setBounds(170,270,80,80);
    Font Buttonfont5 = new Font("Arial", Font.PLAIN, 30);
    Five.setFont(Buttonfont5);
    Five.setBackground(new Color(0,139,139));
    Five.setForeground(Color.black);
    Five.addActionListener(this);
    js.add(Five);

    Six = new JButton("6");
    Six.setBounds(290,270,80,80);
    Font Buttonfont6 = new Font("Arial", Font.PLAIN, 30);
    Six.setFont(Buttonfont6);
    Six.setBackground(new Color(0,139,139));
    Six.setForeground(Color.black);
    Six.addActionListener(this);
    js.add(Six);
   
    //Next row
     
    One = new JButton("1");
    One.setBounds(50,390,80,80);
    Font Buttonfont1 = new Font("Arial", Font.PLAIN, 30);
    One.setFont(Buttonfont1);
    One.setBackground(new Color(0,139,139));
    One.setForeground(Color.black);
    One.addActionListener(this);
    js.add(One);

    Two = new JButton("2");
    Two.setBounds(170,390,80,80);
    Font Buttonfont2 = new Font("Arial", Font.PLAIN, 30);
    Two.setFont(Buttonfont2);
    Two.setBackground(new Color(0,139,139));
    Two.setForeground(Color.black);
    Two.addActionListener(this);
    js.add(Two);

    Three = new JButton("3");
    Three.setBounds(290,390,80,80);
    Font Buttonfont3 = new Font("Arial", Font.PLAIN, 30);
    Three.setFont(Buttonfont3);
    Three.setBackground(new Color(0,139,139));
    Three.setForeground(Color.black);
    Three.addActionListener(this);
    js.add(Three);


    //Next row

    ZeroButton = new JButton("0");
    ZeroButton.setBounds(50,510,80,80);
    Font Buttonfont0 = new Font("Arial", Font.PLAIN, 30);
    ZeroButton.setFont(Buttonfont0);
    ZeroButton.setBackground(new Color(0,139,139));
    ZeroButton.setForeground(Color.black);
    ZeroButton.addActionListener(this);
    js.add(ZeroButton);


    DotButton = new JButton(".");
    DotButton.setBounds(170,510,80,80);
    Font ButtonfontDot = new Font("Arial", Font.PLAIN, 30);
    DotButton.setFont(ButtonfontDot);
    DotButton.setBackground(new Color(0,139,139));
    DotButton.setForeground(Color.black);
    DotButton.addActionListener(this);
    js.add(DotButton);

    EqualButton = new JButton("=");
    EqualButton.setBounds(290,510,80,80);
    Font ButtonfontEqual = new Font("Arial", Font.PLAIN, 30);
    EqualButton.setFont(ButtonfontEqual);
    EqualButton.setBackground(new Color(0,139,139));
    EqualButton.setForeground(Color.black);
    EqualButton.addActionListener(this);
    js.add(EqualButton);

    //Adding operators 

    Addition = new JButton("+");
    Addition.setBounds(410, 150, 80,80);
    Font buttonfontAdd = new Font("Arial", Font.PLAIN, 30);
    Addition.setFont(buttonfontAdd);
    Addition.setBackground(new Color(0, 139, 139));
    Addition.setForeground(Color.black);
    Addition.addActionListener(this);
    js.add(Addition);

    Substraction = new JButton("-");
    Substraction.setBounds(410,270,80,80);
    Font buttonfontSubs = new Font("Arial", Font.PLAIN, 30);
    Substraction.setFont(buttonfontSubs);
    Substraction.setBackground(new Color(0, 139, 139));
    Substraction.setForeground(Color.black);
    Substraction.addActionListener(this);
    js.add(Substraction);

    Multiplication = new JButton("*");
    Multiplication.setBounds(410,390,80,80);
    Font buttonfontMul = new Font("Arial", Font.PLAIN, 30);
    Multiplication.setFont(buttonfontMul);
    Multiplication.setBackground(new Color(0, 139, 139));
    Multiplication.setForeground(Color.black);
    Multiplication.addActionListener(this);
    js.add(Multiplication);

    Division = new JButton("/");
    Division.setBounds(410,510,80,80);
    Font buttonfontDiv = new Font("Arial", Font.PLAIN, 30);
    Division.setFont(buttonfontDiv);
    Division.setBackground(new Color(0, 139, 139));
    Division.setForeground(Color.black);
    Division.addActionListener(this);
    js.add(Division);    

   
    js.setVisible(true);
    js.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
         if(e.getSource()==Seven){
            DisplayScreen.setText(DisplayScreen.getText()+"7");
         }
         else if(e.getSource()==Eight){
            DisplayScreen.setText(DisplayScreen.getText()+"8");
         }
         else if(e.getSource()==Nine){
            DisplayScreen.setText(DisplayScreen.getText()+"9");
         }
         else if(e.getSource()==Four){
            DisplayScreen.setText(DisplayScreen.getText()+"4");
         }
         else if(e.getSource()==Five){
            DisplayScreen.setText(DisplayScreen.getText()+"5");
         }
         else if(e.getSource()==Six){
            DisplayScreen.setText(DisplayScreen.getText()+"6");
         }
         else if(e.getSource()==One){
            DisplayScreen.setText(DisplayScreen.getText()+"1");
         }         
         else if(e.getSource()==Two){
            DisplayScreen.setText(DisplayScreen.getText()+"2");
         }
         else if(e.getSource()==Three){
            DisplayScreen.setText(DisplayScreen.getText()+"3");
         }
         else if(e.getSource()==ZeroButton){
            DisplayScreen.setText(DisplayScreen.getText()+"0");        
          }
         else if(e.getSource()==DotButton){
            DisplayScreen.setText(DisplayScreen.getText()+".");
         }
         //operators

         else if(e.getSource()==Addition){
            num1 = Double.parseDouble(DisplayScreen.getText());
            op=1;
            DisplayScreen.setText("");

            
         }
         else if(e.getSource()==Substraction){
            num1 = Double.parseDouble(DisplayScreen.getText());
            op=2;
            DisplayScreen.setText("");

            
         }

         else if(e.getSource()==Multiplication){
            num1 = Double.parseDouble(DisplayScreen.getText());
            op=3;
            DisplayScreen.setText("");

         }
         else if(e.getSource()==Division){
           num1 = Double.parseDouble(DisplayScreen.getText());
           op=4;
           DisplayScreen.setText("");
         }

         else if(e.getSource()==EqualButton){
            num2 = Double.parseDouble(DisplayScreen.getText());
            switch(op){
               case 1 : res = num1 + num2;
               break;
               case 2 : res = num1 - num2;
               break;
               case 3 : res = num1 * num2;
               break;
               case 4 : res = num1 / num2;
            }
            DisplayScreen.setText(""+res);

         }
         
    }
}




