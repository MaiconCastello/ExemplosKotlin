import TesteUnitárioCalculadora.Calculadora
import TesteUnitárioCalculadora.Calculadora1
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CalculadoraTest{

    @Test
    fun subtracaoTest(){
        assertEquals(3.0,Calculadora1.subtracao(6.0,3.0))
    }

    @Test
    fun somaTest(){

        assertEquals(10.0,Calculadora1.soma(2.0,8.0))
    }

    @Test
    fun multiplicacaoTest(){
        assertEquals(10.0,Calculadora1.multiplicacao(2.0,5.0))
    }

    @Test
    fun divisaoTest(){
        assertEquals(2.0, Calculadora1.divisao(10.0,5.0))
    }

    @Test
    fun potenciaTest(){
        assertEquals(32.0, Calculadora1.potencia(2.0,5.0))
    }

    @Test
    fun raizTest() {
        assertEquals(3.0, Calculadora1.raiz(9.0))
    }
}
