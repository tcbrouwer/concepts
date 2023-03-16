package programs

import Concept
import Program
import concepts.Input
import concepts.Output
import programs.physicals.ConceptPrinter
import programs.physicals.UserInput

class Query : Program {

    override fun main(input: Input): Output {
        ConceptPrinter().main( Input().put( input.essence.pop() ))
        val output = UserInput().main( Input() )
        return output
    }

    override fun usage() = "Query [INPUT SIGNAL]"

    override val name: String = "programs.Query"
    override val description: String = "A program that queries the user"
    override val refs: MutableSet<Concept> = mutableSetOf()
}