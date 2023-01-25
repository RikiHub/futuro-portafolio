import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SwichtPatternMatchDemo {


    public static void main(String[] args) {



        List<String> colors = new ArrayList<>();
//        colors.add(0, "Ricardito");
//        colors.add(1, "Alejandro");
//        colors.add(2, "Yilena");
//        colors.add(3, "Marilyn");
//        System.out.println(colors);
//        for (int i=0; i < colors.size(); i++){
//          String color = colors.get(i);
//          System.out.println(color);
//        }
//        for (String color : colors) {
//            System.out.println(color);
//        }

        colors = Arrays.asList("Red","White","Black","Blue","Yellow","Blue","Red","White");
        colors.stream().sorted().forEach(System.out::println);

        colors.forEach(color -> {
            System.out.println(color.equalsIgnoreCase('\r'+"white"));
        });

        for (String color:colors) {
            String colorIgual = "White";
            System.out.println('\r'+"*************" + color.equals(colorIgual));
        }

        colors.stream().filter(color->color.equals("Blue")).collect(Collectors.toList()).forEach(System.out::println);


        Stream.of("a","b","c","d","e").parallel().forEach(System.out::println);
    }
}
