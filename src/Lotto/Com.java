package Lotto;

import java.util.*;

public class Com {
    private List<Integer> numbers;

    public List<Integer> getNumber(){
        return this.numbers;
    }
    public void makeNumber(){
        Scanner scanner = new Scanner(System.in);
        try{
            numbers = new ArrayList<Integer>();
            Set<Integer> set = new HashSet<Integer>();
            int number = 0;
            while (true)
            {
                number = (int)(Math.random()*46) + 1;
                if(( number > 0 ) && ( number <46 ))
                {
                    set.add(Integer.valueOf(number));
                }
                if( 6 == set.size())
                {
                    System.out.println("6 개의 숫자를 입력하셨습니다.");
                    break;
                }
            }
            numbers.addAll(set);
            numbers.sort(Comparator.naturalOrder());
            System.out.println();
        } finally {
            scanner.close();
        }
    }

    public int checkLotto(User user)
    {
        List<Integer> userNumber = user.getNumber();
        int LottoCnt = 0;
        for(Integer comNumber : this.numbers)
        {
            if( userNumber.contains(comNumber))
            {
                LottoCnt = LottoCnt + 1;
            }
        }

        return LottoCnt;
    }


}
