package com.example.spring_playground_project;

public class ComputationResult {
    private Double sum;
    private Double subtraction;
    private Double division;
    private Double multiplication;
    private Integer reminder;

    public ComputationResult(double sum, double subtraction, double multiplication) {
        this.sum = sum;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public Double getSum() {
        return sum;
    }

    public Double getSubtraction() {
        return subtraction;
    }

    public Double getDivision() {
        return division;
    }

    public Double getMultiplication() {
        return multiplication;
    }

    public Integer getReminder() {
        return reminder;
    }

    public void setReminder(int reminder) {
        this.reminder = reminder;
    }

    @Override
    public String toString() {
        return "ComputationResult{" +
                "sum=" + sum +
                ", subtraction=" + subtraction +
                ", division=" + division +
                ", multiplication=" + multiplication +
                ", reminder=" + reminder +
                '}';
    }
}
