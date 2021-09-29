package com.example.s3.web;

import com.example.s3.infra.s3.AwsS3Uploader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final AwsS3Uploader awsS3Uploader;

    @GetMapping(path = "/")
    public String homePage() {
        return "home";
    }

    @PostMapping(path = "/upload")
    public String uploadImage(@RequestParam("image") final MultipartFile multipartFile) throws IOException {
        awsS3Uploader.upload(multipartFile, "book");
        return "redirect:/";
    }

}
