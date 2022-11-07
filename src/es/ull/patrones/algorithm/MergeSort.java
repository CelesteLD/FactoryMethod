package es.ull.patrones.algorithm;

import es.ull.patrones.template.*;

public class MergeSort extends DivideConqTemplate {


    public MergeSort() { }

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
        solution.setElement(0,p.getElement(0));

        return solution;
    }

    @Override
    protected ProblemInterface[] decompose(ProblemInterface p) {
        Problem problems[] = new Problem[2];
        problems[0] = new Problem();
        problems[1] = new Problem();

        int mid = p.getSize()/2;
        for (int i = 0; i < mid; ++i) {
            problems[0].setElement(p.getElement(i));
        }
        for (int j = mid; j < p.getSize(); ++j) {
            problems[1].setElement(p.getElement(j));
        }

        return problems;
    }

    @Override
    protected SolutionInterface combine(ProblemInterface p, SolutionInterface[] ss) {
        Solution solution = new Solution();

        int i = 0;
        int j = 0;
        for(int k = 0; k < p.getSize();k++){
            if(i >= ss[0].getSize()){
                solution.setElement(k, ss[1].getElement(j));
                j++;
                continue;
            }
            if(j >= ss[1].getSize()){
                solution.setElement(k, ss[0].getElement(i));
                i++;
                continue;
            }
            if(ss[0].getElement(i) < ss[1].getElement(j)) {
                solution.setElement(k, ss[0].getElement(i));
                i++;
            }else{
                solution.setElement(k, ss[1].getElement(j));;
                j++;
            }
        }

        return solution;
    }
}
