

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

    //Function for Searching a Directory

  Node search(Node node, String fname)
    {
        if (node.fname.equals(fname))
        {
            return node;
        }

        for (int i = 0; i< node.dircount; i++)
            {
                Node result = search(node.childrens[i], fname);
                if (result !=null)
                {
                    return result;
                }
            }

        return null;
    }

    
    //Function for Deleting a Directory
    public void delete(String fname)
    {
        node target = null;

        for(node child : current_pos.childrens)
            {
                if(child.fname.equals(fname))
                {
                    target = child;
                    break;
                }
            }

        if (target ==null)
        {
            System.out.println("The Directory is not found!");
            return;
        }

        current_pos.childrens.remove(target);

        System.out.println("Directory was Deleted: " +fname);
    }
    
}


