package Module2;

/**
 * Created by Artem on 24.11.2015.
 * �������� "���������� ���������"

 public class BubbleSorter {
 public static void sort(int[] arr) {
 for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
 for (int index = 0; index < barrier; index++) {
 if (arr[index] > arr[index + 1]) {
 int tmp = arr[index];
 arr[index] = arr[index + 1];
 arr[index + 1] = tmp;
 }
 }
 }
 }
 }
 ��������� �������� � �����������.
 � ������ ������ �������� ��������, ��� ������� �� ������ ������� "���������" ����� ������� �������.
 ���������� �������� �� �����, ��� ������� "�����" ����� ��������� �������.
 ������� ���������� ������ ����������� - �� �����������.
 �������� ������ ������������ ������ - ������. �������� - ������, ����� - �����.
 ���� �� ������� �� ������� �����, ������ - �� ������� �� ������.
 � ������� �� 6 ��������� ������ ������������ (� � ������ �������� ��������������)
 ���� 4-5 3-4 2-3 1-2 0-1 4-5 3-4 2-3 1-2 4-5 3-4 2-3 4-5 3-4 4-5
 */
public class Lab14 {
    public static void main(String[] args) {
        int [] array1 = {3, 1, 2, 5, -2};
        sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
    public static void sort(int[] arr) {
        if (arr.length == 1)
        {
            return;
        }
        else {
            for (int barrier = 0; barrier < arr.length; barrier++) {
 //               System.out.println("first " + barrier);
                for (int index = arr.length - 1; index >= barrier; index--) {
 //                   System.out.println("1" + index);
                    if (index == 0) {
                        break;
                    } else {
                        if (arr[index] < arr[index - 1]) {
                            int tmp = arr[index];
                            arr[index] = arr[index - 1];
                            arr[index - 1] = tmp;
                        }
                    }
//                    System.out.println("2" + barrier);
                }
            }
        }

    }
}

