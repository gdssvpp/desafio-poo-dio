package br.com.dio.desafio.dominio;

public  class Curso extends Conteudo {

    @Override
    public double calcularXp() {
        return 0;
    }

    private int cargaHoraria;

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso " +
                "\nTítulo do Curso: " + getTitulo() + '\'' +
                ", \nDescrição do Curso: " + getDescricao() + '\'' +
                ", \nCarga Horária do Curso: " + cargaHoraria +
                '}';
    }


}
