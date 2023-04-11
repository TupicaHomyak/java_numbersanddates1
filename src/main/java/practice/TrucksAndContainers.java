package practice;
import java.util.Scanner;
public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();  //получение количество коробок от пользователя
        int containers = 1;
        int trucks = 1;

        if (boxes == 0){
            containers = 0;
            trucks = 0;
            System.out.println("Необходимо:");

            System.out.println("грузовиков - " + trucks + " шт.");
            System.out.println("контейнеров - " + containers + " шт.");
        }
        if (boxes != 0){
            System.out.println("Грузовик: " + trucks);
            System.out.println("\tКонтейнер: " + containers);

            for(int i = 1; i <= boxes; i++) {
                System.out.println("\t\tЯщик: " + i);
                if (i % 324 == 0) {
                    trucks++;
                    System.out.println("Грузовик: " + trucks);
                }
                if (i % 27 == 0) {
                    if (boxes == 27 ){
                        break;
                    }
                    if (boxes != 27 ) {
                        containers++;
                        System.out.println("\tКонтейнер: " + containers);
                    }
                }
            }

            System.out.println("Необходимо:");

            System.out.println("грузовиков - " + trucks + " шт.");
            System.out.println("контейнеров - " + containers + " шт.");
        }
    }
}
