package concepts

import Concept
import ideas.Good

class Upstream : Concept {
    override val name: String = "concepts.Upstream"
    override val description: String = "A concept that is upstream"
    override val refs: MutableSet<Concept> = mutableSetOf( Good() )

    override fun synthetize(other: Concept): Concept {
        val input = Input()
        input.essence.add(other)
        input.essence.add(Plural())
        input.essence.add(Plural().synthetize(other))
        input.essence.add(Success())
        input.essence.add(Success())
        input.essence.add(other)
        return input
    }
}