package es.fjmarlop.PizzettAppBackEnd.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Configuración de seguridad de la aplicación.
 * Todos los endpoints de la aplicación requieren autenticación.
 * Todos utilizan el Bearer Token de Firebase.
 * Excepto para el endpoint /pizzettApp/empleado/{email}, solo va
 * a devolver una valor número y no comparte información sensible.
 * Esto es así porque se comprueba el empleado antes de iniciar sesión
 * por lo que el token no está aún disponible.
 */
@Configuration
public class SecurityConfig {

    /**
     * Genera la cadena de filtros de seguridad para la configuración de seguridad HTTP.
     *
     * @param httpSecurity el objeto HttpSecurity utilizado para la configuración
     * @return el objeto SecurityFilterChain
     * @throws Exception si ocurre un error al construir la cadena de filtros de seguridad
     */
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/pizzettApp/empleado/{email}").permitAll();
                    auth.anyRequest().authenticated();
                })
                .oauth2ResourceServer().jwt()
                .and()
                .and().csrf().disable();

        return httpSecurity.build();
    }


}
