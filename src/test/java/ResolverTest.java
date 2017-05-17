import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


@Test
public class ResolverTest {

    public void testNoResults() {
        Arguments arguments = new Arguments(1, 0, 1);
        Result result = Resolver.resolve(arguments);
        assertThat(result.x1).isNull();
        assertThat(result.x2).isNull();
    }

    public void testSameResults() {
        Arguments arguments = new Arguments(1, 2, 1);
        Result result = Resolver.resolve(arguments);
        assertThat(result.x1).isEqualTo(-2.0);
        assertThat(result.x2).isEqualTo(-2.0);
    }

    public void testDifferentResults() {
        Arguments arguments = new Arguments(1, -13, 36);
        Result result = Resolver.resolve(arguments);
        assertThat(result.x1).isEqualTo(9.0);
        assertThat(result.x2).isEqualTo(4.0);
    }
}