package runtime

import java.text.ParseException

class IllegalTokenException(message: String, position: Int) : ParseException(message, position)

class AmbiguousTokenException(message: String, position: Int) : ParseException(message, position)

class UnexpectedTokenException(position: Int, got: Enum<*>, vararg expected: Enum<*>) :
    ParseException(message(got, expected.toList()), position) {
    companion object {
        fun message(got: Enum<*>, expected: List<Enum<*>>) = buildString {
            append(
                "Expected tokens: ${expected.map { it.name }.joinToString(",")} but got ${got.name}"
            )
        }
    }
}
