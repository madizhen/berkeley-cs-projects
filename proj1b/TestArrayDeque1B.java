import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDeque1B {

    /* How the autograder works:
     * Randomly call methods of either LinkedListDeque & LinkedListDequeSolution,
     * when it disagrees, the test will fail
     * Main ideas: randomised testing & JUnit message generation
     * Call on StudentArrayDeque & ArrayDequeSolution
     */
    
    @Test
    public void testArrayDeque() {
        StudentArrayDeque<Integer> student = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> solution = new ArrayDequeSolution<>();
        OperationSequence fs = new OperationSequence();

        for (int i = 0; i < 10; i += 1) {
            double numberBetweenZeroAndOne = StdRandom.uniform();
            if (numberBetweenZeroAndOne < 0.5) {
                student.addLast(i);
                solution.addLast(i);
                DequeOperation randomAddLast = new DequeOperation("addLast", i);
                fs.addOperation(randomAddLast);
            } else {
                student.addFirst(i);
                solution.addFirst(i);
                DequeOperation randomAddFirst = new DequeOperation("addFirst", i);
                fs.addOperation(randomAddFirst);
            }
        }

        Integer a = solution.removeFirst();
        Integer b = student.removeFirst();
        DequeOperation dequeOp1 = new DequeOperation("RemoveFirst");
        fs.addOperation(dequeOp1);
        System.out.println("solution answer: " + a);
        System.out.println("student answer: " + b);
        assertEquals(fs.toString(),a,b);

        Integer c = solution.removeLast();
        Integer d = student.removeLast();
        DequeOperation dequeOp2 = new DequeOperation("RemoveLast");
        fs.addOperation(dequeOp2);
        assertEquals(fs.toString(),c,d);

        Integer e = solution.removeFirst();
        Integer f = student.removeFirst();
        DequeOperation dequeOp3 = new DequeOperation("RemoveFirst");
        fs.addOperation(dequeOp3);
        assertEquals(fs.toString(),e,f);

        Integer g = solution.removeLast();
        Integer h = student.removeLast();
        DequeOperation dequeOp4 = new DequeOperation("RemoveLast");
        fs.addOperation(dequeOp4);
        assertEquals(fs.toString(),g,h);

        Integer i = solution.removeFirst();
        Integer j = student.removeFirst();
        DequeOperation dequeOp5 = new DequeOperation("RemoveFirst");
        fs.addOperation(dequeOp5);
        assertEquals(fs.toString(),i,j);

        Integer k = solution.removeLast();
        Integer l = student.removeLast();
        DequeOperation dequeOp6 = new DequeOperation("RemoveLast");
        fs.addOperation(dequeOp6);
        assertEquals(fs.toString(),k,l);

        Integer m = solution.removeFirst();
        Integer n = student.removeFirst();
        DequeOperation dequeOp7 = new DequeOperation("RemoveFirst");
        fs.addOperation(dequeOp7);
        assertEquals(fs.toString(),m,n);
    }

    public static void main(String[] args) {
        jh61b.junit.TestRunner.runTests("all", TestArrayDeque1B.class);
    }

}
