# My Select Shop
-------------
## **Project Overview**

- 본 프로젝트는 키워드로 상품을 검색하여 관심 상품을 조회, 등록할 수 있으며, 관심 상품에 원하는 가격을 등록하면 최저가가일 때 표시해주는 사이트를 제작하였다.
-------------
## **Project Purpose**

- 요구 기능
    - 상품명에 따른 검색 - “탐색하기” 탭에서 키워드 검색 시, 결과를 목록으로 보여주는 기능
    - 관심 상품 등록 - 상품을 검색한 후, 등록 버튼 클릭 시, 관심 상품 생성 / 검색 결과에서 제목, 이미지, 링크, 최저가 가져오기
    - 관심 상품 조회 - “모아보기” 탭 클릭 시, 등록된 관심 상품 조회 기능
    - 관심 상품에 대한 최저가 등록
-------------
## **Project Environment**
<img src = "https://github.com/user-attachments/assets/c75eb309-4042-4c9d-b808-c47c68dc1bb6" width="250">

-------------
## **Project Preview**

<img width="500" alt="image" src="https://github.com/user-attachments/assets/d1d018e9-9de9-40d0-b968-414321e2f769"></br>
<img width="500" alt="image" src="https://github.com/user-attachments/assets/d57c1097-b036-4bdb-8afc-cd21aeb6e25e"></br>
<img width="500" alt="image" src="https://github.com/user-attachments/assets/d58da1ec-d6d0-4d81-b02b-a662ac1927af"></br>

-------------
## Folder Structure

**🗂 src/main/java/../controller/**

- ProductRestController: 관심 상품 관련 컨트롤러
- SearchRequestController: 검색 관련 컨트롤러

**🗂 src/main/java/../service/**

- ProductService: 관심 상품 가격 변경

**🗂 src/main/java/../repository/**

- ProductRepository: 관심 상품 조회, 저장
- ProductRequestDto: 관심 상품 등록
- ProductMypriceRequestDto: 관심 가격 변경
- ItemDto: 검색 결과 주고받기

**🗂 src/main/java/../domain/**

- Product: 관심 상품 테이블

**🗂 src/main/java/../utils/**

- NaverShopSearch: 네이버 쇼핑 API 이용
- Scheduler: 최저가 정보 업데이트

-------------
## **API**

| Function | Method | URL | Return |
| --- | --- | --- | --- |
| 키워드로 상품 검색하고 그 결과를 목록으로 보여주기 | GET | /api/search?query=검색어 | List<ItemDto> |
| 관심 상품 등록하기 | POST | /api/products | Product |
| 관심 상품 조회하기 | GET | /api/products | List<ItemDto> |
| 관심 상품에 원하는 가격 등록하고, 그 가격보다 낮은 경우 표시하기 | PUT | /api/products/{id} | id |
-------------
## Open API

- 네이버 쇼핑 API 이용
