//import java.util.Arrays;
import java.util.Random;
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
public class Main {
    public static void main(String[] args) {
     int i = getRandom(0,2000);
     int n = getMostSingBit(i);
     int[] m1 = getMultiples(i, Short.MAX_VALUE, n);
     int[] m2 = getNonMultiples(Short.MIN_VALUE, i, n);
    }

    public static int getRandom(int a, int b) {
        return new Random().nextInt(a,b+1);
    }

    static int getMostSingBit(int number) {
    int n = 0;
    for(; number>1; number>>= 1) n++;
    return n;
    }

    static int[] getMultiples (int a, int b, int c) {
        int arraySize = 0;
        for (int i = a; i <= b; i++) {
            if ((i % c)==0) arraySize++;
        }
        int[] m1 = new int[arraySize];
        for (int i = a, j=0; i <= b; i++) {
            if ((i % c)==0) {
                m1[j] = i;
                j++;
            }
        }
        return m1;
    }

    static int[] getNonMultiples(int a, int b, int c){
        int arraySize = 0;
        for (int i = a; i <= b; i++) {
            if ((i % c)!=0) arraySize++;
            }
        int[] m2 = new int[arraySize];
        for (int i = a, j = 0; i <= b; i++) {
            if ((i % c)!=0) {
                m2[j] = i;
                j++;
            }
        }
        return m2;
    }
}



