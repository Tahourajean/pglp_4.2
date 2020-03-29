package fr.uvsq;

import java.util.Stack;



class Undo extends Command {

    protected Stack history;

    public Undo(Stack h) {
        history = h; 
    
                }

    @Override
    public void execute() {
        ((Command) history.pop()).undo();
    }

    @Override
    public void undo() {
        
   }


    
}
