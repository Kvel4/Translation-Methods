import java.util.*

fun main() {
    val visualizer = Visualizer("src/main/resources/images")
    val scanner = Scanner(System.`in`)
    val parser = Parser()
    val tree = parser.parse(scanner.nextLine().byteInputStream())

    visualizer.visualize(tree, "userInput")
}
