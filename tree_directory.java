

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
        for (int i = 0; i<current_pos.dircount; i++)
            {
                if(current_pos.childrens[i].fname.equals(fname))
                {
                    for(int j=i; j<current_pos.dircount -1; j++)
                        {
                            current_pos.childrens[j]=current_pos.childrens[j+1];
                        }
                    current_pos.childrens[current_-pos.dircount -1] =null;
                    current_pos.dircount--;

                    System.out.println("The Directory is deleted: "+fname);
                    return;
                }
            }
        System.out.println("The Directory was not found!");
    }

    //Display the Tree
    public void display(node start, String indent)
    {
        System.out.println(indent + "|-- " +start.fname);

        for (int i = 0; i<start.dircount; i++)
            {
                display(start.childrens[i], indent +" ");
            }
    }
    
}


