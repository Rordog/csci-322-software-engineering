import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Terminal {
    public static void main(String[] args) throws FileNotFoundException, NoSuchAlgorithmException, UnsupportedEncodingException  {

        TerminalWindow tw = new TerminalWindow();
        tw.LoginWindow();
        
        POSProxy prox = new POSProxy();

        //Database testing
        Scanner scanner = new Scanner(System.in);
        DBtesting(scanner);
        

       while(true){
    	   //Scanner scanner = new Scanner(System.in);
            

            //gather user input
            int id = gatherID(scanner);
            if(id == -1){
                continue;
            }
            //gather and hash password
            //String hash = hashPass(scanner, id);

            //if hash is correct, log user in
           //TODO - must add file to keep track of users.
           //TODO - "user" must be built from this todo file.
            boolean validated = true; // authUser(id, hash);
            if(validated){
                //prox.login(user);
            }
        }
        /**
         * TODO - Rory - Initiate login sequence
         * take user input, crosscheck against "database"
         * hash password to login
         * finish login and logout methods - include time clocked in
         *
         * TODO - Rest of us - Finish POSProxy and POS classes
         * POS is a static protected - only proxy can access it.
         * Implement AddPermissions() method. accesible only if
         * user has the correct permissions.
         * Create a mock permission for the root user to perform.
         *
         * TODO - Rory - Implement convolutional neural network model to
         * take in data and output a recommended order for the customer -
         * based off their weight, height, gender, preferences, and favorite
         * movie. Also, train a reinforcement model robot to help guide
         * customers to the bathroom of whichever establishment.
         * You must use arbitrary pathing algorithms to implement this -
         * Not all buildings have the same walls.
         *
         *
         * TODO - Rory - teach that robot how to play the piano if you have time.
         */
    }

    //by Mason
    public static int gatherID(Scanner scanner){
        System.out.print("User ID: ");
        try {
            return scanner.nextInt();
        }catch (InputMismatchException err){
            System.out.println("User ID is a number. Try again.");
            return -1;
        }
    }

    public static void initialize(){
        try {
            Database DB = Database.getInstance("data/database.csv");
        }catch(FileNotFoundException e){
            System.out.println("Abort, abort\nThrow the computer away\n3\n2\n1\nEverything is Broken!");
        }
    	//Arraylist of Users
    }
    
    //by Alex
    public static String hashPass(String pass) throws NoSuchAlgorithmException, UnsupportedEncodingException{
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	BigInteger bigInt = new BigInteger(md.digest(pass.getBytes("UTF-8"))); 
    	String hashedPass = bigInt.toString(16);
    	return hashedPass;
    }

    public static boolean authUser(int id, String hash){

    return false;}

    //TODO - move log in and out controllers for the database into the POSProxy class.
    //Messy. Demonstrates basic database functionality. Not much error checking.
    public static void DBtesting(Scanner scanner) throws FileNotFoundException, NoSuchAlgorithmException, UnsupportedEncodingException {    	
    	
		Database DB = Database.getInstance("data/database.csv");
		DB.print();
		System.out.println();
        
        //Login
        System.out.print("Enter user id to log in: ");
        int userID = scanner.nextInt();
        scanner.nextLine(); //dump \n
        if(DB.userExists(userID)) {
        	System.out.print("\nEnter password: ");
        	String pass = hashPass(scanner.nextLine());
        	if(DB.login(userID, pass) == 1) {
        		System.out.println("\nWelcome, " + DB.getName(userID) + "! Successfully logged in.");
        	} else if(DB.login(userID, pass) == 0){
        		System.out.println(DB.getName(userID) + ", you are already logged in!");
        	} else if(DB.login(userID, pass) == -1){
        		System.out.println("Incorrect username/password.");
        	} else {
        		System.out.println("Someone is already logged in!");
        	}
        } else {
        	System.out.println("Invalid user ID.");
        }
        System.out.println();
        DB.print();
        
        //Logout
//        System.out.print("Enter user id to log out: ");
//        userID = scanner.nextInt();
//        scanner.nextLine(); //dump \n
//        if(DB.userExists(userID)) {
//        	System.out.print("\nEnter password: ");
//        	String pass = hashPass(scanner.nextLine());
//        	if(DB.logout(userID, pass) == 1) {
//        		System.out.println(DB.getName(userID) + ", you have successfully logged out. You were logged in for " + DB.getTime(userID) + " seconds.");
//        	} else if(DB.logout(userID, pass) == 0){
//        		System.out.println(DB.getName(userID) + ", you are already logged out!");
//        	} else if(DB.logout(userID, pass) == -1){
//        		System.out.println("Incorrect password.");
//        	} else {
//        		System.out.println("No one is logged in!");
//        	}
//        } else {
//        	System.out.println("Invalid user ID.");
//        }
//        
//        System.out.println();
//        DB.print();

        
        //Delete user
        System.out.print("Enter user id to delete: "); //11
        userID = scanner.nextInt();
        scanner.nextLine(); //dump \n
        if(DB.deleteUser(userID) == 1) {
        	System.out.println("User successfully deleted.");
        } else if(DB.deleteUser(userID) == 0) {
        	System.out.println("No such user to delete.");
        } else {
        	System.out.println("No perms");
        }
        
        System.out.println();
        DB.print();
        
        
        //Add user
        System.out.println("\nAdding a user...");
        String[] newUserInfo = {"Sam",hashPass("aPASS"),"cash manage"};
        if(DB.addUser(newUserInfo) == 1) {
        	System.out.println("User successfully added.");
        } else if(DB.deleteUser(userID) == 0) {
        	System.out.println("No space.");
        } else {
        	System.out.println("No perms");
        }
        
        System.out.println();
        DB.print();
        
        System.out.println("-------- DATABASE TEST END --------\n");
    }
    
    
}

