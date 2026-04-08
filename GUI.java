import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener
{
   tree_directory tree;
   JTextField fieldsize;
   JTextField inputField;

   JTextArea output;
   JButton startButton,createButton,searchButton,deleteButton,displayButton,cdButton,pathButton,exitButton;

  public GUI()
  {
      setTitle("Simulator for File Directory System");
      setSize(650,500);
      setLayout(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      fieldsize = new JTextField();
      fieldsize.setBounds(230,20,120,30);
      add(fieldsize);

      startButton = new JButton("Start");
      startButton.setBounds(370,20,100,30);
      startButton.addActionListener(this);
      add(startButton);
    
      JLabel inputL = new JLabel("Directory Name-->");
      inputL.setBounds(30,70,150,30);
      add(inputL);

      createButton = new JButton("Create Directory");
      createButton.setBounds(30,120,120,35);
      add(createButton);createButton.setBounds(30,120,120,35);
      add(createButton);

      deleteButton = new JButton("Delete");
      deleteButton.setBounds(170,120,120,35);
      add(deleteButton);

      searchButton = new JButton("Search");
      searchButton.setBounds(310,120,120,35);
      add(searchButton);

      displayButton = new JButton("Display Tree");
      displayButton.setBounds(450,120,150,35);
      add(displayButton);

      cdButton = new JButton("Change Dir");
      cdButton.setBounds(120,180,150,35);
      add(cdButton);

      pathButton = new JButton("Show Path");
      pathButton.setBounds(320,180,150,35);
      add(pathButton);

      exitButton = new JButton("Exit");
      exitButton.setBounds(500,180,100,35);
      add(exitButton);

      output = new JTextArea();
      output.setBounds(30,240,570,200);
      output.setEditable(false);

      JScrollPane scroll = new JScrollPane(output);
      scroll.setBounds(30,240,570,200);
      add(scroll);

      createButton.addActionListener(this);
      deleteButton.addActionListener(this);
      searchButton.addActionListener(this);
      displayButton.addActionListener(this);
      cdButton.addActionListener(this);
      pathButton.addActionListener(this);
      exitButton.addActionListener(this);

      setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==startButton)
        {
            int size = Integer.parseInt(fieldsize.getText());
            tree = new tree_directory(size);
            output.setText("Root directory created successfully\n");
        }

        else if(e.getSource()==createButton)
        {
            String name = inputField.getText();
            tree.mkdir(name);
            output.append("Directory created: "+name+"\n");
        }

        else if(e.getSource()==deleteButton)
        {
            String name = inputField.getText();
            tree.delete(name);
            output.append("Delete attempted for: "+name+"\n");
        }

        else if(e.getSource()==searchButton)
        {
            String name = inputField.getText();
            node result = tree.search(tree.root,name);

            if(result!=null)
                output.append("Directory Found\n");
            else
                output.append("Directory Not Found\n");
        }

        else if(e.getSource()==displayButton)
        {
            output.append("\nDirectory Tree:\n");
            tree.display(tree.root,"");
        }

        else if(e.getSource()==cdButton)
        {
            String name = inputField.getText();
            tree.cd(name);
            output.append("Changed directory to: "+name+"\n");
        }

        else if(e.getSource()==pathButton)
        {
            tree.showpath();
        }

        else if(e.getSource()==exitButton)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        new GUI();
    }
}
      

