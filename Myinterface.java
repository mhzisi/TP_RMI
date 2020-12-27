package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Myinterface extends Remote {
	public String debiter(double d) throws RemoteException ;
	public String crediter(double d) throws RemoteException;
	public double lire_solde() throws RemoteException;

}
