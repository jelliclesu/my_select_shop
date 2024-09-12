package com.spring.my_select_shop.controller;

import com.spring.my_select_shop.domain.Product;
import com.spring.my_select_shop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor    // final 로 선언된 멤버 변수 자동 생성
@RestController //  JSON 으로 데이터 주고받음 선언
public class ProductRestController {

    private final ProductRepository productRepository;

    // 등록된 전체 상품 목록 조회
    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
