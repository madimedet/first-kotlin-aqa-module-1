package org.example
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class  CalculatorTest{

    private fun subtract(a: Int, b: Int): Int{
        return a - b
    }
    @Test
    fun test001_shouldReturnDifferenceOfTwoPositiveNumbers(){
        // Arrange
        val a = 5
        val b = 2
        val expected = 3
        //act
        val actual = subtract(a,b)
        //assert
        Assertions.assertEquals(expected,actual,"5-2 должно быть 3")

    }
    @Test
    fun test002_shouldReturnNegativeResultWhenSubtrahendIsLarger(){
        // Arrange
        val a = 2
        val b = 5
        val expected = -3
        //act
        val actual = subtract(a,b)
        //assert
        Assertions.assertEquals(expected,actual,"2-5 должно быть -3")
    }
    @Test
    fun test003_shouldReturnSameNumberWhenSubtractingZero(){
        // Arrange
        val a = 7
        val b = 0
        val expected = 7
        //act
        val actual = subtract(a,b)
        //assert
        Assertions.assertEquals(expected,actual,"7 - 0 должно быть 7")
    }
}
