package fr.uvsq;


import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;
import fr.uvsq.Command;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public abstract class Interpreter {

    protected Stack history = new Stack();
    protected Hashtable set = new Hashtable();

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
       return  ((Command)set.get(s));
    }
}
