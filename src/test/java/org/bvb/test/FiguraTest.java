package org.bvb.test;

import figuras.Circulo;
import figuras.Rectangulo;
import figuras.Triangulo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiguraTest {
    @Test
    public void validarCalcularAreaCirculo() {
        Circulo circulo = new Circulo(5);

        double resultadoEsperado = Math.PI * 5 * 5;
        Assert.assertEquals(circulo.calcularArea(), resultadoEsperado);
    }
    @Test
    public void validarCalcularAreaRectangulo() {
        Rectangulo rectangulo = new Rectangulo(90, 30);
        double resultadoEsperado = rectangulo.calcularArea();
        Assert.assertEquals(rectangulo.calcularArea(), resultadoEsperado);
    }

    @Test
    public void validarCalcularAreaTriangulo() {
        Triangulo triangulo = new Triangulo(90, 30);
        double resultadoEsperado = triangulo.calcularArea();
        Assert.assertEquals(triangulo.calcularArea(), resultadoEsperado);
    }
}