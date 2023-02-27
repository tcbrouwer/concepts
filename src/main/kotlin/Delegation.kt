class Delegation (
    override var name: String,
    override var description: String,
    override var refs: Set<Concept>
) : Concept {
    override fun synthetize(other: Concept): Concept {
        return other.synthetize( this )
    }
}