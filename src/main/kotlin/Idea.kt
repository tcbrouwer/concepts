import concepts.Plural
import ideas.Good

open class Idea : Concept {

    override val name: String = "Idea"
    override val description: String = "A concept that is an idea"
    override val refs: MutableSet<Concept> = mutableSetOf()
    override fun synthetize(other: Concept): Concept {
        return Plural( mutableSetOf(this, Good()))
    }

}