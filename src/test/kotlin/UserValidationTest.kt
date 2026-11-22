package org.example
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class UserValidationTest {
    private fun isValidAge(age: Int): Boolean {
        return age >= 18
    }
    @ParameterizedTest(name = "Возраст {0}  валиден: {1}")
    @CsvSource(
        "17, false",
        "18, true",
        "19, true",
        "0, false")
    fun testAgeValid(age: Int, expected: Boolean) {
        assertEquals(expected, isValidAge(age), "wrong validation for  $age")
    }

}