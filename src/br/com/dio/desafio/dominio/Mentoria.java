package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class Mentoria extends Conteudo{

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {

    }

    private LocalDate data;


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n\nMENTORIAS " +
                "\nTipo de Mentoria = " + getTitulo() +
                "\ndescricao da mentoria = " + getDescricao() +
                "\n Data de inscrição = " + data;
    }


}
