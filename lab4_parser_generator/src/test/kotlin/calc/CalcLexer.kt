@file:Suppress("RedundantVisibilityModifier")

package calc

import kotlin.String
import kotlin.Suppress
import kotlin.collections.Map
import kotlin.text.Regex
import runtime.BaseLexer

public val skipTokens: Map<String, Regex> = mutableMapOf(
    "WS" to Regex("""[ \t\n\r]"""),
    )

public val termTokens: Map<String, Regex> = mutableMapOf(
    "DIV" to Regex("""\Q/\E"""),
    "NUMBER" to Regex("""[0-9]+"""),
    "MUL" to Regex("""\Q*\E"""),
    "LPAREN" to Regex("""\Q(\E"""),
    "RPAREN" to Regex("""\Q)\E"""),
    "PLUS" to Regex("""\Q+\E"""),
    "MINUS" to Regex("""\Q-\E"""),
    "FACTORIAL" to Regex("""\Q!\E"""),
    )

public enum class CalcToken {
  DIV,
  NUMBER,
  MUL,
  LPAREN,
  RPAREN,
  PLUS,
  MINUS,
  FACTORIAL,
  EOF,
}

public class CalcLexer(
  input: String
) : BaseLexer<CalcToken>(CalcToken::class.java, skipTokens, termTokens, input)
