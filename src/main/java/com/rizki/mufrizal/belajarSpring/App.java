package com.rizki.mufrizal.belajarSpring;

import com.rizki.mufrizal.belajarSpring.domain.SistemOperasi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rizki on 28/07/15.
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[]args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-context.xml");

        SistemOperasi sistemOperasiUbuntu = (SistemOperasi) applicationContext.getBean("sistemOperasiUbuntu");
        SistemOperasi sistemOperasiFedora = (SistemOperasi) applicationContext.getBean("sistemOperasiFedora");
        SistemOperasi sistemOperasiElementary = (SistemOperasi) applicationContext.getBean("sistemOperasiElementary");

        LOGGER.debug("Cek Spring Pertama : {}", sistemOperasiUbuntu.toString());
        LOGGER.debug("Cek Spring Kedua   : {}", sistemOperasiFedora.toString());
        LOGGER.debug("Cek Spring Ketiga  : {}", sistemOperasiElementary.toString());

    }

}
