package concepts

import Concept

class Plural (
    override var refs: Set<Concept> = setOf()
) : Concept {
    override var name: String = "Plural"
    override var description: String = "A concept that is a list of concepts"
    override var examples: List<String> = listOf("Plural")

}