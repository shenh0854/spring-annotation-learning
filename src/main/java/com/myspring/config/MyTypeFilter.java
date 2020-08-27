package com.myspring.config;
/*
 * @author  Steve Shen
 * @date  2020/8/27 10:17
 * @version 1.0.0
 */

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader var1, MetadataReaderFactory var2) throws IOException {
        return false;
    }
}
