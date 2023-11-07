public class ChangeCalculator {

    public static void giveChange(int number){
        int countFive = 0;
        int countTwo = 0;
        int countOne = 0;

        while (number >= 5){
            number = number - 5;
            countFive++;
        }

        while (number >= 2){
            number = number - 2;
            countTwo++;
        }

        while (number > 0){
            number = number - 1;
            countOne++;
        }

        System.out.println("Change: " + countFive + " fives " + countTwo + " twos " + countOne + " ones");
    }

    public static void main(String[] args){
        giveChange(18);
    }
}
