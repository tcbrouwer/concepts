package concepts

import Concept

open class Plural (
    override var refs: Set<Concept> = setOf()
) : Concept {
    override var name: String = "Plural"
    override var description: String = "A concept that is a list of concepts"
    override fun synthetize(other: Concept): Concept {
        return Plural( refs + other )
    }

}