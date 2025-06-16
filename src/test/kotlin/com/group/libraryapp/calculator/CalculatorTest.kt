package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
}

class CalculatorTest {

    fun addTest() {
        // given / 준비
        val calculator = Calculator(5)

        // when / 호출
        calculator.add(3)

        // then / 호출 후 결과 (검증)
        if (calculator.number != 8) {
            throw IllegalArgumentException()
        }
    }

    fun minusTest() {
        // given / 준비
        val calculator = Calculator(5)

        // when / 호출
        calculator.minus(3)

        // then / 호출 후 결과 (검증)
        if (calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

    fun multiplyTest() {
        // given / 준비
        val calculator = Calculator(5)

        // when / 호출
        calculator.multiply(3)

        // then / 호출 후 결과 (검증)
        if (calculator.number != 15) {
            throw IllegalArgumentException()
        }
    }

    fun divideTest() {

        // given
        val calculator = Calculator(6)

        // when
        calculator.divide(3)

        // then
        if (calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

}