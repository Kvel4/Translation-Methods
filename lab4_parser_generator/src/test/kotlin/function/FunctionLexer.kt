@file:Suppress("RedundantVisibilityModifier")

package function

import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map
import kotlin.text.Regex
import runtime.BaseLexer

public val skipTokens: Map<String, Regex> = mutableMapOf(
    "WS" to Regex("""[ \t\n\r]"""),
    )

public val termTokens: Map<String, Regex> = mutableMapOf(
    "COMMA" to Regex("""\Q,\E"""),
    "SEMICOLON" to Regex("""\Q;\E"""),
    "POINTER" to Regex("""\Q*\E"""),
    "LPAREN" to Regex("""\Q(\E"""),
    "RPAREN" to Regex("""\Q)\E"""),
    "VOID" to Regex("""\Qvoid\E"""),
    "TYPE" to Regex("""int|double"""),
    "NAME" to Regex("""(?!(int|double|void))[a-z][a-zA-Z0-9]*"""),
    )

public enum class FunctionToken {
  COMMA,
  SEMICOLON,
  POINTER,
  LPAREN,
  RPAREN,
  VOID,
  TYPE,
  NAME,
  EOF,
}

public class FunctionLexer(
  input: String
) : BaseLexer<FunctionToken>(FunctionToken::class.java, skipTokens, termTokens, input)
