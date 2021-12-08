package calc

fun main() {
    println(CalcParser(CalcLexer("1 + 2 + (3)!")).parse())
}
