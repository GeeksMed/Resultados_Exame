package org.example;

public class Resultados {
    private float triglicerides;
    private float colesterolTotal;
    private float colesterolHDL;
    private float colesterolLDL;
    private float colesterolVLDL;
    private float glicose;

    private final float LIMITE_DESEJAVEL_TRIGLICERIDES = 150f;
    private final float LIMITE_LIMITROFE_TRIGLICERIDES = 200f;
    private final float LIMITE_ALTO_TRIGLICERIDES = 500f;

    private final float LIMITE_DESEJAVEL_COLESTEROL_TOTAL = 200f;
    private final float LIMITE_LIMITROFE_COLESTEROL_TOTAL = 240f;

    private final float LIMITE_BAIXO_COLESTEROL_HDL = 40f;
    private final float LIMITE_NORMAL_COLESTEROL_HDL = 60f;

    private final float LIMITE_OTIMO_COLESTEROL_LDL = 100f;
    private final float LIMITE_DESEJAVEL_COLESTEROL_LDL = 130f;
    private final float LIMITE_LIMITROFE_COLESTEROL_LDL = 160f;
    private final float LIMITE_ALTO_COLESTEROL_LDL = 190f;

    private final float LIMITE_DESEJAVEL_COLESTEROL_VLDL = 30f;
    private final float LIMITE_LIMITROFE_COLESTEROL_VLDL = 40f;

    private final float LIMITE_HIPOCLICEMIA_GLICOSE = 60f;
    private final float LIMITE_DESEJAVEL_GLICOSE = 100f;
    private final float LIMITE_GLICEMIA_JEJUM_INAPROPRIADA_GLICOSE = 125f;

    public Resultados(float triglicerides, float colesterolTotal, float colesterolHDL, float colesterolLDL, float colesterolVLDL, float glicose){
        this.triglicerides = triglicerides;
        this.colesterolTotal = colesterolTotal;
        this.colesterolHDL = colesterolHDL;
        this.colesterolLDL = colesterolLDL;
        this.colesterolVLDL = colesterolVLDL;
        this.glicose = glicose;
    }

    public void verificaValorZerado(float valor){
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
        else if (this.colesterolHDL < LIMITE_NORMAL_COLESTEROL_HDL) { return "Nível normal"; }
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
        else if (this.colesterolVLDL < LIMITE_LIMITROFE_COLESTEROL_VLDL) { return "Nível limítrofe"; }
        else { return "Nível elevado"; }
    }

    public String examinaGlicose(){
        this.verificaValorZerado(this.glicose);

        if (this.glicose < LIMITE_HIPOCLICEMIA_GLICOSE){ return "Hipoglicemia"; }
        else if (this.glicose < LIMITE_DESEJAVEL_GLICOSE) { return "Desejável"; }
        else if (this.glicose < LIMITE_GLICEMIA_JEJUM_INAPROPRIADA_GLICOSE) { return "Glicemia de jejum inapropriada"; }
        else { return "Diabetes"; }
    }
}