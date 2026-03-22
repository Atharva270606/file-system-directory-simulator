

public class tree_directory 
{
    node root;
    node current_pos; 
    
    public tree_directory()
    {
        root = new node("root");
        current_pos = root;
    }

    //mkdir = make directory.
//here we will create a directory

    public void mkdir(String dirname)
    {
        for(node child : current_pos.childrens)
        {
            if(child.fname.equals(dirname))
            {
                System.out.println("The Directory already exists....!!");
                return;
            }
        }
        node newdir = new node(dirname);
        newdir.parent = current_pos;

        current_pos.childrens.add(newdir);
        System.out.println("Directory " + dirname + " has sucessfully been created...");
    }
}


