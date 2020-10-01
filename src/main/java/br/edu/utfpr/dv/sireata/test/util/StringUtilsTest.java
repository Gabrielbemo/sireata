package br.edu.utfpr.dv.sireata.test.util;

import br.edu.utfpr.dv.sireata.util.StringUtils;
import  org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void getExtenso(){
        assertEquals(StringUtils.getExtenso(123), "cento e vinte e três");
    }
}
