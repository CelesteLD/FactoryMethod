package es.ull.patrones.template;

import java.util.ArrayList;

public class Solution implements SolutionInterface {

    ArrayList<Double> solution = new ArrayList<>();

    public Solution () { }

    @Override
    public void setSolution(ArrayList<Double> solution) {
        this.solution = solution;
    }

    @Override
    public ArrayList<Double> getSolution() {
        return this.solution;
    }

    @Override
    public Double getElement(int position) {
        return solution.get(position);
    }

    @Override
    public void setElement(int position, Double element) {
        solution.add(position, element);
    }

    @Override
    public int getSize() {
        return solution.size();
    }

    @Override
    public void setElement(Double element) {
        solution.add(element);
    }

    public void write() {
        System.out.print("SOLUTION --> | ");
        for (int i = 0; i < getSize(); ++i) {
            System.out.print(getElement(i) + " | ");
        }
    }
}
