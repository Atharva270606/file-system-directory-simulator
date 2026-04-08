import java.swing.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener
{
   tree_directory tree;
   JTextField fieldsize;
   JTextField inputField;

   JTextField output;
   JButton startButton,createButton,searchButton,deleteButton,displayButton,cdButton,pathButton,exitButton;

  public GUI()
  {
      setTitle("Simulator for File Directory System");
      setSize(650,500);
      setLayout(null);
      setDefaultCloseOperations(JFrame.EXIT_ON_CLOSE);

      fieldsize = newJTextField();
      fieldsize.setbounds(230,20,120,30);
      add(fieldsize);

      startButton = new JButton("Start");
      startButton.setBounds(370,20,100,30);
      startButton.addActionListener(this);
      add(startButton);
    
      JLabel inputL = new JLabel("Directory Name-->");
      inputL.setBounds(30,70,150,30);
      add(inputL);

      createButton = new JButton("Create Directory");
      
  }
   
}
