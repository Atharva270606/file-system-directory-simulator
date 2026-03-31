import java.util.Scanner;
 public class main
 {
    public static void main(String[] args) 
   {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter maximum number of directories:");
      int size = sc.nextInt();
      sc.nextLine();

      tree_directory tree = new tree_directory(size);

      int choice;

      do{

           System.out.println("\n***** File System directory simulator*****");
           System.out.println("1. Creating a Directory");
           System.out.println("2. Delete a Directory");
           System.out.println("3. Search a Directory");
           System.out.println("4. Display the Tree");
           System.out.println("5. Exit a Menu ");


           System.out.println("Enter your choice");
           choice = sc.nextInt();
           sc.nextLine();

           switch (choice)
           {


            case 1: 
                System.out.print("1. Enter your directory name: ");
                String name = sc.nextLine();
                tree.mkdir(name);
                break;

            case 2: 
                System.out.print("1. Creating the  directory name you want to delete ");
                String dele = sc.nextLine();
                tree.delete(dele);
                break;

            case 3 :
                System.out.print("Enter the directory name you want to search: ");
                String search = sc.nextLine();

                node result = tree.search(tree.root, search );

                if (result != null) {
                    System.out.println("The directory is Found!  ");
                } else {
                    System.out.println("1. The directory is not found");
                }
                break;

           }
     
   } while (choice !=5);

    sc.close();
  }

}

              case 4 : 
                 System.out.println("Displaying directory Tree:");
                 tree.display(tree.root,"");
                 break;
      
    
              case 5:
                 Syystem.out.println("Exiting program....");

break;
               




        














  
