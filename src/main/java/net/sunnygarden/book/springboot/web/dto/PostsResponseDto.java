package net.sunnygarden.book.springboot.web.dto;

import lombok.Getter;
import net.sunnygarden.book.springboot.domain.posts.Posts;

@Getter
public class PostsResponseDto {
    private long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
