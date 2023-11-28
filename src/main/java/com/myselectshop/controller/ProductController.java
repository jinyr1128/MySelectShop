package com.myselectshop.controller;

import com.myselectshop.dto.ProductMypriceRequestDto;
import com.myselectshop.dto.ProductRequestDto;
import com.myselectshop.dto.ProductResponseDto;
import com.myselectshop.repository.ProductRepository;
import com.myselectshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto requestDto) {
        return productService.createProduct(requestDto);
    }

    @PutMapping("/products/{id}")
    public ProductRepository updateProduct9(@PathVariable Long id,@RequestBody ProductMypriceRequestDto requestDto){
        return  productService.updateProduct(id, requestDto);
    }
}
