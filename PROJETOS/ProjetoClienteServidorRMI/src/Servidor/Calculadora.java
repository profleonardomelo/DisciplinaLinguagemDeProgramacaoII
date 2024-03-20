package Servidor;

import Contratos.ICalculadora;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements ICalculadora {

    public Calculadora() throws RemoteException {
        
    }

    @Override
    public int somar(int a, int b) throws RemoteException {
        return a + b;
    }
}
