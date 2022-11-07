package es.ull.patrones.template;

import java.util.ArrayList;

public interface SolutionInterface {
    public void setSolution(ArrayList<Double> solution);
    public ArrayList<Double> getSolution();
    public Double getElement(int position);
    public void setElement(int position, Double element);
    public int getSize();

    void setElement(Double element);
}
