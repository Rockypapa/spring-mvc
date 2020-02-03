package com.rocky.mall.config.dispather;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public interface RockyInitializer {

    void start(ServletContext context) throws ServletException;
}
