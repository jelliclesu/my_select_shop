package com.spring.my_select_shop.controller;

import com.spring.my_select_shop.domain.Product;
import com.spring.my_select_shop.repository.ProductMypriceRequestDto;
import com.spring.my_select_shop.repository.ProductRepository;
import com.spring.my_select_shop.repository.ProductRequestDto;
import com.spring.my_select_shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor    // final 로 선언된 멤버 변수 자동 생성
@RestController //  JSON 으로 데이터 주고받음 선언
public class ProductRestController {

    private final ProductService productService;
    private final ProductRepository productRepository;

    // 등록된 전체 상품 목록 조회
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    // 신규 상품 등록
    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto requestDto) {
        Product product = new Product(requestDto);
        productRepository.save(product);
        return product;
    }

    // 설정 가격 변경
    @PutMapping("/api/products/{id}")
    public Long updateProduct(@PathVariable Long id, @RequestBody ProductMypriceRequestDto requestDto) {
        return productService.update(id, requestDto);
    }
}
