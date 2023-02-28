package concepts

import Concept

class Noop : Concept {
    override var name: String = "concepts.Noop"
    override var description: String = "A concept that does nothing"
    override var refs: Set<Concept> = setOf()
    override fun synthetize(other: Concept): Concept {
        return this // synthesizing with noop is the same as noop
    }
}