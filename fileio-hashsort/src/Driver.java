import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {

        public static HashMap<String, ArrayList<Integer>> sort(ArrayList<String> arr) {

            HashMap<String, ArrayList<Integer>> myMap = new HashMap<>();

            for (int i = 0; i < arr.size(); i++) {
                if (myMap.containsKey(arr.get(i))) {
                    myMap.get(arr.get(i)).add(i);
                } else {
                    ArrayList<Integer> tempList = new ArrayList<>();
                    tempList.add(i);
                    myMap.put(arr.get(i), tempList);
                }
            }

            return myMap;

        }


        public static void main(String[] args) throws FileNotFoundException {

            String fileName = "text.txt";

            File inputFile = new File(fileName);
            Scanner input = new Scanner(inputFile);

            ArrayList<String> bigArray = new ArrayList<>();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] arr = line.split(" ");
                for (String s : arr) {
                    bigArray.add(s);
                }
            }

            HashMap<String, ArrayList<Integer>> bigMap = sort(bigArray);

            for (String x : bigMap.keySet()) {
                System.out.println(x + ": " + bigMap.get(x));
            }

        }

    }


