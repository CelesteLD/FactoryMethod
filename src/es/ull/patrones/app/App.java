package es.ull.patrones.app;

import es.ull.patrones.algorithm.*;
import es.ull.patrones.template.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    public App() {

        /*ArrayList<Double> test = new ArrayList<>();
        test.add(463.0);
        test.add(17.0);
        test.add(233.0);
        test.add(670.0);
        test.add(1.0);

        Problem pr = new Problem(test);*/

        ProblemInterface pr = new Problem(askData());
        Solution sol;

        System.out.println("Select the algorithm to use:");
        System.out.println("1. QuickSort");
        System.out.println("2. MergeSort");

        int option = sc.nextInt();

        if (option == 1) {
            DivideConqTemplate quick = new QuickSort();

            sol = (Solution) quick.solve(pr);
            ((Problem) pr).write();
            System.out.println();
            sol.write();
        }

        if (option == 2) {
            DivideConqTemplate merge = new MergeSort();

            sol = (Solution) merge.solve(pr);
            ((Problem) pr).write();
            System.out.println();
            sol.write();
        }
    }

    public ArrayList<Double> askData() {
        ArrayList<Double> data = new ArrayList<>();

        System.out.println("Type the number of elements of the array: ");
        int n = sc.nextInt();

        System.out.println("Type the elements of the array: ");
        for (int i = 0; i < n; ++i) {
            System.out.println ("Element " + (i+1) + ": ");
            Double element = sc.nextDouble();
            data.add(i, element);
        }
        return data;
    }
}
