package com.iris.solid.ocp.solution.writter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileExporter {

    private static final Logger LOGGER = Logger.getLogger(FileExporter.class.getName());

    public File export(String fileName, Consumer<Writer> contentWriter) throws IOException {
        File file = new File("export/" + fileName);
        try (Writer writer = new FileWriter(file)) {
            contentWriter.accept(writer);
            return file;
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            throw e;
        }
    }
}
