package com.example.patterns.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        FileDownloader fileDownloader = new FileDownloaderProxy();
        System.out.println(fileDownloader.download("A"));
        System.out.println(fileDownloader.download("B"));
        System.out.println(fileDownloader.download("C"));
        System.out.println(fileDownloader.download("A"));
        System.out.println(fileDownloader.download("D"));
        System.out.println(fileDownloader.download("B"));
        System.out.println(fileDownloader.download("E"));

        DataBaseConnection dataBaseConnection = new DataBaseConnectionProxy();
        dataBaseConnection.connect();
        dataBaseConnection.connect();
        dataBaseConnection.connect();
    }
}
