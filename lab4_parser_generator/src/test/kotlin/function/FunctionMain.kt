package function

fun main() {
    println(
        FunctionParser(
                FunctionLexer(
                    "   int     name    (    int   *   a    ,    double    ** b   ,   int* * *     c     )   ;"
                )
            )
            .parse()
    )
}
