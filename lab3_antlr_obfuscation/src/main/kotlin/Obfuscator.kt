import java.lang.Integer.max
import kotlin.random.Random

class Obfuscator(variablesNumber: Int) {
    companion object {
        private val alphabet = listOf("1", "0", "I", "O")
        private val startAlphabet = alphabet.subList(2, 4)
        private const val MIN_NAME_LENGTH = 6
        private const val MIN_STATEMENT_LENGTH = 5
        private const val MAX_STATEMENT_LENGTH = 10
    }

    private val variableTypes = hashMapOf<String, MutableList<String>>(
        Pair("int", mutableListOf()),
        Pair("float", mutableListOf()),
        Pair("double", mutableListOf()),
        Pair("long", mutableListOf()),
        Pair("char", mutableListOf()),
        Pair("boolean", mutableListOf()),
        Pair("class", mutableListOf()),
    )
    private val possibleStatements = listOf(
        { generateNumberExpression("int") { "${Random.nextInt()}" } },
        { generateNumberExpression("long") { "${Random.nextLong()}L" } },
        { generateNumberExpression("char") { "${Random.nextInt()}" } },
        { generateNumberExpression("float") { "${Random.nextFloat()}f" } },
        { generateNumberExpression("double") { "${Random.nextDouble()}d" } },
        { generateBooleanExpression { "${Random.nextBoolean()}" } }
    )
    private val variableNames = hashMapOf<String, String>()
    private val usedNames = hashSetOf<String>()
    private val length = max(MIN_NAME_LENGTH, variablesNumber)

    fun obfuscateVariable(variable: String): String {
        variableNames.putIfAbsent(variable, generateObfuscatedName())

        return variableNames[variable]!!
    }

    fun createUselessStatement(): String {
        return possibleStatements.random().invoke()
    }

    fun addType(type: String, variable: String) {
        val category = getTypeCategory(type)

        variableTypes.getValue(category).add(obfuscateVariable(variable))
    }

    private fun getTypeCategory(type: String) = when (type) {
        "int", "long", "char", "float", "double", "boolean" -> type
        else -> "class"
    }

    private fun generateObfuscatedName(): String {
        var generated = generateName()

        while (generated in usedNames) {
            generated = generateName()
        }

        usedNames += generated

        return generated
    }

    private fun generateName(): String {
        val even = listOf("0", "O")
        val odd = listOf("1", "I")

        val tail = mutableListOf(startAlphabet.random())
        for (i in 1 .. length) {
            if (tail[i-1] in odd) {
                tail.add(even.random())
            } else {
                tail.add(odd.random())
            }
        }

        return tail.joinToString("")
    }

    private fun generateNumberExpression(key: String, RandomTerminal: () -> String) =
        generateExpression(key, RandomTerminal, listOf("+", "-", "*", "/"))

    private fun generateBooleanExpression(RandomTerminal: () -> String) =
        generateExpression("boolean", RandomTerminal, listOf("||", "&&"))


    private fun generateExpression(key: String, RandomTerminal: () -> String, operations: List<String>): String {
        val variables = variableTypes.getValue(key)
        var s = "$key ${generateObfuscatedName()} ="

        for (i in 0..randomEven()) {
            s = if (i % 2 == 0) {
                val operators = if (variables.isEmpty()) {
                    RandomTerminal.invoke()
                } else {
                    listOf(variables.random(), RandomTerminal.invoke()).random()
                }

                "$s $operators"
            } else {
                "$s ${operations.random()}"
            }
        }

        return "$s;"
    }

    private fun randomEven(): Int {
        var number = Random.nextInt(MIN_STATEMENT_LENGTH, MAX_STATEMENT_LENGTH)

        while (number % 2 != 0) {
            number = Random.nextInt(MIN_STATEMENT_LENGTH, MAX_STATEMENT_LENGTH)
        }

        return number
    }


}