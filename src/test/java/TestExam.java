import org.example.Exam;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestExam {
    Exam exam = new Exam();

    @Test
    void test1() {
        assertEquals(exam.isPassed(80, 80), true);
    }
    @Test
    void test2() {
        assertEquals(exam.isPassed(60, 100), true);
    }
    @Test
    void test3() {
        assertEquals(exam.isPassed(100, 60), true);
    }
    @Test
    void test4() {
        assertEquals(exam.isPassed(60, 90), false);
    }
    @Test
    void test5() {
        assertEquals(exam.isPassed(90, 60), false);
    }
    @Test
    void test6() {
        assertEquals(exam.isPassed(60, 60), false);
    }
}
