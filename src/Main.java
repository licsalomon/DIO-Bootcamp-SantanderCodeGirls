import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("desc Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Angular");
        curso2.setDescricao("desc Angular");
        curso2.setCargaHoraria(10);

//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("desc java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(mentoria1);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLaura = new Dev();
        devLaura.setNome("Laura");
        devLaura.inscreverBootcamp(bootcamp);
        System.out.println("Cont inscritos "+ devLaura.getNome()+" "+ devLaura.getConteudosInscritos());
        devLaura.progredir();
        devLaura.progredir();
        System.out.println("-");
        System.out.println("Cont concluidos "+ devLaura.getNome()+" "+ devLaura.getConteudosConcluidos());
        System.out.println("Cont inscritos "+ devLaura.getNome()+" "+ devLaura.getConteudosInscritos());
        System.out.println("XP:"+ devLaura.calcularTotalXp());

        System.out.println("---------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Cont inscritos "+ devPedro.getNome()+" "+ devPedro.getConteudosInscritos());
        System.out.println("-");
        devPedro.progredir();
        System.out.println("Cont concluidos "+ devPedro.getNome()+" "+ devPedro.getConteudosConcluidos());
        System.out.println("Cont inscritos "+ devPedro.getNome()+" "+ devPedro.getConteudosInscritos());
        System.out.println("XP:"+ devPedro.calcularTotalXp());


    }
}
