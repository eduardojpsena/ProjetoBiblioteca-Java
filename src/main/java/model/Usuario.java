package model;

public class Usuario {
    //Atributos
    private Aluno alunoExterno;
    private Professor professor;
    private MembroExterno membroExterno;

    //Construtores
    public Usuario() {
    }

    public Usuario(Aluno alunoExterno, Professor professor, MembroExterno membroExterno) {
            this.alunoExterno = alunoExterno;
            this.professor = professor;
            this.membroExterno = membroExterno;
    }

    //Get e Set
    public Aluno getAlunoExterno() {
            return alunoExterno;
    }
    public void setAlunoExterno(Aluno alunoExterno) {
            this.alunoExterno = alunoExterno;
    }

    public Professor getProfessor() {
            return professor;
    }
    public void setProfessor(Professor professor) {
            this.professor = professor;
    }

    public MembroExterno getMembroExterno() {
            return membroExterno;
    }
    public void setMembroExterno(MembroExterno membroExterno) {
            this.membroExterno = membroExterno;
    }

    //toString
    public String toString() {
            return "Usuario [alunoExterno=" + alunoExterno + ", professor=" + professor + ", membroExterno=" + membroExterno
                            + "]";
    }	
}