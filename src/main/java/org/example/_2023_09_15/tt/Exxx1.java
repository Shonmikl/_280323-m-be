package org.example._2023_09_15.tt;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exxx1 {
    /**
     * * Разберитесь с
     * * HTML-кодом и извлеките все ссылки (теги <a>) с их атрибутами href.
     */

    private static List<String> parseXML(String html) {
        List<String> list = new ArrayList<>();
        //<a href="https://www.w3.org/">W3C</a>
        String regex = "<a\\s+[^>]*?href\\s*=\\s*\"([^\"]*)\"[^>]*>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            String str = matcher.group();
            list.add(str);
        }

        return list;
    }

    public static void main(String[] args) {
        String s = "<a href=\"https://www.w3.org/\">W3C</a>";
        List<String> list = parseXML(s);
        for (String string : list) {
            System.out.println(string);
        }
    }
}
