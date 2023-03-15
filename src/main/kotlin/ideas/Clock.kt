package ideas

import Concept
import Idea
import Program
import concepts.Input
import concepts.Output
import concepts.Plural
import java.lang.Thread.sleep

class Clock(val wavelength: Double) : Idea(), Program {

    companion object {
        val SCALE_FACTOR = 100
    }

    override fun main(input: Input): Output {
        val output = Output()
        input.essence.forEach {
            output.essence.add(Tick())
            output.essence.add(Not())
        }
        return output
    }

    override fun usage() = "Clock [INPUT SIGNAL]>"

    fun tick() = sleep( (wavelength * SCALE_FACTOR).toLong() )

    private class Tick : Concept {
        override var name: String = "ideas.Clock.Tick"
        override var description: String = "A concept that is the output of a program"
        override var refs: MutableSet<Concept> = mutableSetOf()
        override fun synthetize(other: Concept): Concept {
            return this // synthesizing with tick is the same as tick
        }
    }

    override val name: String = "ideas.Clock"
    override val description: String = "A program that prints the current time"
    override val refs: MutableSet<Concept> = mutableSetOf()
    override fun synthetize(other: Concept): Concept {
        return Plural( mutableSetOf(Tick(), other))
    }
}