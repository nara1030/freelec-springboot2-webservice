도서 스터디
=====
* 기간: 2022.07.02 ~ 2022.08.20
* 교재: [스프링 부트와 AWS로 혼자 구현하는 웹서비스](http://www.yes24.com/Product/Goods/83849117)
- - -
```TXT
노트

- 어노테이션
  = 프로덕션 코드
    @SpringBootApplication
  = 테스트 코드
    @RunWith(SpringRunner.class)
    @WebMvcTest vs. @SpringBootTest(H2 DB 자동실행)
- JPA(cf. MyBatis)
  = JPA <- Hibernate <- Spring Data JPA
  = @Entity(Setter 금지, @Builder 사용)
    + 영속성 컨텍스트/더티 체킹(p113)
  = 객체지향적인 코드를 작성 가능
    + Controller: Dto(toEntity; p108), Service: Entity
      PostsApiControllerTest, PostRepositoryTest
- 

질의

- JS 한 페이지에?
- @Transactional(readOnly = true), p148
```