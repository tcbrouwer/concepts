package programs

import Concept
import Program
import concepts.Input
import concepts.Output
import ideas.Not

class Pipe : Program {
    override fun main( input: Input ) : Output {
        val output = Output()
        var argument = Input().put( input.essence.pop() )
        var result = Output()
        input.essence.forEach {
            if( isProgram(it) ) {
                println("-- running ${it.name} --")
                result = (it as Program).main( argument )
                println("-- done, result size ${result.essence.size} --")
                argument = Input()
                result.essence.forEach { argument.put( it ) }
            } else {
                output.put( Not() )
                return output
            }
        }
        return result
    }

    override fun usage(): String = "Pipe [INPUT SIGNAL]"

    fun isProgram( concept: Concept ) : Boolean {
        return concept is Program
    }

    override val name: String = "programs.Pipe"
    override val description: String = "A program that pipes the first symbol"
    override val refs: MutableSet<Concept> = mutableSetOf()

}