package concepts

import Concept
import ideas.Good

class Plural (
    override var refs: Set<Concept> = setOf()
) : Concept {

    init {
        refs = refs + Good()
    }

    override var name: String = "Plural"
    override var description: String = "A concept that is a list of concepts"
    override fun synthetize(other: Concept): Concept {
        return Plural( refs + other )
    }

}