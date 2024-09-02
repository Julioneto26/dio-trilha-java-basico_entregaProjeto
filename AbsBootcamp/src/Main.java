import br.com.dio.desafio.dominio.Curso ;

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




        System.out.println(curso1);
        System.out.println(curso2);


    }
}
