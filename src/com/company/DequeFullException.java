package com.company;


/**
 * Vi fikk her valget mellom at unntakene våre skulle være kjøretidsunntak / RuntimeException / unchecked Exception
 * eller sjekkede unntak / checked Exception. Hovedforskjellen mellom disse er at sjekkede unntak blir skjekket når man kompilerer.
 * Mens kjøretidsunntak blir sjekket når programmet kjører.
 *
 *
 *
 *
 */

public class DequeFullException extends Exception {

    public DequeFullException(String message){
        super(message);
    }

}
