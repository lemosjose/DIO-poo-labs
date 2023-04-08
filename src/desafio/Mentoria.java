package desafio;

import java.time.LocalDate;
public class Mentoria {
    String nomeMentoria;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    String descricao;
    LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeMentoria() {
        return nomeMentoria;
    }

    public void setNomeMentoria(String nomeMentoria) {
        this.nomeMentoria = nomeMentoria;
    }
}
