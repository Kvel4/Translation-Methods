package visualizer

import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.model.Factory.mutGraph
import guru.nidi.graphviz.model.Factory.mutNode
import guru.nidi.graphviz.model.MutableNode
import runtime.Tree
import java.io.File


class Visualizer(private val path: String) {
    private val counter = mutableMapOf<String, Int>()

    fun visualize(tree: Tree, fileName: String) {
        val graph = mutGraph("Parsing visualise").add(transformToGraph(tree))

        Graphviz.fromGraph(graph).render(Format.PNG).toFile(File(path, fileName))
    }

    private fun transformToGraph(tree: Tree): MutableNode {
        counter.putIfAbsent(tree.node, 0)
        counter.computeIfPresent(tree.node) { _, value -> value + 1 }

        val node = mutNode( "${tree.node}${counter.getValue(tree.node)}")

        for (child in tree.children) {
            node.addLink(transformToGraph(child))
        }

        return node
    }
}