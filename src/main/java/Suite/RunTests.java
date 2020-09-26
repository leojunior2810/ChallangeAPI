package Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.London;
import tests.MountainView;
import tests.ValidateError;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        London.class,
        MountainView.class,
        ValidateError.class
})
public class RunTests {

}
