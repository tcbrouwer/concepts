package laboratories

import Program
import computers.Computer
import concepts.Input
import programs.Noop
import concepts.Output
import ideas.Clock

abstract class ProtoLab (
    val computer: Computer = Computer( name = "ProtoLabComputer", clock = Clock( wavelength = 0.5) ),
    var program: Program = Noop()
) {

    fun insertProgam( program: Program ) {
        this.program = program
    }

    fun churn( input: Input ): Output {
        return computer.churn( program, input )
    }

    abstract fun tick( input: Input ): Output

}