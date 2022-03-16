import java.util.ArrayList;


public class Main1 {
    public static void main(String[] args) {


        ArrayList<Integer> listOfNumbers = new ArrayList();
        Numbers myNumbers = new Numbers(listOfNumbers);

        myNumbers.setSize();
        myNumbers.addNumbers();

        System.out.println("The maximum number is: " + myNumbers.maxNumberInList());
        System.out.println("The minimum number is: " + myNumbers.minNumberInList());
        System.out.println("Sum of all numbers is: " + myNumbers.sumNumbers());
//        System.out.println("Prime numbers are: " + myNumbers.primeNumber());
    }
}

