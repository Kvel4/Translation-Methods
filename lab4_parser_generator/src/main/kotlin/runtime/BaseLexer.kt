package runtime

abstract class BaseLexer<T : Enum<T>>(
    private val tokenClass: Class<T>,
    private val skipTokens: Map<String, Regex>,
    termTokens: Map<String, Regex>,
    private val input: String
) {
    private val termTokens: Map<T, Regex>
    private var position = 0

    lateinit var tokenValue: String
    lateinit var token: T
    var pos = 1
        get() = position - tokenValue.length + 1
        private set

    init {
        this.termTokens = termTokens.mapKeys { java.lang.Enum.valueOf(tokenClass, it.key) }
        nextToken()
    }

    @OptIn(ExperimentalStdlibApi::class)
    fun nextToken(): T {
        if (position >= input.length) {
            token = java.lang.Enum.valueOf(tokenClass, "EOF")
            tokenValue = ""

            return token
        }

        do {
            var skipped = false

            for ((_, value) in skipTokens) {
                val result = value.matchAt(input, position)

                if (result != null) {
                    position = result.range.last + 1
                    skipped = true
                }
            }
        } while (skipped)

        var matched: Pair<T, MatchResult>? = null

        for ((key, value) in termTokens) {
            val result = value.matchAt(input, position)

            if (result != null) {
                if (matched != null) {
                    throw AmbiguousTokenException(
                        "String started at ${position + 1} matched ambiguous tokens: ${matched.first}, $key",
                        position + 1
                    )
                }

                matched = Pair(key, result)
            }
        }

        if (matched == null) {
            throw IllegalTokenException(
                "Can't tokenize substring starting at position ${position + 1}",
                position + 1
            )
        }

        position = matched.second.range.last + 1
        tokenValue = matched.second.value
        token = matched.first

        return token
    }
}
