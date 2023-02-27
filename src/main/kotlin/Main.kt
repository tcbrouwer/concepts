import concepts.Input
import concepts.Output
import concepts.Plural
import ideas.Clock
import ideas.Not
import programs.*

fun main(args: Array<String>) {

    // Convert the program arguments to a list of concepts
    val input = Input()
    args.forEach { input.essence.add( Concept.actualize(it, "Program argument", )) }

    // Create a new concept
    val concept = Concept.actualize("Hello World", "A simple program that prints 'Hello World' to the console.")

    // create a new program
    val program = HelloWorld()

    // run the program
    program.main( input )

    // create the arrow concept
    val arrow = Concept.actualize("Arrow", "A simple program that prints an arrow to the console.")
    // program concept
    val programConcept = Concept.actualize("Program", "A program is a set of instructions that performs a task.")
    // add the arrow concept to the program concept
    programConcept.addRef( arrow )
    // print the program concept
    programConcept.print()

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
    // create a new program
    val refLister = RefLister()


    // compute
    val compute = Concept.actualize("Compute", "Compute is the process of performing a computation.")

    // What is actualization?
    val actualization = Concept.actualize("Actualization", "Actualization is the process of creating a concept.")
    // #happy ;)

    fun upstream() {
        // create a new concept
        val concept = Concept.actualize("Hello World", "A simple program that prints 'Hello World' to the console.")
        // print the concept
        concept.print()
    }

    fun downstream() {
        // create a new concept
        val concept = Concept.actualize("Hello World", "A simple program that prints 'Hello World' to the console.")
        // print the concept
        concept.print()
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
    val computer = Computer( clock = Clock() )
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

}

fun godelChurn() {
    // get a computer
    val computer = Computer( clock = Clock() )

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
    godelRefs.essence.forEach { it.print() }

    // iterate on the references
    val input2 = Input()
    input2.essence.addAll( godelRefs.essence )
    val godelRef = computer.churn( RefLister(), input2 )

    // print the reference
    godelRef.essence.forEach { it.print() }
}