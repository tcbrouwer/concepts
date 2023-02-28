package concepts

import Concept
import java.util.*

fun Concept.toInput(): Input {
    return Input().put( this )
}

class Input : Concept {

    override var name: String = "Input"
    override var description: String = "A concept that is the input of a program"
    override var refs: Set<Concept> = setOf()
    override fun synthetize(other: Concept): Concept {
        return Input().put( this ).put( other )
    }

    fun put( concept: Concept ): Input {
        essence.add( concept )
        return this
    }

    // put all
    fun put( concepts: Collection<Concept> ): Input {
        concepts.forEach { essence.add( it ) }
        return this
    }

    // hi hi
    // val essense = "A concept that is the input of a program"

    val essence = LinkedList<Concept>()

}