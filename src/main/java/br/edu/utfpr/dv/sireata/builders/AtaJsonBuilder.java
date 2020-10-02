package br.edu.utfpr.dv.sireata.builders;

import br.edu.utfpr.dv.sireata.model.Ata;
import br.edu.utfpr.dv.sireata.model.AtaJson;
import br.edu.utfpr.dv.sireata.util.DateUtils;

import java.util.Date;

public class AtaJsonBuilder {
    private Ata.TipoAta tipo;
    private int numero;
    private int ano;
    private String data;

    public AtaJsonBuilder() {
        this.tipo = Ata.TipoAta.ORDINARIA;
        this.numero = 0;
        this.ano = 0;
        this.data = "";
    }

    public AtaJsonBuilder withType(Ata.TipoAta tipoAta) {
        this.tipo = tipoAta;
        return this;
    }

    public AtaJsonBuilder withNumber(int numero) {
        this.numero = numero;
        return this;
    }

    public AtaJsonBuilder withYear(Date ano) {
        this.ano = DateUtils.getYear(ano);
        return this;
    }

    public AtaJsonBuilder withDate(Date data) {
        this.data = DateUtils.format(data, "dd/MM/yyyy");
        return this;
    }

    public AtaJson constroi() {

        AtaJson a = new AtaJson(this.tipo, this.numero, this.ano, this.data);

        return a;
    }
}
