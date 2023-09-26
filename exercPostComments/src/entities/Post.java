package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
    //Attributs
    private LocalDate moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> listComment = new ArrayList<>();

    //Constructors
    public Post(){
    }
    public Post(LocalDate moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    //Getters and Setters
    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    //Methods
    public void addComment(Comment comment){
        listComment.add(comment);
    }
    public void removeComment(Comment comment){
        listComment.remove(comment);
    }
    @Override
    public String toString(){
        StringBuilder newToString = new StringBuilder();
        newToString.append(moment + "\n");
        newToString.append(title + "\n");
        newToString.append(content + "\n" + likes + "Likes" + "\n");

        for (Comment comment : listComment) {
            newToString.append(comment + "\n");
        }
        return newToString.toString();
    }
}

