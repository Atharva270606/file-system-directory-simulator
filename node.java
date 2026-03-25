
/*This class is for representing the depository
This contains name and child folders
Also the parameterized constructor for new folders
*/ 
public class node
{
   String fname;
   node parent;
   node[] childrens;
   int dircount;

   public node(String fname,int size)
   {
        this.fname = fname;
        this.childrens = new node[size];
        this.parent = null;
        this.dircount = 0;
   }
}