package Principal;

import java.util.ArrayList;
import java.util.List;

public class ExemploDeUsoDeColecoes {

    public static void main(String[] args) {
        
        List<Estudante> listaDeEstudantes = new ArrayList<>();

        Estudante estudante1 = new Estudante("Maria", 20);
        listaDeEstudantes.add(estudante1);

        Estudante estudante2 = new Estudante("Joao", 22);
        listaDeEstudantes.add(estudante2);

        Estudante estudante3 = new Estudante("Pedro", 21);
        listaDeEstudantes.add(estudante3);
        
        Estudante estudante4 = new Estudante("Ana", 25);
        listaDeEstudantes.add(estudante4);

        listaDeEstudantes.remove(2);
        listaDeEstudantes.remove(estudante4);

        for (Estudante estudante : listaDeEstudantes) {
            System.out.println("Nome: " + estudante.getNome());
            System.out.println("Idade: " + estudante.getIdade() + "\n");
        }
    }
    
}
