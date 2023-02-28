package programs.physicals

import Concept
import Program
import concepts.Input
import concepts.Output

class UserInput : Program {
    override fun main(input: Input): Output {
        val sideput = readln()
        return Output().put(Concept.actualize( sideput ))
    }

    override fun usage() = "UserInput"

    override var name: String = "programs.physicals.UserInput"
    override var description: String = "A program that reads from the user"
    override var refs: Set<Concept> = setOf()

}