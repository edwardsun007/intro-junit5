package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before-I am only called once!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each executing...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloSam() {
        System.out.println(greeting.helloWorld("Sam!"));
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Edward"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("TearDown executing...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After everything !- I am only called once in entire test suite!");
    }
}