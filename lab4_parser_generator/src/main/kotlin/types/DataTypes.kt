package types

data class Rule(
    val name: String,
    val arguments: List<Argument>,
    val returnType: String?,
    val productions: List<Production> = ArrayList(),
)

data class Production(
    val productions: List<Element>,
    val extendedProduction: List<ExtendedElement>,
    val returnExpression: String?
) : List<Element> by productions

sealed class Element(val name: String)
class Term(name: String) : Element(name)
class NonTerm(name: String, val callAttributes: List<String>) : Element(name)

sealed class ExtendedElement
class ProductionElement(val element: Element) : ExtendedElement()
class Code(val code: String) : ExtendedElement()

data class Argument(val name: String, val type: String)