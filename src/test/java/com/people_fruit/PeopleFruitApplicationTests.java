package com.people_fruit;

import com.people_fruit.bean.CategoriesFruit;
import com.people_fruit.service.CategoryFruitService;
import com.people_fruit.service.impl.CategoryFruitServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class PeopleFruitApplicationTests {

    @Autowired
    private CategoryFruitService categoryFruitService;

    @Test
    void contextLoads() {
        CategoriesFruit categoriesFruit=new CategoriesFruit();
        categoriesFruit.setCatName("Èöµ©Èöµ©");
        categoriesFruit.setUpdateTime(LocalDateTime.now());
        categoriesFruit.setCreateTime(LocalDateTime.now());
        categoriesFruit.setCatStatus("1000");
        categoriesFruit.setIsDeleted(1);
        System.out.println(categoriesFruit);
        categoryFruitService.save(categoriesFruit);

    }

}
