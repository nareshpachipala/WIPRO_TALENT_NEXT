package oops.MiniProject;

import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();
        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1.Add Videos: 2.Check Out Video : 3.Return Video : 4.Receive Rating : 5.List Inventory : 6.Exit :");
            System.out.print("Enter your choice(1..6): ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String name = sc.nextLine();
                    store.addVideo(name);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    store.doCheckout(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return: ");
                    store.doReturn(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String n = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    store.receiveRating(n, r);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    return;
            }
        }
    }
}
