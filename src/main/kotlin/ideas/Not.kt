package ideas

import Concept
import Idea

class Not : Idea() {
    override val name: String = "Not"
    override val description: String = "A concept that is the opposite of another concept"
    override val refs: MutableSet<Concept> = mutableSetOf()

}