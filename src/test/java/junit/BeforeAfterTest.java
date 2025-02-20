package junit;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }
    @BeforeEach
    void BeforeEach(){
        System.out.println("BeforeEach");
    }
    @Test
    void test1() {
        System.out.println("test1");
    }
    @Test
    void test2() {
        System.out.println("test2");
    }
    @AfterEach
    void AfterEach(){
        System.out.println("AfterEach");
    }
}
