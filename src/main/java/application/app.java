package application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class app {

    public static void main(String[] args) throws IOException {

        System.out.println("Printing all ID's and details of object in Map which has chosen name. ");
        System.out.println("Choose name:  ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String checkName = br.readLine();

        Person person1 = new Person("Dawid", "Kulikowski", "28");
        Person person2 = new Person("Dawid", "Nowak", "32");
        Person person3 = new Person("Lukasz", "Kulikowski", "29");
        Person person4 = new Person("Tomek", "Nowak", "47");
        Person person5 = new Person("Damian", "Kulikowski", "52");
        Person person6 = new Person("Lukasz", "Nowak", "65");
        Person person7 = new Person("Michal", "Kowalski", "23");
        Person person8 = new Person("Damian", "Nowak", "35");
        Person person9 = new Person("Dawid", "Kowalski", "30");


        Map<Integer,Person> personMap = new HashMap<>();
        personMap.put(3005,person1);
        personMap.put(1203,person2);
        personMap.put(2711,person3);
        personMap.put(2022,person4);
        personMap.put(1995,person5);
        personMap.put(1994,person6);
        personMap.put(3690,person7);
        personMap.put(9999,person8);
        personMap.put(3366,person9);

        System.out.println("Print ID with name: " + checkName);

       Set<Map.Entry<Integer, Person>> entrySet = personMap.entrySet();
        for (Map.Entry<Integer,Person> entry : entrySet){
            if(checkName.equalsIgnoreCase(entry.getValue().name)) {
                System.out.println("ID is: " + entry.getKey()+" Values: " + entry.getValue().toString());
            }
        }

    }


}
