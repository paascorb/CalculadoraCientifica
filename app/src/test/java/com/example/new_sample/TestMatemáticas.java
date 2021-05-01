package com.example.new_sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMatemáticas {

    @Test
    public void cuadrado_01() {
        assertEquals(4, UtilesMatemáticas.cuadrado(2),0.0000001);
    }

    @Test
    public void DosElevadoX_01() {
        assertEquals(64, UtilesMatemáticas.DosAlaX(6),0.0000001);  }

    @Test
    public void cubo_01() {
        assertEquals(8, UtilesMatemáticas.cubo(2),0.0000001);  }

    @Test
    public void eElevadoX_01() {
        assertEquals(7.389056098930650227230427460575, UtilesMatemáticas.eElevadoX(2),0.0000001);  }

    @Test
    public void XelevadoY_01() {
        assertEquals(125, UtilesMatemáticas.XelevadoY(5,3),0.0000001);  }

    @Test
    public void DiezElevadoX_01() {
        assertEquals(1000, UtilesMatemáticas.diezElevadoX(3),0.0000001);  }

    @Test
    public void RaizCuadrada_01() {
        assertEquals(5, UtilesMatemáticas.raízCuadrada(25),0.0000001);  }

    @Test
    public void RaizCubica_01() {
        assertEquals(3, UtilesMatemáticas.raízCubica(27),0.0000001);  }

    @Test
    public void raizYdeX_01() {
        assertEquals(3, UtilesMatemáticas.raizYdeX(27,3),0.0000001);  }

    @Test
    public void log10deX_01() {
        assertEquals(4, UtilesMatemáticas.log10deX(10000),0.0000001);  }

    @Test
    public void Seno_01() {
        assertEquals(1, UtilesMatemáticas.seno(90),0.0000001);  }

    @Test
    public void ASeno_01() {
        assertEquals(0.9033391107665127, UtilesMatemáticas.ArcSeno(45),0.0000001);  }

    @Test
    public void Coseno_01() {
        assertEquals(0, UtilesMatemáticas.coseno(90),0.0000001);  }

    @Test
    public void ACoseno_01() {
        assertEquals(0.6674572160283838, UtilesMatemáticas.ArcCoseno(45),0.0000001);  }

    @Test
    public void Tangente_01() {
        assertEquals(1, UtilesMatemáticas.tangente(45),0.0000001);  }

    @Test
    public void ATangente_01() {
        assertEquals(0.6657737500283538, UtilesMatemáticas.ArcTangente(45),0.0000001);  }

    @Test
    public void ln_01() {
        assertEquals(1, UtilesMatemáticas.lnDeX(UtilesMatemáticas.e()),0.0000001);  }

    @Test
    public void factorial_01() {
        assertEquals(120, UtilesMatemáticas.factorial(5),0.0000001);  }

    @Test
    public void Evaluar_01() {
        assertEquals(24, UtilesMatemáticas.parentesis("(5+7)*2"),0.0000001);  }

    @Test
    public void Evaluar_02() {
        assertEquals(48, UtilesMatemáticas.parentesis("2*(5+7)*2"),0.0000001);  }

    @Test
    public void Evaluar_03() {
        assertEquals(24, UtilesMatemáticas.parentesis("2*(5+7)"),0.0000001);  }



}