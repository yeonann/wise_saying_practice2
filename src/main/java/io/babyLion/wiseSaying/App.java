package io.babyLion.wiseSaying;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        int number = 0;
        List<WiseSay> wiseSays = new ArrayList<>();

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                int id = number + 1;
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String authorName = sc.nextLine().trim();
                System.out.printf("%d번 명언이 등록되었습니다.\n", id);

                wiseSays.add(new WiseSay(id, content, authorName));
                number = id;
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(20));

                for (WiseSay wisesay : wiseSays) {
                    System.out.printf("%d / %s / %s\n", wisesay.getId(), wisesay.getAuthorName(), wisesay.getContent());
                }


            }
        }
    }
}
