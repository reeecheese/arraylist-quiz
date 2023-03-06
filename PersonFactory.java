import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;
    private ArrayList<Person> under18s;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        for(int i = 0; i < allPersons.size();){
            Person alp = new Person("","", 0);
            alp = allPersons.get(i);
            if (person.getlastName().compareTo(alp.getlastName()) == 1){
                i++;
            }else{
                allPersons.add(i, person);
                return;
                }}}

    public ArrayList<Person> under18() {
        Person alp = new Person("","", 0);
        for (int i = 0; i < allPersons.size(); i++){
            alp = allPersons.get(i);
            if(alp.getAge()>18){
                under18s.add(alp);
            }
        }
        return under18s;
    }

    public boolean checkLastName(String lastName) {

    }
}
