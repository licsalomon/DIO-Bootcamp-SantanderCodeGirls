import br.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("desc java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
