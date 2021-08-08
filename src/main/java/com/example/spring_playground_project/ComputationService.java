package com.example.spring_playground_project;

public class
ComputationService {

    public static ComputationResult compute(int a, int b) {
        double sum = a + b;
        double subtraction = a - b;
        double multiplication = a * b;

        ComputationResult result = new ComputationResult(sum, subtraction, multiplication);

        if (b != 0) {
            double division = (double) a / b;
            result.setDivision(division);

            int reminder = a % b;
            result.setReminder(reminder);
        }

        return result;
    }
}
