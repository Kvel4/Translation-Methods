import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.mutNode
import guru.nidi.graphviz.model.MutableNode
import java.io.File


class Visualizer(private val path: String) {

    fun visualize(tree: Tree, fileName: String) {
        val graph = mutGraph("Parsing visualise").add(transformToGraph(tree, 0))

        Graphviz.fromGraph(graph).render(Format.PNG).toFile(File(path, fileName))
    }

    private fun transformToGraph(tree: Tree, depth: Int): MutableNode {
        val node = mutNode( "${depth}_${tree.node}")
//        val node = mutNode("$depth [label=${tree.node}]")

        for (child in tree.children) {
            node.addLink(transformToGraph(child, depth + 1))
        }

        return node
    }
}