package application;

import entities.Comment;
import entities.Post;

import java.net.DatagramSocket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args){
        DateTimeFormatter formatOne = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Post post1 = new Post(LocalDate.parse("29/04/2019", formatOne), "Text Post Here", "Description Post Here", 12);
        Comment c1 = new Comment("Comment One Here");
        Comment c2 = new Comment("Comment two Here");

        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1);


    }
}
