package com.example.patterns.proxy;

public class FileDownloaderImpl implements FileDownloader {
    @Override
    public String download(String path) {
        return "The content of " + path + " was downloaded";
    }
}
