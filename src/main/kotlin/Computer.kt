import concepts.Input
import concepts.Output

open class Computer : Concept  {

    // input and output tape
    val deque = ArrayDeque<Concept>()

    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var description: String = "A computer is a machine that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming."

    override var examples: List<String>
        get() = TODO("Not yet implemented")
        set(value) {}
    override var refs: Set<Concept> = setOf()

    // a computer runs programs
    // a computer has a memory
    // a computer has a processor
    // a computer has a storage

    // a function that runs a program
    fun churn(program: Program, input: Input ): Output {
        // run program
        return program.main( input )
    }

    fun getStepper( program: Program, input: Input ): Iterator<Concept> {
        // execute program
        val output = churn( program, input )
        // return iterator
        return output.essence.iterator()
    }

}