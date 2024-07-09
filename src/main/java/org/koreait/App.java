package org.koreait;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {

        int lastId = 0;

        System.out.println("== 명언 앱 실행 ==");

        String cmd;

        List<Motivation> motivations = new ArrayList<>();

        while (true) {
            int id = lastId + 1;
            System.out.print("명령어 ) ");
            cmd = sc.nextLine().trim();

            if (cmd.equals("종료")) {
                System.out.println("== 명언 앱 종료 ==");
                break;
            }

            if (cmd.length() == 0) {
                System.out.println("명령어를 입력하세요. :)");
                continue;
            }

            if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String content = sc.nextLine();
                System.out.print("작가 : ");
                String author = sc.nextLine();

                Motivation motivation = new Motivation(id, content, author);
                motivations.add(motivation);
                System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                lastId++;
            }

            if (cmd.equals("목록")) {
                System.out.println("번호   /    작가    /     명언");
                System.out.println("=".repeat(35));
                if (motivations.size() == 0) {
                    System.out.println("등록된 명언이 없습니다.");
                    continue;
                }
                if (motivations.size() != 0) {
                    for (int i = motivations.size() - 1; i >= 0; i--) {
                        System.out.printf("  %d   /    %s    /     %s\n", motivations.get(i).getId(), motivations.get(i).getAuthor(), motivations.get(i).getContent());
                    }
                }
            }

            if (cmd.startsWith("수정")) {

            }

            if (cmd.startsWith("상세보기")) {

            }

            if (cmd.startsWith("삭제")) {

            }
        }
    }
}
