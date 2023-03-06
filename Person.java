public class Person {

    private String firstName;
    private String lastName;
    private int age;

    //1
    Person(String fN, String lN, int ag){
        firstName = fN; lastName = lN; age = ag;
    }

    //2 3 getters/setter
    public String getfirstName(){
        return firstName;}
    public String getlastName(){
        return lastName;}
    public int getAge(){
        return age;}

    public void setLastName(String n){ lastName = n; }
    public void setFirstName(String n){ firstName = n; }
    public void setAge(int n){ age = n; }

    //4
    public String toString(){
        return "first name: " + firstName + "   last name: " + lastName + "  age: " + age;
    }

}
