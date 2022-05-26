package Lotto;

public class Lotto {

    public static void main(String[] args) {

        User user = new User();
        user.makeNumber();

        Com computer = new Com();
        computer.makeNumber();

        int lottoCnt = computer.checkLotto(user);
        System.out.println("사용자 입력 숫자 : " + user.getNumber());
        System.out.println("컴퓨터 생성 숫자 : " + computer.getNumber());
        System.out.println(lottoCnt);

    }

}
