package es.fjmarlop.PizzettAppBackEnd.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración de la aplicación.
 */
@Configuration
public class Config {

    /**
     * Bean que proporciona una instancia de ModelMapper.
     *
     * @return Instancia de ModelMapper configurada.
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}