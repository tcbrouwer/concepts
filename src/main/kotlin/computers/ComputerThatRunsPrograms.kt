package computers

import Program
import concepts.Input
import concepts.Output
import ideas.Clock
import ideas.Not

class ComputerThatRunsPrograms : Computer( name = "computers.ComputerThatRunsPrograms", clock = Clock( 1.12349 ) ) {

    fun churnIt( input: Input ): Output {
        var program: Program? = null
        while( input.essence.isNotEmpty() ) {
            val concept = input.essence.pop()
            if( concept is Program ) {
                program = concept
                break
            }
        }
        return program?.main( input ) ?: Output().put( Not() ) // remainer of input is add to the program
    }

}