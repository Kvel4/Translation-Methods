package runtime

fun factorial(number: Number): Long {
    var res = 1L

    for (i in 1 .. number.toLong()) {
        res *= i
    }

    return res
}