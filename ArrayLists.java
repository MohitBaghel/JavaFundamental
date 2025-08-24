import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        try {

            ArrayList<String> languages = new ArrayList<String>();
            languages.add("Java");// 0
            languages.add("Python"); // 1
            languages.add("Python"); // 1
            languages.add("JavaScript"); // 3
            languages.add("Kotlin");  // 4
            System.out.println(languages);

            languages.add(2, "C++");  // 2

            System.out.println(languages);
            System.out.println("Element at index 2: " + languages.get(2)); // Accessing element at index 2

            languages.remove(3);
            System.out.println(languages);

            System.out.println("Size of the list: " + languages.size()); // Getting the size of the list

            languages.set(1, "C#"); // Setting element at index 1

            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}








// access from by there index, add duplicates


// pre-defined method provides in list
// add() -> adding element to the list
// remove() -> removing element from the list
// get() -> getting element from the list by index
// set() -> setting element at the specified index
// size() -> return the ute, / element count in the list

