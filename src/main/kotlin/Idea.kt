import concepts.Plural
import ideas.Good

open class Idea : Concept {

    override var name: String = "Idea"
    override var description: String = "A concept that is an idea"
    override var refs: Set<Concept> = setOf()
    override fun synthetize(other: Concept): Concept {
        return Plural( setOf(this, Good()))
    }

}