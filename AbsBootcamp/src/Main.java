import br.com.dio.desafio.dominio.Curso ;
import br.com.dio.desafio.dominio.Mentoria ;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java Dio");
        curso1.setDescricao("Curso Java Tooop das Galaxias");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java Dio 55");
        curso2.setDescricao("Curso Java Tooop dos universos");
        curso2.setCargaHoraria(120);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Brocando em JAVA");
        mentoria1.setDescricao("Mentoria java total");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}
