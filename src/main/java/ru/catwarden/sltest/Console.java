package ru.catwarden.sltest;

import java.util.Scanner;

public class Console {
    private Scanner scanner;
    private Controller controller;

    public Console(Scanner scanner, Controller controller) {
        this.scanner = scanner;
        this.controller = controller;

    }

    public void show_ui(){
        boolean running = true;

        while(running) {
            System.out.println("Поздравлятор 1.0");
            show_current_birthday();
            show_upcoming_birthday();
            System.out.println("Введите команду:");
            System.out.println("1. Показать текущие и ближайшие ДР");
            System.out.println("2. Показать все ДР");
            System.out.println("3. Добавить новый ДР");
            System.out.println("4. Удалить ДР");
            System.out.println("5. Изменить ДР");
            System.out.println("0. Выйти");

            String cmd = scanner.nextLine();

            switch (cmd){
                case "0":
                    running = false;
                    break;

            }
        }
    }


    public void show_current_birthday(){
        System.out.println("Список текущих ДР:");
    }

    public void show_upcoming_birthday(){
        System.out.println("Список ближайших ДР:");

    }
}
