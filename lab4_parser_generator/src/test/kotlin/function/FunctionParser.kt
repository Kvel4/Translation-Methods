@file:Suppress(
  "MemberVisibilityCanBePrivate",
  "RedundantVisibilityModifier",
  "UNUSED_VARIABLE",
  "LocalVariableName"
)

package function

import kotlin.String
import kotlin.Suppress
import runtime.Tree
import runtime.UnexpectedTokenException

public class FunctionParser(
  public val lexer: FunctionLexer
) {
  public fun parse(): Tree = expression()

  public fun processToken(token: FunctionToken): String {
    if (lexer.token != token) throw UnexpectedTokenException(lexer.pos, lexer.token, token)
    val res = lexer.tokenValue
    lexer.nextToken()
    return res
  }

  private fun expression(): Tree = when (lexer.token) {
    FunctionToken.TYPE,FunctionToken.VOID -> {
      val functionType = functionType()
      val NAME = processToken(FunctionToken.NAME)
      val LPAREN = processToken(FunctionToken.LPAREN)
      val arguments = arguments()
      val RPAREN = processToken(FunctionToken.RPAREN)
      val SEMICOLON = processToken(FunctionToken.SEMICOLON)
       Tree("E", functionType, Tree("NAME"), Tree("LPAREN"), arguments, Tree("RPAREN"))
    }
    else -> {
      throw UnexpectedTokenException(lexer.pos, lexer.token, FunctionToken.TYPE,FunctionToken.VOID)
    }
  }

  private fun functionType(): Tree = when (lexer.token) {
    FunctionToken.TYPE -> {
      val TYPE = processToken(FunctionToken.TYPE)
       Tree("FT", Tree("TYPE")) 
    }
    FunctionToken.VOID -> {
      val VOID = processToken(FunctionToken.VOID)
       Tree("FT", Tree("VOID")) 
    }
    else -> {
      throw UnexpectedTokenException(lexer.pos, lexer.token, FunctionToken.TYPE,FunctionToken.VOID)
    }
  }

  private fun arguments(): Tree = when (lexer.token) {
    FunctionToken.TYPE -> {
      val argumentsPrime = argumentsPrime()
       Tree ("AS", argumentsPrime) 
    }
    FunctionToken.RPAREN -> {
       Tree("EPS") 
    }
    else -> {
      throw UnexpectedTokenException(lexer.pos, lexer.token,
          FunctionToken.TYPE,FunctionToken.RPAREN)
    }
  }

  private fun argumentsPrime(): Tree = when (lexer.token) {
    FunctionToken.TYPE -> {
      val argument = argument()
      val argumentsPrimePrime = argumentsPrimePrime()
       Tree("AS'", argument, argumentsPrimePrime) 
    }
    else -> {
      throw UnexpectedTokenException(lexer.pos, lexer.token, FunctionToken.TYPE)
    }
  }

  private fun argumentsPrimePrime(): Tree = when (lexer.token) {
    FunctionToken.COMMA -> {
      val COMMA = processToken(FunctionToken.COMMA)
      val argumentsPrime = argumentsPrime()
       Tree ("AS''", Tree("COMMA"), argumentsPrime) 
    }
    FunctionToken.RPAREN -> {
       Tree("EPS") 
    }
    else -> {
      throw UnexpectedTokenException(lexer.pos, lexer.token,
          FunctionToken.COMMA,FunctionToken.RPAREN)
    }
  }

  private fun argument(): Tree = when (lexer.token) {
    FunctionToken.TYPE -> {
      val TYPE = processToken(FunctionToken.TYPE)
      val argumentName = argumentName()
       Tree ("A", Tree("TYPE"), argumentName) 
    }
    else -> {
      throw UnexpectedTokenException(lexer.pos, lexer.token, FunctionToken.TYPE)
    }
  }

  private fun argumentName(): Tree = when (lexer.token) {
    FunctionToken.POINTER -> {
      val POINTER = processToken(FunctionToken.POINTER)
      val argumentName = argumentName()
       Tree ("AN", Tree("POINTER"), argumentName) 
    }
    FunctionToken.NAME -> {
      val NAME = processToken(FunctionToken.NAME)
       Tree ("AN", Tree("NAME")) 
    }
    FunctionToken.COMMA,FunctionToken.RPAREN -> {
       Tree("EPS") 
    }
    else -> {
      throw UnexpectedTokenException(lexer.pos, lexer.token,
          FunctionToken.POINTER,FunctionToken.NAME,FunctionToken.COMMA,FunctionToken.RPAREN)
    }
  }
}
