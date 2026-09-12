package Task11;

import java.util.Collection;
import java.util.Set;

public class TwoKeyMapTester {
    public static void main(String[] args) {
        // 1. Tworzymy naszą dwukluczową mapę ocen
        TwoKeyMap<String, String, Integer> grades = new CompositeTwoKeyHashMap<>();

        // 2. Test stanu początkowego: isEmpty() oraz size()
        System.out.println("--- Testing initial state ---");
        System.out.println("Is map empty? " + grades.isEmpty());
        System.out.println("Initial size: " + grades.size());

        // 3. Test dodawanie elementów: put()
        System.out.println("\n--- Testing put() ---");
        grades.put("Anna", "Nowak", 4);
        grades.put("Jan", "Kowalski", 3);
        grades.put("Stefan", "Żeromski", 5);
        System.out.println("Size after adding elements: " + grades.size());
        System.out.println("Map toString: " + grades);

        // 3b. Test kopiowania map: putAll()
        System.out.println("\n--- Testing putAll() ---");
        TwoKeyMap<String, String, Integer> extraGrades = new CompositeTwoKeyHashMap<>();
        extraGrades.put("Adam", "Kowalski", 5);
        extraGrades.put("Ewa", "Lis", 4);
        grades.putAll(extraGrades);
        System.out.println("Size of map after putAll(): " + grades.size());

        // 4. Test odczytu i sprawdzania zawartości: get(), containsKeys(), containsValue()
        System.out.println("\n--- Testing get() and contains ---");
        System.out.println("Get Anna Nowak: " + grades.get("Anna", "Nowak"));
        System.out.println("Contains keys (Jan, Kowalski)? " + grades.containsKeys("Jan", "Kowalski"));
        System.out.println("Contains value (5)? " + grades.containsValue(5));
        System.out.println("Contains value (2)? " + grades.containsValue(2));

        // 5. Test widoków kolekcji: keySet(), values()
        System.out.println("\n--- Testing keySet() and values() ---");
        Set<Pair<String, String>> keys = grades.keySet();
        Collection<Integer> allValues = grades.values();
        System.out.println("All keys (keySet): " + keys);
        System.out.println("All values: " + allValues);

        // 6. Test pętli for-each i pobierania zestawu wpisów: entrySet(), iterator()
        System.out.println("\n--- Testing iterator and entrySet() ---");
        for (TwoKeyMap.Entry<String, String, Integer> entry : grades) {
            System.out.println("Entry found: " + entry.getKey1() + " " + entry.getKey2() + " -> " + entry.getValue());
        }

        // 7. Test usuwania elementów: remove()
        System.out.println("\n--- Testing remove() ---");
        Integer removedValue = grades.remove("Jan", "Kowalski");
        System.out.println("Value removed for Jan Kowalski: " + removedValue);
        System.out.println("Size after removal: " + grades.size());

        // 8. Test czyszczenia całej mapy: clear()
        System.out.println("\n--- Testing clear() ---");
        grades.clear();
        System.out.println("Size after clear: " + grades.size());
        System.out.println("Is map empty now? " + grades.isEmpty());
    }
}