import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double groupFirst = scanner.nextDouble();
        double groupSc = scanner.nextDouble();
        double groupTd = scanner.nextDouble();
        
        groupFirst = groupFirst / 2;
        groupSc = groupSc / 2;
        groupTd = groupTd / 2;
        Math.ceil(groupFirst);
        Math.ceil(groupSc);
        Math.ceil(groupTd);
        
        double sum = Math.ceil(groupFirst) + Math.ceil(groupSc) + Math.ceil(groupTd);
        int value = (int)Math.round(sum);
        System.out.println(value); 
    }
}
