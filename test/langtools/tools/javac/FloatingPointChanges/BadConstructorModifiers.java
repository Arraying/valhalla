/*
 * @test  /nodynamiccopyright/
 * @bug 4153038 4785453 8244146
 * @summary strictfp may not be used with constructors
 * @author David Stoutamire (dps)
 *
 * @requires javac.sourceless & javac.releaseless
 * @compile/fail/ref=BadConstructorModifiers.out -XDrawDiagnostics --release 16     BadConstructorModifiers.java
 * @compile/fail/ref=BadConstructorModifiers.out -XDrawDiagnostics -Xlint:-strictfp BadConstructorModifiers.java
 */

public class BadConstructorModifiers {

    strictfp BadConstructorModifiers (double abra) { }

}
