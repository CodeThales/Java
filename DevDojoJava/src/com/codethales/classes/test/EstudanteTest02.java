package com.codethales.classes.test;

import com.codethales.classes.domainmodel.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        /*Como não atribuí valores à variável de referencia 'estudante',
        * a saída do print terá o valor default referente ao tipo de cada atributo:
        * name == null, age == 0, gender == vazio
        */

        estudante.printDados();
    }
}
