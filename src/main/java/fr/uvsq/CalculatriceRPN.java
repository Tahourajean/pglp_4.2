package fr.uvsq;


import exeption.SAISIEException;

public enum CalculatriceRPN {
	val1;
	CalculatriceRPN() 
	{
	
		Command  b=new SaisieRPN();
                b.enregistrerOperande();		
		
	}
	
	public static void main(String[] args) {
		CalculatriceRPN e;	
	}

}
