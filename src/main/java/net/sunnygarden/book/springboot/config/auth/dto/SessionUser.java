package net.sunnygarden.book.springboot.config.auth.dto;

import lombok.Getter;
import net.sunnygarden.book.springboot.domain.user.User;

@Getter
public class SessionUser {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
