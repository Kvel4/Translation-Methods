@file:Suppress(
    "MemberVisibilityCanBePrivate",
    "RedundantVisibilityModifier",
    "UNUSED_VARIABLE",
    "LocalVariableName"
)

package calc

import kotlin.Double
import kotlin.String
import kotlin.Suppress
import runtime.UnexpectedTokenException

public class CalcParser(public val lexer: CalcLexer) {
    public fun parse(): Double = expr()

    public fun processToken(token: CalcToken): String {
        if (lexer.token != token) throw UnexpectedTokenException(lexer.pos, lexer.token, token)
        val res = lexer.tokenValue
        lexer.nextToken()
        return res
    }

    private fun expr(): Double =
        when (lexer.token) {
            CalcToken.LPAREN, CalcToken.NUMBER -> {
                val term = term()
                val exprPrime = exprPrime(term)
                exprPrime
            }
            else -> {
                throw UnexpectedTokenException(
                    lexer.pos,
                    lexer.token,
                    CalcToken.LPAREN,
                    CalcToken.NUMBER
                )
            }
        }

    private fun exprPrime(t: Double): Double =
        when (lexer.token) {
            CalcToken.PLUS -> {
                val PLUS = processToken(CalcToken.PLUS)
                val term = term()
                val res = t + term
                val exprPrime = exprPrime(res)
                exprPrime
            }
            CalcToken.MINUS -> {
                val MINUS = processToken(CalcToken.MINUS)
                val term = term()
                val res = t - term
                val exprPrime = exprPrime(res)
                exprPrime
            }
            CalcToken.EOF, CalcToken.RPAREN -> {
                t
            }
            else -> {
                throw UnexpectedTokenException(
                    lexer.pos,
                    lexer.token,
                    CalcToken.PLUS,
                    CalcToken.MINUS,
                    CalcToken.EOF,
                    CalcToken.RPAREN
                )
            }
        }

    private fun term(): Double =
        when (lexer.token) {
            CalcToken.LPAREN, CalcToken.NUMBER -> {
                val unary = unary()
                val termPrime = termPrime(unary)
                termPrime
            }
            else -> {
                throw UnexpectedTokenException(
                    lexer.pos,
                    lexer.token,
                    CalcToken.LPAREN,
                    CalcToken.NUMBER
                )
            }
        }

    private fun termPrime(f: Double): Double =
        when (lexer.token) {
            CalcToken.MUL -> {
                val MUL = processToken(CalcToken.MUL)
                val unary = unary()
                val res = f * unary
                val termPrime = termPrime(res)
                termPrime
            }
            CalcToken.DIV -> {
                val DIV = processToken(CalcToken.DIV)
                val unary = unary()
                val res = f / unary
                val termPrime = termPrime(res)
                termPrime
            }
            CalcToken.PLUS, CalcToken.MINUS, CalcToken.EOF, CalcToken.RPAREN -> {
                f
            }
            else -> {
                throw UnexpectedTokenException(
                    lexer.pos,
                    lexer.token,
                    CalcToken.MUL,
                    CalcToken.DIV,
                    CalcToken.PLUS,
                    CalcToken.MINUS,
                    CalcToken.EOF,
                    CalcToken.RPAREN
                )
            }
        }

    private fun unary(): Double =
        when (lexer.token) {
            CalcToken.LPAREN, CalcToken.NUMBER -> {
                val fact = fact()
                val postUnary = postUnary(fact)
                postUnary
            }
            else -> {
                throw UnexpectedTokenException(
                    lexer.pos,
                    lexer.token,
                    CalcToken.LPAREN,
                    CalcToken.NUMBER
                )
            }
        }

    private fun fact(): Double =
        when (lexer.token) {
            CalcToken.LPAREN -> {
                val LPAREN = processToken(CalcToken.LPAREN)
                val expr = expr()
                val RPAREN = processToken(CalcToken.RPAREN)
                expr
            }
            CalcToken.NUMBER -> {
                val NUMBER = processToken(CalcToken.NUMBER)
                NUMBER.toDouble()
            }
            else -> {
                throw UnexpectedTokenException(
                    lexer.pos,
                    lexer.token,
                    CalcToken.LPAREN,
                    CalcToken.NUMBER
                )
            }
        }

    private fun postUnary(num: Double): Double =
        when (lexer.token) {
            CalcToken.FACTORIAL -> {
                val FACTORIAL = processToken(CalcToken.FACTORIAL)
                val res = runtime.factorial(num).toDouble()
                val postUnary = postUnary(res)
                postUnary
            }
            CalcToken.MUL,
            CalcToken.DIV,
            CalcToken.PLUS,
            CalcToken.MINUS,
            CalcToken.EOF,
            CalcToken.RPAREN -> {
                num
            }
            else -> {
                throw UnexpectedTokenException(
                    lexer.pos,
                    lexer.token,
                    CalcToken.FACTORIAL,
                    CalcToken.MUL,
                    CalcToken.DIV,
                    CalcToken.PLUS,
                    CalcToken.MINUS,
                    CalcToken.EOF,
                    CalcToken.RPAREN
                )
            }
        }
}
