 import java.awt.*;
 import java.awt.event.*;
public class House extends Frame { 
    public House() {
        setBackground(Color.WHITE);
        setSize(800,600);
        this.addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        }
        );
    }
    public void paint(Graphics g) {
        g.drawRect(120, 149, 151, 151);
        g.setColor(new Color(0,100,255));
        g.fillRect(12, 32, 450, 300);
        g.setColor(Color.ORANGE);
        g.fillArc(32, 13, 76, 76, 0, 360);
        g.setColor(Color.RED);
        g.fillArc(35, 15, 70, 70, 0, 360);
        g.setColor(Color.yellow);
        g.fillArc(38, 17, 67, 67, 0, 360);
        g.setColor(new Color(255,150,0));
        g.fillRect(65, 100, 200, 200);
        g.setColor(new Color(0,140,0));
        g.fillRect(12, 270, 450, 150);
        g.drawRect(19, 149, 102, 151);
        g.setColor(new Color(255,250,10));
        g.fillRect(121, 150, 150, 150);
        g.fillRect(20, 150, 100, 150);
        g.setColor(Color.RED);
        g.drawArc(20, 100, 100, 100, 0, 180);
        g.setColor(Color.BLACK);
        g.fillArc(20, 100, 100, 100, 0, 180);
        g.drawArc(25, 105, 90, 90, 0, 180);
        g.setColor(new Color(255,150,0));
        g.fillArc(25, 105, 90, 90, 0, 180);
        g.setColor(Color.BLACK);
        g.drawArc(170, 100, 100, 100, 0, 90);
        g.drawArc(70, 100, 100, 100, 0, 90);
        g.drawArc(130, 100, 100, 100, 0, 90);
        g.drawLine(65, 100, 220, 100);
        g.drawLine(100, 110, 250, 110);
        g.drawLine(112, 125, 262, 125);
        g.setColor(Color.GRAY);
        g.fillRect(45, 220, 50, 80);
        g.setColor(Color.BLACK);
        g.drawRect(45, 220, 50, 80);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(48, 222, 20, 25);
        g.fillRect(71, 222, 20, 25);
        g.fillRect(48, 248, 20, 25);
        g.fillRect(71, 248, 20, 25);
        g.fillRect(48, 274, 20, 25);
        g.fillRect(71, 274, 20, 25);
        g.setColor(Color.BLUE);
        g.fillRect(170, 200, 25, 25);
        g.fillRect(200, 200, 25, 25);
        g.fillRect(170, 230, 25, 25);
        g.fillRect(200, 230, 25, 25);
        g.drawRect(166, 196, 62, 62);
        g.setColor(new Color(20,20,20));
        g.drawArc(353, 170, 30, 150, 90, 180);
        g.drawArc(270, 170, 30, 150, 270, 180);
        g.setColor(new Color(0,100,0));
        g.fillArc(230, 35, 210, 200, 0, 360);
        g.setColor(new Color(0,150,0));
        g.fillArc(230, 35, 200, 200, 0, 360);
        g.setColor(Color.RED);
        g.fillRect(297, 170, 60, 150);
        g.setColor(new Color(0,255,0));
        g.fillArc(230, 35, 195, 200, 0, 360);
        g.setColor(new Color(0,255,0));
        g.fillArc(290, 270, 60, 60, 0, 360);
        g.fillArc(310, 283, 50, 50, 0, 360);
        g.fillArc(275, 283, 50, 50, 0, 360);
        g.fillArc(330, 270, 60, 60, 0, 360);
    }
    public static void main(String[] args) {
        House h = new House();
        h.setSize(400,400);
        h.setTitle("house");
        h.setVisible(true);
    }
    
}
