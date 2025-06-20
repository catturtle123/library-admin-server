package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
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
        val calculator = Calculator(5)

        // when
        calculator.divide(2)

        // then
        if (calculator.number != 2) {
            throw IllegalArgumentException()
        }
    }

    fun divideExceptionTest() {
        //given
        val calculator = Calculator(5)

        // when
        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {
            if (e.message != "0으로 나눌 수 없습니다.") {
                throw IllegalStateException("메시지가 다릅니다.")
            }
            // 테스트 성공
            return
        } catch (e: Exception) {
            throw IllegalStateException()
        }
        throw IllegalStateException("기대하는 예외가 발생하지 않았습니다.")
    }

}