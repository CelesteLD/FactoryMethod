package es.ull.patrones.template;

import java.util.ArrayList;

public interface ProblemInterface {
    public void setProblem(ArrayList<Double> problem);
    public ArrayList<Double> getProblem();
    public int getSize();
    public void setElement(Double element);
    public void setElement(int position, Double element);
    public Double getElement(int position);

}
