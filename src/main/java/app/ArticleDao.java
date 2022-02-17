package app;

import java.util.List;

public interface ArticleDao {

    void write(Article article);  //<- 게시글 작성

    void modify(Article article);  //<- 게시글 수정

    void delete(int id);  //<- 게시글 삭제

    List<Article> findAll();  //<- 게시글 리스트(전체 데이터 가지고오기)

    Article findById(int id);  //<- 게시글 번호로 해당 게시글 찾기


}

