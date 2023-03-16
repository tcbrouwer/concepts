package programs.physicals

import Concept
import Program
import concepts.Input
import concepts.Output
import concepts.Success

// program printer
class ConceptPrinter : Program {
    override fun main( input: Input ) : Output {
        input.essence.forEach {
            print("[${it.name}]")

        }
        val output = Output()
        output.essence.add( Success() )
        return output
    }

    override fun usage(): String = "ConceptPrinter [INPUT SIGNAL]"

    override val name: String = "programs.physicals.NamePrinter"
    override val description: String = "A program that prints the name of a concept"
    override val refs: MutableSet<Concept> = mutableSetOf()}