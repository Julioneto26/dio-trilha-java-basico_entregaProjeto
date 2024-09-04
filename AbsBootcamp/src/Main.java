import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso ;
import br.com.dio.desafio.dominio.Dev;
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


        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Total do curso Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
            
        Dev devJulio = new Dev();
        devJulio.setNome("Júlio Neto");
        devJulio.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Julio" + devJulio.getConteudosInscritos());

        devJulio.Progredir();
        devJulio.Progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Julio" + devJulio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Julio" + devJulio.getConteudosFinalizados());
        System.out.println("XP:" + devJulio.CalculaTotalXp());

        System.out.println("-----------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());

        devCamila.Progredir();
        devCamila.Progredir();
        devCamila.Progredir();
        
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudosFinalizados());
        System.out.println("XP:" + devCamila.CalculaTotalXp());



    }
}
