package programs

import Concept
import Program
import concepts.Input
import concepts.Output
import programs.physicals.NamePrinter
import programs.physicals.UserInput

class Query : Program {

    override fun main(input: Input): Output {
        NamePrinter().main( Input().put( input.essence.pop() ))
        val output = UserInput().main( Input() )
        return output
    }

    override fun usage() = "Query [INPUT SIGNAL]"

    override var name: String = "programs.Query"
    override var description: String = "A program that queries the user"
    override var refs: Set<Concept> = setOf()
}