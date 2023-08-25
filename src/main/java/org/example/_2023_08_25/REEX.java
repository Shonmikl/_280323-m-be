package org.example._2023_08_25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REEX {

    public static void main(String[] args) {
        String s = "La prisión del condado de Fulton, en Georgia, " +
                "ha hecho historia este jueves. En esta " +
                "cárcel, cuyas condiciones@gmail.com para los " +
                "presos@yahoo.com son tan peligrosas que se encuentra bajo " +
                "una investigación oficial, ha comparecido el " +
                "expresidente de Estados Unidos Donald Trump para " +
                "quedar fichado como imputado por, entre otras cosas, " +
                "liderar una asociación de tipo mafioso para alterar " +
                "los resultados de las elecciones de 2020@yahoo.ru " +
                "en ese Estado";

        String pat = "\\w+@\\w+\\.(com|ru)";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
