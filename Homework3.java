import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받을 정수의 개수
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int count = scanner.nextInt();

        // 입력받은 개수만큼 배열 생성
        int[] numbers = new int[count];

        // 정수 입력받아 배열에 저장
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 첫 번째 요소를 기준으로 최대값과 최소값 초기화
        int max = numbers[0];
        int min = numbers[0];

        // 나머지 배열 요소를 탐색하며 최대값과 최소값 갱신
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}