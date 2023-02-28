import computers.Computer
import computers.ComputerThatRunsPrograms
import concepts.Input
import concepts.Noop
import concepts.Output
import concepts.Plural
import ideas.Clock
import ideas.Not
import ideas.Weave
import programs.*
import programs.physicals.NamePrinter
import programs.physicals.Save
import programs.physicals.UserInput

fun main(args: Array<String>) {

    // take a computer
    val computer = Computer( name = "fastComputer1", clock = Clock( wavelength = 0.5 ) )
    val output = Output()

    computer.printAsConcept( " -- Starting -- " )

    // Convert the program arguments to a list of concepts
    val input = Input()
    args.forEach { input.essence.add( Concept.actualize(it, "Program argument", )) }

    // Create a new concept
    val concept = Concept.actualize("Hello World", "A simple program that prints 'Hello World' to the console.")

    // create a new program
    val program = HelloWorld()

    // run the program
    output.essence.addAll( program.main( input ).essence )

    // create the arrow concept
    val arrow = Concept.actualize("Arrow", "A simple program that prints an arrow to the console.")
    // program concept
    val programConcept = Concept.actualize("Program", "A program is a set of instructions that performs a task.")
    // add the arrow concept to the program concept
    programConcept.addRef( arrow )

    // add programConcept to the output
    output.essence.add( programConcept )

    // addition
    val addition = Concept.actualize("Addition", "Addition is the process of adding two numbers together.")
    // subtraction
    val subtraction = Concept.actualize("Subtraction", "Subtraction is the process of subtracting two numbers.")
    // multiplication
    val multiplication = Concept.actualize("Multiplication", "Multiplication is the process of multiplying two numbers.")
    // division
    val division = Concept.actualize("Division", "Division is the process of dividing two numbers.")
    // exponentiation
    val exponentiation = Concept.actualize("Exponentiation", "Exponentiation is the process of raising a number to a power.")
    // modulus
    val modulus = Concept.actualize("Modulus", "Modulus is the process of finding the remainder of a division.")
    // create a list of concepts
    val concepts = listOf(addition, subtraction, multiplication, division, exponentiation, modulus)


    // output the concepts
    computer.printAsConcept( "- here are some arimethic concepts -" )
    computer.print( concepts )

    // compute
    val compute = Concept.actualize("Compute", "Compute is the process of performing a computation.")

    // What is actualization?
    val actualization = Concept.actualize("Actualization", "Actualization is the process of creating a concept.")
    // #happy ;)

    fun upstream() {
        // create a new concept
        val concept = Concept.actualize("Hello World", "A simple program that prints 'Hello World' to the console.")
    }

    fun downstream() {
        // create a new concept
        val concept = Concept.actualize("Hello World", "A simple program that prints 'Hello World' to the console.")
    }

    // what is a question?
    val question = Concept.actualize("Question", "A question is a statement that requires an answer.")
    // what is an answer?
    val answer = Concept.actualize("Answer", "An answer is a statement that provides a response to a question.")
    // what is a statement?
    val statement = Concept.actualize("Statement", "A statement is a sentence that makes a claim.")
    // what is a sentence?
    val sentence = Concept.actualize("Sentence", "A sentence is a group of words that makes a complete thought.")
    // what is a word?
    val word = Concept.actualize("Word", "A word is a single unit of language.")
    // what is a unit?
    val unit = Concept.actualize("Unit", "A unit is a single thing.")
    // is a concept a thing
    val conceptIsThing = Concept.actualize("Concept is Thing", "A concept is a thing.")

    // compute the "concept is thing" concept
    val program2 = Program.default()
    val result = computer.churn( program2, Input() )

    // forgot what program 1 did
    computer.churn( program, Input() )

    // a more difficult question
    godelChurn()

    // synthesize
    val synthesize = Concept.actualize("Synthesize", "Synthesize is the process of combining concepts to create a new concept.")
    val synth = synthesize.synthetize( compute ).synthetize( actualization )

    // print the concept
    computer.churn( NamePrinter(), Input().put( synth ) )

    // recurse
    val a = computer.churn( RefLister(), Input().put( synth ) )
    val b = computer.churn( RefLister(), Input().put( a ) )
    val c = computer.churn( RefLister(), Input().put( b ) )
    computer.churn( NamePrinter(), Input().put( Concept.actualize("Output of recursion") ).put( c ) )

    computer.churn( Evaluate(), Input().put( HelloWorld() ).put( Lookup() ) )

    computer.churn( Pipe(), Input().put( Concept.actualize("CoPilot")).put( HelloWorld() ).put( Lookup() ) )

    // make a slow computer for experimentation
    computer.shutdown()
    val slowComputer = Computer( name = "slowComputer1", clock = Clock( wavelength = 0.5 ) )

    // get some input, then print it
    val x = slowComputer.churn( UserInput(), Input() )
    slowComputer.churn( NamePrinter(), x.toInput() )

    // weave
    val copilotWeaveDefinition = Concept.actualize("Weave", "Weave is the process of combining concepts to create a new concept.")
    val upstreamWeave = Weave()

    val i1 = upstreamWeave.synthetize( Concept.actualize("Input 1", "The first input to the weave.") )
    val i2 = upstreamWeave.synthetize( Concept.actualize("Input 2", "The second input to the weave.") )

    val inputForWeave = Input()
    inputForWeave.essence.add( upstreamWeave )
    inputForWeave.essence.add( i1 )
    inputForWeave.essence.add( i2 )

    slowComputer.churn( Weave(), Input().put( i1 ).put( i2 ) )

    // save the weave
    slowComputer.churn( Save(), Input().put( upstreamWeave ).put( copilotWeaveDefinition ).put( Concept.actualize("Automated input") ) )

    // query
    val query = Concept.actualize("Query", "Query is the process of asking a question.")
    slowComputer.churn( Query(), Input().put( query ).put( Concept.actualize("Automated input") ) )

    // Send a computer concept to indicate start of computation
    val computation = Concept.actualize("Computation", "Computation is the process of performing a computation.")

    // shutdown the slow computer
    slowComputer.shutdown()

    // Get a computer that runs programs
    val programComputer = ComputerThatRunsPrograms()
    val lint = Input().put(Noop()).put(Query()).put(Query()).put(Query()).put(Query()).put(Query()).put(Query()).put(Query())
    programComputer.churnIt( lint )

}

fun godelChurn() {
    // get a computer
    val computer = Computer( name = "GodelChurner", clock = Clock( 1.12349 ) )

    // formulate a question
    // what is Godel?
    // what are some related concepts?
    val refs = Plural( setOf(Not(), Not(), Plural(), Not(), Output() ) )
    val godel = Concept.actualize(
        name = "Godel",
        description = "Godel is a concept that is not in the list.",
        refs = refs.refs
    )


    // lookup references
    val input = Input()
    input.essence.add( godel )
    val godelRefs = computer.churn( RefLister(), input )

    // print the references (should use a program)
    godelRefs.essence.forEach { computer.print(it) }

    // iterate on the references
    val input2 = Input()
    input2.essence.addAll( godelRefs.essence )
    val godelRef = computer.churn( RefLister(), input2 )

    // print the reference
    godelRef.essence.forEach { computer.print(it) }

    computer.shutdown()
}