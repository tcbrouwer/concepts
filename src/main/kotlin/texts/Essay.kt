package texts

import Concept

class Essay : PlainText( length = 10000 ) {

    val textBuilder = StringBuilder()
    override fun asConcept(): Concept {
        return Concept.actualize( "Essay", textBuilder.toString(), setOf() )
    }
    fun toTweet(): Tweet {
        return Tweet( text = textBuilder.substring( 0, 280 ) )
    }

    fun add( text: String ) {
        textBuilder.append( text )
    }

    fun add( concept: Concept ) {
        textBuilder.append( concept.name )
    }

    fun add( concept: Concept, description: String ) {
        textBuilder.append( concept.name )
        textBuilder.append( " " )
        textBuilder.append( description )
    }

    fun add( concept: Concept, description: String, refs: Set<Concept> ) {
        textBuilder.append( concept.name )
        textBuilder.append( " " )
        textBuilder.append( description )
        textBuilder.append( " " )
        textBuilder.append( refs )
    }

    fun add( concept: Concept, description: String, refs: Set<Concept>, essence: Set<Concept> ) {
        textBuilder.append( concept.name )
        textBuilder.append( " " )
        textBuilder.append( description )
        textBuilder.append( " " )
        textBuilder.append( refs )
        textBuilder.append( " " )
        textBuilder.append( essence )
    }

    fun add( concept: Concept, description: String, refs: Set<Concept>, essence: Set<Concept>, synthetize: ( Concept ) -> Concept ) {
        textBuilder.append( concept.name )
        textBuilder.append( " " )
        textBuilder.append( description )
        textBuilder.append( " " )
        textBuilder.append( refs )
        textBuilder.append( " " )
        textBuilder.append( essence )
        textBuilder.append( " " )
        textBuilder.append( synthetize )
    }

    fun add( concept: Concept, description: String, refs: Set<Concept>, essence: Set<Concept>, synthetize: ( Concept ) -> Concept, put: ( Concept ) -> Concept ) {
        textBuilder.append( concept.name )
        textBuilder.append( " " )
        textBuilder.append( description )
        textBuilder.append( " " )
        textBuilder.append( refs )
        textBuilder.append( " " )
        textBuilder.append( essence )
        textBuilder.append( " " )
        textBuilder.append( synthetize )
        textBuilder.append( " " )
        textBuilder.append( put )
    }

}