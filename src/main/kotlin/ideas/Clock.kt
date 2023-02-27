package ideas

import Concept
import Idea
import Program
import concepts.Input
import concepts.Output
import concepts.Plural

class Clock : Idea(), Program {
    override fun main(input: Input): Output {
        val output = Output()
        output.essence.add( this )
        return output
    }

    private class Tick : Concept {
        override var name: String = "ideas.Clock.Tick"
        override var description: String = "A concept that is the output of a program"
        override var refs: Set<Concept> = setOf()
        override fun synthetize(other: Concept): Concept {
            return this // synthesizing with tick is the same as tick
        }
    }

    override var name: String = "ideas.Clock"
    override var description: String = "A program that prints the current time"
    override var refs: Set<Concept> = setOf()
    override fun synthetize(other: Concept): Concept {
        return Plural( setOf(Tick(), other))
    }
}