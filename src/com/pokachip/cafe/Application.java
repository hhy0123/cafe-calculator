package com.pokachip.cafe;   // 팀 번호에 맞게 변경

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("===== [팀 이름] 식단 계산기 =====");
            // (1) 각자 자기 메뉴 한 줄 추가
            System.out.println("1. 하루 칼로리 합계");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 : ");
            menu = sc.nextInt();

            switch (menu) {
                // (2) 각자 자기 case 블록 추가
                case 1: {
                    System.out.print("디저트 칼로리 : ");
                    int dessert = sc.nextInt();
                    System.out.print("음료 칼로리 : ");
                    int drink = sc.nextInt();
                    System.out.print("토핑 칼로리 : ");
                    int topping = sc.nextInt();

                    PlusCalculator plus = new PlusCalculator();
                    int total = plus.sum(dessert, drink, topping);
                    System.out.println("총 칼로리 : " + total + " kcal");
                    break;
                }
                case 0:
                    System.out.println("계산기를 종료합니다.");
                    break;
                default:
                    System.out.println("없는 메뉴입니다. 다시 선택하세요.");
            }
            System.out.println();

        } while (menu != 0);

    }
}