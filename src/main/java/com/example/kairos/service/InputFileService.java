package com.example.kairos.service;

import com.example.kairos.pojo.InputFileFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@Service
public class InputFileService {

    @Autowired
    private AWSService awsService;

    public void createAndUploadFile() throws IOException {
        String fileName = "inputFile.json";
        File file = new File(fileName);

        InputFileFormat inputFileFormat = new InputFileFormat(null, 1, null, null, null, null, null, null, null, null);

        Writer writer = new FileWriter(fileName);
        Gson gson = new GsonBuilder().create();
        gson.toJson(inputFileFormat, writer);
        writer.flush();
        writer.close();

        awsService.upload(file);
    }

}
