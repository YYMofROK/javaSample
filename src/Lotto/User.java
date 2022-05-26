package Lotto;

import java.util.*;

public class User {

    private List<Integer> numbers;
    public List<Integer> getNumber()
    {
        return this.numbers;
    }
    public void makeNumber(){
        Scanner scanner = new Scanner(System.in);
        try{
            numbers = new ArrayList<Integer>();
            Set<Integer> set = new HashSet<Integer>();
            String number = "";
            while (true)
            {
                System.out.println("1 에서 45 사이의 정수를 입력하시오." + "("+set.size()+"/6)");
                number = scanner.next();

                if(( Integer.valueOf(number) > 0 ) && ( Integer.valueOf(number) <46 ))
                {
                    set.add(Integer.valueOf(number));
                }
                if( 6 == set.size())
                {
                    System.out.println("6 개의 숫자를 입력하셨습니다.");
                    break;
                };
            }
            numbers.addAll(set);
            numbers.sort(Comparator.naturalOrder());
            System.out.println();
        } finally {
            scanner.close();
        }
    }

}
