import java.util.*;

public class Oct_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();
        sc.nextLine(); // Consume the newline after Q

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < Q; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");

            String operation = parts[0];

            if (operation.equals("JOIN")) {
                int x = Integer.parseInt(parts[1]);
                q.add(x);
            }
            else if (operation.equals("CANCEL")) {
                int x = Integer.parseInt(parts[1]);
                q.remove(Integer.valueOf(x));
            }
            else if (operation.equals("SERVE")) {
                if (q.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(q.poll());
                }
            }
        }

        sc.close();
    }
}
