package programs.physicals

import Concept
import Program
import concepts.Input
import concepts.Output
import java.io.File

class Save : Program {
    override fun main(input: Input): Output {
        val output = Output()
        val filename = "savefile.txt"
        val file = File(filename)
        input.essence.forEach {
//            if (it is Save) {
                file.appendText(it.name)
            file.appendText("\n")
//            }
        }
        return output
    }
    override fun usage(): String = "Save [INPUT SIGNAL]"
    override val name: String = "programs.physicals.Save"
    override val description: String = "A program that saves a concept to a file"
    override val refs: MutableSet<Concept> = mutableSetOf()}