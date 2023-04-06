/**
 * Your Mother has N bags containing chocolates (ith bag contains ar[i] chocolates).
 * She wants to distribute these bags between you and your sister in such a way that
 * there is an absolute minimum difference between the total number of chocolates each
 * of you gets.
 * <p>
 * Write a program to help your mother do this distribution easily.
 * </p>
 * Input
 * - The first line of input contains an integer N, representing the number of bags.
 * - The second line of input contains N space-separate integers, representing the number
 * of chocolates in each bag.
 * <p>
 * Output
 * The minimum absolute difference between the total number of chocolates you and your sister have.
 * </p>
 * Constraints
 * 1<=N<=50
 * 1<=ar[i]<=60
 *
 */

import java.util.*;
import java.io.*;

public class Test7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_FILE_PATH")));
        bufferedWriter.write("\n");
        bufferedWriter.close();
        bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_FILE_PATH"), true));
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = new ArrayList<>();

        String[] artempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(artempItems[i]);
            ar.add(arItem);
        }

        int outcome = Outcome.solve(ar);

        bufferedWriter.write(outcome + "\n");

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static class Outcome {
        public static int solve(List<Integer> ar) {
            int s = 0;
            for (int a : ar) {
                s = s + a;
            }
            List<Integer> ns = new ArrayList<>();
            g(ar, 0, 0, 0, ns);
            int result = 0;
            int n = ns.size();
            for (int i = 0; i <= n / 2; i++) {
                result = Math.min(result, Math.abs(s - ns.get(i) - ns.get(i)));
            }
            return result;
        }

        public static void g(List<Integer> ns, int i, int j, int s, List<Integer> list) {
            if (j == ns.size() / 2) {
                list.add(s);
                return;
            }
            if (i == ns.size()) return;
            g(ns, i + 1, j + 1, s + ns.get(i), list);
            g(ns, i + 1, j, s, list);

        }
    }

}

