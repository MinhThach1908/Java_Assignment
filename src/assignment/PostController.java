package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    ArrayList<Post> posts = new ArrayList<Post>();
    Scanner scanner = new Scanner(System.in);

    // 1. Thêm mới bài viết
    public void createPost() {
        System.out.println("Creating a new post...");
        System.out.println("------------------------------");
        // Yêu cầu nhập thông tin
        System.out.println("Please enter post's information.");
        System.out.println("Enter post's id: ");
        long postId = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter post's title: ");
        String postTitle = scanner.nextLine();
        System.out.println("Enter post's description: ");
        String description = scanner.nextLine();
        System.out.println("Enter avatar's image (You can enter the image link or URL): ");
        String avatar = scanner.nextLine();
        System.out.println("Enter post's main content about: ");
        String mainContent = scanner.nextLine();
        System.out.println("Enter post's author name: ");
        String authorName = scanner.nextLine();
        System.out.println("Enter post's writing date: ");
        String writingDate = scanner.nextLine();
        // Tạo đối tượng post mới từ thông tin được nhập
        Post post = new Post();
        post.setPostId(postId);
        post.setPostTitle(postTitle);
        post.setDescription(description);
        post.setAvatar(avatar);
        post.setMainContent(mainContent);
        post.setAuthorName(authorName);
        post.setWritingDate(writingDate);
        // Đưa post vào list
        posts.add(post);
        System.out.println("Saved Successfully");
    }

    // 2. Hiển thị danh sách bài viết
    public void showPostList() {
        System.out.println("Showing list of the posts have been entered...");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-10s ||%-30s ||%-30s ||%-30s ||%-30s ||%-30s ||%-30s\n", "Id", "Title", "Description", "Avatar", "Main Content", "Author", "Writing Date");
        System.out.println("====================================================================================================================================================");
        for (int i = 0; i < posts.size(); i++) {
            Post p = posts.get(i);
            System.out.printf("%-10s ||%-30s ||%-30s ||%-30s ||%-30s ||%-30s ||%-30s\n", p.getPostId(), p.getPostTitle(), p.getDescription(), p.getAvatar(), p.getMainContent(), p.getAuthorName(), p.getWritingDate());
        }
        System.out.println("Please press the enter button to continue.");
        scanner.nextLine();
    }
}
