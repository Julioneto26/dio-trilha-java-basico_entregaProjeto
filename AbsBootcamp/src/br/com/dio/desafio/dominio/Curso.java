package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    public Curso(){


    }

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO * getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso{ " + 
            "titulo='"+ getTitulo() + '\''+
            "descricao='"+ getDescricao() + '\'' +
            "caragaHoraria='"+ getCargaHoraria() + 

        
        '}';
    }

    

    

    


    
}
