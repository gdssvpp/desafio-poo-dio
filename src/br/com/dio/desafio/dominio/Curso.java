package br.com.dio.desafio.dominio;

public  class Curso extends Conteudo {

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
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
        return "\n\nCURSOS " +
                "\nTítulo do Curso: " + getTitulo() +
                "\nDescrição do Curso: " + getDescricao() +
                "\nCarga Horária do Curso: " + cargaHoraria + " horas";
    }


}
