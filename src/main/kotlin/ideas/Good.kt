package ideas

import Concept
import Idea

class Good : Idea() {
    override var name: String = "Good"
    override var description: String = "A concept that is a good idea"
    override var refs: MutableSet<Concept> = mutableSetOf()
    override fun synthetize(other: Concept): Concept {
        return this
    }
}