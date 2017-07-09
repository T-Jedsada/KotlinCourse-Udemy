
public class App {

    public static void main(String[] args) {
        //init value
        UserData userData = UserData.getInstance();
        userData.setFistName("20Scoops");
        userData.setLastName("CNX");

        Example example = new Example();
        example.printFistNameUser();
        example.printLastNameUser();
    }
}

class Example {

    public void printFistNameUser (){
        System.out.println(UserData.getInstance().getFistName());
    }

    public void printLastNameUser (){
        System.out.println(UserData.getInstance().getLastName());
    }
}