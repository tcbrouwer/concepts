package ideas

import Concept
import Idea

class Not : Idea() {
    override var name: String = "Not"
    override var description: String = "A concept that is the opposite of another concept"
    override var examples: List<String> = listOf("Not")
    override var refs: Set<Concept> = setOf()

}