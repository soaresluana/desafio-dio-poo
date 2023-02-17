import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("Descrição curso PHP");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuana = new Dev();
        devLuana.setNome("Luana Soares");
        devLuana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devLuana.getConteudosInscritos());
        devLuana.progredir();
        devLuana.progredir();

        System.out.println("Conteudos inscritos: " + devLuana.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devLuana.getConteudosConcluidos());
        System.out.println("XP: " + devLuana.calcularTotalXp());


        System.out.println(" -------------");

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael Silva");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devRafael.getConteudosInscritos());
        devRafael.progredir();

        System.out.println("Conteudos inscritos: " + devRafael.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devRafael.getConteudosConcluidos());
        System.out.println("XP: " + devRafael.calcularTotalXp());


    }
}