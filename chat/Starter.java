package ru.makarov.chat;

import ru.makarov.chat.client.Client;
import ru.makarov.chat.server.Server;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите запуск сервера S или клиента C");
        while (true) {
            char answer = Character.toLowerCase(in.nextLine().charAt(0));
            if (answer == 's') {
                new Server();
                break;
            }else if (answer == 'c') {
                new Client();
                break;
            } else {
                System.out.println("Некорректный ввод. Повторите.");
            }
        }
    }
}
