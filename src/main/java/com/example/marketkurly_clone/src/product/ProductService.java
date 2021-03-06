package com.example.marketkurly_clone.src.product;

import com.example.marketkurly_clone.utils.JwtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final ProductProvider productProvider;
    private final JwtService jwtService;
    private final ProductMapper productMapper;

    @Autowired
    public ProductService( ProductProvider productProvider, JwtService jwtService, ProductMapper productMapper) {
        this.productProvider = productProvider;
        this.jwtService = jwtService;
        this.productMapper=productMapper;
    }








}
