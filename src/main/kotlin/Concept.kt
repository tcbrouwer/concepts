interface Concept {

    // Properties
    var name: String
    var description: String
    var examples: List<String>

    var refs: Set<Concept>

    // add ref
    fun addRef(ref: Concept) {
        refs = refs + ref
    }

    // Methods
    fun print() {
        println("Name: $name")
        println("Description: $description")
        println("Examples: $examples")
    }

    private class AbstractConcept: Concept {
        override var name: String = ""
        override var description: String = ""
        override var examples: List<String> = listOf()
        override var refs: Set<Concept> = setOf()

    }
    companion object {
        fun actualize(name: String, description: String, examples: List<String>, refs: Set<Concept> = setOf()): Concept {
            val abstractConcept = AbstractConcept()
            abstractConcept.name = name
            abstractConcept.description = description
            abstractConcept.examples = examples
            abstractConcept.refs = refs
            return abstractConcept
        }
    }

}