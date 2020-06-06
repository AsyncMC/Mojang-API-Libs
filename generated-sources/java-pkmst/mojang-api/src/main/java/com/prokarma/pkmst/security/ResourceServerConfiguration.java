package com.prokarma.pkmst.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.http.HttpMethod;
/**
 * Configurer class for <code>@EnableResourceServer</code> classes. This class adjust the access
 * rules and paths that are protected by OAuth2 security. If more than one configures the same property, then the last
 * one wins. The configurers are sorted by {@link Order} before being applied.
 * 
 * @author pkmst
 * 
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    private static final String RESOURCE_ID = "my_rest_api";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(RESOURCE_ID).stateless(false);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
    //configure security for the http methods
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/Name History/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/Name History/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/Skin Operations/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/Skin Operations/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/Security question-answer/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/Security question-answer/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/Miscellaneous/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/Miscellaneous/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }

}
