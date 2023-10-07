package Contratos;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote {
    int somar(int a, int b) throws RemoteException;
}