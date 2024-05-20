package assignment;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        createMenu();
    }

    public static void createMenu() {
        Scanner scanner = new Scanner(System.in);
        PostController postController = new PostController();
        while (true) {
            System.out.println("Post Management Program");
            System.out.println("=============================");
            System.out.println("1. Create new post");
            System.out.println("2. Show recent posts");
            System.out.println("3. Search a post by id");
            System.out.println("4. Delete a post by id");
            System.out.println("0. Exit");
            System.out.println("=============================");
            System.out.println("Please choose from 0-4");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    postController.createPost();
                    break;
                case 2:
                    postController.showPostList();
                    break;
                case 3:
                    postController.searchPost();
                    break;
                case 4:
                    System.out.println("In development");
                    break;
                case 0:
                    System.out.println("Goodbye, see you again!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose from 0-4");
            }
            // Kết thúc chương trình
            if (choice == 0){
                break;
            }
        }
    }
}
