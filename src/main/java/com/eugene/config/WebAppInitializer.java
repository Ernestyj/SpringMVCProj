//package com.eugene.config;
//
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.filter.DelegatingFilterProxy;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//import javax.servlet.Filter;
//
///**
// * Created by DCLab on 12/17/2015.
// */
//public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//    @Override   //����root������,��Jpa����Դ�ȵȵ�����
//    protected Class<?>[] getRootConfigClasses() {
////        return new Class<?>[] {ApplicationConfig.class, JpaConfig.class, SecurityConfig.class};
//        return new Class<?>[] {ApplicationConfig.class};
//    }
//
//    @Override   //����dispatcher servlet�������root configָ���˸�ת������Ϳ��Ժ���
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[] {WebMvcConfig.class};
//    }
//
//    @Override   //ָ����ʼ��servlet�����url,���ô�/��ʼ
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    //����servlet������
//    @Override
//    protected Filter[] getServletFilters() {
//        //����
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setEncoding("UTF-8");
//        characterEncodingFilter.setForceEncoding(true);
//        return new Filter[] {characterEncodingFilter};
//    }
//
//
//}
