package com.group.libraryapp.calculator

// public
// data class 이용
// custom getter 사용 등이 존재
class Calculator(
    var number: Int
) {

    fun add(operand: Int) {
        this.number += operand
    }

    fun minus(operand: Int) {
        this.number -= operand
    }

    fun multiply(operand: Int) {
        this.number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("0으로 나눌 수 없습니다.")
        }

        this.number /= operand
    }

}