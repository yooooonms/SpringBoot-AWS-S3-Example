package com.example.s3.product.application;

import com.example.s3.infra.s3.AwsS3Uploader;
import com.example.s3.product.entity.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final AwsS3Uploader awsS3Uploader;

    @Transactional
    public void productSave() {

    }

}
