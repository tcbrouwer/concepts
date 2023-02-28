package concepts

import Concept
import java.util.*

class Output : Concept {

    override var name: String = "Output"
    override var description: String = "A concept that is the output of a program"
    override var refs: Set<Concept> = setOf( Plural() )
    override fun synthetize(other: Concept): Concept {
        return Output().put( other )
    }

    fun put( concept: Concept ): Output {
        essence.add( concept )
        return this
    }
    fun put( concepts: Collection<Concept> ): Output {
        concepts.forEach { essence.add( it ) }
        return this
    }

    // hi hi
    // val essense = "A concept that is the output of a program"

    val essence = LinkedList<Concept>()

}