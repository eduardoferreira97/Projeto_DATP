package com.br.poli.datp;

public class Disciplina {

    //Váriaveis
    private String turma;
    private Professor professor;
    private Materia materia;
    private Sala sala;
    private Horario horario;

    //Método especial (Construtor)
    public Disciplina(String turma, Professor professor, Materia materia, Sala sala, Horario horario) {
        this.turma = turma;
        this.professor = professor;
        this.materia = materia;
        this.sala = sala;
        this.horario = horario;
    }

    //Métodos (Get e Set)
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    //Método temporário criado para ver o estado da chave
    public void chaveSala() {

        if (this.sala.getChave() == true) {

            System.out.println("Sim");

        } else {

            System.out.println("Não");
        }
    }

}
