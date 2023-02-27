package concepts

import Concept
import java.util.*

class Input : Concept {

    override var name: String = "Input"
    override var description: String = "A concept that is the input of a program"
    override var examples: List<String> = listOf("Input")
    override var refs: Set<Concept> = setOf()

    // hi hi
    // val essense = "A concept that is the input of a program"

    val essence = LinkedList<Concept>()

}