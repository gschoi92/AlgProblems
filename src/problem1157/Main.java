// ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
//
// ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
//
// ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.


package problem1157;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    scanner.close();
    int[] countArray = new int[26];

    // count letters and store them to countArray
    for (int i = 0; i < str.length(); i++) {
      if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
        int x = str.charAt(i) - 'A';
        countArray[x]++;
      } else {
        int x = str.charAt(i) - 'a';
        countArray[x]++;
      }
    }
    // search the biggest number in count Array
    int temp = -1;
    char index = '?';
    for (int i = 0; i < countArray.length; i++) {
      if (temp < countArray[i]) {
        index = (char) i;
        temp = countArray[i];
      } else if (temp == countArray[i]) {
        temp = countArray[i];
        index = '?';
      }
    }
    if (index != '?')
      System.out.println((char)(index + 'A'));
    else
      System.out.println(index);
  }
}
