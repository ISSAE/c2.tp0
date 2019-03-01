/*
 * The MIT License
 *
 * Copyright 2019 pascalfares.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.cnamliban.c2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author pascalfares
 */
public class ExempleTest {
    
    Exemple ex;
    
    public ExempleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         ex = new Exemple.ExempleBuilder(1).nom("Pascal").tel("01000100").build();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Exemple.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Exemple instance = ex;
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);

    }


    /**
     * Test of getNom method, of class Exemple.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Exemple instance = ex;
        String expResult = "Pascal";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNom method, of class Exemple.
     */
    @Test
    @Ignore
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Exemple instance = null;
        instance.setNom(nom);
    }

    /**
     * Test of getTel method, of class Exemple.
     */
    @Test
    public void testGetTel() {
        System.out.println("getTel");
        Exemple instance = ex;
        String expResult = "01000100";
        String result = instance.getTel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTel method, of class Exemple.
     */
    @Test
    @Ignore
    public void testSetTel() {
        System.out.println("setTel");
        String tel = "";
        Exemple instance = null;
        instance.setTel(tel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
