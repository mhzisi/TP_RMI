package service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServiceRMI {
  
	public static void main(String[] args) throws RemoteException,MalformedURLException {
		try {
			java.rmi.registry.LocateRegistry.createRegistry(1250);
			Gestion_Compte gs=new Gestion_Compte() ;
			Naming.rebind("rmi://127.0.0.1:1250/gs", gs);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
