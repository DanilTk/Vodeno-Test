package com.example.spring_playground_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputationServiceTest {

    @Test
    void shouldComputeResultWhenParamsAboveZero() {

        //when:
        ComputationResult result = ComputationService.compute(5, 2);

        //then:
        Assertions.assertEquals(7, result.getSum());
        Assertions.assertEquals(3, result.getSubtraction());
        Assertions.assertEquals(10d, result.getMultiplication());
        Assertions.assertEquals(2.5, result.getDivision());
        Assertions.assertEquals(1, result.getReminder());
    }

    @Test
    void shouldContainNullsWhenSecondParameterIsZero() {

        //when:
        ComputationResult result = ComputationService.compute(5, 0);

        //then:
        Assertions.assertNull(result.getDivision());
        Assertions.assertNull(result.getReminder());
    }
}

