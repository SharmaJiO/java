import java.util.ArrayList;
public class multidimentional_list {
    public static void main(String args[]) {

        // Creating outer ArrayList (2D structure)
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // Creating first inner ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);   // Adding element 1
        list.add(2);   // Adding element 2

        // Adding first inner list to main list
        mainList.add(list);

        // Creating second inner ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);  // Adding element 3
        list2.add(4);  // Adding element 4

        // Adding second inner list to main list
        mainList.add(list2);

        // Outer loop → Traversing rows
        for (int i = 0; i < mainList.size(); i++) {

            // Getting current inner list (row)
            ArrayList<Integer> currList = mainList.get(i);

            // Inner loop → Traversing columns
            for (int j = 0; j < currList.size(); j++) {

                // Printing element at row i and column j
                System.out.print(currList.get(j) + " ");
            }

            // Move to next line after printing one row
            System.out.println();
        }
        System.out.println(mainList);
    }
}
