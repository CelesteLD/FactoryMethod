package es.ull.patrones.algorithm;

import es.ull.patrones.template.Problem;
import es.ull.patrones.template.ProblemInterface;
import es.ull.patrones.template.Solution;
import es.ull.patrones.template.SolutionInterface;

public abstract class DivideConqTemplate {
    final public SolutionInterface solve(ProblemInterface p) {

        ProblemInterface[] pp;

        if (isSimple(p)) {
            return simplySolve(p);
        } else {
            pp = decompose(p);
        }

        SolutionInterface[] ss = new SolutionInterface[pp.length];

        for(int i = 0; i < pp.length; i++) {
            ss[i] = solve(pp[i]);
        }
        return combine(p, ss);
    }

    abstract protected boolean isSimple (ProblemInterface p);
    abstract protected Solution simplySolve (ProblemInterface p);
    abstract protected ProblemInterface[] decompose (ProblemInterface p);
    abstract protected SolutionInterface combine(ProblemInterface p, SolutionInterface[] ss);
}
