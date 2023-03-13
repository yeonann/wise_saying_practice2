package io.babyLion.wiseSaying;

public class WiseSay {

    private int id;
    private String content;
    private String authorName;

    public WiseSay(int id, String content, String authorName) {
        this.id = id;
        this.content = content;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }
}
