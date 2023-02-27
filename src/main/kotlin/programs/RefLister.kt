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

    private fun listRefs(concept: Concept): List<Concept> {
        return concept.refs.toList()
    }

    override var name: String = "programs.RefLister"
    override var description: String = "A program that lists the refs of a concept"
    override var refs: Set<Concept> = setOf()

}