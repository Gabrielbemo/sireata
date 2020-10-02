package br.edu.utfpr.dv.sireata.model;

public class AtaJson {

    private Ata.TipoAta tipo;
    private int numero;
    private int ano;
    private String data;

    public AtaJson(Ata.TipoAta tipoAta, int numero, int ano, String data) {
        this.setTipo(tipoAta);
        this.setNumero(numero);
        this.setAno(ano);
        this.setData(data);
    }

    public Ata.TipoAta getTipo() {
        return tipo;
    }
    public void setTipo(Ata.TipoAta tipo) {
        this.tipo = tipo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

}