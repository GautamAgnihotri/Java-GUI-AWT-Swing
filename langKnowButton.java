import java.awt.*;
import java.awt.event.*;

public class langKnowButton extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    String str;
    TextField tf1 = new TextField(30);
    langKnowButton(){
        setLayout(null);
        b1 = new Button("Hindi");
        b2 = new Button("English");
        b3 = new Button("Both");
        b4 = new Button("None of them");
        b1.setBounds(260, 175, 100, 80);
        b2.setBounds(380,175, 100, 80);
        b3.setBounds(260, 275, 100, 80);
        b4.setBounds(380, 275, 100, 80);
        tf1.setBounds(190, 400, 350, 50);
        Font f = new Font("TimesRoman",Font.PLAIN,25);
        tf1.setFont(f);
        tf1.setBackground(new Color(50,50,50));
        tf1.setForeground(Color.RED);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(b1); 
        add(b2); 
        add(b3);
        add(b4); 
        add(tf1);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    
    public void actionPerformed(ActionEvent ae){
        str = ae.getActionCommand();
        if(str.equals("Hindi"))
           tf1.setText("You know Hindi");
        if(str.equals("English"))
           tf1.setText("You know English");
        if(str.equals("Both"))
           tf1.setText("You know both Hindi and English");
        if(str.equals("None of them"))
           tf1.setText("You know none of them");
    }
    public void paint(Graphics g){
        Font font = new Font("TimesRoman",Font.PLAIN,35);
        g.setColor(Color.RED);
        g.setFont(font);
        g.drawString("Select the language you know :",180,100);
        
    }
    public static void main(String[] args) {
        langKnowButton b = new langKnowButton();
        b.setSize(800,600);
        b.setTitle("Languages Known");
        b.setVisible(true);
        b.setBackground(new Color(50,50,50));
    }
}
