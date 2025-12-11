/*
 * @test /nodynamiccopyright/
 * @bug 8246704
 * @summary Verify preview APIs are reported correctly when using --release.
 * @requires javac.sourceless & javac.releaseless
 * @compile/fail/ref=PreviewAPIsWithRelease.out -XDrawDiagnostics --release 14 PreviewAPIsWithRelease.java
 */

import com.sun.source.tree.Tree.Kind;

public class PreviewAPIsWithRelease {
    void test() {
        "".stripIndent();
        Kind r = Kind.RECORD;
    }
}
