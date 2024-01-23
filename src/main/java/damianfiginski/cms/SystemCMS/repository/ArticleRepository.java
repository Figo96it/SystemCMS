package damianfiginski.cms.SystemCMS.repository;

import damianfiginski.cms.SystemCMS.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
