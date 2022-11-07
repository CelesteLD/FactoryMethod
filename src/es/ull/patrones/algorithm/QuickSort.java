package es.ull.patrones.algorithm;

import es.ull.patrones.template.Problem;
import es.ull.patrones.template.ProblemInterface;
import es.ull.patrones.template.Solution;
import es.ull.patrones.template.SolutionInterface;

public class QuickSort extends DivideConqTemplate {

    public QuickSort() { }

    @Override
    protected boolean isSimple(ProblemInterface p) {
        if (p.getSize() <= 1) {
            return true;
        }
        return false;
    }

    @Override
    protected Solution simplySolve(ProblemInterface p) {
        Solution solution = new Solution();
        if (p.getSize() == 1) {
            solution.setElement(p.getElement(0));
        }
        return solution;
    }

    @Override
    protected ProblemInterface[] decompose(ProblemInterface p) {
        Problem[] problems = new Problem[2];
        problems[0] = new Problem(); // left
        problems[1] = new Problem(); // right
        int i = -1;
        int k = -1;

        Double pivot = p.getElement(0);

        for (int j = 1; j < p.getSize(); ++j) {
            if (p.getElement(j) <= pivot) {
                i++;
                problems[0].setElement(i, p.getElement(j));
            }
            else {
                k++;
                problems[1].setElement(k, p.getElement(j));
            }
        }
        problems[0].setElement(pivot);
        return problems;
    }

    @Override
    protected SolutionInterface combine(ProblemInterface p, SolutionInterface[] ss) {
        Solution solution = new Solution();
        for (int i = 0; i < ss[0].getSize(); ++i) {
            solution.setElement(ss[0].getElement(i));
        }
        for (int i = 0; i < ss[1].getSize(); ++i) {
            solution.setElement(ss[1].getElement(i));
        }
        return solution;
    }
}
