package com.testFile.repository;

import com.testFile.model.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageRepository extends CrudRepository<Image, Long> {
}
