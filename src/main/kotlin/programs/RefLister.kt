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

    override fun iterateToConcept(concept: Concept): Concept {
        // return lambda function

        return concept
    }

    override fun iterateToConcept(concepts: List<Concept>): Concept {
        return Concept.actualize("programs.RefLister", "programs.RefLister generated concept", concepts.map { it.name })
    }

    override var name: String = "programs.RefLister"
    override var description: String = "A program that lists the refs of a concept"
    override var examples: List<String> = listOf("RefLister programs.HelloWorld")
    override var refs: Set<Concept> = setOf()

}