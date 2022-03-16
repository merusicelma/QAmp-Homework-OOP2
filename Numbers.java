import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {
    Scanner reader = new Scanner(System.in);
    int sizeArray;
    ArrayList<Integer> listOfNumbers;

    public Numbers(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public void setSize() {
        System.out.println("How many elements you want to add?");
        sizeArray = reader.nextInt();
    }

    public void addNumbers() {
        System.out.println("Add numbers:");
        for (int i = 0; i < sizeArray; i++) {
            this.listOfNumbers.add(reader.nextInt());
        }
    }

    public int maxNumberInList() {
        return Collections.max(this.listOfNumbers);
    }

    public int minNumberInList() {
        return Collections.min(this.listOfNumbers);
    }

    public int sumNumbers() {
        int sumOfAllNumbers = 0;
        for (Integer number : listOfNumbers) {
            sumOfAllNumbers = sumOfAllNumbers + number;
        }
        return sumOfAllNumbers;
    }

    public void removeNonPrimes() {
        ArrayList<Integer> listPrimeNumbers = new ArrayList<>();
        for (Integer someNumber : listOfNumbers) {
            if (primeNumber(someNumber)) {
                listPrimeNumbers.add(someNumber);
            }
        }
        listOfNumbers = listPrimeNumbers;
    }


    public boolean primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Number is not prime.");
                return false;
            }
        }
        return true;
    }


}
