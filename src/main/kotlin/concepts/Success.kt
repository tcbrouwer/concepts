package concepts

import Concept
import ideas.Good
import ideas.Not
import java.util.*

class Success : Concept {

        override var name: String = "Success"
        override var description: String = "A concept that is the output of a program"
        override var refs: Set<Concept> = setOf(
            Not(),
            Not(),
            Good(),
            Output()
        )

    override fun synthetize(other: Concept): Concept {
        return Good()
    }

    val essence: Queue<Concept>
            get() {
                val essence = LinkedList<Concept>()
                essence.add( Not() )
                essence.add( Not() )
                essence.add( Good() )
                essence.add( Output() )
                return essence
            }
}