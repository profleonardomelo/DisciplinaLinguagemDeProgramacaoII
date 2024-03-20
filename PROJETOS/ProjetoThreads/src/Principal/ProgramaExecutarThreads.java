package Principal;

public class ProgramaExecutarThreads {

    public static void main(String[] args) {
        
        Thread tarefaA = new TarefaA();
        Thread tarefaB = new TarefaB();
        Thread tarefaC = new Thread(new TarefaC());
        
        tarefaA.start();
        tarefaB.start();
        tarefaC.start();
        
    } 
}
