import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateList {

    CreateList() {

        // initialize, then add
        List<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(2);

        // init with double brace (фигурная скобка)
        List<Integer> list2 = new ArrayList<>() {{
            add(3);
            add(4);
            add(5);
        }};

        // create immutable (неизменяемый) list with Arrays
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        // create immutable (неизменяемый) list with List
        List<Integer> list4 = List.of(10, 20, 30); // Java 8
        list4.add(12); // UnsupportedOperationException

        // TODO: 01.11.2021 Learn more
        // Java8 stream API
        List<Integer> list5 = Stream.of(40, 50, 60).collect(Collectors.toList());
    }
}
