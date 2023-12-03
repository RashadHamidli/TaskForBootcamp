package com.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            int localPort = serverSocket.getLocalPort();
            System.out.println("Sunucu başlatıldı. Port:" + localPort);

            Socket clientSocket = serverSocket.accept();
            System.out.println("İstemci bağlandı. IP: " + clientSocket.getInetAddress().getHostAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Sunucuya gönderilecek mesajı girin: ");
            String messageToSend = scanner.nextLine();

            out.println(messageToSend);

            String clientMessage = in.readLine();
            System.out.println("İstemciden gelen mesaj: " + clientMessage);

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
