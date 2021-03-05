import java.awt.*;
import java.awt.event.*;
public class drawingPad extends Frame implements MouseListener,MouseMotionListener,ItemListener{
    int last_x,last_y;
    String msg;
   
    List lst;
    drawingPad(){
        addMouseListener(this);
        addMouseMotionListener(this);
        Panel pan = new Panel();
        pan.setBounds(50, 70, 100, 50);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        lst=new List(3);
        lst.add("RED");
        lst.add("BLUE");
        lst.add("ORANGE");
        lst.add("BLACK");
        pan.add(lst);
        // add(pan);
        lst.addItemListener(this);
    }
        public void itemStateChanged(ItemEvent is){
            msg=lst.getSelectedItem();
           
        }
        public void mousePressed(MouseEvent e){
            last_x=e.getX();
            last_y=e.getY();
        }
        public void mouseDragged(MouseEvent e){
            Graphics g = this.getGraphics();
            int x=e.getX(),y=e.getY();
            
             g.setColor(Color.RED);
            g.drawLine(last_x, last_y, x, y);
            last_x=x;last_y=y;
        }
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mouseMoved(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    public static void main(String[] args) {
        drawingPad dp=new drawingPad();
        dp.setTitle("My Drawing Pad");
        dp.setSize(450,400);
        dp.setVisible(true);
    }

}

