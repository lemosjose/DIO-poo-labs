import desafio.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setNomeCurso("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setNomeCurso("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setNomeMentoria("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudoCurso().add(curso1);
        bootcamp.getConteudoCurso().add(curso2);
        bootcamp.getConteudoCurso().add(mentoria);

        AlunoDev devLemos = new AlunoDev();
        devLemos.setNome("Lemos");
        devLemos.inscricao(bootcamp);
        System.out.println("Conteúdos Inscritos Lemos:" + devLemos.getConteudosIncritos());
        devLemos.progredir();
        devLemos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lemos:" + devLemos.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Lemos:" + devLemos.getConteudosConcluidos());
        System.out.println("XP:" + devLemos.CalculaXPTotal(););


        System.out.println("-------");


        AlunoDev devJoao = new AlunoDev();
        devJoao.setNome("Joao");
        devJoao.inscricao(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.CalculaXPTotal(););

    }
}
