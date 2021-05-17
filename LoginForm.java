
import java.awt.*;
import java.awt.event.*;


public class LoginForm {
    public static void main(String[] args)
    {
     	 Frame o=new Frame("Login Page");
         o.setVisible(true);
         o.setSize(700,600);		 
         o.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		System.exit(0);
			} 		 
		 });
		o.setLayout(null); 
		Font f=new Font("Serif",Font.BOLD,25);
		Label l1=new Label("User ID",Label.LEFT);
		l1.setVisible(true);
		l1.setBounds(200,105,110,40);
		l1.setFont(f);
		Label l2=new Label("Password",Label.LEFT); 
		l2.setVisible(true);
		l2.setBounds(200,155,110,40);
		l2.setFont(f);
		TextField t1=new TextField();
		t1.setVisible(true);
		t1.setBounds(350,110,140,30);
		t1.setFont(f);
		TextField t2=new TextField();
		t2.setVisible(true);
		t2.setBounds(350,160,140,30);
		t2.setEchoChar('*');
		t2.setFont(f);
		Button b1=new Button("Login");
		b1.setVisible(true);
		b1.setBounds(290,230,100,40);
		b1.setFont(f);
		o.add(l1);
		o.add(l2);
		o.add(t1);
		o.add(t2);
		o.add(b1);
	}   
}
