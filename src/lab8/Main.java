package lab8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(deleteDuplicate(Arrays.asList(1,2,3,4,3,1,2,4)));
        System.out.println(countStrings(Arrays.asList("andrew","andrew","ana","peter"),'a'));
        System.out.println(sortAscending(Arrays.asList(1,2,3,4,3,1,2,4)));
        System.out.println(sortDescending(Arrays.asList(1,2,3,4,3,1,2,4)));
    }

    private static List<Integer> deleteDuplicate (List <Integer> numbers) {
        return numbers
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    private static Integer countStrings (List <String> strings, char letter){
        return Math.toIntExact(
                strings
                        .stream()
                        .filter(string -> string.charAt(0) == letter)
                        .count());
    }

    private static List<Integer> sortAscending (List <Integer> numbers) {
        return numbers
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private static List<Integer> sortDescending (List <Integer> numbers) {
        return numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}