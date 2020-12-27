package service;

import java.rmi.Naming;


public class ClientRMI {

    public static void main(String[] args) {
        try {
            Myinterface service1 = (Myinterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.crediter(50));
            System.out.println(service1.debiter(20));
            System.out.println(service1.lire_solde());
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }
}
