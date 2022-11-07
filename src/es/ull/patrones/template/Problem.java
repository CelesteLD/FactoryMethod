package es.ull.patrones.template;

import java.util.ArrayList;

public class Problem implements ProblemInterface {
    ArrayList<Double> problem = new ArrayList<>();

    public Problem () { }

    public Problem(ArrayList<Double> problem) {
        setProblem(problem);
    }

    @Override
    public void setProblem(ArrayList<Double> problem) {
        this.problem = problem;
    }

    @Override
    public ArrayList<Double> getProblem() {
        return this.problem;
    }

    @Override
    public int getSize() {
        return problem.size();
    }

    @Override
    public void setElement(Double element) {
        problem.add(element);
    }

    @Override
    public void setElement(int position, Double element) {
        problem.add(position, element);
    }

    @Override
    public Double getElement(int position) {
        return problem.get(position);
    }

    public void write() {
        System.out.print("PROBLEM --> | ");
        for (int i = 0; i < getSize(); ++i) {
            System.out.print(getElement(i) + " | ");
        }
    }
}
