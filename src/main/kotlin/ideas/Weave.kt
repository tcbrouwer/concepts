package ideas

import Concept
import Idea
import Program
import concepts.Input
import concepts.Noop
import concepts.Output

class Weave : Idea(), Program {
    override var name: String = "ideas.Weave"
    override var description: String = "A concept that is the output of a program"
    override var refs: Set<Concept> = setOf()
    override fun main(input: Input): Output {
        var weave = 1
        val output = Output()
        input.essence.forEach {
            if (it is Weave) {
                weave++
                output.essence.add( Noop() )
            } else {
                for (i in 1..weave) {
                    output.essence.add(it)
                }
            }
        }
        return output
    }

    override fun usage(): String = "Weave [INPUT SIGNAL]"

    override fun synthetize(other: Concept): Concept {
        return this // synthesizing with weave is the same as weave
    }
}