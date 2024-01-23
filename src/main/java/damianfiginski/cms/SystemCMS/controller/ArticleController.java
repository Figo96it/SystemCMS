package damianfiginski.cms.SystemCMS.controller;

import damianfiginski.cms.SystemCMS.model.Article;
import damianfiginski.cms.SystemCMS.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping
    public List<Article> getAllArticles(){
        return articleRepository.findAll();
    }

    @PostMapping
    public Article createArticle(@RequestBody Article article){
        return articleRepository.save(article);
    }
}
