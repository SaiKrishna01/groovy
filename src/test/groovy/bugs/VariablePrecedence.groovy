/**
 * @author John Wilson
 * @version $Revision$
 */
class VariblePrecedence extends GroovyTestCase {
    
    void testVariablePrecedence() {
 /*
        assertScript( <<<-EOF
            class VariableFoo {
                x = 100
                y = 93
                c = {|x| assert x == 1; assert y == 93; }
                static void main(args) {
                    vfoo = new VariableFoo()
                    vfoo.c.call(1)

                    z = 874;
                    1.times { assert vfoo.x == 100; assert z == 874; z = 39; }
                    assert z == 39;

                    vfoo.local();
                }

                void local() {
                    c.call(1);

                    z = 874;
                    1.times { assert x == 100; assert z == 874; z = 39; }
                    assert z == 39;
                } 
            }

        EOF );
 */
    }


/*
    void testVariablePrecedenceInScript() {
        assertScript( <<<-EOF
            c = { |x| assert x == 1; assert y == 93; }
            x = 100;
            y = 93;

            c.call(1);
        EOF);
    }
*/

}
