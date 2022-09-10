package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultadosTest{

    @Test
    public void testeTrigliceridesZerado(){
        try{
            Resultados resultado = new Resultados(0, 1, 1, 1, 1, 1);
            resultado.examinaTriglicerides();
        }catch (IllegalArgumentException e) {
            assertEquals("Valor informado abaixo ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void testeColesterolTotalZerado(){
        try{
            Resultados resultado = new Resultados(1, 0, 1, 1, 1, 1);
            resultado.examinaColesterolTotal();
        }catch (IllegalArgumentException e) {
            assertEquals("Valor informado abaixo ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void testeColesterolHDLZerado(){
        try{
            Resultados resultado = new Resultados(1, 1, 0, 1, 1, 1);
            resultado.examinaColesterolHDL();
        }catch (IllegalArgumentException e) {
            assertEquals("Valor informado abaixo ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void testeColesterolLDLZerado(){
        try{
            Resultados resultado = new Resultados(1, 1, 1, 0, 1, 1);
            resultado.examinaColesterolLDL();
        }catch (IllegalArgumentException e) {
            assertEquals("Valor informado abaixo ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void testeColesterolVLDLZerado(){
        try{
            Resultados resultado = new Resultados(1, 1, 1, 1, 0, 1);
            resultado.examinaColesterolVLDL();
        }catch (IllegalArgumentException e) {
            assertEquals("Valor informado abaixo ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void testeGlicoseZerado(){
        try{
            Resultados resultado = new Resultados(1, 1, 1, 1, 1, 0);
            resultado.examinaGlicose();
        }catch (IllegalArgumentException e) {
            assertEquals("Valor informado abaixo ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void testeTrigliceridesDesejavel(){
        Resultados resultado = new Resultados(149f, 1, 1, 1, 1, 1);
        assertEquals("Nível desejável", resultado.examinaTriglicerides());
    }

    @Test
    public void testeTrigliceridesLimitrofe(){
        Resultados resultado = new Resultados(199f, 1, 1, 1, 1, 1);
        assertEquals("Nível limitrofe", resultado.examinaTriglicerides());
    }

    @Test
    public void testeTrigliceridesAlto(){
        Resultados resultado = new Resultados(499f, 1, 1, 1, 1, 1);
        assertEquals("Nível alto", resultado.examinaTriglicerides());
    }

    @Test
    public void testeTrigliceridesMuitoAlto(){
        Resultados resultado = new Resultados(500f, 1, 1, 1, 1, 1);
        assertEquals("Nível muito alto", resultado.examinaTriglicerides());
    }

    @Test
    public void testeColesterolTotalDesejavel(){
        Resultados resultado = new Resultados(500f, 199f, 1, 1, 1, 1);
        assertEquals("Nível desejável", resultado.examinaColesterolTotal());
    }

    @Test
    public void testeColesterolTotalLimitrofe(){
        Resultados resultado = new Resultados(500f, 239f, 1, 1, 1, 1);
        assertEquals("Nível limitrofe", resultado.examinaColesterolTotal());
    }

    @Test
    public void testeColesterolTotalElevado(){
        Resultados resultado = new Resultados(500f, 240f, 1, 1, 1, 1);
        assertEquals("Nível elevado", resultado.examinaColesterolTotal());
    }

    @Test
    public void testeColesterolHDLBaixo(){
        Resultados resultado = new Resultados(500f, 240f, 39f, 1, 1, 1);
        assertEquals("Nível baixo", resultado.examinaColesterolHDL());
    }

    @Test
    public void testeColesterolHDLNormal(){
        Resultados resultado = new Resultados(500f, 240f, 59f, 1, 1, 1);
        assertEquals("Nível normal", resultado.examinaColesterolHDL());
    }

    @Test
    public void testeColesterolHDLDesejado(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 1, 1, 1);
        assertEquals("Nível desejado", resultado.examinaColesterolHDL());
    }

    @Test
    public void testeColesterolLDLOtimo(){
        Resultados resultado = new Resultados(500f, 199f, 60f, 99f, 1, 1);
        assertEquals("Nível otimo", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolLDLDesejavel(){
        Resultados resultado = new Resultados(500f, 239f, 60f, 129f, 1, 1);
        assertEquals("Nível desejável", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolLDLLimitrofe(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 159f, 1, 1);
        assertEquals("Nível limítrofe", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolLDLAlto(){
        Resultados resultado = new Resultados(500f, 239f, 60f, 189f, 1, 1);
        assertEquals("Nível alto", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolLDLDesejado(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 190f, 1, 1);
        assertEquals("Nível muito alto", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolVLDLDesejado(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 190f, 29f, 1);
        assertEquals("Nível desejável", resultado.examinaColesterolVLDL());
    }

    @Test
    public void testeColesterolVLDLLimítrofe(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 190f, 39f, 1);
        assertEquals("Nível limítrofe", resultado.examinaColesterolVLDL());
    }

    @Test
    public void testeColesterolVLDLElevado(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 190f, 40f, 1);
        assertEquals("Nível elevado", resultado.examinaColesterolVLDL());
    }

    @Test
    public void testeColesterolGlicoseHipoglicemia(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 190f, 40f, 59f);
        assertEquals("Hipoglicemia", resultado.examinaGlicose());
    }

    @Test
    public void testeColesterolGlicoseDesejavel(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 190f, 40f, 99f);
        assertEquals("Desejável", resultado.examinaGlicose());
    }

    @Test
    public void testeColesterolGlicoseGlicemia(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 190f, 40f, 124f);
        assertEquals("Glicemia de jejum inapropriada", resultado.examinaGlicose());
    }

    @Test
    public void testeColesterolGlicoseDiabetes(){
        Resultados resultado = new Resultados(500f, 240f, 60f, 190f, 40f, 125f);
        assertEquals("Diabetes", resultado.examinaGlicose());
    }

}