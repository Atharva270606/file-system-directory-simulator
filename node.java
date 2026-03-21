import java.util.ArrayList;

/*This class is for representing the depository
This contains name and child folders
Also the parameterized constructor for new folders
*/ 
public class node
{
   String fname;
   ArrayList <node> childrens;

   public node(String fname)
   {
        this.fname = fname;
        this.childrens = new ArrayList<>();
   }
}