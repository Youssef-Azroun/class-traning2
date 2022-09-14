public class person {
    String name;
    String phoneNumber;
    int age;

    public person(String name,String phoneNumber,int age){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.age=age;

    }

    public String toString(){
        return this.name+" "+this.phoneNumber +" " + this.age;
    }
}
