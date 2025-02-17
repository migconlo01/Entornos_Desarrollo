/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.entornos.Entornos_practica;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Miguel Ángel Conde
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    @BeforeAll
    static void setup() {
        System.out.println("Iniciando pruebas de la calculadora...");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Pruebas finalizadas con éxito");
    }

    @Test
    void sumaNumeros() {
        assertEquals(21, Entornos_practica.suma(14, 7), "14 + 7 debe ser 21");
    }

    @Test
    void restaDosNumeros() {
        assertEquals(7, Entornos_practica.resta(14, 7), "14 - 7 debe ser 7");
    }

    @Test
    void multiplicaNumeros() {
        assertEquals(98, Entornos_practica.multiplica(14, 7), "14 * 7 debe ser 98");
    }

    @Test
    void divideNumeros() {
        assertEquals(2, Entornos_practica.divide(14, 7), "14 / 7 debe ser 2");
    }

    @Test
    void divisionCeroExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Entornos_practica.divide(14, 0);
        });
        assertTrue(exception.getMessage().contains("No se puede dividir por cero"), "Debe lanzar la excepcion al dividir por 0");
    }

    @Test
    void potenciaBaseExponente() {
        assertEquals(81, Entornos_practica.potencia(9, 2), "9 ^ 2 debe ser 81");
    }

    @Test
    void raizCuadradaNumeroPositivo() {
        assertEquals(9, Entornos_practica.raizCuadrada(81), "La raiz cuadrada de 81 debe ser 9");
    }

    @Test
    void raizCuadradaNumeroNegativoExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Entornos_practica.raizCuadrada(-4);
        });
        assertTrue(exception.getMessage().contains("No se puede calcular la raiz cuadrada de un numero negativo"), 
                   "Debe lanzar la excepcion con un numero negativo");
    }

    @Test
    void logaritmoNaturalNumeroPositivo() {
        assertEquals(Math.log(10), Entornos_practica.logaritmoNatural(10), "El ln de 10 debe ser igual a Math.log(10)");
    }

    @Test
    void logaritmoNaturalCeroNegativoExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Entornos_practica.logaritmoNatural(0);
            Entornos_practica.logaritmoNatural(-1);
        });
        assertTrue(exception.getMessage().contains("El logaritmo natural solo esta definido para numeros positivos"), 
                   "Debe lanzar la excepcion con 0 o numero negativo");
    }
}

