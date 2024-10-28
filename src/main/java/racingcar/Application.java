package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try{
            startGame();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void startGame()  {
        printStartMessage();
        String input = getCarNamesInput().replaceAll(" ","");
        validateEmptyInput(input);
        String[] names = splitWithComma(input);
    }

    public static void printStartMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printTryCountMessage() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public static String getCarNamesInput() {
        return Console.readLine();
    }

    public static void validateEmptyInput(String input) {
        if(input.isEmpty()) {
            throw new IllegalArgumentException("정확한 값을 입력해 주세요.");
        }
    }

    public static String[] splitWithComma(String input) {
        return input.split(",");
    }
}
