package com.spring.my_select_shop.domain;

import com.spring.my_select_shop.Timestamped;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // get 함수 일괄 생성
@NoArgsConstructor  // 기본 생성자 생성
@Entity // DB 테이블 역할
public class Product extends Timestamped {

    // ID 자동 생성 및 증가
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 반드시 값을 가지도록 함
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String link;

    @Column(nullable = false)
    private int lprice;

    @Column(nullable = false)
    private int myprice;
}
