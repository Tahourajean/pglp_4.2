/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq;

/**
 *
 * @author USER
 */
public abstract class Command implements Cloneable{
    public abstract void execute();
    public abstract void undo();
    public abstract void calculSurOperande();
    public abstract void enregistrerOperande();
    public abstract void RetournerEnsembleOperandeStocker();
}
