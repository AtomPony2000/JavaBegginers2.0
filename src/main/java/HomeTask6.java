import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class HomeTask6 {
    public static void main(String... args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get("src/main/resources/home6")));
        String str[] = content.split(" ");
        List<String> list;
        list = asList(str);
        Collections.sort(list);
        System.out.println("Отсортированный список: ");

        Map<String, List<String>> collect = list.stream().collect(Collectors.groupingBy(o -> o));
        System.out.println("Тут у нас колличество вхождений: ");
        collect.forEach((s, strings) -> System.out.println(s + " : " + strings.size()));
        Optional<Map.Entry<String, List<String>>> max = collect.entrySet().stream().max(Comparator.comparing(stringListEntry -> stringListEntry.getValue().size()));
        System.out.println("МАКСИМАЛЬНОЕ ЗНАЧЕНИЕ ПРИСУЖДАЕТСЯ!!!!!!!!! ------> " + max.get().getKey() + " : " +  max.get().getValue().size());

    }
}

