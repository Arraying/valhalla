/*
 * @test /nodynamiccopyright/
 * @bug 5019609 8246774
 * @summary javac fails to reject local enums
 * @author gafter
 * @requires javac.sourceless & javac.releaseless
 * @compile/fail/ref=LocalEnum.out -XDrawDiagnostics --release 15 LocalEnum.java
 * @compile LocalEnum.java
 */

public class LocalEnum {
    void f() {
        enum B {}
    }
}
