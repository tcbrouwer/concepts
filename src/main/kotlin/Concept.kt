interface Concept {

    // Properties
    var name: String
    var description: String
    var refs: Set<Concept>

    // add ref
    fun addRef(ref: Concept) {
        refs = refs + ref
    }

    fun synthetize( other: Concept ): Concept

    private class AbstractConcept: Concept {
        override var name: String = ""
        override var description: String = ""
        override var refs: Set<Concept> = setOf()
        override fun synthetize(other: Concept): Concept {
            return actualize(
                name + other.name,
                description + other.description,
                refs + other.refs + this + other
            )
        }

    }
    companion object {
        fun actualize(name: String, description: String = "missing description", refs: Set<Concept> = setOf()): Concept {
            val abstractConcept = AbstractConcept()
            abstractConcept.name = name
            abstractConcept.description = description
            abstractConcept.refs = refs
            return abstractConcept
        }
    }

}