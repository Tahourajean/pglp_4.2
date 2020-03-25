
import fr.uvsq.Command;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;


public class Interpreter {

    protected Stack history = new Stack();
    protected HashSet set = new HashSet();

    public void session() {
        while (true) {
            Command command = getNewCommand();
            if (command instanceof Quit)
            {
            return;
            }
                
            else {
                   command.execute ( ) ;
                  }
          }
       }

    protected Command getNewCommand() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!set.contains(s)) {
            System.out.println(""+s);
            s = sc.nextLine();
        }
       // return (Command) ((Command) set.getClass().c
    }
}
