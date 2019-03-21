package com.dlut.config;


//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;

//@Configuration
//@EnableWebSecurity
public class webSecurityConfig
//        extends WebSecurityConfigurerAdapter
{
//    @Override
//    protected void configure(HttpSecurity http) throws Exception
//    {
//        http.authorizeRequests()
//                .antMatchers("/","/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .defaultSuccessUrl("/chat")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }
//
//    /**
//     * 在内存中分配两个用户
//     */
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception
//    {
////        auth.inMemoryAuthentication()
////                .withUser("wyf").password("wyf").roles("USER")
////                .and()
////                .withUser("wisely").password("wisely").roles("USER");
//    }
//
//    /**
//     * 设置静态资源目录不拦截
//     */
//    @Override
//    public void configure(WebSecurity web) throws Exception
//    {
//        web.ignoring().antMatchers("/resources/static/**");
//    }
//
//    @Bean
//    public static NoOpPasswordEncoder passwordEncoder() {
//        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//    }
}
