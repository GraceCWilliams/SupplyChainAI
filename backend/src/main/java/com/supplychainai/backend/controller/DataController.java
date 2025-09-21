package com.supplychainai.backend.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        return "Uploaded: " + file.getOriginalFilename();
    }

    @GetMapping("/status")
    public String status() {
        return "Backend is running!";
    }
}
