import java.util.Scanner;
 public class main
 {
    public static void main(String[] args) 
   {

      Scanner sc = new Scanner(System.in);
      tree_directory tree = new tree_directory();

      int choice;

      do{

        System.out.println("\n********** file system directory simulator ***********");
        System.out.println("1. Creating New Directory ");
        System.out.println("2. Deleting a Directory");
        System.out.println("3. Searching a Directory ");
        System.out.println("4. Displaying a Tree ");
        System.out.println("5. Exit ");

        System.out.println("Enter Your Choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch(choice) 
        {

          case 1: 
            System.out.print("Enter your directory name:");
            String name = sc.nextLine();
            tree.mkdir(name);
            break;

          case 2: 
            System.out.println("Enter directory name to delete: ");
            String dele = sc.nextLine();
            tree.delete(dele);
            break;

          case 3:
            System.out.println("Enter directory name to search : ");
            String search = sc.nextLine();

            node result =  tree.search(tree.root, search);

            if (result != null)
            {
              System.out.println("The Directory is found ");
            }
            else
            {
              System.out.println("The Directory is not found ");
            }
              break;
          }  
        }while(choice != 4);

          sc.close();
    }
  }          
            
