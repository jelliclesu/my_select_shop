package com.spring.my_select_shop.service;

import com.spring.my_select_shop.domain.Product;
import com.spring.my_select_shop.repository.ProductMypriceRequestDto;
import com.spring.my_select_shop.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor    // final 로 선언된 멤버 변수 자동 생성
@Service    // 서비스임 선언
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional  // 메소드 동작이 SQL 쿼리문임 선언
    public Long update(Long id, ProductMypriceRequestDto requestDto) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        product.update(requestDto);
        return id;
    }
}
