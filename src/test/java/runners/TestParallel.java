package test.java.runners;

import com.intuit.karate.junit5.Karate;

class TestParallel{

    @Karate.Test
    Karate runTests() {
        return Karate.run("classpath:features").parallel(3);
    }

}
