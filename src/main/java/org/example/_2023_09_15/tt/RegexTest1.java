package org.example._2023_09_15.tt;

public class RegexTest1 {
    private static boolean isIPCorrect(String ip) {
        return true;
    }

    public static void main(String[] args) {
        String ip1 = "127.0.98.966";
        String ip2 = "127.0.8.6";
        System.out.println(isIPCorrect(ip1));
        System.out.println(isIPCorrect(ip2));
    }
}
