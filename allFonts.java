import java.awt.*;
import java.awt.event.*;


class allFonts extends Frame {
  allFonts(){
    setBackground(new Color(50,50,50));
    setSize(800, 1000);
    
    addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {System.exit(0);
        }
    });
 }
 public void paint(Graphics g){
      Font font1 = new Font("TimesRoman",Font.PLAIN,25);
      g.setFont(font1);
      g.setColor(Color.RED);
      g.drawString("list of all fonts available in java awt :", 30, 50);
      setLayout(new FlowLayout());
      GraphicsEnvironment ge;
      ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      g.setColor(Color.ORANGE);
      for (int i = 0,y=85; i < names.length; i++,y+=20) {
        
        Font font = new Font(names[i],Font.PLAIN,20);
        g.setFont(font);
        g.drawString(names[i], 30, y);
      }
 }
        public static void main(String[] args) {
            allFonts Demo = new allFonts();
            Demo.setTitle("All Fonts in awt");
            Demo.setVisible(true);
        }
    }

