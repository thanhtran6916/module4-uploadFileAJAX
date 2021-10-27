package com.testFile.controller;

import com.testFile.model.Image;
import com.testFile.model.ImageForm;
import com.testFile.service.image.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@CrossOrigin("*")
@RequestMapping("/images")
public class ImageRestController {

    @Value("${upload-file}")
    private String uploadFile;

    @Autowired
    private IImageService imageService;

    @GetMapping
    public ResponseEntity<String> findAll() {
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> save(ImageForm file) {
        String fileName = file.getImage().getOriginalFilename();
        return new ResponseEntity<>(fileName, HttpStatus.OK);
    }

}
