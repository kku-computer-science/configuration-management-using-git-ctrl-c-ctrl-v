import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("กรุณาป้อนชุดตัวเลขที่ต้องการเรียงลำดับ (คั่นด้วยช่องว่าง, เช่น: 5 1 9 3)");
            System.out.print("Input: ");
            String inputLine = scanner.nextLine();

            String[] strArray = inputLine.trim().split("\\s+");
            int[] array = new int[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                array[i] = Integer.parseInt(strArray[i]);
            }

            System.out.println("\nกรุณาเลือก Algorithm ที่จะใช้:");
            System.out.println("1. Quick Sort");
            System.out.println("2. Bubble Sort");
            System.out.print("เลือก (1 หรือ 2): ");
            
            int choice = scanner.nextInt();
            System.out.println("-------------------------");

            switch (choice) {
                case 1:
                    QuickSort.Sort(array);
                    break;
                case 2:
                    BubbleSort.bubbleSort(array);
                    break;
                default:
                    System.out.println("Error: กรุณาเลือกแค่ 1 หรือ 2 เท่านั้น");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: กรุณาใส่ข้อมูลเป็นตัวเลขจำนวนเต็มเท่านั้น");
        } catch (Exception e) {
            System.out.println("Error: เกิดข้อผิดพลาด " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
