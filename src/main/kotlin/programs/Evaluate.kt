package programs

import Concept
import Program
import concepts.Input
import concepts.Output
import concepts.Success

class Evaluate : Program {
    override fun main( input: Input ) : Output {
        val output = Output()
        input.essence.forEach {
            if( it is Program ) {
                output.put( it.main( input ) )
                output.put( Success() )
            } else {
                output.put( it )
            }
        }
        return output
    }

    override fun usage(): String = "Evaluate [INPUT SIGNAL]"

    override var name: String = "programs.Evaluate"
    override var description: String = "A program that evaluates all programs on input"
    override var refs: Set<Concept> = setOf()

}