package desafio;

import java.util.*;

public class AlunoDev {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //nome do aluno em questao, nao alterar sob nenhuma hipotese
    private String nome;

    public Set<Conteudo> getConteudosIncritos() {
        return ConteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        ConteudosIncritos = conteudosIncritos;
    }

    private Set<Conteudo> ConteudosIncritos = new LinkedHashSet<>();

    public Set<Conteudo> getConteudosConcluidos() {
        return ConteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        ConteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlunoDev alunoDev = (AlunoDev) o;
        return Objects.equals(ConteudosIncritos, alunoDev.ConteudosIncritos) && Objects.equals(ConteudosConcluidos, alunoDev.ConteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ConteudosIncritos, ConteudosConcluidos);
    }

    //linkedhashset ordenação das conclusões de conteúdos
    private Set<Conteudo> ConteudosConcluidos = new LinkedHashSet<>();

    public void inscricao(Bootcamp bootcamp){
        this.ConteudosIncritos().addAll(bootcamp.getConteudoCurso());
        bootcamp.getInscritos().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.getConteudosIncritos().stream().findFirst();
        if (conteudo.isPresent){
            this.ConteudosConcluidos.add(conteudo.get())
        }
    }
    public void CalculaXPTotal(){
        return this.ConteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.CalculaXPTotal())
                .sum()
    }
}
