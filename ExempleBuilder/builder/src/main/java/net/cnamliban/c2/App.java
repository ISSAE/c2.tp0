package net.cnamliban.c2;

/**
 * Hello Java simple
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Cnam Liban!" );
        Exemple ex = new Exemple.ExempleBuilder(1).nom("Pascal").tel("01000100").build();
    }
}
