package com.gokul.expencetrackerapi.Service;

import com.gokul.expencetrackerapi.domain.Category;
import com.gokul.expencetrackerapi.exceptions.EtBadRequestException;
import com.gokul.expencetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category>fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId,Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId,String title,String description) throws EtBadRequestException;

    void updateCategory(Integer userId,Integer categoryId,Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId,Integer categoryId) throws EtResourceNotFoundException;
}
