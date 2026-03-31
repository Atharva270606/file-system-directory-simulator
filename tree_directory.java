

public class tree_directory 
{
    node root;
    node current_pos; 
    int maxsize;
    
    public tree_directory(int size)
    {
        root = new node("root", maxsize);
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
        node newdir = new node(dirname,maxsize);
        newdir.parent = current_pos;

       current_pos.childrens[current_pos.dircount] = newdir;
       current_pos.dircount++;
    }

    //Function for Searching a Directory

  node search(node node, String fname)
    {
        if (node.fname.equals(fname))
        {
            return node;
        }

        for (int i = 0; i< node.dircount; i++)
            {
                node result = search(node.childrens[i], fname);
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
                    current_pos.childrens[current_pos.dircount -1] =null;
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


