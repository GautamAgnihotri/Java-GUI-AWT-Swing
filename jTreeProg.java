import javax.swing.*;  
import javax.swing.tree.*; 
public class jTreeProg extends JFrame {
    jTreeProg(){
        DefaultMutableTreeNode localDiskF= new DefaultMutableTreeNode("Local Disk (F:)");  
        DefaultMutableTreeNode gamesFolder= new DefaultMutableTreeNode("Games Folder");  
        DefaultMutableTreeNode projectFolder= new DefaultMutableTreeNode("ProjectFolder");
        localDiskF.add(gamesFolder);  
        localDiskF.add(projectFolder);  
        DefaultMutableTreeNode pubg= new DefaultMutableTreeNode("PUBG");  
        DefaultMutableTreeNode callOfDuty= new DefaultMutableTreeNode("Call Of Duty");  
        DefaultMutableTreeNode counterStrike= new DefaultMutableTreeNode("Counter Strike");  
        DefaultMutableTreeNode javaProject= new DefaultMutableTreeNode("Java Project");
        DefaultMutableTreeNode pythonProject= new DefaultMutableTreeNode("Python Project");
        DefaultMutableTreeNode cppProject= new DefaultMutableTreeNode("C++ Project");
        DefaultMutableTreeNode webProject= new DefaultMutableTreeNode("Web Application Project");  
        gamesFolder.add(pubg); 
        gamesFolder.add(callOfDuty);
        gamesFolder.add(counterStrike);
        projectFolder.add(javaProject); 
        projectFolder.add(pythonProject);
        projectFolder.add(cppProject);
        projectFolder.add(webProject);     
        JTree jt=new JTree(localDiskF);  
        add(jt);  
        setSize(200,200);  
        setVisible(true);  
}
  
    public static void main(String[] args) {  
        new jTreeProg();  
    }
 
}  
  