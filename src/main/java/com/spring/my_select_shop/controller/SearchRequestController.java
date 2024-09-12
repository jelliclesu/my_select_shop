package com.spring.my_select_shop.controller;

import com.spring.my_select_shop.repository.ItemDto;
import com.spring.my_select_shop.utils.NaverShopSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor    // final 로 선언된 클래스 자동 생성
@RestController // JSON으로 응답함을 선언
public class SearchRequestController {

    private final NaverShopSearch naverShopSearch;

    @GetMapping("/api/search")
    public List<ItemDto> getItems(@RequestParam String query) { // ? 사용하려면 @RequestParam 필수
        String resultString = naverShopSearch.search(query);
        return naverShopSearch.fromJSONtoItems(resultString);
    }
}
