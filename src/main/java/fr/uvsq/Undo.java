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

    @Override
    public void calculSurOperande(Operation sign) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enregistrerOperande() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void RetournerEnsembleOperandeStocker() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
