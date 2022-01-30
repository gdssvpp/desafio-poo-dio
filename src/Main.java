import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso intensivo voltado a Linguagem Java");
        curso1.setCargaHoraria(54);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso IDEs");
        curso2.setDescricao("Curso intensivo sobre IDEs");
        curso2.setCargaHoraria(15);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria da Linguagem Java");
        mentoria.setData(LocalDate.now());


        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Start #3");
        bootcamp.setDescricao("Em busca de Starters");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTibio = new Dev();
        devTibio.setNome("Tíbio");
        devTibio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Tíbio " + devTibio.getConteudosInscritos());
        System.out.println();

        devTibio.progredir();
        devTibio.progredir();
        devTibio.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Inscritos de Tíbio " + devTibio.getConteudosInscritos());
        System.out.println();

        System.out.println("Conteúdos Concluídos de Tíbio " + devTibio.getConteudosConcluidos());
        System.out.println("XP: " + devTibio.calcularTotalXp());
        System.out.println("----------------------------------------------------------");

        Dev devPeronio = new Dev();
        devPeronio.setNome("Perônio");
        devPeronio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Perônio " + devPeronio.getConteudosInscritos());
        System.out.println();

        devPeronio.progredir();

        System.out.println("-");

        System.out.println("Conteúdos Inscritos de Perônio " + devPeronio.getConteudosInscritos());
        System.out.println();

        System.out.println("Conteúdos Concluídos de Perônio " + devPeronio.getConteudosConcluidos());
        System.out.println("XP:" + devPeronio.calcularTotalXp());
        System.out.println("----------------------------------------------------------");



    }

}
