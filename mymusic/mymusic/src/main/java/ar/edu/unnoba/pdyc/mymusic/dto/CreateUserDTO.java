package ar.edu.unnoba.pdyc.mymusic.dto;

public class CreateUserDTO {
    private Long id;
    private String email;
    private String password;

    public CreateUserDTO() {
    }

    public CreateUserDTO(Long id ,String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
