package Four;

public class Main {

    public static void main(String[] args){
        int x1[] = new int[10];
        int y2[] = new int[10];
        System.out.print("Перший масив : ");
        for (int i = 0; i < 10; i++) {
            x1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(x1[i] + " ");
        }
        System.out.println();
        System.out.print("Другий масив : ");
        for (int i = 0; i < 10; i++) {
            y2[i] = (int) Math.round(Math.random() * 10);
            System.out.print(y2[i] + " ");
        }
        System.out.println();
        System.out.print("Третій масив : ");
        int c3[] = new int[11];
        for (int i=0; i<10;i++) {
            c3[i] = x1[i] + y2[i];
            System.out.print(c3[i]  + " ");
        }
    }
}