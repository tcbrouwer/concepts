package programs

import Concept
import Program
import concepts.Input
import concepts.Output

class RefLister : Program {
    override fun main( input: Input ): Output {
        val output = Output()
        input.essence.forEach { concept -> concept.refs.forEach { output.essence.add( it ) } }
        return output
    }

    override fun usage(): String = "RefLister [INPUT SIGNAL]"

    private fun listRefs(concept: Concept): List<Concept> {
        return concept.refs.toList()
    }

    override val name: String = "programs.RefLister"
    override val description: String = "A program that lists the refs of a concept"
    override val refs: MutableSet<Concept> = mutableSetOf()
}