package programs.physicals

import Concept
import Program
import concepts.Input
import concepts.Output
import concepts.Success

// program printer
class NamePrinter : Program {
    override fun main( input: Input ) : Output {
        input.essence.forEach { println(it.name) }
        val output = Output()
        output.essence.add( Success() )
        return output
    }

    override fun usage(): String = "NamePrinter [INPUT SIGNAL]"

    override var name: String = "programs.physicals.NamePrinter"
    override var description: String = "A program that prints the name of a concept"
    override var refs: Set<Concept> = setOf()
}