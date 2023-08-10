package edu.lingnan.eattingwhat.configuration;


import edu.lingnan.eattingwhat.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


                @Override
                public void addInterceptors(InterceptorRegistry registry) {
                    registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns(
                            "/customer/toLogin","/customer/loginByPhone","/customer/toHome","/customer/toRegister",
                            "/customer/register","/static/**","/store/toStreet","/store/suggestByStr","/store/search");
                }
            }
