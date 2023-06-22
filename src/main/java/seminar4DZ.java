import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class seminar4DZ {
    public static void main(String[] args) {
//        Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//        вывод в формате Фамилия И.О. возраст пол
//        добавить возможность выхода или вывода списка отсортированного по возрасту!)
//        *реализовать сортировку по возрасту с использованием индексов
//        *реализовать сортировку по возрасту и полу с использованием индексов
        Boolean run = true;
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<String> lastname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> parentsname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        System.out.println("Введите фио, возраст и пол");
        Scanner in = new Scanner(System.in);
        int i = 0;

        while (run) {
            String str = in.nextLine();

            if (str.equals("Exit")) {
                System.out.println("Exit");
                break;
            }
            String[] fio = str.split(",");
            for (int j = 0; j < fio.length+1; j++) {
                index.add(i);
                lastname.add(fio[0]);
                name.add(fio[1]);
                parentsname.add(fio[2]);
                age.add(Integer.parseInt(fio[3]));
                gender.add(fio[4]);
                i++;
            }
//
                System.out.println(fio);
            }


        }
    }



            



