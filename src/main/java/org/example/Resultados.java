package org.example;

public class Resultados {
    private int triglicerides;
    private int colesterolTotal;
    private int colesterolHDL;
    private int colesterolLDL;
    private int colesterolVLDL;
    private int glicose;

    private final int LIMITE_DESEJAVEL_TRIGLICERIDES = 150;
    private final int LIMITE_LIMITROFE_TRIGLICERIDES = 200;
    private final int LIMITE_ALTO_TRIGLICERIDES = 500;

    private final int LIMITE_DESEJAVEL_COLESTEROL_TOTAL = 200;
    private final int LIMITE_LIMITROFE_COLESTEROL_TOTAL = 240;

    private final int LIMITE_BAIXO_COLESTEROL_HDL = 40;
    private final int LIMITE_NORMAL_COLESTEROL_HDL = 60;

    private final int LIMITE_OTIMO_COLESTEROL_LDL = 100;
    private final int LIMITE_DESEJAVEL_COLESTEROL_LDL = 130;
    private final int LIMITE_LIMITROFE_COLESTEROL_LDL = 160;
    private final int LIMITE_ALTO_COLESTEROL_LDL = 190;

    private final int LIMITE_DESEJAVEL_COLESTEROL_VLDL = 30;
    private final int LIMITE_LIMITROFE_COLESTEROL_VLDL = 40;

    private final int LIMITE_HIPOCLICEMIA_GLICOSE = 60;
    private final int LIMITE_DESEJAVEL_GLICOSE = 100;
    private final int LIMITE_GLICEMIA_JEJUM_INAPROPRIADA_GLICOSE = 125;

    public Resultados(int triglicerides, int colesterolTotal, int colesterolHDL, int colesterolLDL, int colesterolVLDL, int glicose){
        this.triglicerides = triglicerides;
        this.colesterolTotal = colesterolTotal;
        this.colesterolHDL = colesterolHDL;
        this.colesterolLDL = colesterolLDL;
        this.colesterolVLDL = colesterolVLDL;
        this.glicose = glicose;
    }

    public void verificaValorZerado(int valor){
        if(valor<=0){
            throw new IllegalArgumentException("Valor informado abaixo ou igual a zero");
        }
    }

    public String examinaTriglicerides(){
        this.verificaValorZerado(this.triglicerides);

        if (this.triglicerides < LIMITE_DESEJAVEL_TRIGLICERIDES){ return "Nível desejável"; }
        else if (this.triglicerides < LIMITE_LIMITROFE_TRIGLICERIDES) { return "Nível limitrofe"; }
        else if (this.triglicerides < LIMITE_ALTO_TRIGLICERIDES) { return "Nível alto"; }
        else { return "Nível muito alto"; }
    }

    public String examinaColesterolTotal(){
        this.verificaValorZerado(this.colesterolTotal);

        if (this.colesterolTotal < LIMITE_DESEJAVEL_COLESTEROL_TOTAL){ return "Nível desejável"; }
        else if (this.colesterolTotal < LIMITE_LIMITROFE_COLESTEROL_TOTAL) { return "Nível limitrofe"; }
        else { return "Nível elevado"; }
    }

    public String examinaColesterolHDL(){
        this.verificaValorZerado(this.colesterolHDL);

        if (this.colesterolHDL < LIMITE_BAIXO_COLESTEROL_HDL){ return "Nível baixo"; }
        else if (this.colesterolHDL <= LIMITE_NORMAL_COLESTEROL_HDL) { return "Nível normal"; }
        else { return "Nível desejado"; }
    }

    public String examinaColesterolLDL(){
        this.verificaValorZerado(this.colesterolLDL);

        if (this.colesterolLDL < LIMITE_OTIMO_COLESTEROL_LDL){ return "Nível otimo"; }
        else if (this.colesterolLDL < LIMITE_DESEJAVEL_COLESTEROL_LDL) { return "Nível desejável"; }
        else if (this.colesterolLDL < LIMITE_LIMITROFE_COLESTEROL_LDL) { return "Nível limítrofe"; }
        else if (this.colesterolLDL < LIMITE_ALTO_COLESTEROL_LDL) { return "Nível alto"; }
        else { return "Nível muito alto"; }
    }

    public String examinaColesterolVLDL(){
        this.verificaValorZerado(this.colesterolVLDL);

        if (this.colesterolVLDL < LIMITE_DESEJAVEL_COLESTEROL_VLDL){ return "Nível desejável"; }
        else if (this.colesterolVLDL <= LIMITE_LIMITROFE_COLESTEROL_VLDL) { return "Nível limítrofe"; }
        else { return "Nível elevado"; }
    }

    public String examinaGlicose(){
        this.verificaValorZerado(this.glicose);

        if (this.glicose < LIMITE_HIPOCLICEMIA_GLICOSE){ return "Hipoglicemia"; }
        else if (this.glicose < LIMITE_DESEJAVEL_GLICOSE) { return "Desejável"; }
        else if (this.glicose <= LIMITE_GLICEMIA_JEJUM_INAPROPRIADA_GLICOSE) { return "Glicemia de jejum inapropriada"; }
        else { return "Diabetes"; }
    }
}