package desafio;

import java.util.*;
import java.time.LocalDate;
public class Bootcamp {
    public Set<AlunoDev> getInscritos() {
        return Inscritos;
    }

    public void setInscritos(Set<AlunoDev> inscritos) {
        Inscritos = inscritos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(Inscritos, bootcamp.Inscritos) && Objects.equals(ConteudoCurso, bootcamp.ConteudoCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Inscritos, ConteudoCurso);
    }

    private Set<AlunoDev> Inscritos = new HashSet<>();

    public Set<Conteudo> getConteudoCurso() {
        return ConteudoCurso;
    }

    public void setConteudoCurso(Set<Conteudo> conteudoCurso) {
        ConteudoCurso = conteudoCurso;
    }

    //ordenação de conteúdos
    private Set<Conteudo> ConteudoCurso = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    //inicia o curso por instanciação da classe
    private final LocalDate dataInicial = LocalDate.now();

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    private final LocalDate dataFinal = dataInicial.plusDays(45);
}
