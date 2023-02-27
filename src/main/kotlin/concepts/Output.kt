package concepts

import Concept
import java.util.*

class Output : Concept {

    override var name: String = "Output"
    override var description: String = "A concept that is the output of a program"
    override var examples: List<String> = listOf("Output")
    override var refs: Set<Concept> = setOf()

    // hi hi
    // val essense = "A concept that is the output of a program"

    val essence = LinkedList<Concept>()

}