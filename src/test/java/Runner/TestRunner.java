package runners;

import com.intuit.karate.junit5.Karate;

class TestRunner {

    @Karate.Test
    Karate runTests() {
        return Karate.run("classpath:feature/healthcheck.feature").relativeTo(getClass());
    }

}