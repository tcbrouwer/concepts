package computers

import Concept
import Program
import concepts.Input
import concepts.Output
import ideas.Clock
import ideas.Not
import programs.Noop
import programs.physicals.ConceptPrinter
import programs.physicals.LinePrinter

open class Computer (
    override var name: String,
    private val clock: Clock
) : Concept {

    private var step = 1L
    private var shortName = name.take(2) + "." + name.takeLast(2)
    private var isOn = true

    override var description: String = "A computer is a machine that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming."

    override var refs: MutableSet<Concept> = mutableSetOf()

    init {
        print(Concept.actualize("**** Starting computer $name with clock ${clock.name} ****", "programs.Printer"))
    }

    fun shutdown() {
        print(Concept.actualize("**** Shutting down computer $name, thank you ****", "programs.Printer"))
        isOn = false
    }

    override fun synthetize(other: Concept): Concept {
        return Output()
    }

    // a computer runs programs
    // a computer has a memory
    // a computer has a processor
    // a computer has a storage

    // a function that runs a program
    fun churn(program: Program, input: Input ): Output {
        // run program
        print(Concept.actualize("", "print newline",)) // newline
        print(
            Concept.actualize(
                "---- computers.Computer $name step $step START PROGRAM ${program.name} ----",
                "programs.Printer"
            )
        )
        input.essence.forEach { print( it ) } // It is actually not good to consume the input here
        print(Concept.actualize("---- INPUT ${input.essence.size} concepts ----", "programs.Printer"))
        val output = pump( program, input )
        print(Concept.actualize("---- OUTPUT ${output.essence.size} concepts ----", "programs.Printer"))
        output.essence.forEach { print( it ) } // It is actually not good to consume the output here
        print(Concept.actualize("---- computers.Computer $name step $step END PROGRAM ${program.name} ----", "programs.Printer"))
        print(Concept.actualize("", "print newline")) // newline
        step++

        return output
    }

    fun print( concept: Concept) {
        val prepended = Concept.actualize("<$shortName> ", "prepended").synthetize( concept )
        pump( ConceptPrinter(), Input().put( prepended ) )
        pump( LinePrinter(), Input() )
    }
    fun print( concepts: Collection<Concept>) {
        concepts.forEach { print( it ) }
    }

    fun printAsConcept( string: String ) {
        pump( ConceptPrinter(), Input().put(Concept.actualize(string, "programs.Printer computer printAsConcept")),)
    }

    private fun pump(program: Program, input: Input ): Output {
        if( !isOn ) {
            return Output().put(Not()).put(
                Concept.actualize(
                    "computers.Computer $name is not on",
                    "programs.Printer computer printAsConcept"
                )
            )
        }
        // run program
        clock.tick()
        // return output
        return program.main(input)
    }
    fun getStepper(program: Program, input: Input ): Container = Container( program, input )

}