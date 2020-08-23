package vavylo_project;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			correctTime();
		}
	}

	public static String numberSquare() {
		System.out.println("Введите любую строку с числами:");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		HashSet<Integer> numb = new HashSet<Integer>();
		Matcher m = Pattern.compile("\\d+").matcher(line);
		while (m.find()) {
			numb.add(Integer.parseInt(m.group()));
		}
		for (int n : numb) {
			line = line.replaceAll(Integer.toString(n), Integer.toString(n * n));
		}
		return line;
	}

	public static void correctTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите время для проверки:");
		String timePattern = "([01][0-9]|2[0-3]):([0-5][0-9])";
		String time = sc.nextLine();
		System.out.println(
				Pattern.matches(timePattern, time) ? "Введено корректное время" : "Введено неккоректное время");
	}

}
