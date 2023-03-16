package com.filesIO;

import java.nio.file.*;
public class WatchServiceToDirectories {

    public static void main(String[] args) throws Exception {
        Path directoryPath = Paths.get("/path/to/directory");

        WatchService watcherService = FileSystems.getDefault().newWatchService();

        directoryPath.register(watcherService, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

        while (true) {
            WatchKey key = watcherService.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                
                if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                    System.out.println("File created: " + event.context().toString());
                } else if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
                    System.out.println("File deleted: " + event.context().toString());
                } else if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
                    System.out.println("File modified: " + event.context().toString());
                }
            }

            key.reset();
        }
    }

}
