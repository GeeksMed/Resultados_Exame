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
        Resultados resultado = new Resultados(149, 1, 1, 1, 1, 1);
        assertEquals("N??vel desej??vel", resultado.examinaTriglicerides());
    }

    @Test
    public void testeTrigliceridesLimitrofe(){
        Resultados resultado = new Resultados(199, 1, 1, 1, 1, 1);
        assertEquals("N??vel limitrofe", resultado.examinaTriglicerides());
    }

    @Test
    public void testeTrigliceridesAlto(){
        Resultados resultado = new Resultados(499, 1, 1, 1, 1, 1);
        assertEquals("N??vel alto", resultado.examinaTriglicerides());
    }

    @Test
    public void testeTrigliceridesMuitoAlto(){
        Resultados resultado = new Resultados(500, 1, 1, 1, 1, 1);
        assertEquals("N??vel muito alto", resultado.examinaTriglicerides());
    }

    @Test
    public void testeColesterolTotalDesejavel(){
        Resultados resultado = new Resultados(500, 199, 1, 1, 1, 1);
        assertEquals("N??vel desej??vel", resultado.examinaColesterolTotal());
    }

    @Test
    public void testeColesterolTotalLimitrofe(){
        Resultados resultado = new Resultados(500, 239, 1, 1, 1, 1);
        assertEquals("N??vel limitrofe", resultado.examinaColesterolTotal());
    }

    @Test
    public void testeColesterolTotalElevado(){
        Resultados resultado = new Resultados(500, 240, 1, 1, 1, 1);
        assertEquals("N??vel elevado", resultado.examinaColesterolTotal());
    }

    @Test
    public void testeColesterolHDLBaixo(){
        Resultados resultado = new Resultados(500, 240, 39, 1, 1, 1);
        assertEquals("N??vel baixo", resultado.examinaColesterolHDL());
    }

    @Test
    public void testeColesterolHDLNormal(){
        Resultados resultado = new Resultados(500, 240, 60, 1, 1, 1);
        assertEquals("N??vel normal", resultado.examinaColesterolHDL());
    }

    @Test
    public void testeColesterolHDLDesejado(){
        Resultados resultado = new Resultados(500, 240, 61, 1, 1, 1);
        assertEquals("N??vel desejado", resultado.examinaColesterolHDL());
    }

    @Test
    public void testeColesterolLDLOtimo(){
        Resultados resultado = new Resultados(500, 199, 61, 99, 1, 1);
        assertEquals("N??vel otimo", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolLDLDesejavel(){
        Resultados resultado = new Resultados(500, 239, 61, 129, 1, 1);
        assertEquals("N??vel desej??vel", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolLDLLimitrofe(){
        Resultados resultado = new Resultados(500, 240, 61, 159, 1, 1);
        assertEquals("N??vel lim??trofe", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolLDLAlto(){
        Resultados resultado = new Resultados(500, 239, 61, 189, 1, 1);
        assertEquals("N??vel alto", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolLDLDesejado(){
        Resultados resultado = new Resultados(500, 240, 61, 190, 1, 1);
        assertEquals("N??vel muito alto", resultado.examinaColesterolLDL());
    }

    @Test
    public void testeColesterolVLDLDesejado(){
        Resultados resultado = new Resultados(500, 240, 61, 190, 29, 1);
        assertEquals("N??vel desej??vel", resultado.examinaColesterolVLDL());
    }

    @Test
    public void testeColesterolVLDLLim??trofe(){
        Resultados resultado = new Resultados(500, 240, 61, 190, 40, 1);
        assertEquals("N??vel lim??trofe", resultado.examinaColesterolVLDL());
    }

    @Test
    public void testeColesterolVLDLElevado(){
        Resultados resultado = new Resultados(500, 240, 61, 190, 41, 1);
        assertEquals("N??vel elevado", resultado.examinaColesterolVLDL());
    }

    @Test
    public void testeColesterolGlicoseHipoglicemia(){
        Resultados resultado = new Resultados(500, 240, 61, 190, 41, 59);
        assertEquals("Hipoglicemia", resultado.examinaGlicose());
    }

    @Test
    public void testeColesterolGlicoseDesejavel(){
        Resultados resultado = new Resultados(500, 240, 61, 190, 41, 99);
        assertEquals("Desej??vel", resultado.examinaGlicose());
    }

    @Test
    public void testeColesterolGlicoseGlicemia(){
        Resultados resultado = new Resultados(500, 240, 61, 190, 41, 125);
        assertEquals("Glicemia de jejum inapropriada", resultado.examinaGlicose());
    }

    @Test
    public void testeColesterolGlicoseDiabetes(){
        Resultados resultado = new Resultados(500, 240, 61, 190, 41, 126);
        assertEquals("Diabetes", resultado.examinaGlicose());
    }

}