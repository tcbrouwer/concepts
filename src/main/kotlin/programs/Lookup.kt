package programs

import Concept
import Program
import concepts.Input
import concepts.Output
import ideas.Good
import ideas.Not

class Lookup : Program {
    override fun main( input: Input ) : Output {
        val output = Output()
        output.essence.add( input )
        output.essence.add(Not())
        output.essence.add(Good())

        // success
        return output
    }

    override var name: String = "programs.Lookup"
    override var description: String = "A program that looks up a concept"
    override var refs: Set<Concept> = setOf()
}