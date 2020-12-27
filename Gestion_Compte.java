package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Gestion_Compte extends UnicastRemoteObject implements Myinterface {
    double solde=0 ;
	protected Gestion_Compte() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String debiter(double d) throws RemoteException { 
		if (d>solde)
		return "solde insuffisant";
		else solde=solde-d;
		
		// TODO Auto-generated method stub
		return "operation effectuée";
	}

	@Override
	public String crediter(double c) throws RemoteException {
		solde=solde+c;
		return "operation effectuée";
	}

	@Override
	public double lire_solde() throws RemoteException {
		// TODO Auto-generated method stub
		return solde;
	}

}
