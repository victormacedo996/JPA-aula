package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tarefa;

public class BuscaUmaTarefa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");

        EntityManager manager = factory.createEntityManager();

        Tarefa tarefa = manager.find(Tarefa.class, 2L);

        System.out.println(tarefa.getDescricao());
        System.out.println(tarefa.getDataFinalizacao());
        System.out.println(tarefa.getId());

        manager.close();
        factory.close();
    }
}
