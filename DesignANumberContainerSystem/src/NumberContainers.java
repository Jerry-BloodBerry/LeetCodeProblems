import java.util.HashMap;
import java.util.TreeSet;

class NumberContainers {
    private final HashMap<Integer, TreeSet<Integer>> numberIndexes = new HashMap<>();
    private final HashMap<Integer, Integer> numbers = new HashMap<>();

    public NumberContainers() {
    }

    public void change(int index, int number) {
        if (numbers.containsKey(index)) {
            numberIndexes.get(numbers.get(index)).remove(index);
        }
        numbers.put(index, number);
        numberIndexes.putIfAbsent(number, new TreeSet<>());
        numberIndexes.get(number).add(index);
    }

    public int find(int number) {
        if (numberIndexes.containsKey(number) && !numberIndexes.get(number).isEmpty()) {
            return numberIndexes.get(number).first();
        }
        return -1;
    }
}