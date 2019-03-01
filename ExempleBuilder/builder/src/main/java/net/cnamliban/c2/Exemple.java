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

/**
 * Un exemple de pattern builder
 * @author pascalfares
 */
public class Exemple {

    //quelques attributs
    private int _id;
    private String nom;
    private String tel;

    /**
     * Le Builder
     * Une méthode par attribut (avec le même nom)
     * la différence d'un muttateur (setter)
     * renvoit ExempleBuilder
     * LE construteur de la classe à contruire
     * clone la classe résultat du builder
     * 
     */
    public static class ExempleBuilder {
        //Les memes attributs que la classe a contruire
        int _id;
        String nom;
        String tel;
        
        //Un contructeur avec les attribut obligatoires (not null)
        public ExempleBuilder(int id) {
            _id=id;
        }
        //Une méthode par attribut (avec le même nom)
        //A la différence d'un muttateur (setter)
        //renvoit ExempleBuilder
        public ExempleBuilder nom(String nom) {
            this.nom = nom;
            return this;
        }
        
        public ExempleBuilder tel(String tel) {
            this.tel = tel;
            return this;
        }
        
        public Exemple build() {
            return new Exemple(this);
        }
        
    }
    
    //LE construteur de la classe à contruire
    //clone la classe résultat du builder
    public Exemple(ExempleBuilder exb) {
        _id=exb._id;
        nom=exb.nom;
        tel=exb.tel;
    }
    
    //Les getter setter

    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /*
     * PAS DE SETID c'est un identifiants
     * @param _id the _id to set
     */
   

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
