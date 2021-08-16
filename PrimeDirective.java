import java.util.ArrayList;     //importing ArrayList java utility

class PrimeDirective {

  //creating a boolean method to check if a number is prime or not
  public boolean isPrime(int number) {

    //primes are greater than 1, so if the number is equal to 2, it is prime because 2 is only divisible by 1 and itself
    if(number == 2) {
      return true;
    }
    //if the number is less than 2, it is not prime. This includes 1 because all numbers are divisble by 1 anyway so we don't neccessarily need to check that condition
    else if (number < 2) {
       return false;
    }
    //finally, for all other numbers, we go through the for loop
    else {
      //we initialize i to 2, and as long as 2 is smaller than the number passed into the function, we check if that number is divisible by 2. If it is, then it is not a prime number and we return false
      for (int i = 2; i < number; i++) {
      if(number % i == 0 ) {
        return false;
      }
    }
    //if the number is not divisible by 2, then we return true because it is a prime number
    return true;
    }
  }

  //creating another method which returns an ArrayList of Integers by taking in an array of integers as its argument
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    //creating a new empty ArrayList to store all prime numbers
    ArrayList<Integer> primes = new ArrayList<Integer>();
    //using a for-each loop to iterate through each number of the array
    for (Integer number : numbers) {
      //if isPrime method returns true for the number passed in from the array of integers
      if (isPrime(number)) {
        //then we add that number to the ArrayList (called primes)
        primes.add(number);
      }
    }
    //after going through each number in the array and adding all the primes to the ArrayList, we return the ArrayList (primes, in this case)
    return primes;
  }

  //main method to test our methods
  public static void main(String[] args) {

    //creating a new instance of the class PrimeDirective
    PrimeDirective pd = new PrimeDirective();
    //declaring and initializing an array of numbers (ints)
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    //to test out the isPrime method
    System.out.println("\n----- True or False -----");

    System.out.println("7 is prime: " + (pd.isPrime(7)));
    System.out.println("28 is prime: " + (pd.isPrime(28)));
    System.out.println("2 is prime: " + (pd.isPrime(2)));
    System.out.println("0 is prime: " + (pd.isPrime(0)));

    //to test out the onlyPrimes method on the numbers array
    System.out.println("\n----- Primes ArrayList -----");
    System.out.println(pd.onlyPrimes(numbers));
  }

}
