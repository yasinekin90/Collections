package day059;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        List<Integer> numbers =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


        List<Integer>oddNumbers=new ArrayList<>();
        List<Integer>evenNumbers=new ArrayList<>();

        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i)%2==0){
                evenNumbers.add(i);
            }else if(numbers.get(i)%2==1){
                oddNumbers.add(i);
            }
        }

        for (var item:numbers){  //numbers
            System.out.print(item);
        }

        System.out.println();


        Iterator<Integer> iterator = oddNumbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()); //oddnumbers
        }

        System.out.println(evenNumbers); //even numbers

        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i)%2==1){
                numbers.remove(i);
            }
        }

        System.out.println(numbers);

    }
}