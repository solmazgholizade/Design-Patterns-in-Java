package com.example.patterns.proxy;

import java.util.HashMap;

//This proxy class provides caching
public class FileDownloaderProxy implements FileDownloader {
    private FileDownloaderImpl fileDownloader;
    private HashMap<String, String> cachedFiles = new HashMap<>();

    public FileDownloaderProxy() {
        this.fileDownloader = new FileDownloaderImpl();
    }

    @Override
    public String download(String path) {
        if (cachedFiles.get(path) != null) {
            System.out.println(path + " read from cache");
            return cachedFiles.get(path);
        } else {
            String content = fileDownloader.download(path);
            cachedFiles.put(path, content);
            return content;
        }
    }
}
