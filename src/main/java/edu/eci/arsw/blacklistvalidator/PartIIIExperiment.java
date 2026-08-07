/*
 * SCRATCH FILE — not part of the lab deliverable, ignored by git.
 * Part III experiments using ONLY the lab's raw Thread implementation:
 * the parallel checkHost(ip, n) timed for n = 1, cores, 2*cores, 50, 100.
 * Watch CPU/memory in VisualVM while this runs.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.List;

public class PartIIIExperiment {

    public static void main(String[] args) {
        String ip = "202.24.34.55"; // dispersed occurrences: forces a full scan
        int cores = Runtime.getRuntime().availableProcessors();
        HostBlackListsValidator validator = new HostBlackListsValidator();

        int[] sizes = {cores, cores * 2, 50, 100, 10000, 50000};
        for (int n : sizes) {
            long start = System.currentTimeMillis();
            List<Integer> found = validator.checkHost(ip, n);
            long ms = System.currentTimeMillis() - start;
            System.out.printf("Hilos: %d, Tiempo: %d ms, Ocurrencias: %d%n", n, ms, found.size());
            System.out.println("  -> lists: " + found);
        }
    }
}
