import concepts.Input
import concepts.Output
import ideas.Clock
import programs.NamePrinter

open class Computer (
    clock: Clock
) : Concept  {

    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var description: String = "A computer is a machine that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming."

    override var refs: Set<Concept> = setOf()
    override fun synthetize(other: Concept): Concept {
        return Output()
    }

    // a computer runs programs
    // a computer has a memory
    // a computer has a processor
    // a computer has a storage

    // a function that runs a program
    fun churn( program: Program, input: Input ): Output {
        // run program
        print( Concept.actualize( "", "print newline", ) ) // newline
        print( Concept.actualize( "---- START PROGRAM ${program.name} ----", "programs.Printer" ) )
        input.essence.forEach { print( it ) } // It is actually not good to consume the input here
        print( Concept.actualize( "---- INPUT ${input.essence.size} concepts ----", "programs.Printer" ) )
        val output = pump( program, input )
        print( Concept.actualize( "---- OUTPUT ${output.essence.size} concepts ----", "programs.Printer" ) )
        output.essence.forEach { print( it ) } // It is actually not good to consume the output here
        print( Concept.actualize( "---- END PROGRAM ${program.name} ----", "programs.Printer" ) )
        print( Concept.actualize( "", "print newline") ) // newline
        return output
    }

    private fun print( concept: Concept ) {
        pump( NamePrinter(), Input()
            .put( concept ),)
    }

    private fun pump(program: Program, input: Input): Output {
        // run program
        // return output
        return program.main(input)
    }

    fun getStepper( program: Program, input: Input ): Iterator<Concept> {
        // execute program
        val output = churn( program, input )
        // return iterator
        return output.essence.iterator()
    }

}