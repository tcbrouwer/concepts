package programs

import Concept
import Program
import concepts.Input
import concepts.Output

class HelloWorld : Program {
    fun hello() = "Hello, World!"
    override fun main( input: Input): Output {
        val output = Output()
        output.essence.add(Concept.actualize("programs.HelloWorld", "programs.HelloWorld generated concept. ${hello()}", listOf()))
        return output
    }

    override fun iterateToConcept(concept: Concept): Concept {
        // hmmm, how do I iterate to a concept?
        concept.print()

        TODO("Not yet implemented")
    }

    override fun iterateToConcept(concepts: List<Concept>): Concept {
        TODO("Not yet implemented")
    }

    override var name: String = "programs.HelloWorld"
    override var description: String = "A program that prints 'Hello, World!'"
    override var examples: List<String> = listOf("Hello, World!")
    override var refs: Set<Concept> = setOf()

}