import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* PART TWO: Now revise the code to store the pairs of each state and its capital in a Map using the HashMap function.
Display the content of the Map, then use the TreeMap class to sort the map while using a binary search tree for storage.
Next, your program should prompt the user to enter a state, and it should then display the capital for the state.*/

public class main {
    public static void main(String[] args) {
        String[][] statesCapitals =  {
                {"Alabama", "Alaska", "Arizona", "Arkansas",
                        "California", "Colorado", "Connecticut", "Delaware",
                        "Florida", "Georgia", "Hawaii", "Idaho",
                        "Illinois", "Indiana", "Iowa", "Kansas",
                        "Kentucky", "Louisiana", "Maine", "Maryland",
                        "Massachusetts", "Michigan", "Minnesota", "Mississippi",
                        "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire",
                        "New Jersey", "New Mexico", "New York", "North Carolina",
                        "North Dakota", "Ohio", "Oklahoma", "Oregon",
                        "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
                        "Tennessee", "Texas", "Utah", "Vermont", "Virginia",
                        "Washington", "West Virginia", "Wisconsin", "Wyoming"},

                {"Montgomery", "Juneau", "Phoenix", "Little Rock",
                        "Sacramento", "Denver", "Hartford", "Dover",
                        "Tallahassee", "Atlanta", "Honolulu", "Boise",
                        "Springfield", "Indianapolis", "Des Moines", "Topeka",
                        "Frankfort", "Baton Rouge", "Augusta", "Annapolis",
                        "Boston", "Lansing", "St. Paul", "Jackson",
                        "Jefferson City", "Helena", "Lincoln", "Carson City",
                        "Concord", "Trenton", "Santa Fe", "Albany",
                        "Raleigh", "Bismarck", "Columbus", "Oklahoma City",
                        "Salem", "Harrisburg", "Providence", "Columbia",
                        "Pierre", "Nashville", "Austin", "Salt Lake City",
                        "Montpelier", "Richmond", "Olympia", "Charleston",
                        "Madison", "Cheyenne"}
        };


        // Now revise the code to store the pairs of each state and its capital in a Map using the HashMap function.
        HashMap<String, String> hMap = new HashMap<String, String>(statesCapitals[1].length);

        //For loop to assign elements to HashMap.
        for (int i = 0; i < statesCapitals[1].length; i++) {
                hMap.put(statesCapitals[0][i], statesCapitals[1][i]);
        }

        //Display the content of the HashMap. Setting the key and value of the HashMap to equal the states/capitals.
        for(Map.Entry<String, String> mapElement : hMap.entrySet()) {
            String key = mapElement.getKey();

            String value = (mapElement.getValue());

            System.out.println(key + " : " + value);
        }

        System.out.println("Now, you can enter a state. After your entry, the program will tell you the capital. " +
                "Type stop to stop the program.");
        System.out.println("**Please enter the state with the first letter capitalized** (ex. Texas, New York, Ohio):");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*Use the TreeMap class to sort the map while using a binary search tree for storage.
        * NOTE: The treemap is a binary sort tree itself. */
        TreeMap<String, String> tMap = new TreeMap<>(hMap);

        //Initialize scanner for user input and boolean for while loop flow control.
        Scanner keyboard = new Scanner(System.in);
        boolean treeStop = false;

        /*Checking user input to compare against the treemap using the containsKey() method.
        If user enters an actual state, the program will tell them the capital.*/

        while (!treeStop) {
            String userEntry = keyboard.nextLine();
            if (tMap.containsKey(userEntry)){
                System.out.println(tMap.get(userEntry) + " is the capital of " + userEntry);}
            //User can type stop to end the program and exit the loop.
            else if (userEntry.equalsIgnoreCase("stop")){
                treeStop = true;
                System.out.println("Goodbye. Thank you for grading my assignment. Hope you have a nice day.");
                continue;
            }
        }
    }
}


