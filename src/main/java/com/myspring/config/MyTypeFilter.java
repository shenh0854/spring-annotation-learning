package com.myspring.config;
/*
 * @author  Steve Shen
 * @date  2020/8/27 10:17
 * @version 1.0.0
 */

import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {
    public MyTypeFilter() {

    }
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // AnnotationMetadata获取注解元信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // ClassMetadata获取类元信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println("--->" + className);
        return className.contains("er");
    }
}
