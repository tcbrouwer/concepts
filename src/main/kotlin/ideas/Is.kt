package ideas

import Concept
import Idea

class Is : Idea() {

        override var name: String = "ideas.Is"
        override var description: String = "A concept that is a relation between two concepts"
        override var refs: MutableSet<Concept> = mutableSetOf(Good())
        override fun synthetize(other: Concept): Concept {
            return other
        }
}