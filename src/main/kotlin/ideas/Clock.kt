package ideas

import Concept
import Idea
import Program
import concepts.Input
import concepts.Output
import concepts.Plural
import java.lang.Thread.sleep

class Clock( val duration: Int ) : Idea(), Program {
    override fun main(input: Input): Output {
        val output = Output()
        input.essence.forEach {
            output.essence.add(Tick())
            output.essence.add(Not())
        }
        return output
    }

    fun tick() = sleep(duration.toLong())

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