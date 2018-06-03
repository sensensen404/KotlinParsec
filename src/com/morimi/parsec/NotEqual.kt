package com.morimi.parsec

class NotEqual(private val text: String): Parser {

    override fun parse(target: String): Result {
        if(text != target) {
            return Result.success(text, "")
        }
        return Result.fail()
    }
}