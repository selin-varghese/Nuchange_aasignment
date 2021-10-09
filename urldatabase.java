import java.util.Scanner;
public class urldatabase {

	public static void main(String args[]){
	    
		int count = 0;

		Scanner sc = new Scanner(System.in);  
		while (1) 
                {
		      System.out.println("Enter the command:");
	              String command = sc.nextLine();		    	
		   
		    switch (command)
                    {
		    case "storeurl":
		        String url = sc.nextLine();
                        count=count+1;
		          break;
		    case "get":
		    	   String url1 = sc.nextLine();
                           System.out.println("short key: %s",url);
         		    break;
		    case "count":
		    	   String url2 = sc.nextLine();
                           System.out.println("usage count:",count);
                           break;
		    case "list":
		 		System.out.println(url);
		                break;
		    case "exit":exit();
                             break;
                    }

		}
				
}

	