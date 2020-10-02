/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaprova;

/**
 *
 * @author ander
 */
public class Disciplina {
    private String nome;
    private String ciclo;
    private String ementa;

    public Disciplina(String nome, String ciclo, String ementa, Double nota) {
        this.nome = nome;
        this.ciclo = ciclo;
        this.ementa = ementa;
        this.nota = nota;
    }
    private Double nota;
    
    public String getList(){
        return
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
}
