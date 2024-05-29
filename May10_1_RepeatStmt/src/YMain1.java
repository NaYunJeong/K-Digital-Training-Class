import java.util.Scanner;

// 평일 스케쥴 출력해주는 프로그램(함수사용)

// 시간을 입력받아서 (24시간 단위) => 해당시간에 속하는 내용을 출력
//	 	=> (입력한 시간이) 시간 범위가 아니면 다시 입력

// 오전 9시 ~ 오후 6시 : 학원에서 공부
// 오전 9시, 오후 2시, 오후 6시 : QR찍기
// 오후 1시 ~ 오후 2시 전까지: 점심시간
// 오후 6시 넘어서 ~ 오후 8시 : 집에 가는 시간
// 오전 6시 ~ 오전 9시 전까지 : 기상 + 씻기 + 학원가기
// 오후 8시 넘어서 ~ 오전 6시 전까지 : 여가시간 + 취침

public class YMain1 {

	public static void startProgram() {
		System.out.println("▷▷▷  스케쥴 프로그램을 시작합니다!  ◁◁◁");
	}
	public static int getHour() {
		Scanner k = new Scanner(System.in);
		System.out.print("시간 입력(00 ~ 23) : ");
		int hour = k.nextInt();
		if (!(hour >= 0 && hour <= 23)) {
			System.err.printf("%02d시는 없습니다. 다시 입력하세요.\n", hour);
		}
		return (hour >= 0 && hour <= 23) ? hour : getHour();
	}
	public static String noticeSchedule(int hour) {
		String schedule = "";
		if (hour >= 9 && hour <= 18) {
			schedule = "학원에서 공부";
			if (hour == 9 || hour == 14 || hour == 18) {
				schedule = "QR찍기";
			} else if (hour >= 13 && hour < 14) {
				schedule = "점심";
			}
		} else if (hour > 18 && hour <= 20) {
			schedule = "집에 가기";
		} else if (hour >= 6 && hour < 9) {
			schedule = "기상 + 씻기 + 학원가기";
		} else {
			schedule = "여가 + 취침";
	    } 
		return schedule;
	}
	public static void printResult(int h, String s) {
		System.out.printf("%d시는 [%s] 시간입니다.\n", h, s);
	}
	public static void main(String[] args) {
		startProgram();
		int hour = getHour();
		String schedule = noticeSchedule(hour);
		printResult(hour, schedule);
	}
}
