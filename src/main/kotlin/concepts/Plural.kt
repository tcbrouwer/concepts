package concepts

import Concept
import ideas.Good

class Plural (
    override val refs: MutableSet<Concept> = mutableSetOf()
) : Concept {

    init {
        refs += Good()
    }

    override var name: String = "Plural"
    override var description: String = "A concept that is a list of concepts"
    override fun synthetize(other: Concept): Concept {
        return Plural( (refs + other).toMutableSet() )
    }

}