package programs

import Concept
import Program
import concepts.Input
import concepts.Output
import concepts.Success
import ideas.Not
import java.util.*

// program printer
class ProgramPrinter : Program {
    override fun main( input: Input ) : Output {
        input.essence.forEach { it.print() }
        val output = Output()
        output.essence.add( Success() )
        return output
    }

    override fun iterateToConcept(concept: Concept): Concept {
        // what is a module
        // a module is a concept that has a main function
        // not sure how to iterate to a module
        TODO("Not yet implemented")
    }

    override fun iterateToConcept( concepts: List<Concept> ): Concept {
        TODO("Not yet implemented")
    }

    override var name: String = "programs.ProgramPrinter"
    override var description: String = "A program that prints a program"
    override var examples: List<String> = listOf("ProgramPrinter programs.HelloWorld")
    override var refs: Set<Concept> = setOf()
}