package com.example.myjpastudy;

import org.springframework.context.annotation.Import;

import jakarta.transaction.Transactional;

@Import(QueryDSLConfig.class)
@Transactional
public class QuerydslTest {
    
}
