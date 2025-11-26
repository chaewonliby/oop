package Homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Map<String, String> users = new HashMap<>();
        users.put("myId", "myPass");
        users.put("myId2", "myPass2");
        users.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id 와 password 를 입력해주세요.");
            System.out.print("id : ");


            String id = sc.nextLine().trim();


            if (!users.containsKey(id)) {
                System.out.println("입력하신 id 는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;   // 다시 처음부터
            }

            System.out.print("password : ");
            String password = sc.nextLine().trim();  // 공백 제거


            if (!users.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println();
            } else {
                System.out.println("id 와 비밀번호가 일치합니다");
                break;
            }
        }

        sc.close();
    }
}

