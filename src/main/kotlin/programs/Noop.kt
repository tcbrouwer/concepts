package programs

import Concept
import Program
import concepts.Input
import concepts.Output

class Noop : Program {

    override val name: String = "programs.Noop"
    override val description: String = "A concept that does nothing"
    override val refs: MutableSet<Concept> = mutableSetOf()
    override fun main(input: Input): Output {
        return Output()
    }

    override fun usage(): String {
        TODO("Not yet implemented")
    }

    override fun synthetize(other: Concept): Concept {
        return this // synthesizing with noop is the same as noop
    }
}