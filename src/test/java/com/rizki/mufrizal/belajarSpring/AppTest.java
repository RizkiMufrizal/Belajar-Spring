package com.rizki.mufrizal.belajarSpring;

import com.rizki.mufrizal.belajarSpring.domain.SistemOperasi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static org.junit.Assert.assertEquals;

/**
 * Created by rizki on 28/07/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config-context.xml")
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class
    }
)
public class AppTest {

    @Qualifier("sistemOperasiUbuntu")
    @Autowired
    private SistemOperasi sistemOperasiUbuntu;

    @Qualifier("sistemOperasiFedora")
    @Autowired
    private SistemOperasi sistemOperasiFedora;

    @Qualifier("sistemOperasiElementary")
    @Autowired
    private SistemOperasi sistemOperasiElementary;

    private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

    @Test
    public void testSistemOperasiPertama() throws Exception {
        assertEquals(sistemOperasiUbuntu.getNamaSistemOperasi(), "Ubuntu");
        assertEquals(sistemOperasiUbuntu.getVersiSistemOperasi(), "14.04");
        LOGGER.debug("Test Sistem Operasi Pertama");
    }

    @Test
    public void testSistemOperasiKedua() throws Exception {
        assertEquals(sistemOperasiFedora.getNamaSistemOperasi(), "Fedora");
        assertEquals(sistemOperasiFedora.getVersiSistemOperasi(), "fedora 22");
        LOGGER.debug("Test Sistem Operasi Kedua");
    }

    @Test
    public void testSistemOperasiKetiga() throws Exception {
        assertEquals(sistemOperasiElementary.getNamaSistemOperasi(), "Elementary os");
        assertEquals(sistemOperasiElementary.getVersiSistemOperasi(), "Freya");
        LOGGER.debug("Test Sistem Operasi Ketiga");
    }

}
