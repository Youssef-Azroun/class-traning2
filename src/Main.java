import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    person p1 = new person("Youssef","12345", 25);
    person p2 = new person("Alaa","67896",22);
    person p3 = p1;
        ArrayList<person> persons= new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        for(person p:persons){
            System.out.println(p);

        }


    }
}