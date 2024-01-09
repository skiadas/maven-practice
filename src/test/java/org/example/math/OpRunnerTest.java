package org.example.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OpRunnerTest {
    @Test
    void testSum() {
        OpRunner opRunner = new OpRunner();
        assertEquals(9, opRunner.doOp(4, "+", 5));
    }
}