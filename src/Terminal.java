import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args)  {

        title();
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
    public static void title() {
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::..:....:\n" +
                ":::::::::::.:::::::..:.....::::::::::::::::::::::::::::~JJ???~:\n" +
                "::::::::::.::.:..:......::.::::::.:.::.::::.::::::::::.?PPGGP5^\n" +
                ":::::..::...:..............:.::::.......:.:...::::::::.:JPGGPP!\n" +
                ":::::::::::::....:.........:.:.:......::..::.:..:.:::::.:YPGP57\n" +
                ":::::::::::.:::::::::...::::::.:::::::::::::::::::::::::.?PGP5!\n" +
                ":::::::::.::::::::::::::::::::::::::::::::::::::::::::::.?GGPY:\n" +
                "::::::::::..:::::::::::::::::::::::::::::::::::::::::::.^YGGPY:\n" +
                ":::::::::::::::::::::::::::::::::::::::::::::::::      :7Y5P5?::\n" +
                ".::::::::::::::::.::::::::::::::::::::::::::^^^~~~~     ~~~!?~::::::\n" +
                ".:::::::::::::::::::::::::...:::::::::::::^~~~~~~~~      ~~~~~~~~~^^::\n" +
                ":::::::::::.::::::::.::::::.::::::::::::^\t\t                   ~~:\n" +
                ":::::::::::::::::::::::::::::::::::::.:^~^\t\t\t                   ::\n" +
                ":::::::::::::::::::::::::::::::::::::^\t\t\t\t                  !^\n" +
                "::::::::::::::::::::::::::::::::::::^\t\t\t\t                  !~\n" +
                ":::::::::::::::::::::::::::::::.::^\t\t\t\t                     ~!!^\n" +
                "::::::::::::::::::::::::::::::::^~\t\t\t\t                      ~!~:\n" +
                "::::::::::::::::::::::::::::::^~\t\t\t\t                     ~~!!^\n" +
                "::::::::::::::::::::::::::::^~\t\t\t\t\t                      ~~!!^\n" +
                ":::::::::::::..:::::::::.:^^\t\t\t\t\t                     ~~~~!~^\n" +
                ":::::::::::::::::::::::::^\t  _ _\t    _ _ _      _     _ _ _\t          !~^\n" +
                ".::::::::::::::::::::::\t^\t ||_ _\\    |\t      /\t\\   | _ _ |\n" +
                "...:::::::::::::::::.:^~~!\t ||_ _ |   |_ _ _    /|\t|\\  | _ _||               ~\n" +
                "..::::.::..::.::.::..:~~!\t ||_ _/    |_ _ _   |---- | |   \\                !^\n" +
                "....................:^~!\t ||\t       |\t    |\t  | |    \\\t            !!~\n" +
                "....................:^\t\t ||\t       |_ _ _   |\t  | |     \\              ~~\n" +
                "....................:~\t\t         _ _\t   _\t _ _ _\t                 ~~\n" +
                "....................^~!\t\t        ||_ _\\\t  / \\\t|  _  \\\t\t             !~\n" +
                "....................^!!!\t        ||_ _ |\t /| |\\\t| | |  |\t             !~\n" +
                "....................:~!\t            ||_ _/  | ----| | | |  |  \t            !!~\n" +
                "::::::::::::::::::..:~!\t\t        ||\t    |     |\t| |_|  |\t            !!^\n" +
                "::::::::::::::::::::.^~!7\t        ||\t    |     |\t|_ _ _/\t\t           7!~:\n" +
                "::::::::::::::::::::::^!\t\t\t\t\t\t                            !\n" +
                ":::::::::::::::::::::::^!!\t\t\t\t\t\t                            :\n" +
                ":::::::::::::::::::::::::~\t\t\t\t\t\t                          ~:\n" +
                "::::::::::::::::::::::::::^!\t\t\t\t\t\t                     ~^^\n" +
                ":::::::::::::::::::::^^^^^~~!\t\t\t\t\t\t                    ~~~~^^^\n" +
                "::::::::::::::::::::^^^~~~!! ~~\t\t\t\t\t\t                          ^\n" +
                ":::::::::::::::::^^^^^~~~~!!!777?JY55555YYY55555555YY5555555P5555YYJJJJ??77!!\n" +
                "::::::::::::::::::^^^^^~~~!!!77??JJY5PGGGGGGGGGGGGGGBBBBGGGPP55YYYJJJJ??77!!\n" +
                ":::::::::::::::::::::^^^^^~~~!!!777???JJYY555PPPPGGGPPPP555YYYJJJ????77!!\n" +
                ":::::::::::::::::::::::::::^^^^^^~~~~~!!!!!77777??????????77777!!!\n" +
                ".::::::::::::::::::::::::::::::::::::^^^^^^^^^~~~~~~~~~");
    }
}

