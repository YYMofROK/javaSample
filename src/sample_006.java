
import java.util.Scanner;
import java.util.Random;

public class sample_006 {

    public static int userSelect = 0;
    public static String[] RPS = new String[3];

    public static void main(String[] args)
    {
        System.out.println("가위바위보 게임 시작");

        RPS[0]	=	"가위";
        RPS[1]	=	"바위";
        RPS[2]	=	"보";

        while(true)
        {
            func_rps();
        }
    }

    public static void func_rps()
    {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("가위(0)바위(1)보(2) 를 숫자로 선택하시오 :");
        userSelect= sc.nextInt();

        switch( userSelect )
        {
            case 0:
            case 1:
            case 2:

                System.out.println("당신의 선택은 " + RPS[userSelect] + "입니다.");
                Random rand = new Random();
                int computerSelect = rand.nextInt(2);
                System.out.println("기계의 선택은 " + RPS[computerSelect] + "입니다.");

                func_judgment(userSelect, computerSelect);

                break;
            default:
                System.out.println("비 정상적인 입력 입니다.");
        }
    }

    public static void func_judgment(int userValue, int computerValue)
    {
        if( userValue == 0 )
        {
            switch(computerValue)
            {
                case 0:
                    System.out.println("무승부");
                    break;
                case 1:
                    System.out.println("기계 승리");
                    break;
                case 2:
                    System.out.println("당신의 승리");
                    break;
            }
        }


        if( userValue == 1 )
        {
            switch(computerValue)
            {
                case 0:
                    System.out.println("당신의 승리");
                    break;
                case 1:
                    System.out.println("무승부");
                    break;
                case 2:
                    System.out.println("기계 승리");
                    break;
            }
        }


        if( userValue == 2 )
        {
            switch(computerValue)
            {
                case 0:
                    System.out.println("기계 승리");
                    break;
                case 1:
                    System.out.println("당신의 승리");
                    break;
                case 2:
                    System.out.println("무승부");
                    break;
            }
        }

    }

}