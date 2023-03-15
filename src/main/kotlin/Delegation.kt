class Delegation (
    override val name: String,
    override val description: String,
    override val refs: MutableSet<Concept>
) : Concept {
    override fun synthetize(other: Concept): Concept {
        return other.synthetize( this )
    }
}