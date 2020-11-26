package edu.junior;

/**
 * Author: eukovko
 * Date: 11/23/2020
 */
public class DivisibilityExclusion {

    private int[] numbers;

    public DivisibilityExclusion() {
    }

    public DivisibilityExclusion(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] removeOdd() {
        int j = 0;
        int evenCount = 0;

        int numbersLength = numbers.length;
        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenNumbers = new int[evenCount];

        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[j++] = numbers[i];
            }
        }
        return evenNumbers;
    }

    public int[] removeEven() {
        int countEven = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                countEven++;
            }
        }
        int[] result = new int[countEven];
        int i = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                result[i] = number;
                i++;
            }
        }
        return result;
    }

    public int[] removeEvenOrOdd(boolean odd) {
        if (odd) {
            int[] result = removeOdd();
            return result;
        } else {
            int[] result = removeEven();
            return result;
        }

        // TODO: Remove all odd or even numbers (based on the second argument) from the array with for-each loop
        // throw new UnsupportedOperationException();
    }

    public int[] removeDivisibleByThree() {
        int i = 0;
        int numbersLength = numbers.length;
        int countDivisibleThree = 0;
        while (i < numbersLength) {
            if (numbers[i] % 3 == 0) {
                countDivisibleThree++;
            }
            i++;
        }
        int j = 0;
        i = 0;
        int[] result = new int[numbersLength - countDivisibleThree];
        while (j < numbersLength) {
            if (numbers[j] % 3 != 0) {
                result[i++] = numbers[j];
            }
            j++;
        }
        return result;
    }

    public int[] removeDivisible(int divisor) {
        int count = 0;
        for (int number : numbers) {
            if (number % divisor == 0) {
                count++;
            }
        }
        int resultLength = numbers.length - count;
        int[] result = new int[resultLength];

        int i = 0;
        for (int number : numbers)
            if (number % divisor != 0) {
                result[i++] = number;
            }

        return result;
    }

}