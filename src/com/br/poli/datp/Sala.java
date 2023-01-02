package com.br.poli.datp;

public class Sala {

    private String nomeDaSala;
    private String bloco;
    private boolean chave;

    public Sala(String nomeDaSala, String bloco, boolean chave) {
        this.nomeDaSala = nomeDaSala;
        this.chave = chave;
    }

    public String getNomeDaSala() {
        return nomeDaSala;
    }

    public void setNomeDaSala(String nomeDaSala) {
        this.nomeDaSala = nomeDaSala;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public boolean getChave() {
        return chave;
    }

    public void setChave(boolean chave) {
        this.chave = chave;
    }

    public void pegaChave() {

        if (this.getChave() == true) {

            this.setChave(false);

        } else if (this.getChave() == false) {

            this.setChave(true);
        }
    }
}
