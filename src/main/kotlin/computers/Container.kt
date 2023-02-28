package computers

import Program
import concepts.Input
import concepts.toInput
import ideas.Clock

class Container(
    val program: Program,
    val input: Input,
) : Computer( name = "computers.Container", clock = Clock( 1.12349 ) ) {

    fun step() {
        val input = input.essence.pop().toInput()
        program.main( input )
    }

}