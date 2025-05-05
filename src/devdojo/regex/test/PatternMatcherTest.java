package devdojo.regex.test;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatcherTest {
    public static void main(String[] args) {
        String regex = "([^A-Z#@!\\|\\*&:,])+@([a-z])+(\\.([a-z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";

        /* Esse método NÃO muda o elemento para que se enquadre no padrão */
        String[] list = text.split(",");

        Arrays.stream(list)
                .filter(item -> item.matches(regex))
                .forEach(item -> System.out.println(item.trim() + "🆗"));

        /* Já esse, adapta o contéudo para que se enquadre no padrão */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.pattern());

        while (matcher.find()){
            System.out.println(matcher.start() + " - " + matcher.group() + " - " + matcher.end());
        }

        String x = "gui";
        x += " morais";

        System.out.println(x);

    }
}
