package desafio;

public class Curso {
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeCurso() {
        return NomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        NomeCurso = nomeCurso;
    }

    String NomeCurso;
    String descricao;

    @Override
    public String toString() {
        return "Curso{" +
                "NomeCurso='" + NomeCurso + '\'' +
                ", descricao='" + descricao + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }

    public float getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    float CargaHoraria;
}
