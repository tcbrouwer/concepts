package programs

import Concept
import Program
import concepts.Input
import concepts.Output

class HelloWorld : Program {
    fun hello() = "Hello, World!"
    override fun main( input: Input ): Output {
        val output = Output()
        output.essence.add(Concept.actualize("programs.HelloWorld generated concept. ${hello()}", ))
        return output
    }

    override fun usage(): String = "HelloWorld"

    override val name: String = "programs.HelloWorld"
    override val description: String = "A program that prints 'Hello, World!'"
    override val refs: MutableSet<Concept> = mutableSetOf()

}